package Esercizio2;

import Esercizio1.Dipartimento;

public class Dirigente extends Dipendente {
    public Dirigente(Dipartimento dipartimento, int matricola, double stipendio) {
        super(dipartimento, matricola, stipendio);
    }

    @Override
    public double calcolaSalario() {
        return getStipendio() * 50;
    }

    @Override
    public void checkIn() {
        System.out.println("Questo dipendente fullTime attacca alle 9:00 di mattina");
    }


}
