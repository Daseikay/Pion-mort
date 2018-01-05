/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Joueur;

import java.awt.*;
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
public class Rules extends View {
    
    private final JFrame window;
    private final JPanel mainPanel;



    public Rules(){
        // Définition des éléments de l'IHM

        //Création de l'IHM

        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(800,100);
        window.setTitle("Règles");
        window.setLocationRelativeTo(null);

        mainPanel = new JPanel();
        //pan.setBackground(Color.WHITE);

        JLabel text = new JLabel("<html><body>Les règles de ce jeu sont très simples.<br />"
                + "Pour gagner, un des deux joueurs doit aligner n formes."
                + "<br />'n' étant le nombre de lignes/colonnes de la grille de jeu.</body></html>");
        mainPanel.add(text);

        window.add(mainPanel);

        window.setResizable(false);

    }

    @Override
    public void setVisible(Boolean b) {
        window.setVisible(b);
    }

    @Override
    public void aClique(int arg, Joueur joueurCourant) {

    }


    public static void main(String [] args) {
        // Instanciation de la fenêtre 
        Rules vuereg = new Rules();
}


    
}
