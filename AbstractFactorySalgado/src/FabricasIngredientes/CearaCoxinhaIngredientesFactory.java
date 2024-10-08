package FabricasIngredientes;

public class CearaCoxinhaIngredientesFactory extends SalgadoIngredientesFactory {

    @Override
    public String criarMassa() {
        return "Grossa";
    }
    public String criarMolho() {
        return "Pimenta";
    }
    public String criarRecheio() {
        return "Carne Seca";
    }
}
