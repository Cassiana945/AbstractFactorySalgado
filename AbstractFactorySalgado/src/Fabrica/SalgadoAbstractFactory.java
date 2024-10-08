package Fabrica;
import javax.swing.JOptionPane;

import Fabrica.SalgadosFactory;
import Modelos.Salgado;

public class SalgadoAbstractFactory {
    public static void main(String[] args) {
        SalgadosFactory factory = new SalgadosFactory();


        String tipo = JOptionPane.showInputDialog("Qual tipo de salgado (Coxinha ou Empada)?");
        String regiao = JOptionPane.showInputDialog("Qual a região (Goias ou Ceara)?");

        Salgado salgado = factory.criarSalgado(tipo, regiao);


        if (salgado != null) {
            String resultado = String.format("Salgado: %s\nMassa: %s\nMolho: %s\nRecheio: %s",
                    salgado.getClass().getSimpleName(),
                    salgado.getMassa(),
                    salgado.getMolho(),
                    salgado.getRecheio());
            JOptionPane.showMessageDialog(null, resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de salgado ou região não reconhecidos.");
        }
    }
}
