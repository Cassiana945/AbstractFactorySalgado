package Modelos;

public abstract class Salgado {

    private String massa;
    private String molho;
    private String recheio;


    public Salgado(String massa, String molho, String recheio) {
        this.massa = massa;
        this.molho = molho;
        this.recheio = recheio;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }
}
