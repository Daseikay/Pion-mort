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
public class Case {

    private int numC;

    public Case (int numC){
        this.numC = numC + 1;   //Retourne le numéro de la case sur la grille (+1 car stockée dans une ArrayList de cases)
    }

    public int getNumero() {
        return numC;
    }

}
