/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author barrerat
 */
class Symbole {
    
    private Forme forme;
    
    public Symbole(Forme forme){
        this.forme = forme;
    }

    /**
     * @return the forme
     */
    public Forme getForme() {
        return forme;
    }

    /**
     * @param forme the forme to set
     */
    public void setForme(Forme forme) {
        this.forme = forme;
    }
    
    public String toString(){
        if(this.forme == Forme.croix){
            return "X";
        }
        else{
            return "O";
        }
    }
    
    
}
