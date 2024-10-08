package FabricasIngredientes;

public class GoiasEmpadaIngredientesFactory extends SalgadoIngredientesFactory{

    @Override
    public String criarMassa() {
        return "Podre";
    }
    public String criarMolho() {
        return "Tomate";
    }
    public String criarRecheio() {
        return "Calabresa";
    }
}
