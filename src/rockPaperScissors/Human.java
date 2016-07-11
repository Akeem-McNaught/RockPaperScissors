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
public class Human extends Player {

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

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
        return this.playValue;
    }

    public Human() {
        
    }
    
    
    
}
