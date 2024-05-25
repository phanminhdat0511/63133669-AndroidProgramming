package mdat.ontap;

public class Hamster {
    int HamsterID;
    String HamsterName;

    public Hamster(int hamsterID, String hamsterName) {
        HamsterID = hamsterID;
        HamsterName = hamsterName;
    }

    public int getHamsterID() {
        return HamsterID;
    }

    public void setHamsterID(int hamsterID) {
        HamsterID = hamsterID;
    }

    public String getHamsterName() {
        return HamsterName;
    }

    public void setHamsterName(String hamsterName) {
        HamsterName = hamsterName;
    }
}
