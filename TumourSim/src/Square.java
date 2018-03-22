/* Copyright (C) Arthur Drozdov and Miruna Rusu
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */

public class Square {

    private final int x;
    private final int y;
    private int sugar;
    private int maxSugar;
    private Occupier occ;

    public Square(int x, int y, int sugar, int maxSugar, Occupier occ) {
        this.x        = x;
        this.y        = y;
        this.sugar    = sugar;
        this.maxSugar = maxSugar;
        this.occ      = occ;
    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Occupier occupiedBy() {
        return occ;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugarInt) {

        sugar = sugarInt;
        maxSugar = sugarInt;

    }

    public void incrementSugar() {

        if (sugar+1 <= maxSugar) {
            sugar++;
        } else {}

    }

    public void resetSugar() {
        sugar = 0;
    }

    public void setOccupier(Occupier occupier) {
        occ = occupier;
    }
    
}
