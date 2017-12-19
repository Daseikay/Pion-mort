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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.Year;
import java.util.Date;
import java.util.Observable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Théo
 */
public class MainMenu extends Observable {
    
    private final JFrame window;
    private final JButton tournament;
    private final JButton solo;
    private final JButton twoPlayers;
    private final JButton rules;
    private final JButton exit;
    
    public MainMenu(){
        window = new JFrame();
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        window.setSize(800,500);
        window.setTitle("Menu principal");
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
    }
        //Ouverture de la fenètre rêgles quand click sur btn//
    public MainMenu (JButton regles){
    regles.addMouseListener(
            new MouseListener(){
            
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("On a cliquer sur le bouton 'rêgles' ");
        }

        @Override
        public void mousePressed(MouseEvent e) {   
        }

        @Override
        public void mouseReleased(MouseEvent e) { 
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
                
                
            
            }
    
    
    );
    
    
    
    
    
    }
}
    
    
    

