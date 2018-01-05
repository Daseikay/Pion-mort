package View;

import Model.Joueur;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public abstract class View extends Observable {

    public View(){}
    public void abonner(Observer observateur){ this.addObserver(observateur);}
    public abstract void setVisible(Boolean b);


    public abstract void aClique(int arg, Joueur joueurCourant);

}