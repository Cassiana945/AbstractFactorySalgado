package FabricasIngredientes;

public class GoiasCoxinhaIngredientesFactory extends SalgadoIngredientesFactory {

    @Override
    public String criarMassa() {
        return "Fina";
    }
    public String criarMolho() {
        return "Pequi";
    }
    public String criarRecheio() {
        return "Frango";
    }
}
