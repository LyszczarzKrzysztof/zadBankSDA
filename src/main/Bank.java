import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String nazwa;

    List<Rachunek> rachunki = new ArrayList<>();
    List<Klient> listaKlientow= new ArrayList<>();

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public boolean addKlient(Klient klient, List listaKlientow){
        if(listaKlientow.contains(klient)){
            System.out.println("Klient jest juz na lisćie.");
            return false;
        }else{
            listaKlientow.add(klient);
            System.out.println("Klient: "+klient+" został dodany do listy.");
            return true;
        }
    }


    //trzeba dodac warunek ze stan konta ma być 0
    public boolean removeKlient(Klient klient, List listaKlientow){
        if(listaKlientow.contains(klient)){
            System.out.println("Klient"+klient+" został usunięty");
            return true;
        }else{
            System.out.println("Klienta: "+klient+" nie ma na liście.");
            return false;
        }
    }
}
