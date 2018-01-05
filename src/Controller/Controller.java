package Controller;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Observer;
import Model.Case;
import Model.Coup;
import Model.Joueur;
import Model.Symbole;
import View.Options1v1;
import View.View;
import View.ViewGrille;

import Model.*;
import View.*;

import javax.swing.*;

public class Controller implements Observer {

    private ArrayList<View> views = new ArrayList<>();
    private ArrayList<Joueur> joueurs = new ArrayList<>();
    private ArrayList<Case> cases;
    private Joueur joueurCourant;
    private ArrayList<Coup> coups = new ArrayList<>();
    private ArrayList<Symbole> symboles;
    private Joueur premierJoueur;
    private String j;

    private MainMenu mainMenu = new MainMenu();
    private Options1v1 deuxJoueurs = new Options1v1();
    private Rules regles = new Rules();
    private ViewGrille grille;
    //private Win win = new Win();

    public Controller(ViewGrille grille){
        this.grille = grille;


        //Abonnement
        addView(mainMenu);
        addView(deuxJoueurs);
        addView(regles);
        addView(grille);
        //addView(win);

        this.cases = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            Case ca = new Case(i);
            cases.add(ca);
        }



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

        if(arg == Message.MSG){
            Coup c;

            if (!coups.isEmpty() && !this.lastPlayer().Won()){
                c = coups.get(coups.size() - 1);

                this.joueurCourant.supprDerniereCaseJouee();
                coups.remove(c);
            }
        }

        // Pour la vue "Mode1v1"
        if(arg == Message.RETOUR){
            ((View) o).setVisible(false);
            views.get(0).setVisible(true);
        }

        if (arg == Message.LANCERJEU){
            Coup c;
            launchGame();

            if (!coups.isEmpty()) {
                c = coups.get(coups.size() - 1);
                coups.clear();
                joueurCourant = switchPlayer(c.getJoueur());
            }
            else {
                joueurCourant = premierJoueur;
            }
            this.joueurs.get(0).resetCases();
            this.joueurs.get(1).resetCases();
            this.grille.nettoie();

            grille.setVisible(true);
        }

        if (arg instanceof Integer){
            Coup co = new Coup(joueurCourant, cases.get((int)arg));
            coups.add(co);

            grille.aClique((int)arg, joueurCourant);
            joueurCourant.getCasesJouees().add(cases.get((int)arg));

            if (joueurCourant.Won()) {
                this.grille.setEnableButton(false);
                //win.setVisible(true);
            }

            joueurCourant = switchPlayer();


        }

        if (arg == Message.QUITTER){
            ((View) o).setVisible(false);
            mainMenu.setVisible(true);
            joueurs.clear();

        }

        if (arg == Message.TOURNOI){
            JOptionPane erreur = new JOptionPane();
            erreur.showMessageDialog(null, "Mode de jeu indisponible.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }







    }


    public Joueur lastPlayer() {// Dernier joueur a avoir joué
        Joueur j;
        j = coups.get(coups.size() - 1).getJoueur();

        return j;
    }

    public void launchGame(){
        if (joueurs.isEmpty()) {
            //Joueur j1 = new Joueur((Symbole)deuxJoueurs.getSymboles().get(0));
            //Joueur j2 = new Joueur((Symbole)deuxJoueurs.getSymboles().get(1));
            Joueur j1 = new Joueur(Symbole.O);
            Joueur j2 = new Joueur(Symbole.X);
            joueurs.add(j1);
            joueurs.add(j2);
            premierJoueur = j1;
        }
        else {
            premierJoueur = switchPlayer(premierJoueur);
        }
    }


    private Joueur switchPlayer(Joueur j){ //Changer le premier joueur

        if (coups.size() != 0) {
            j = joueurs.get((joueurs.indexOf(lastPlayer()) + 1) % 2);
        }
        else {
            j = premierJoueur;
        }
        return j;
    }

    private Joueur switchPlayer(){ //Passer au joueur suivant

        Joueur j;
        if (coups.size() != 0) {
            j = joueurs.get((joueurs.indexOf(lastPlayer()) + 1) % 2);
        }
        else {
            j = premierJoueur;
        }
        return j;
    }


}
