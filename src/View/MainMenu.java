/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Message;

import java.awt.*;
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
public class MainMenu extends View {

    private final JFrame window;

    private final JButton tournoi;
    private final JButton vsIA;
    private final JButton deuxJoueurs;
    private final JButton regles;
    private final JButton quitter;

    
    public MainMenu(){
        // Définition des éléments de l'IHM

        tournoi = new JButton("Tournoi");
        tournoi.setPreferredSize(new Dimension(250, 100));

        vsIA = new JButton("Solo");
        vsIA.setPreferredSize(new Dimension(250,100));

        deuxJoueurs = new JButton("1v1");
        deuxJoueurs.setPreferredSize(new Dimension(250,100));

        regles = new JButton("Règles");
        regles.setPreferredSize(new Dimension(250,50));

        quitter = new JButton("Quitter");
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

        /* ACTION LISTENERS */

        //Lancement de la vue ModeTournoi
        tournoi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setChanged();
                notifyObservers(Message.TOURNOI);
                clearChanged();
            }
        });

        //Lancement de la vue Mode1v1
        deuxJoueurs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setChanged();
                notifyObservers(Message.DEUXJOUEURS);
                clearChanged();
            }
        });

        //Lancement de la vue Rules
        regles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setChanged();
                notifyObservers(Message.REGLES);
                clearChanged();
            }
        });
        
    }


    @Override
    public void setVisible(Boolean b) {
        window.setVisible(b);
    }

    public static void main(String [] args) {
        // Instanciation de la fenêtre
        MainMenu menu = new MainMenu();
    }
     
    }

    
    
    

