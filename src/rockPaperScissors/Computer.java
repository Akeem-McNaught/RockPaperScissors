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
public class Computer extends Player {
    
     @Override
    public int getPlayValue() {
        return playValue;
    }

    @Override
    public void setPlayValue(int playValue) {
        this.playValue = playValue;
    }

    @Override
    public int generatePlay() {
        return getPlayValue();
    }
    
    public Computer() {
    }
}
