public class Ciezarowka extends Samochod {
    private int ladownosc;
    private int iloscKol;

    public Ciezarowka() {
        super();
    }

    public Ciezarowka(String kolor, int wiek, int iloscDrzwi, int ladownosc, int iloscKol) {
        super(kolor, wiek, iloscDrzwi);
        this.ladownosc = ladownosc;
        this.iloscKol = iloscKol;
    }

    public int getLadownosc() {
        return ladownosc;
    }

    public void setLadownosc(int ladownosc) {
        this.ladownosc = ladownosc;
    }

    public int getIloscKol() {
        return iloscKol;
    }

    public void setIloscKol(int iloscKol) {
        this.iloscKol = iloscKol;
    }

    @Override
    public String toString() {
        return "Ciezarowka{" +
                "ladownosc=" + ladownosc +
                ", iloscKol=" + iloscKol +
                ", kolor='" + kolor + '\'' +
                ", wiek=" + wiek +
                ", iloscDrzwi=" + iloscDrzwi +
                '}';
    }
}
