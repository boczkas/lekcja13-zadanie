package klasa.osoby;

public class Nauczyciel extends Osoba {
    public Nauczyciel(String imie) {
        super(imie);
    }

    public void wystawOcene(Uczen uczen, int ocena) {
        uczen.ocena = ocena;
    }

    @Override
    public void przywitajSie() {
        System.out.println("Dzien dobry, jestem nauczycielem o imieniu " + imie);
    }
}
