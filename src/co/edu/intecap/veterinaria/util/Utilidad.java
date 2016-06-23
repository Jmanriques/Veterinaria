/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.veterinaria.util;

import co.edu.intecap.veterinaria.negocio.mascotas.Perro;
import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Capacitaciones
 */
public class Utilidad {

    private static final String RUTA_ARCHIVO = "C:/archivo_veterinaria/";

    private static void validarRuta() {

        File directorio = new File(RUTA_ARCHIVO);
        if (!directorio.exists()) {
            directorio.mkdirs();

        }
    }

    /**
     *
     * @param listaPerros
     */
    public static void escribirArchivoPerros(ArrayList<Perro> listaPerros) {
        try {
            StringBuilder linea = new StringBuilder("|");
            for (Perro perro : listaPerros) {
                linea = linea.append(perro.getNombre()).append(",");
                linea = linea.append(perro.getEdad()).append(",");
                linea = linea.append(perro.getPeso()).append(",");
                linea = linea.append(perro.getRaza()).append(",");
                linea = linea.append(perro.getDueno()).append(",");
                linea = linea.append(perro.getEnergia()).append(",");
                linea = linea.append(perro.getTamano()).append(",");
                linea = linea.append(perro.getCOLOR().toString()).append(",");
                linea = linea.append(perro.isCola()).append("|");

            }
            validarRuta();
            PrintStream escritor = new PrintStream(RUTA_ARCHIVO + "archivo_perro.txt");
            escritor.print(linea.toString());
            escritor.flush();
            escritor.close();

        } catch (Exception e) {
        }

    }

    private static void  leerArchivosPerros (ArrayList<Perro> listaPerros) {
         listaPerros = new ArrayList<>();

        try {
            validarRuta();
            //lectura de archivo plano externo
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(RUTA_ARCHIVO + "archivo_perro.txt")
                    )
            );

            StringBuilder contenido = new StringBuilder();
            while (br.ready()) {
                contenido = contenido.append(br.readLine());//para asignar la linea que llega al archivo
            }
            
            prepararListaPerros(listaPerros,contenido.toString());
            br.close();

        } catch (Exception e) {
        }
        
    }
    //se realiza los arreglos de separacion de caracteres
    private static void prepararListaPerros(ArrayList<Perro> listaPerros, String lineaPerros) {
        String[] arregloPerros = lineaPerros.split("|");
        for (String perro : arregloPerros) {
                String[] atributosPerro = perro.split(",");
                listaPerros.add(asignarAtributosPerro(atributosPerro));
                
        }
    }

    private static Perro asignarAtributosPerro(String[] atributos){
        Perro perro = new Perro();
        perro.setNombre(atributos[0]);
        perro.setEdad(Integer.parseInt(atributos[1]));
        perro.setPeso(Double.parseDouble(atributos[2]));
        perro.setRaza(atributos[3]);
        perro.setDueno(atributos[4]);
        perro.setEnergia(Double.parseDouble(atributos[5]));
        perro.setTamano(Double.parseDouble(atributos[6]));
        perro.setCOLOR(Color.getColor(atributos[7]));
        perro.setCola(Boolean.parseBoolean(atributos[8]));
        
        return perro;
        
    }
    
    public static void lanzaAlerta(Component padre, String mensaje, String titulo, int tipo) {
        JOptionPane.showMessageDialog(padre, mensaje, titulo, tipo);
    }

}
