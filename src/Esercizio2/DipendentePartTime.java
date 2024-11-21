package Esercizio2;

import Esercizio1.Dipartimento;

public class DipendentePartTime extends Dipendente{
    public DipendentePartTime(Dipartimento dipartimento, int matricola, double stipendio) {
        super(dipartimento, matricola, stipendio);
    }

    @Override
    public double calcolaSalario() {
        return getStipendio() * 15;
    }

    @Override
    public void checkIn() {
        System.out.println("Questo dipendente partTime attacca alle 14:00");
    }

}
