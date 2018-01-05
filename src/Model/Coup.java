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
        setJoueur(joueur);
        setCaseJouee(caseJouee);
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public int getNumCase() {
        return getCaseJouee().getNumero();
    }


    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public Case getCaseJouee() {
        return caseJouee;
    }

    public void setCaseJouee(Case caseJouee) {
        this.caseJouee = caseJouee;
    }
}
