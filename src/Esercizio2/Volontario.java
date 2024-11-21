package Esercizio2;

public class Volontario implements ICheckIn {
    private String nome;
    private int eta;
    private String cv;

    public Volontario(String cv, int eta, String nome) {
        this.cv = cv;
        this.eta = eta;
        this.nome = nome;
    }


    @Override
    public void checkIn() {
        System.out.println("Questo volontario attacca alle 10:00 di mattina");
    }
}
