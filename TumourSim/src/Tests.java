/* Copyright (C) Arthur Drozdov and Miruna Rusu
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Tests {

        public static void main(String[] args) throws FileNotFoundException {
            File input = new File("/Users/ADrozdov/Desktop/hackathon/GENETESTS/read0.txt");
            Scanner in = new Scanner(input);
            Set<Gene> genes = new HashSet<>();

            while(in.hasNext()){
                String command = in.next();
                switch(command){
                    case "GENE" :
                        String geneName = in.next();
                        Double speed = in.nextDouble();
                        Double replicationTime = in.nextDouble();
                        Gene newGene = new Gene(geneName, speed, replicationTime.intValue());
                        genes.add(newGene);
                        break;
                    case "REPRODUCE":
                        int cancerCellsNumber = in.nextInt();
                        int coordX = in.nextInt();
                        int coordY = in.nextInt();
                        Board newBoard = new Board(coordX, coordY, cancerCellsNumber, genes);
                        testSystem(newBoard);
                        break;
                }

            }}

    //testBoardDisplay();

    //testBoardDisplayAndAgents();

    //testBoardMoveRegen();

    //testSystem();

    static void testBoardDisplay(Board grid) {
        grid.display();
        
    }

    static void testBoardDisplayAndAgents(Board grid) {
        grid.display();
        System.out.println(Arrays.toString(grid.getCells().toArray()));

    }

    static void testBoardMoveRegen(Board grid) {
        for (int i = 0 ; i < 4 ; i++) {
            System.out.println(Arrays.toString(grid.getCells().toArray()));
            grid.display();
            grid.applyAllMovesThenRegenSugar();
        }
    }

    static void testSystem(Board grid) {
        int speed = (int) (grid.getGenes().stream().map(g -> g.getSpeed()).reduce(1.0, (a,b) -> a*b).doubleValue()) * 10;
        try {
            while (!grid.areAllAgentsDeadOrPastMembrane()) {
                grid.display();
                grid.applyAllMovesThenRegenSugar();
                Thread.sleep(6000 / speed);
//                System.out.println(Arrays.toString(grid.getCells().toArray()));
//                Thread.sleep(1000);
            }
            grid.display();
            //System.out.println(Arrays.toString(grid.getCells().toArray()));
            System.out.println();
            System.out.println("Time elapsed until metastasis: " + (grid.getWeeks()-8) + " months");
            System.out.println();
        } catch (InterruptedException ex) {}
    }

    /*public static Board grid1() {
        Set<Gene> genes = new HashSet<>();
        //genes.add(new Gene("BRAF", 1, 1.2));
        genes.add(new Gene("APC", 1.5, 1.6));
        /*genes.add(new Gene("MRPS30", 1.3, 1.5));
        genes.add(new Gene("DACT1", 1.2, 1.4));
        genes.add(new Gene("PAPPA2", 1.2, 1.3));
        //genes.add(new Gene("APC", ));
        Board grid = new Board(1, genes);
        return grid;
    }

    public static Board grid2() {
        Set<Gene> genes = new HashSet<>();
        genes.add(new Gene("p53", 2, 5));
        Board grid = new Board(1, genes);
        return grid;
    } */

   /* public static Board grid2() {
        Board grid = new Board(250);
        return grid;
    } */
        

}
