/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author avognonm
 */
public class ModeTournoi {

    private final JFrame window;
    private final JTextField nbjoueur;
    
    
        public ModeTournoi(){
        window = new JFrame();
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        window.setSize(800,200);
        window.setTitle("Mode de Jeu : Tournoi");
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setResizable(false);
        
        
        window.setLayout(new GridLayout(3,3));
        
        nbjoueur = new JTextField();
        
        window.add(new JLabel());
        window.add(new JLabel());
        window.add(new JLabel("Nombre de joueurs"));
        window.add(new JLabel());
        window.add(new JLabel());
        window.add(nbjoueur);
        window.add(new JLabel());
        window.add(new JLabel());
        window.add(new JLabel());
        
        }
    
}
