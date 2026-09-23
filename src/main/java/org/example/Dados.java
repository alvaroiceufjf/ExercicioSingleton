package org.example;

public class Dados {

    private Dados() {};
    private static Dados instance = new Dados();
    public static Dados getInstance() {
        return instance;
    }

    private String codCoop;
    private String numPA;
    private String nomeCoop;

    public String getCodCoop() {
        return codCoop;
    }

    public void setCodCoop(String codCoop) {
        this.codCoop = codCoop;
    }

    public String getNumPA() {
        return numPA;
    }

    public void setNumPA(String numPA) {
        this.numPA = numPA;
    }

    public String getNomeCoop() {
        return nomeCoop;
    }

    public void setNomeCoop(String nomeCoop) {
        this.nomeCoop = nomeCoop;
    }

    public void encerrarSessao() {
        this.codCoop = null;
        this.numPA = null;
        this.nomeCoop = null;
    }



}
