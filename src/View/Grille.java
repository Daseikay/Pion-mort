/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Joueur;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Malcolm
 */
public class Grille {
    private final JFrame window;
    private final JButton btnquitter;
    private final JButton buttons[][] = new JButton[3][3];
    private final JPanel mainPanel = new JPanel();
    private final JPanel northPanel = new JPanel();
    private final JPanel westPanel = new JPanel();
    private final JPanel eastPanel = new JPanel();
    private final JPanel southpanel = new JPanel();
    private final JPanel centerPanel = new JPanel();
    
    
    public Grille(){

        window = new JFrame();
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        window.setSize(1000,500);
        window.setTitle("Mode de Jeu : 1v1");
        window.setLocationRelativeTo(null);
        
        window.setResizable(false);
        
        
         window.add(mainPanel);
	 mainPanel.setLayout(new BorderLayout());
	 mainPanel.add(northPanel, BorderLayout.NORTH);
	 mainPanel.add(southpanel, BorderLayout.SOUTH);
	 mainPanel.add(centerPanel, BorderLayout.CENTER);
	 mainPanel.add(eastPanel, BorderLayout.EAST);
	 mainPanel.add(westPanel, BorderLayout.WEST);
        
         //Panels Ouest
        
         westPanel.add(new JLabel("Joueur 1 :"));
        
         
         //Panel Est
         eastPanel.add(new JLabel("Joueur 2 :"));
         
         //Panels Sud
        btnquitter = new JButton("Quitter");
        southpanel.add(btnquitter, BorderLayout.EAST);
        btnquitter.setPreferredSize(new Dimension(250,50));
        
         //Panel Center
         centerPanel.setLayout(new GridLayout(3,3));
         int n = 3;
        for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
			 buttons[i][j] = new JButton();
			 buttons[i][j].setEnabled(true);
			 centerPanel.add(buttons[i][j]);
			}
		}
         
         
         
         
         
         
        window.setVisible(true);

    }
    
    public static void main(String [] args) {
        // Instanciation de la fenêtre
        Grille vuegrille = new Grille();
    }
}
