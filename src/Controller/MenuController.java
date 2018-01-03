/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import Model.*;
import View.*;

import javax.swing.*;

/**
 *
 * @author avognonm
 */
public class MenuController extends AbstractController {

    private ArrayList<View> views = new ArrayList<>();

    public MenuController(){

        //Création des vues
        MainMenu mainMenu = new MainMenu();
        Mode1v1 deuxJoueurs = new Mode1v1();
        Rules regles = new Rules();

        //Abonnement
        addView(mainMenu);
        addView(deuxJoueurs);
        addView(regles);

        mainMenu.setVisible(true); // Pour l'initialisation du jeu
    }

    public void addView(View view){
        view.abonner(this);
        views.add(view);
    }

    @Override
    public void update(Observable o, Object arg){
        if(arg == Message.DEUXJOUEURS){
            ((View) o).setVisible(false);
            views.get(1).setVisible(true);
        }

        if(arg == Message.REGLES){
            views.get(2).setVisible(true);
        }


        if(arg == Message.QUITTER){
            ((View) o).setVisible(false);
        }


        if(arg == Message.IA){
            JOptionPane erreur = new JOptionPane();
            erreur.showMessageDialog(null, "Mode de jeu indisponible.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }


        // Pour la vue "Mode1v1"
        if(arg == Message.RETOUR){
            ((View) o).setVisible(false);
            views.get(0).setVisible(true);
        }
    }
    
    
    
    
    
    
}
