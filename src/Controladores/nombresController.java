/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author dmiranda
 */
public class nombresController implements ActionListener {
 frmPrincipal VistaPrincipal = new frmPrincipal();

 public nombresController(frmPrincipal Vistap)
 {
     this.VistaPrincipal = Vistap;
     
     //PONER A LA ESCUCHA LOS BOTONES ANTES DE LEVANTAR LA VISTA PRINCIPAL
     this.VistaPrincipal.btnCatedrático.addActionListener(this);
     this.VistaPrincipal.btnFabian.addActionListener(this);
     this.VistaPrincipal.BtnRieckof.addActionListener(this);
     this.VistaPrincipal.btnAlex.addActionListener(this);
     this.VistaPrincipal.btnIsmar.addActionListener(this);
     this.VistaPrincipal.btnCarlos.addActionListener(this);
     this.VistaPrincipal.btnDaniel.addActionListener(this);
     this.VistaPrincipal.btnJordy.addActionListener(this);
     this.VistaPrincipal.btnJuanjo.addActionListener(this);
     //LEVANTAR LA VISTA PRINCIPAL QUE CONTIENE TODOS LOS BOTONES DE ESTUDIANTES
     this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
     this.VistaPrincipal.setVisible(true);
 }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnCatedrático)
        {
            JOptionPane.showMessageDialog(null, "Mi nombre es: DANY MIRANDA", "PROBANDO MVC", 2 );
        }
        if(e.getSource()==this.VistaPrincipal.btnFabian)
        {
            JOptionPane.showMessageDialog(null, "Mi nombre es: Fabian Garcia", "PROBANDO MVC", 2 );
        }
         if(e.getSource()==this.VistaPrincipal.BtnRieckof)
        {
            JOptionPane.showMessageDialog(null, "Mi nombre es: Jose Rieckof", "PROBANDO MVC", 2 );
        }
         if(e.getSource()==this.VistaPrincipal.btnAlex)
        {
            JOptionPane.showMessageDialog(null, "Mi nombre es: Alex Avila", "PROBANDO MVC", 2 );
        }
        if(e.getSource()==this.VistaPrincipal.btnIsmar)
        {
            JOptionPane.showMessageDialog(null, "Mi nombre es: Ismar Figueroa", "PROBANDO MVC", 2 );
        }
        if(e.getSource()==this.VistaPrincipal.btnCarlos)
        {
            JOptionPane.showMessageDialog(null, "Mi nombre es: Carlos Cardona", "PROBANDO MVC Carlos", 2 );
        }
        if(e.getSource()==this.VistaPrincipal.btnDaniel)
        {
            JOptionPane.showMessageDialog(null, "Mi nombre es: Daniel Martinez", "PROBANDO MVC", 2 );
        }
        if(e.getSource()==this.VistaPrincipal.btnJordy)
        {
            JOptionPane.showMessageDialog(null, "Mi nombre es: Jordy Aguilar", "PROBANDO MVC", 2 );
        }  
        if(e.getSource()==this.VistaPrincipal.btnJuanjo)
        {
            JOptionPane.showMessageDialog(null, "Mi nombre es: Juan José Sales", "PROBANDO MVC", 2);
        }
    }
 
 
}
