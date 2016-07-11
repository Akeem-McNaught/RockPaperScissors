/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockPaperScissors;

import javax.swing.JOptionPane;

/**
 *
 * @author Akeem
 */
public class LetsPlay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int players, janKenPon;

        String user, user2;
        String restart = "y";
        
        JOptionPane.showMessageDialog(null, "JAN KEN PON!");
        
        while(restart.equalsIgnoreCase("y")){
            
        
        int win = 0;
        int win2 = 0;
        int loss = 0;
        int loss2 = 0;
           try { players = (int) Double.parseDouble(JOptionPane.showInputDialog("Enter amount of players(1-2)"));
            
            user = JOptionPane.showInputDialog("Enter your username player 1");
            user2 = JOptionPane.showInputDialog("Enter your username player 2\n"
                    + "if only one player type NA");
            
            String cont = "y";
            while(cont.equalsIgnoreCase("y")){
                
            switch (players) {

                case 1:
                    Human player = new Human();
                    player.setName(user);
                    janKenPon = (int) Double.parseDouble(JOptionPane.showInputDialog(player.getName()
                            + "\n1|Rock"
                            + "\n2|Paper"
                            + "\n3|Scissors"));
                    player.setPlayValue(janKenPon);
                    Computer AI = new Computer();
                    int random = (int)(Math.random()*(3-1))+1;
                    AI.setPlayValue(random);

                    if (player.generatePlay() == 1 && AI.generatePlay() == 3) {
                        JOptionPane.showMessageDialog(null, user +": YOU WIN! A:<");
                        win += 1;
                        loss2 += 1;
                        
                    } else if (player.generatePlay() == 1 && AI.generatePlay() == 1) {
                        JOptionPane.showMessageDialog(null, "TIE");
                        
                    } else if (player.generatePlay() == 1 && AI.generatePlay() == 2) {
                        JOptionPane.showMessageDialog(null, user +": YOU LOOSE! c:<");
                        loss += 1;
                        win2 += 1;
                    }

                    if (player.generatePlay() == 2 && AI.generatePlay() == 1) {
                        JOptionPane.showMessageDialog(null, user+": YOU WIN! A:<");
                        win += 1;
                        loss2 += 1;
                        
                    } else if (player.generatePlay() == 2 && AI.generatePlay() == 2) {
                        JOptionPane.showMessageDialog(null, "TIE");
                        
                    } else if (player.generatePlay() == 2 && AI.generatePlay() == 3) {
                        JOptionPane.showMessageDialog(null, user +": YOU LOOSE! c:<");
                        loss += 1;
                        win2 += 1;
                    }
                    
                    if (player.generatePlay() == 3 && AI.generatePlay() == 2) {
                        JOptionPane.showMessageDialog(null, user +": YOU WIN! A:<");
                        win += 1;
                        loss2 += 1;
                        
                    } else if (player.generatePlay() == 3 && AI.generatePlay() == 3) {
                        JOptionPane.showMessageDialog(null, "TIE");
                        
                    } else if (player.generatePlay() == 3 && AI.generatePlay() == 1) {
                        JOptionPane.showMessageDialog(null, user +": YOU LOOSE! c:<");
                        loss += 1;
                        win2 += 1;
                    }

                    break;

                case 2:
                   Human player1 = new Human();
                    player1.setName(user);
                    janKenPon = (int) Double.parseDouble(JOptionPane.showInputDialog(player1.getName()
                            + "\n1|Rock"
                            + "\n2|Paper"
                            + "\n3|Scissors"));
                    player1.setPlayValue(janKenPon);
                    
                    Human player2 = new Human();
                    player2.setName(user2);
                    janKenPon = (int) Double.parseDouble(JOptionPane.showInputDialog(player2.getName()
                            + "\n1|Rock"
                            + "\n2|Paper"
                            + "\n3|Scissors"));
                    player2.setPlayValue(janKenPon);

                    if (player1.generatePlay() == 1 && player2.generatePlay() == 3) {
                        JOptionPane.showMessageDialog(null, user +": YOU WIN! A:<\n"
                                + user2 +": YOU LOSE!");
                        win += 1;
                        loss2 += 1;
                        
                    } else if (player1.generatePlay() == 1 && player2.generatePlay() == 1) {
                        JOptionPane.showMessageDialog(null, "TIE");
                        
                    } else if (player1.generatePlay() == 1 && player2.generatePlay() == 2) {
                        JOptionPane.showMessageDialog(null, user +": YOU LOOSE! c:<\n"
                                + user2 +": YOU LOSE!");
                        loss += 1;
                        win2 += 1;
                    }

                    if (player1.generatePlay() == 2 && player2.generatePlay() == 1) {
                        JOptionPane.showMessageDialog(null, user +": YOU WIN! A:<\n"
                                + user2 +": YOU LOOSE");
                        win += 1;
                        loss2 += 1;
                        
                    } else if (player1.generatePlay() == 2 && player2.generatePlay() == 2) {
                        JOptionPane.showMessageDialog(null, "TIE");
                        
                    } else if (player1.generatePlay() == 2 && player2.generatePlay() == 3) {
                        JOptionPane.showMessageDialog(null, user +": YOU LOOSE! c:<\n"
                                + user2 +": YOU WIN!");
                        loss += 1;
                        win2 += 1;
                    }
                    
                    if (player1.generatePlay() == 3 && player2.generatePlay() == 2) {
                        JOptionPane.showMessageDialog(null, user +": YOU WIN! A:<\n"
                                + user2 +": YOU LOOSE!");
                        win += 1;
                        loss2 += 1;
                        
                    } else if (player1.generatePlay() == 3 && player2.generatePlay() == 3) {
                        JOptionPane.showMessageDialog(null, "TIE");
                        
                    } else if (player1.generatePlay() == 3 && player2.generatePlay() == 1) {
                        JOptionPane.showMessageDialog(null, user +": YOU LOOSE! c:<\n"
                                + user2 +": YOU WIN!");
                        loss += 1;
                        win2 += 1;
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Outside Scope, choose 1-3");
                    break;
            }
            cont = JOptionPane.showInputDialog("Do you wish to play again?"
                    + "\nY|Yes"
                    + "\nElse|no");
        }
            if (players ==1){JOptionPane.showMessageDialog(null,user+": Wins|"+ win + " loss|"+ loss);
            
            }
            
            if (players ==2){
            JOptionPane.showMessageDialog(null,user+": Wins|"+ win + " loss|"+ loss
                                        +"\n"+ user2+": Wins|"+ win2 + " loss|"+ loss2);
            }

        } catch (NumberFormatException A) {
            JOptionPane.showMessageDialog(null, "invalid input/numbers only");
        }
        
        restart = JOptionPane.showInputDialog("Do you wish to return to main menu?"
                    + "\nY|Yes"
                    + "\nElse|no");
        }
        JOptionPane.showMessageDialog(null,"Thanks for Playing!");
    }
}
