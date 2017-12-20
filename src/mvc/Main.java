/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import Controller.Controller;

/**
 *
 * @author Théo
 */
public class Main {
    
    
    
    
    
    
    
    public void Main(String[] args){
    Observé MainMenu= new Observé();
    Observateur Contoller = new Observateur();
    Observé.addObserver(Controller);
    
    }
}
