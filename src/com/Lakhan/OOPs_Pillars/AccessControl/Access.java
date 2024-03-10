package com.Lakhan.OOPs_Pillars.AccessControl;

public class Access {
    private int jerseyNo;
    String playerName;
    int[] playing11;

    public int getJerseyNo() {
        return jerseyNo;
    }

    public void setJerseyNo(int jerseyNo) {
        this.jerseyNo = jerseyNo;
    }

    public Access(int jerseyNo, java.lang.String playerName) {
        this.jerseyNo = jerseyNo;
        this.playerName = playerName;
        this.playing11 = new int[jerseyNo];
    }
}
