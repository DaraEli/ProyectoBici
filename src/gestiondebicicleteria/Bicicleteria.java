/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondebicicleteria;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Bicicleteria {
 ArrayList <Bicicleta> bicicletas;  
 double ganancia;
 int cantidadDeVentas;

    public Bicicleteria() {
    }
    
  void addBicicleta(Bicicleta nuevaBici){
  
    bicicletas.add(nuevaBici);
  }  
  
  void venderBicicleta(Bicicleta bicicleta){
    cantidadDeVentas ++;
    ganancia=ganancia + bicicleta.getPrecio();
    bicicletas.remove(bicicleta);
  }
  
  Bicicleta buscarBicicleta (String nroDeSerie){
    for(int i=0; i<bicicletas.size(); i++){
        if(nroDeSerie.equals(bicicletas.get(i).getNroDeSerie())){
             return bicicletas.get(i);
        }
        
  }
    
    return null;
  }
  
}
