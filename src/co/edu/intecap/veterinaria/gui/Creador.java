/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.veterinaria.gui;

import co.edu.intecap.veterinaria.Principal;
import co.edu.intecap.veterinaria.negocio.mascotas.Gato;
import co.edu.intecap.veterinaria.negocio.mascotas.Perro;
import co.edu.intecap.veterinaria.util.Utilidad;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

/**
 *
 * @author Capacitaciones
 */
public class Creador extends javax.swing.JDialog {

    private ArrayList<Perro> listaPerros;
    private ArrayList<Gato> listaGatos;

    /**
     * Creates new form Creador
     *
     * @param parent
     * @param modal
     * @param listaPerros
     * @param listaGatos
     */
    public Creador(java.awt.Frame parent, boolean modal, ArrayList<Perro> listaPerros, ArrayList<Gato> listaGatos) {

        super(parent, modal);
        initComponents();
        this.listaPerros = listaPerros;
        this.listaGatos = listaGatos;
        rbgMascota.add(rbPerro);
        rbgMascota.add(rbGato);
        pnPerro.setVisible(false);
        pnGato.setVisible(false);
        this.asignarListeners();

    }

    private void agregarMascota() {
        if (rbPerro.isSelected()) {
            this.agregarPerro();

        }
        if (rbGato.isSelected()) {
            this.agregarGato();

        }
    }
    
    private void limpiarPantalla(){
        txtNombre.setText("");
        txtEdad.setText("");
        txtPeso.setText("");
        txtRaza.setText("");
        txtDueno.setText("");
        txtTamano.setText("");
        txtColor.setBackground(Color.white);
        cbxCola.setSelected(false);
        cbxPelo.setSelected(false);
        cbxGarras.setSelected(false);
        rbgMascota.clearSelection();
        pnPerro.setVisible(false);
        pnGato.setVisible(false);
    }

    private void agregarPerro() {
        
            Perro perro = new Perro();
            perro.setNombre(txtNombre.getText());
            perro.setEdad(Integer.parseInt(txtEdad.getText()));
            perro.setPeso(Double.parseDouble(txtPeso.getText()));
            perro.setRaza(txtRaza.getText());
            perro.setDueno(txtDueno.getText());
            perro.setTamano(Double.parseDouble(txtTamano.getText()));
            perro.setCOLOR(txtColor.getBackground());
            perro.setCola(cbxCola.isSelected());
            perro.setEnergia(100);
            listaPerros.add(perro);

        

    }

    private void agregarGato() {
        Gato gato = new Gato();
        gato.setNombre(txtNombre.getText());
        gato.setEdad(Integer.parseInt(txtEdad.getText()));
        gato.setPeso(Double.parseDouble(txtPeso.getText()));
        gato.setRaza(txtRaza.getText());
        gato.setDueno(txtDueno.getText());
        gato.setPelo(cbxPelo.isSelected());
        gato.setGarras(cbxGarras.isSelected());
        gato.setEnergia(100);
        listaGatos.add(gato);

    }

    private void asignarListeners() {
        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton rb = (JRadioButton) e.getSource();
                if (rb.equals(rbPerro)) {
                    pnPerro.setVisible(true);
                    pnGato.setVisible(false);
                }
                if (rb.equals(rbGato)) {
                    pnPerro.setVisible(false);
                    pnGato.setVisible(true);

                }
            }
        };
        rbPerro.addActionListener(accion);
        rbGato.addActionListener(accion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgMascota = new javax.swing.ButtonGroup();
        jSpinner1 = new javax.swing.JSpinner();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtDueno = new javax.swing.JTextField();
        pnPerro = new javax.swing.JPanel();
        txtTamano = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxCola = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        btnSelecionarColor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnGato = new javax.swing.JPanel();
        cbxGarras = new javax.swing.JCheckBox();
        cbxPelo = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();
        rbPerro = new javax.swing.JRadioButton();
        rbGato = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaActionPerformed(evt);
            }
        });

        jLabel6.setText("Tamaño:");

        cbxCola.setText("Cola");

        jLabel7.setText("Color");

        txtColor.setEditable(false);

        btnSelecionarColor.setText("Seleccionar Color");
        btnSelecionarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPerroLayout = new javax.swing.GroupLayout(pnPerro);
        pnPerro.setLayout(pnPerroLayout);
        pnPerroLayout.setHorizontalGroup(
            pnPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPerroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPerroLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTamano))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPerroLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelecionarColor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                        .addComponent(cbxCola))))
        );
        pnPerroLayout.setVerticalGroup(
            pnPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPerroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCola)
                    .addComponent(jLabel7)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecionarColor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Nombre:");

        jLabel2.setText("Edad:");

        jLabel3.setText("Peso:");

        jLabel4.setText("Raza:");

        jLabel5.setText("Dueño:");

        cbxGarras.setText("Garras");

        cbxPelo.setText("Pelo");

        javax.swing.GroupLayout pnGatoLayout = new javax.swing.GroupLayout(pnGato);
        pnGato.setLayout(pnGatoLayout);
        pnGatoLayout.setHorizontalGroup(
            pnGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGatoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxGarras, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbxPelo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnGatoLayout.setVerticalGroup(
            pnGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGatoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxGarras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxPelo))
        );

        btnGuardar.setText("Guardar Mascota");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        rbPerro.setText("Perro");

        rbGato.setText("Gato");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(txtEdad)
                            .addComponent(txtPeso)
                            .addComponent(txtRaza)
                            .addComponent(txtDueno)))
                    .addComponent(pnGato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbPerro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbGato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar))
                            .addComponent(pnPerro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPerro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnGato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(rbPerro)
                    .addComponent(rbGato))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            this.agregarMascota();
            Utilidad.lanzaAlerta(this, "la mascota ha sido agregada", "registro de mascota", JOptionPane.INFORMATION_MESSAGE);
            Principal.actualizarListas();
            this.limpiarPantalla();
           
            

        } catch (Exception e) {
            Utilidad.lanzaAlerta(this, "Los datos del formulario son incorrectos", "Error dato numerico", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSelecionarColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarColorActionPerformed
        Color color = JColorChooser.showDialog(this, "selecionar color", Color.DARK_GRAY);
        txtColor.setBackground(color);

    }//GEN-LAST:event_btnSelecionarColorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSelecionarColor;
    private javax.swing.JCheckBox cbxCola;
    private javax.swing.JCheckBox cbxGarras;
    private javax.swing.JCheckBox cbxPelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel pnGato;
    private javax.swing.JPanel pnPerro;
    private javax.swing.JRadioButton rbGato;
    private javax.swing.JRadioButton rbPerro;
    private javax.swing.ButtonGroup rbgMascota;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDueno;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTamano;
    // End of variables declaration//GEN-END:variables
}