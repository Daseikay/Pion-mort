/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author avognonm
 */
public abstract class Controller implements Observer {
    
    
    
    
    @Override
    public void update(Observable o, Object arg){
        System.out.println("On a cliquer sur le bouton 'rêgles' ");
    }
    
    
    
    
    
    
    
}
