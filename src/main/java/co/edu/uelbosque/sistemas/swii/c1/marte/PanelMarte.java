/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

import co.edu.uelbosque.sistemas.swii.c1.marte.Tablero;
import java.awt.BorderLayout;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Scabrera
 */
public class PanelMarte extends JComponent {

    private final JFrame jf = new JFrame("Marte");
    private Tablero tablero = new Tablero();
   
    public PanelMarte(){}
    
    public PanelMarte(Tablero tablero) {
     this.tablero = tablero;
    }
    
    @Override
    public void paintComponent(Graphics g){
    g.drawLine(tablero.getX()*100, tablero.getY(), 100, tablero.getX());
    
    }

    void montarTablero(Tablero t) {

        PanelMarte p = new PanelMarte();
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);

        jf.getContentPane().setLayout(new BorderLayout());
        jf.getContentPane().add(p, BorderLayout.CENTER);
        jf.setVisible(true);
        jf.setSize(t.getX() * 100, t.getY() * 100);
        
    }

}
