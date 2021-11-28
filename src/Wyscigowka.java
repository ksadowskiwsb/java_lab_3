public class Wyscigowka  extends Samochod {
    private int predkoscMaksymalna;
    private int waga;

    public Wyscigowka() {
        super();
    }

    public Wyscigowka(String kolor, int wiek, int iloscDrzwi, int predkoscMaksymalna, int waga) {
        super(kolor, wiek, iloscDrzwi);
        this.predkoscMaksymalna = predkoscMaksymalna;
        this.waga = waga;
    }

    public int getPredkoscMaksymalna() {
        return predkoscMaksymalna;
    }

    public void setPredkoscMaksymalna(int predkoscMaksymalna) {
        this.predkoscMaksymalna = predkoscMaksymalna;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    @Override
    public String toString() {
        return "Wyscigowka{" +
                "kolor='" + kolor + '\'' +
                ", wiek=" + wiek +
                ", iloscDrzwi=" + iloscDrzwi +
                ", predkoscMaksymalna=" + predkoscMaksymalna +
                ", waga=" + waga +
                '}';
    }
}
