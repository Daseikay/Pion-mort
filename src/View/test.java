/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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
 * @author Théo
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    // Définition des éléments de l'IHM
    JFrame window;
           
    JButton tournoi = new JButton("Tournoi");
    tournoi.setPreferredSize(new Dimension(250, 100));
    
    JButton vsIA = new JButton("Solo");
    vsIA.setPreferredSize(new Dimension(250,100));
            
    JButton deuxJoueurs = new JButton("1v1");
    deuxJoueurs.setPreferredSize(new Dimension(250,100));
    
    JButton regles = new JButton("Règles");
    regles.setPreferredSize(new Dimension(250,50));
    
    JButton quitter = new JButton("Quitter");
    quitter.setPreferredSize(new Dimension(250,50));
    
    
    //Création de l'IHM   
    window = new JFrame();
    window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    window.setSize(900,600);
    window.setTitle("Menu principal");
    window.setLocationRelativeTo(null);
    
    window.setResizable(false);
    
    //Placement des différents éléments et création de panels
    JPanel mainPanel = new JPanel(new BorderLayout());
    //mainPanel.setBackground(Color.WHITE);
    window.add(mainPanel);
    
    JPanel panelHaut = new JPanel();
    //panelHaut.setBackground(Color.WHITE);
    mainPanel.add(panelHaut, BorderLayout.NORTH);
    
    JPanel panelBas = new JPanel(new BorderLayout());
    //panelBas.setBackground(Color.WHITE);
    mainPanel.add(panelBas, BorderLayout.SOUTH);
    
    JPanel panelCentre = new JPanel(new GridBagLayout());
    //panelCentre.setBackground(Color.WHITE);
    mainPanel.add(panelCentre, BorderLayout.CENTER);
    
    GridBagConstraints gbc = new GridBagConstraints();
    
    gbc.weightx = 3;
    gbc.weighty = 3;
    
    gbc.gridx = 0;
    gbc.gridy = 0;
    
    panelCentre.add(vsIA, gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    
    panelCentre.add(deuxJoueurs, gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    
    
    panelCentre.add(tournoi, gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    
    panelBas.add(regles, BorderLayout.WEST);
    panelBas.add(quitter, BorderLayout.EAST);
    
 
    JLabel titre = new JLabel("MORPION");
    titre.setForeground(Color.DARK_GRAY);
    titre.setFont(new Font(titre.getFont().getName(), titre.getFont().getStyle(), (int) (titre.getFont().getSize() * 1.5)));
    panelHaut.add(titre);
              
            
            
    window.setVisible(true);        
    }
    
}
