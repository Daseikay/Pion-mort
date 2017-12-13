package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Théo
 */
public class Joueur {
    private String pseudo;
    private Symbole symbole;
    
    
    public Joueur(String pseudo, Symbole symbole){
        this.pseudo = pseudo;
        this.symbole = symbole;
    }

    /**
     * @return the pseudo
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     * @return the symbole
     */
    public Symbole getSymbole() {
        return symbole;
    }
    
    @Override
    public String toString(){
        return this.pseudo + "(" + this.symbole + ")";
    }
      
}
