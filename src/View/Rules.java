/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;
import java.util.Date;
import java.util.Observable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author avognonm
 */
public class Rules extends Observable {
    
    private final JFrame windows;
    private final JButton btnexit;
    private final JPanel mainPanels;
    private final JPanel panelBoutons ;
    private final JLabel règle;
    
    
    
    public Rules(){
        windows = new JFrame();
        windows.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        windows.setSize(800,125);
        windows.setTitle("Règles");
        windows.setLocationRelativeTo(null);
        mainPanels = new JPanel(new GridLayout(2,1));
        windows.add(mainPanels);
        
        
        
        règle = new JLabel("<html><body>Les règles de ce jeu sont très simples.<br />"
                + "Pour gagner, un des deux joueurs doit aligner n formes."
                + "<br />'n' étant le nombre de lignes/colonnes de la grille de jeu.</body></html>", SwingConstants.CENTER);
        
      mainPanels.add(règle);
      
        
     this.panelBoutons = new JPanel(new GridLayout(1,2));
     this.panelBoutons.setOpaque(false);
     mainPanels.add(this.panelBoutons, BorderLayout.SOUTH);
     
     this.btnexit = new JButton("Exit") ;
     panelBoutons.add(btnexit);
    
     panelBoutons.add(new JLabel(""));
     
     
     windows.setVisible(true);
        
    }



    
     public static void main(String [] args) {
        // Instanciation de la fenêtre 
        Rules vuereg = new Rules();
}


    
}
