/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar Aron Romero Camacho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creamos un arreglo y creamos bastantes dimensiones para haci crear una lista
    CasiLista aArregloLista[] = new CasiLista[10];
        aArregloLista[0] = new <Integer>CasiLista();
        aArregloLista[1] = new <Integer>CasiLista();
        aArregloLista[2] = new <Integer>CasiLista();
        aArregloLista[3] = new <Integer>CasiLista();
        aArregloLista[4] = new <Integer>CasiLista();
        aArregloLista[5] = new <Integer>CasiLista();
        aArregloLista[6] = new <Integer>CasiLista();
        aArregloLista[7] = new <Integer>CasiLista();
        aArregloLista[8] = new <Integer>CasiLista();
        aArregloLista[9] = new <Integer>CasiLista();
        aArregloLista[0].setTipoDato(100);
        System.out.println(aArregloLista[0].getTipoDato());
    }
    
}
class CasiLista<CUALQUIER_DATO>{
    private CUALQUIER_DATO tipoDato;

    public CUALQUIER_DATO getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(CUALQUIER_DATO tipoDato) {
        this.tipoDato = tipoDato;
    }
}