package View;

import Model.Joueur;

import javax.swing.*;

public class Win extends View {
    private final JFrame window;
    private final JPanel mainPanel;
    private String joueur;



    public Win(String joueur){
        this.joueur = joueur;

        //Création de l'IHM

        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(800,100);
        window.setTitle("Victoire");
        window.setLocationRelativeTo(null);

        mainPanel = new JPanel();
        //pan.setBackground(Color.WHITE);

        JLabel text = new JLabel("<html><body>Le joueur" + joueur + "a gagné la partie !</body></html>");
        mainPanel.add(text);

        window.add(mainPanel);

        window.setResizable(false);

    }

    @Override
    public void setVisible(Boolean b) {
        window.setVisible(b);
    }

    @Override
    public void aClique(int arg, Joueur joueurCourant) {

    }


    public static void main(String [] args) {
        // Instanciation de la fenêtre
        String joueur = "lol";
        Win win = new Win(joueur);
    }

}
