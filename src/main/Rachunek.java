public class Rachunek {

    private int iban;
    private RodzajRachunku rodzajRachunku;
    private double stanRachunku;

    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    public RodzajRachunku getRodzajRachunku() {
        return rodzajRachunku;
    }

    public void setRodzajRachunku(RodzajRachunku rodzajRachunku) {
        this.rodzajRachunku = rodzajRachunku;
    }

    public double getStanRachunku() {
        return stanRachunku;
    }

    public void setStanRachunku(double stanRachunku) {
        this.stanRachunku = stanRachunku;
    }
}
