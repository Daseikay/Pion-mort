package View;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public abstract class View extends Observable {

    public View(){}
    public void abonner(Observer observateur){ this.addObserver(observateur);}
    public abstract void setVisible(Boolean b);

}