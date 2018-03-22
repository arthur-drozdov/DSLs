/* Copyright (C) Arthur Drozdov and Miruna Rusu
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */

public class Gene {

    String id;
    double speed;
    int replicationTime;

    public Gene(String id, double speed, int replicationTime) {
        this.id = id;
        this.speed = speed;
        this.replicationTime = replicationTime;
    }
    public String getId() {
        return id;
    }

    public double getSpeed() {
        return speed;
    }

    public int getReplicationTime() {
        return replicationTime;
    }
}