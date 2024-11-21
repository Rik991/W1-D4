import Esercizio1.Dipartimento;
import Esercizio2.*;

public class Main {
    public static void main(String[] args) {

/*  ESERCIZIO 1
        Dipendente dipendente1 = new Dipendente(Dipartimento.AMMINISTRAZIONE, 1,40);
        Dipendente dipendente2 = new Dipendente(Dipartimento.PRODUZIONE, 2,50);
        Dipendente dipendente3 = new Dipendente(Dipartimento.VENDITE, 3,45);


        Dipendente[] arrayDipendenti = new Dipendente[3];
        arrayDipendenti[0] = dipendente1;
        arrayDipendenti[1] = dipendente2;
        arrayDipendenti[2] = dipendente3;

        for (int i = 0; i < arrayDipendenti.length; i++) {
            Dipendente dipendenteCorrente = arrayDipendenti[i];
            System.out.println("La matricola del dipendente n: " + (i+1) + " è: " + dipendenteCorrente.getMatricola());

        }

    ***********************************************************************/

        //ESERCIZIO 2 e 3

        Esercizio2.Dipendente dipendente1 = new DipendenteFullTime(Dipartimento.PRODUZIONE, 10, 40);
        Esercizio2.Dipendente dipendente2 = new DipendentePartTime(Dipartimento.PRODUZIONE, 20,40);
        Esercizio2.Dipendente dipendente3 = new Dirigente(Dipartimento.VENDITE, 30,50);

        Esercizio2.Dipendente[] arrayDipendenti = new Dipendente[3];
        arrayDipendenti[0] = dipendente1;
        arrayDipendenti[1] = dipendente2;
        arrayDipendenti[2] = dipendente3;

        for (int i = 0; i < arrayDipendenti.length; i++) {
            Dipendente dipendenteCorrente = arrayDipendenti[i];
            System.out.println("Lo stipendio del dipendente n: " + (i+1) + " è: " + dipendenteCorrente.calcolaSalario());
        }

        //esecuzione terzo

        Volontario poveraccio = new Volontario("mai lavorato", 40, "Rodrigo");

        ICheckIn[] arrayMisto = new ICheckIn[4];
        arrayMisto[0] = dipendente1;
        arrayMisto[1] = dipendente2;
        arrayMisto[2] = dipendente3;
        arrayMisto[3] = poveraccio;

        for (int i = 0; i < arrayMisto.length; i++) {
            ICheckIn dipendenteCorrente = arrayMisto[i];
            dipendenteCorrente.checkIn();
        }





    }
}