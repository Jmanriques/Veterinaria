/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.veterinaria.negocio.mascotas;

import co.edu.intecap.veterinaria.negocio.Animal;
import co.edu.intecap.veterinaria.negocio.Mascota;

/**
 *
 * @author Capacitaciones
 */
public class Gato extends Mascota implements Animal {

    private boolean pelo;
    private boolean garras;

    @Override
    public void comer(double comida) {

        this.setPeso(this.getPeso() + (comida * 0.03));
        this.setEnergia(this.getEnergia() + 10);
        this.validarEnergia();
    }

    @Override
    public void defecar() {
        System.out.println("ya fui al baño, recoje mi regalito");
        this.setPeso(this.getPeso() * 0.02);

    }

    @Override
    public void beber(double bebida) {
        this.setPeso(this.getPeso() + (bebida * 0.01));
    }

    @Override
    public void jugar() {
        super.jugar(); //To change body of generated methods, choose Tools | Templates.
        this.setPeso(this.getPeso() / 0.10);
        
    }

    public void aranar() {
        System.out.println("te rasgune por fastidioso");
        this.setEnergia(this.getEnergia() - 7);
        this.validarEnergia();
    }

    public void lamer() {
        System.out.println("me estoy limpiando");
        this.setEnergia(this.getEnergia() - 13);
        this.validarEnergia();
    }

    public void maullar() {
        System.out.println("miau..... miau..... miau....");
    }

    /**
     * @return the pelo
     */
    public boolean isPelo() {
        return pelo;
    }

    /**
     * @param pelo the pelo to set
     */
    public void setPelo(boolean pelo) {
        this.pelo = pelo;
    }

    /**
     * @return the garras
     */
    public boolean isGarras() {
        return garras;
    }

    /**
     * @param garras the garras to set
     */
    public void setGarras(boolean garras) {
        this.garras = garras;
    }

    
    
}
