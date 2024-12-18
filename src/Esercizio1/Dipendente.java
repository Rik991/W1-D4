package Esercizio1;

public class Dipendente {
    private int matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(Dipartimento dipartimento, int matricola, double stipendio) {
        this.dipartimento = dipartimento;
        this.matricola = matricola;
        this.stipendio = stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
}

