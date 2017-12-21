/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Case;
import Model.Morpion;
import Model.Joueur;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



/**
 *
 * @author Théo
 */
public class ViewCase {
    
    private Morpion morpion;
    private Case modele;
    
    private JButton bouton;
    private JLabel label;
    
    
    public ViewCase(Morpion morpion, Case modele){
        this.morpion = morpion;
        this.modele = modele;
        
        bouton = new JButton();
        label = new JLabel();
        
        label.setLayout(new BorderLayout());
        label.add(bouton, BorderLayout.CENTER);
        
	bouton.addActionListener(new ActionListener() {

            @Override
		public void actionPerformed(ActionEvent evenement) {
			jouer();
		}

	});

    }
    
    

    
    
    
    
}
