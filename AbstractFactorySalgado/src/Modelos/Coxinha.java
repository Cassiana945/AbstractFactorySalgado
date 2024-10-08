package Modelos;

import FabricasIngredientes.SalgadoIngredientesFactory;

public class Coxinha extends Salgado {

   private SalgadoIngredientesFactory ingredientes;


    public Coxinha(String massa, String molho, String recheio){
         super(massa, molho, recheio);
}

}
