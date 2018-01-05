package View;

import Controller.Message;
import Model.Joueur;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class ViewGrille extends View {

    private final JFrame window;
    private final JButton btnquitter;
    private ArrayList<JButton> buttons = new ArrayList<>();
    private final JPanel mainPanel = new JPanel();
    private final JPanel northPanel = new JPanel();
    private final JPanel westPanel = new JPanel();
    private final JPanel eastPanel = new JPanel();
    private final JPanel southpanel = new JPanel();
    private final JPanel centerPanel = new JPanel();


    public ViewGrille(){

        window = new JFrame();
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        window.setSize(600,400);
        window.setTitle("Mode de Jeu : 1v1");
        window.setLocationRelativeTo(null);

        window.setResizable(false);


        window.add(mainPanel);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(southpanel, BorderLayout.SOUTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(eastPanel, BorderLayout.EAST);
        mainPanel.add(westPanel, BorderLayout.WEST);

        //Panels Ouest

        westPanel.add(new JLabel("Joueur 1 :"));


        //Panel Est
        eastPanel.add(new JLabel("Joueur 2 :"));

        //Panels Sud
        btnquitter = new JButton("Quitter");
        southpanel.add(btnquitter, BorderLayout.EAST);
        btnquitter.setPreferredSize(new Dimension(250,50));




        //Panel Center
        centerPanel.setLayout(new GridLayout(3,3));
        for (int i=1; i<=9; i++) {
            JButton button = new JButton() ;
            button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            button.setBackground(Color.white);
            centerPanel.add(button);
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    setChanged();
                    int msg = getButtons().indexOf(button);
                    UIManager.put("Button.DisabledText", Color.BLACK);
                    notifyObservers(msg);
                    clearChanged();
                }

            });

            buttons.add(button);

            btnquitter.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setChanged();
                    notifyObservers(Message.QUITTER);
                    clearChanged();
                }
            });



    }}

    public ArrayList<JButton> getButtons() {
        return buttons;
    }


    public void aClique(int arg, Joueur jCourant) {
        //dès qu'un joueur clicque sur une case de
        //l'ihm graphique cette fonction se déclenche
        //et desactive la case cliqué et affiche le
        //symbole

        buttons.get(arg).setFont(new Font("Calibri", Font.PLAIN, 100));
        buttons.get(arg).setText(jCourant.getSymbole().name());
        buttons.get(arg).setEnabled(false);

    }




    @Override
    public void setVisible(Boolean b) {
        window.setVisible(b);
    }

    public static void main(String [] args) {
        // Instanciation de la fenêtre
        ViewGrille vuegrille = new ViewGrille();
    }

    public void setEnableButton(boolean bool) {
        for (JButton b : buttons) {
            b.setEnabled(bool);
        }
    }

    public void nettoie(){
        for(JButton b: this.buttons){
            b.setText(null);
        }

}}
