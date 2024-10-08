package FabricasIngredientes;

public class CearaEmpadaIngredientesFactory extends SalgadoIngredientesFactory{

    @Override
    public String criarMassa() {
        return "Crepioca";
    }
    public String criarMolho() {
        return "Camarao";
    }
    public String criarRecheio() {
        return "Peixe";
    }
}
