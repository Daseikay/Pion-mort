/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Théo
 */
public class Coup {
    
    private Joueur joueur;
    private Case caseJouee;

    public Coup(Joueur joueur, Case caseJouee){
        this.joueur = joueur;
        this.caseJouee = caseJouee;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public int getNumCase() {
        return caseJouee.getNumero();
    }

    
}
