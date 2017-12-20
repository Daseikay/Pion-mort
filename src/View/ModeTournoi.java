/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author avognonm
 */
public class ModeTournoi {

    private final JFrame window;
    private final JButton launchgame;
    private final JButton retour;
    
    
        public ModeTournoi(){
        window = new JFrame();
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        window.setSize(800,500);
        window.setTitle("Mode de Jeu : Tournoi");
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setResizable(false);
        
        }
    
}
