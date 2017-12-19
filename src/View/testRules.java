/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.JLabel;

/**
 *
 * @author barrerat
 */
public class testRules {
    
    public static void main(String[] args) {
        
        // Définition des éléments de l'IHM
        
        JFrame window;
        
        //Création de l'IHM
        
        window = new JFrame();
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        window.setSize(800,100);
        window.setTitle("Règles");
        window.setLocationRelativeTo(null);
        
        JPanel pan = new JPanel();
        //pan.setBackground(Color.WHITE);
        
        JLabel text = new JLabel("<html><body>Les règles de ce jeu sont très simples.<br />"
                + "Pour gagner, un des deux joueurs doit aligner n formes."
                + "<br />'n' étant le nombre de lignes/colonnes de la grille de jeu</body></html>");
        pan.add(text);
        
        window.add(pan);
        
        window.setResizable(false);
        window.setVisible(true);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
