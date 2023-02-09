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
    }
 
 
}
