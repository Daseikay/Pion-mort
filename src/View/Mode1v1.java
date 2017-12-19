/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author avognonm
 */
public class Mode1v1 {
    private final JFrame window;
    private final JButton launchgame;
    private final JButton retour;
    private final JTextField pseudoj1;
    private final JTextField pseudoj2;
    
    
        public Mode1v1(){
        window = new JFrame();
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        window.setSize(800,500);
        window.setTitle("Mode de Jeu : 1v1");
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setResizable(false);


        }    
    
}
