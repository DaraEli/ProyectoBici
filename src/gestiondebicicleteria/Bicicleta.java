/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondebicicleteria;

/**
 *
 * @author Usuario
 */
public class Bicicleta {
 String nroDeSerie;
 String Modelo;
 int Año;
 double Precio;

    public Bicicleta(String nroDeSerie, String Modelo, int Año) {
        this.nroDeSerie = nroDeSerie;
        this.Modelo = Modelo;
        this.Año = Año;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public double getPrecio() {
        return Precio;
    }

    public String getNroDeSerie() {
        return nroDeSerie;
    }
 
    
    
    
    
    
}
