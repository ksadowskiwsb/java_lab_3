public class Samochod {
    protected String kolor;
    protected int wiek;
    protected int iloscDrzwi;

    public Samochod() {
    }

    public Samochod(String kolor, int wiek, int iloscDrzwi) {
        this.kolor = kolor;
        this.wiek = wiek;
        this.iloscDrzwi = iloscDrzwi;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getIloscDrzwi() {
        return iloscDrzwi;
    }

    public void setIloscDrzwi(int iloscDrzwi) {
        this.iloscDrzwi = iloscDrzwi;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "kolor='" + kolor + '\'' +
                ", wiek=" + wiek +
                ", iloscDrzwi=" + iloscDrzwi +
                '}';
    }
}
