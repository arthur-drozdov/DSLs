/* Copyright (C) Arthur Drozdov and Miruna Rusu
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Board {

    private final int numAgents;
    private Square[][] grid   = new Square[50][90];
    private List<AbstractCell> cells;
    private Set<Gene> genes;

    private int weeks;

    private Random generator = new Random();

    public Board(int startX, int startY, int cancerCells, Set<Gene> genes) {

        this.numAgents = cancerCells;
        this.cells = new ArrayList<>();
        this.genes = genes;

        for (int y = 0 ; y < 50 ; y++) {
            for (int x = 0 ; x < 90 ; x++) {
                grid[49-y][x] = new Square(x, y, 0, 0, Occupier.none);
            }
        }
        for (int i = 0 ; i < cancerCells ; i++) {
            //int modifierX = startX - 5;
            //int modifierY = startY - 10;
            int agentGridY = ensureRange(generator.nextInt(10)+(startX-5), 0, 49-7);
            int agentGridX = ensureRange(generator.nextInt(10)+(startY-5), 0, 89);
            //assert (startY <)
            grid[agentGridY][agentGridX].setOccupier(Occupier.agent);
            this.cells.add(i, new CancerCell(this, grid[agentGridY][agentGridX]));
        }


    }
    private int ensureRange(int value, int min, int max) {
        return Math.min(Math.max(value, min), max);
    }

    public void replicateCell(AbstractCell cell) {
        int[] parseRow = new int[] {-1,-1,-1,0,0,1,1,1};
        int[] parseCol = new int[] {-1,1,0,-1,1,-1,0,1};
        boolean add = false;
        Random generator = new Random();
        boolean isSurrounded = true;
        for(int i = 0; i<= 6; i++){
            int coordX =  cell.getSquare().getX();
            int coordY =  cell.getSquare().getY();
            coordX += parseRow[i];
            coordY += parseCol[i];
            if (isWithinBounds(coordX, coordY) && getSquare(coordX, coordY).occupiedBy() == Occupier.none){
                isSurrounded = false;
                break;
            }

        }
        if(!isSurrounded) {
            while (!add) {
                int i = generator.nextInt(8);
                int coordX = cell.getSquare().getX();
                int coordY = cell.getSquare().getY();
                coordX += parseRow[i];
                coordY += parseCol[i];
                if (isWithinBounds(coordX, coordY) && getSquare(coordX, coordY).occupiedBy() == Occupier.none) {
                    CancerCell newCell = new CancerCell(this, getSquare(coordX, coordY));
                    newCell.getSquare().setOccupier(Occupier.agent);
                    cells.add(newCell);
                    add = true;
                }
            }
        }
    }

    public void addCelltoCells(AbstractCell cell) {
        cells.add(cell);
    }

    public boolean isWithinBounds(int x, int y){
        return (x >= 0) && (x <= 89) && (y >= 0) && (y <= 49);
    }

    public Set<Gene> getGenes() {
        return genes;
    }

    public Square getSquare(int x, int y) {
        return grid[49-y][x];
    }

    public List<AbstractCell> getCells() {
        return cells;
    }

    public boolean areAllAgentsDeadOrPastMembrane() {
        int numAgentsDead = 0;
        boolean isPastMembrane = false;
        for (int i = 0 ; i < cells.size() ; i++) {
            if (!cells.get(i).isAlive()) {
                numAgentsDead++;
                //cells.remove(cells.get(i));
            }
            if (cells.get(i).getSquare().getY() == 0) {
                isPastMembrane = true;
            }
        }
        return numAgentsDead == cells.size() || isPastMembrane;
    }

    public void applyMove(Move move) {  // assuming alive
        if (move != null) {
            if (!move.getTo().equals(move.getFrom())) {
                grid[49 - move.getTo().getY()][move.getTo().getX()] = move.getTo();

                grid[49 - move.getFrom().getY()][move.getFrom().getX()] = move.getFrom();

                getSquare(move.getTo().getX(), move.getTo().getY()).setOccupier(Occupier.agent);
                getSquare(move.getFrom().getX(), move.getFrom().getY()).setOccupier(Occupier.none);
            } else {
                grid[49 - move.getFrom().getY()][move.getFrom().getX()].resetSugar();
            }
        }
    }

    public void applyAllMovesThenRegenSugar() {
        for (int i = 0 ; i < cells.size() ; i++) {
            if (!cells.get(i).isAlive()) {
                cells.get(i).getSquare().setOccupier(Occupier.none);
            } else {
                cells.get(i).makeMove();
            }
        }
        weeks++;
    }

    public int getWeeks() {
        return weeks;
    }

    public void display() {

        System.out.println();
        System.out.println("    " + new String(new char[9]).replace("\0",  "0 1 2 3 4 5 6 7 8 9 ") + "   ");
        System.out.println();

        for (int y = 50 ; y >= 1 ; y--) {
            System.out.print(((y-1) % 10) + "   ");
            for (int x = 90 ; x >= 1 ; x--) {

                if (grid[50 - y][90 - x].occupiedBy() == Occupier.none && grid[50 - y][90 - x].getSugar() == 0 && y > 8) {
                    System.out.print(". ");
                //} else if (grid[50 - y][90 - x].occupiedBy() == Occupier.none && grid[50 - y][90 - x].getSugar() == 0 && ())
                } else if (grid[50 - y][90 - x].occupiedBy() == Occupier.none && grid[50 - y][90 - x].getSugar() == 0 && (y == 8 || y == 1)) {
                    System.out.print("= ");
                } else if (grid[50 - y][90 - x].occupiedBy() == Occupier.none && grid[50 - y][90 - x].getSugar() == 0 && y < 8) {
                    System.out.print("- ");
                } else if (grid[50 - y][90 - x].occupiedBy() == Occupier.agent) {
                    System.out.print("X ");
                } else {
                    System.out.print(grid[50 - y][90 - x].getSugar() + " ");
                }
            }
            System.out.println("   " + ((y-1)%10));
        }
        System.out.println();
        System.out.println("    " + new String(new char[9]).replace("\0",  "0 1 2 3 4 5 6 7 8 9 ") + "   ");
        //System.out.println();
        //System.out.println();

    }



    //private String repeatString(String) {




}
