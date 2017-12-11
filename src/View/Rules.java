/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;
import java.util.Date;
import java.util.Observable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author avognonm
 */
public class Rules extends Observable {
    
    private final JFrame windows;
    private final JButton exit;
    
    public Rules(){
        windows = new JFrame();
        windows.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        windows.setSize(800,500);
        windows.setTitle("Rêgles");
        windows.setLocationRelativeTo(null);
        
        windows.setVisible(true);
    
    }
    
    
}
