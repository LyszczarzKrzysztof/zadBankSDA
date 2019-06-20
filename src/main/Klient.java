public class Klient {
    private int numerID;
    private String imie;
    private String nazwisko;
    private RodzajRachunku rodzajRachunku;



    public Klient(int numer, String imie, String nazwisko, RodzajRachunku rodzajRachunku){
        this.numerID=numer;
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.rodzajRachunku=rodzajRachunku;

    }

    @Override
    public String toString(){
        return "Klient numer: "+numerID+" nazywa się: "+imie+" "+nazwisko+" rodzaj rachunku: "+rodzajRachunku;
    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getNumerID() {
        return numerID;
    }

    public void setNumerID(int numerID) {
        this.numerID = numerID;
    }

    public RodzajRachunku getRodzajRachunku() {
        return rodzajRachunku;
    }

    public void setRodzajRachunku(RodzajRachunku rodzajRachunku) {
        this.rodzajRachunku = rodzajRachunku;
    }
}
