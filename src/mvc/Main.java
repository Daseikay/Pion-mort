/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 */
package mvc;
import Controller.*;
import View.ViewGrille;

/**
 *
 * @author Théo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ViewGrille grille = new ViewGrille();
        Controller controleur = new Controller(grille);
    }

}
