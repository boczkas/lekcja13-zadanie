package klasa.osoby;

public class Uczen extends Osoba {

    int ocena;

    public Uczen(String imie) {
        super(imie);
    }

    public void pokazOcene() {
        System.out.println("Moja ocena to: " + ocena);
    }
}
