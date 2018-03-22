/* Copyright (C) Arthur Drozdov and Miruna Rusu
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */

import java.util.Random;
import java.util.Set;

public abstract class AbstractCell {

    private Board grid;
    private Square square;
    private double speed;
    private int maxAge;
    private int replicationTime;

    private int age;

    public AbstractCell(Board grid, Square square) {
        this.grid = grid;
        this.square = square;

        Random generator = new Random();

        this.speed = ensureRange(grid.getGenes().stream().map(g -> g.getSpeed()).reduce(1.0, (a,b) -> a*b).intValue(), 1, 4);
        this.maxAge = 100;
        this.replicationTime = ensureRange(grid.getGenes().stream().map(g -> g.getReplicationTime()).reduce(1, (a,b) -> a*b).intValue(), 2, 5);
    }
    private int ensureRange(int value, int min, int max) {
        return Math.min(Math.max(value, min), max);
    }

    public void replicate() {
        grid.replicateCell(this);
    }

    public Square aquireTarget() {
        if (square.getY() <= 7) {
            speed = 1;
        }
        Square result = null;
        int[] parseRow = new int[] {-1,-1,-1,0,0,1,1,1};
        int[] parseCol = new int[] {-1,1,0,-1,1,-1,0,1};
        boolean add = false;
        Random generator = new Random();
        boolean isSurrounded = true;
        for(int i = 0; i<= 6; i++) {
            int coordX = this.getSquare().getX();
            int coordY = this.getSquare().getY();
            coordX += parseRow[i] * (int) speed;
            coordY += parseCol[i] * (int) speed;
            if (grid.isWithinBounds(coordX, coordY) && grid.getSquare(coordX, coordY).occupiedBy() == Occupier.none) {
                isSurrounded = false;
                break;
            }
        }
        if(!isSurrounded) {
            while (!add) {
                int i = generator.nextInt(8);
                int coordX = this.getSquare().getX();
                int coordY = this.getSquare().getY();
                coordX += parseRow[i] * (int) speed;
                coordY += parseCol[i] * (int) speed;
                if (grid.isWithinBounds(coordX, coordY) && grid.getSquare(coordX, coordY).occupiedBy() == Occupier.none) {
                    CancerCell newCell = new CancerCell(grid, grid.getSquare(coordX, coordY));
                    newCell.getSquare().setOccupier(Occupier.agent);
                    result = grid.getSquare(coordX, coordY);
                    add = true;
                }
            }
        }
        return result;
    }

    public void incrementAge() {
        age++;
    }

    public void makeMove() {                  // assuming alive
        Square target = aquireTarget();
        if (isAlive() && target != null) {
            Move move = new Move(square, target);
            grid.applyMove(move);
            incrementAge();
            square = target;
        } else {
            Move move = new Move(square, square);
            grid.applyMove(move);
            incrementAge();
        }
        if (age % replicationTime == 0) {
            replicate();
        }
    }

    public boolean isAlive() {
        return age <= maxAge;
    }

    public Square getSquare() {
        return square;
    }


    @Override
    public String toString() {

        return ("CancerCell" + grid.getCells().indexOf(this) + ": " +"("+coordToString(square.getX())+", "+coordToString(square.getY())+")" + ", " + "speed: "
                + speed + ", " + "age: " + age + ", " + "alive: " + isAlive() + ")" + "\n");
    }

    private String coordToString(int coord) {
        if (coord < 10) {
            return "0" + coord;
        } else {
            return Integer.toString(coord);
        }
    }

}
