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

/**
 *
 * @author avognonm
 */
public class Controller implements Observer {

    private ArrayList<View> views = new ArrayList<>();

    public Controller(){

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
            ((MainMenu) o).setVisible(false);
            views.get(1).setVisible(true);
        }

        if(arg == Message.REGLES){
            views.get(2).setVisible(true);
        }





        // Pour la vue "Mode1v1"
        if(arg == Message.RETOUR){
            ((Mode1v1) o).setVisible(false);
            views.get(0).setVisible(true);
        }
    }
    
    
    
    
    
    
}
