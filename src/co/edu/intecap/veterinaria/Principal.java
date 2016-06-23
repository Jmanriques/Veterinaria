/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.veterinaria;

import co.edu.intecap.veterinaria.gui.Creador;
import co.edu.intecap.veterinaria.gui.Gestor;
import co.edu.intecap.veterinaria.gui.Visualizador;
import co.edu.intecap.veterinaria.negocio.mascotas.Gato;
import co.edu.intecap.veterinaria.negocio.mascotas.Perro;
import co.edu.intecap.veterinaria.util.Utilidad;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Capacitaciones
 */
public class Principal extends javax.swing.JFrame {
    
    private static ArrayList<Perro> listaPerros;
    private static ArrayList<Gato> listaGatos;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        listaPerros = new ArrayList<>();
        listaGatos = new ArrayList<>();
        setResizable(false);
        setLocationRelativeTo(null);
        asignarListeners();
        
    }
    
    public static void actualizarListas(){
        lstPerros.removeAll();
        DefaultListModel<String> modeloPerro = new DefaultListModel<>();
        for (Perro perro: listaPerros) {
            modeloPerro.addElement(perro.getNombre());
        }
        lstPerros.setModel(modeloPerro)
                ;
        lstGatos.removeAll();
        DefaultListModel<String> modeloGato = new DefaultListModel<>();
         for (Gato gato: listaGatos) {
            modeloGato.addElement(gato.getNombre());
        }
         lstGatos.setModel(modeloGato);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane3 = new javax.swing.JScrollPane();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPerros = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstGatos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnDetalle = new javax.swing.JButton();
        btnActividades = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstPerros);

        jScrollPane4.setViewportView(lstGatos);

        jLabel1.setText("Lista de Perros");

        jLabel2.setText("Lista de Gatos");

        btnCrear.setText("Crear Mascota");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnDetalle.setText("Detalle de Mascota");
        btnDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleActionPerformed(evt);
            }
        });

        btnActividades.setText("Actividades");
        btnActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDetalle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActividades)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        new Creador(this,false,listaPerros, listaGatos).setVisible(true);

    }//GEN-LAST:event_btnCrearActionPerformed
//MENSAJE DE ALERTA DE ESCOGENCIA DE MASCOTA
    private void btnDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleActionPerformed
        if(lstPerros.getSelectedIndex()<0 && lstGatos.getSelectedIndex()<0){
            Utilidad.lanzaAlerta(this, "debe seleccionar una mascota", "seleccion de mascotas", JOptionPane.WARNING_MESSAGE);
            
        }
        if(lstPerros.getSelectedIndex()> -1){
            Perro perro = listaPerros.get(lstPerros.getSelectedIndex());
        new Visualizador(this, true,perro).setVisible(true);
    }
        if(lstGatos.getSelectedIndex()> -1){
            Gato gato = listaGatos.get(lstGatos.getSelectedIndex());
        new Visualizador(this, true,gato).setVisible(true);
    }
        
    }//GEN-LAST:event_btnDetalleActionPerformed

    private void btnActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesActionPerformed
       if(lstPerros.getSelectedIndex()<0 && lstGatos.getSelectedIndex()<0){
            Utilidad.lanzaAlerta(this, "debe seleccionar una mascota", "seleccion de mascotas", JOptionPane.WARNING_MESSAGE);
            
        }
        if(lstPerros.getSelectedIndex()> -1){
            Perro perro = listaPerros.get(lstPerros.getSelectedIndex());
        new Gestor(this, true,perro).setVisible(true);
    }
        if(lstGatos.getSelectedIndex()> -1){
            Gato gato = listaGatos.get(lstGatos.getSelectedIndex());
        new Gestor(this, true,gato).setVisible(true);
    }
        
    }//GEN-LAST:event_btnActividadesActionPerformed
    //para anular la seleccion opuesta se hace este metodo
    private void asignarListeners(){
        ListSelectionListener selector = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                JList<String> lista = (JList<String>) e.getSource();
             if (lista.equals(lstPerros)){
                 lstGatos.clearSelection();
             }
             if (lista.equals(lstGatos)){
                 lstPerros.clearSelection();
                 
             }   
            }
        };
        lstPerros.addListSelectionListener(selector);
        lstGatos.addListSelectionListener(selector);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnDetalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private static javax.swing.JList<String> lstGatos;
    private static javax.swing.JList<String> lstPerros;
    // End of variables declaration//GEN-END:variables
}
