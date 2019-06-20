public class Main {

    public static void main(String[] args) {

        Klient klient1 = new Klient(1,"Szymon","Sand",RodzajRachunku.ROR);
        Klient klient2 = new Klient(2,"K","S", RodzajRachunku.OSZCZEDNOSCIOWY);
        Klient klient3 = new Klient(3,"J","D", RodzajRachunku.ROR);


        Bank bank=new Bank();
        bank.setNazwa("Fajny Bank");

        bank.addKlient(klient1);
        bank.addKlient(klient2);

        bank.wypiszKlientow(bank.listaKlientow);

        bank.addKlient(klient3);
        bank.wypiszKlientow(bank.listaKlientow);

    }

}
