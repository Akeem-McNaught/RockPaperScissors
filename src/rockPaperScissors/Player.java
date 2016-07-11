/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockPaperScissors;

/**
 *
 * @author Akeem
 */
public abstract class Player {
    String name;
    int playValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayValue() {
        return playValue;
    }

    public void setPlayValue(int playValue) {
        this.playValue = Math.abs(playValue);
    }

    public abstract int generatePlay();
}
