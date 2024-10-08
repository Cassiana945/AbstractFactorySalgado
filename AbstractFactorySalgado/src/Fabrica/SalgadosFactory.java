package Fabrica;

import FabricasIngredientes.*;
import Modelos.Coxinha;
import Modelos.Empada;
import Modelos.Salgado;


public class SalgadosFactory {
    private SalgadoIngredientesFactory ingredientes;
    private Salgado salgadinho;


    private SalgadoIngredientesFactory getIngredientesFactory(String tipo, String regiao) {
        if (tipo.equals("Coxinha")) {
            switch (regiao) {
                case "Goias":
                    return new GoiasCoxinhaIngredientesFactory();
                case "Ceara":
                    return new CearaCoxinhaIngredientesFactory();
                default:
                    return null;
            }
        } else if (tipo.equals("Empada")) {
            switch (regiao) {
                case "Goias":
                    return new GoiasEmpadaIngredientesFactory();
                case "Ceara":
                    return new CearaEmpadaIngredientesFactory();
                default:
                    return null;
            }
        } else {
            return null;
        }
    }


    public Salgado criarSalgado(String tipo, String regiao) {
        SalgadoIngredientesFactory ingredientesFactory = getIngredientesFactory(tipo, regiao);
        if (ingredientesFactory == null) {
            return null;
        }

        switch (tipo) {
            case "Coxinha":
                return new Coxinha(ingredientesFactory.criarMassa(), ingredientesFactory.criarMolho(), ingredientesFactory.criarRecheio());
            case "Empada":
                return new Empada(ingredientesFactory.criarMassa(), ingredientesFactory.criarMolho(), ingredientesFactory.criarRecheio());
            default:
                return null;
        }
    }
}




