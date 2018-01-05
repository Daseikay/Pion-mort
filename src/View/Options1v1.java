/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Message;


import Model.Joueur;
import Model.Symbole;
import static Model.Symbole.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author avognonm
 */
public class Options1v1 extends View {
    private final JFrame window;
    private final JButton btnlaunchgame;
    private final JButton btnretour;
    private final JPanel mainPanels;
    private final JLabel j1;
    private final JLabel j2;
    private final JComboBox listedep;
    private final JComboBox listedep2;
    private final JPanel panelBoutons;

    public Options1v1(){
        window = new JFrame();
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        window.setSize(800,200);
        window.setTitle("Mode de Jeu : 1v1");
        window.setLocationRelativeTo(null);

        window.setResizable(false);

        mainPanels = new JPanel(new GridLayout(3,3,10,10));
        window.add(mainPanels);

        j1 = new JLabel("Joueur 1", SwingConstants.CENTER);
        j2= new JLabel("Joueur 2", SwingConstants.CENTER);

        ArrayList<Symbole> symbole = new ArrayList<>();
        symbole.add(X);
        symbole.add(O);

        this.listedep = new JComboBox(symbole.toArray());
        this.listedep2 = new JComboBox(symbole.toArray());



        this.btnretour = new JButton("Retour") ;
        this.btnlaunchgame= new JButton("Lancer Jeu");




        this.panelBoutons = new JPanel(new GridLayout(1,3));
        mainPanels.add(this.panelBoutons, BorderLayout.SOUTH);




        panelBoutons.add(btnretour);
        panelBoutons.add(new JLabel());
        panelBoutons.add(btnlaunchgame);


        mainPanels.add(new JLabel());
        mainPanels.add(j1);
        mainPanels.add(j2);
        mainPanels.add(new JLabel("Votre Symbole: "));
        mainPanels.add(listedep);
        mainPanels.add(listedep2);
        mainPanels.add(new JLabel());
        mainPanels.add(new JLabel());
        mainPanels.add(new JLabel());

        window.add(this.panelBoutons, BorderLayout.SOUTH);

        /* GESTION DES ACTION LISTENERS */

        btnretour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setChanged();
                notifyObservers(Message.RETOUR);
                clearChanged();
            }
        });

        btnlaunchgame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setChanged();
                notifyObservers(Message.LANCERJEU);
                clearChanged();
            }
        });



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
        Options1v1 options1v1 = new Options1v1();
    }


    public ArrayList getSymboles(){
        ArrayList<Symbole> symboles = new ArrayList<>();

        if (listedep.getSelectedItem().toString() == "X" || (listedep2.getSelectedItem().toString() == "X")){
            symboles.add(Symbole.X);
        }else if(listedep.getSelectedItem().toString() == "O" || (listedep2.getSelectedItem().toString() == "O")){
            symboles.add(Symbole.O);
        }

        return symboles;
    }






}
