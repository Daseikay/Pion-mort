package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Théo
 */
public class Joueur {
    private String pseudo;
    private int score;
    private Symbole symbole;
    private ArrayList<Case> casesJouees = new ArrayList<>();


    public Joueur (String nom,Symbole symbole) {
        this.setPseudo(nom);
        this.setScore(0);
        this.setSymbole(symbole);
    }

    public Symbole getSymbole() {
        return symbole;
    }

    public ArrayList<Case> getCasesJouees() {
        return casesJouees;
    }

    public void resetCases(){
        getCasesJouees().clear();
    }


    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score + 1;
    }

    public void setSymbole(Symbole symbole) {
        this.symbole = symbole;
    }

    public void setCasesJouees(ArrayList<Case> casesJouees) {
        this.casesJouees = casesJouees;
    }

    public boolean Won(){
        boolean win = false;

        for(Case x : casesJouees){
            if(x.getNumero() == 1){
                for(Case y : casesJouees){
                    for(Case z : casesJouees){
                        if((y.getNumero() == 2 && z.getNumero() == 3) || (y.getNumero() == 4 && z.getNumero() == 7) || (y.getNumero() == 5 && z.getNumero() == 9)){
                            win = true;
                        }
                    }
                }
            }
            else if(x.getNumero() == 7){
                for(Case y : casesJouees){
                    for(Case z : casesJouees){
                        if((y.getNumero() == 8 && z.getNumero() == 9) || (y.getNumero() == 5 && z.getNumero() == 3)){
                            win = true;
                        }
                    }
                }
            }
            else if(x.getNumero() == 2){
                for(Case y : casesJouees){
                    for(Case z : casesJouees){
                        if(y.getNumero() == 5 && z.getNumero() == 8){
                            win = true;
                        }
                    }
                }
            }

            else if(x.getNumero() == 3){
                for(Case y : casesJouees){
                    for(Case z : casesJouees){
                        if(y.getNumero() == 6 && z.getNumero() == 9){
                            win = true;
                        }
                    }
                }
            }

            else if(x.getNumero() == 4){
                for(Case y : casesJouees){
                    for(Case z : casesJouees){
                        if(y.getNumero() == 5 && z.getNumero() == 6){
                            win = true;
                        }
                    }
                }
            }
        }
        return win;
    }






}
