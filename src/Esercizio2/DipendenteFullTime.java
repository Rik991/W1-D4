package Esercizio2;

import Esercizio1.Dipartimento;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(Dipartimento dipartimento, int matricola, double stipendio) {
        super(dipartimento, matricola, stipendio);
    }

    @Override
    public double calcolaSalario() {
        return getStipendio() * 30;
    }

    @Override
    public void checkIn() {
        System.out.println("Questo dipendente fullTime attacca alle 08:00 di mattina");
    }
}
