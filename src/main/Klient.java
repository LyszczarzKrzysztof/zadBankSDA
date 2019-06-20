public class Klient {
    private int numer;
    private String imie;
    private String nazwisko;
    private boolean madry;


    public Klient(int numer, String imie, String nazwisko, boolean madry ){
        this.numer=numer;
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.madry=madry;
    }

    @Override
    public String toString(){
        return "Klient numer: "+numer+" nazywa się: "+imie+" "+nazwisko+" Czy madry?: "+madry;
    }


    public int getNumber() {
        return numer;
    }

    public void setNumber(int number) {
        this.numer = number;
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

    public boolean isMadry() {
        return madry;
    }

    public void setMadry(boolean madry) {
        this.madry = madry;
    }
}
