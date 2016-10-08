/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Game implements Serializable {
    
    // class instance variables
    private int mainQuestProgress;
    private int floorQuestProgress;
    private int highestFloor;

    public Game() {
    }
    
    public int getMainQuestProgress() {
        return mainQuestProgress;
    }

    public void setMainQuestProgress(int mainQuestProgress) {
        this.mainQuestProgress = mainQuestProgress;
    }

    public int getFloorQuestProgress() {
        return floorQuestProgress;
    }

    public void setFloorQuestProgress(int floorQuestProgress) {
        this.floorQuestProgress = floorQuestProgress;
    }

    public int getHighestFloor() {
        return highestFloor;
    }

    public void setHighestFloor(int highestFloor) {
        this.highestFloor = highestFloor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.mainQuestProgress;
        hash = 67 * hash + this.floorQuestProgress;
        hash = 67 * hash + this.highestFloor;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.mainQuestProgress != other.mainQuestProgress) {
            return false;
        }
        if (this.floorQuestProgress != other.floorQuestProgress) {
            return false;
        }
        if (this.highestFloor != other.highestFloor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "mainQuestProgress=" + mainQuestProgress + ", floorQuestProgress=" + floorQuestProgress + ", highestFloor=" + highestFloor + '}';
    }
    
}
