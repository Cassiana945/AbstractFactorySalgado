package Modelos;

import FabricasIngredientes.SalgadoIngredientesFactory;

public class Empada extends Salgado {

    private SalgadoIngredientesFactory ingredientes;


    public Empada(String massa, String molho, String recheio){
         super(massa, molho, recheio);
}

}
