
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;


public class ListaKontaktow {

    private Persona[] lista;
    private int liczbaPerson;

    public ListaKontaktow(int maxKontaktow) {
        lista = new Persona[maxKontaktow];
        liczbaPerson = 0;
    }

    public void dodaj(Persona nowa) {
        if (liczbaPerson < lista.length) {
            lista[liczbaPerson] = nowa;
            liczbaPerson++;
        }//if
    }//public void dodaj

    /**
     *
     */
    public void wyswietl() {
        for (int i = 0; i < liczbaPerson; i++) {
            System.out.println((i + 1) + ") " + lista[i]);
        }//for
    }//public void wyswietl

    public void zapisDoPliku(String nazwaPliku) throws IOException {
        PrintWriter wynik = new PrintWriter(new FileWriter(nazwaPliku));
        wynik.println(liczbaPerson);
        for (int i = 0; i < liczbaPerson; i++) {
            wynik.println(lista[i].getImie());
            wynik.println(lista[i].getNazwisko());
            wynik.println(lista[i].getPseudonim());
            wynik.println(lista[i].getAdresZamieszkania());
            wynik.println(lista[i].getDataUrodzenia());
            //wynik.println(Arrays.toString(lista[i].getNumeryTelefonu()));
        }//for
        wynik.close();
    }//public void zapiszDoPliku

    public void wczytajZPliku(String nazwaPliku) throws FileNotFoundException, IOException {
        String imie;
        String nazwisko;
        String pseudonim;
        String adresZamieszkania;
        String dataUrodzenia;
        //String[] numeryTelefonu;
        BufferedReader zrodlo = new BufferedReader(new FileReader(nazwaPliku));
        liczbaPerson = Integer.parseInt(zrodlo.readLine());
        for (int i = 0; i < liczbaPerson; i++) {
            imie = zrodlo.readLine();
            nazwisko = zrodlo.readLine();
            pseudonim = zrodlo.readLine();
            adresZamieszkania = zrodlo.readLine();
            dataUrodzenia = zrodlo.readLine();
            /*numeryTelefonu[0] = zrodlo.readLine();
            numeryTelefonu[1] = zrodlo.readLine();
            numeryTelefonu[2] = zrodlo.readLine();
            numeryTelefonu[3] = zrodlo.readLine();
            numeryTelefonu[4] = zrodlo.readLine();
            lista[i] = new Persona(imie, nazwisko, pseudonim, adresZamieszkania, dataUrodzenia,
            numeryTelefonu.[numeryTelefonu.length]);*/
            lista[i] = new Persona(imie, nazwisko, pseudonim, adresZamieszkania, dataUrodzenia);
        }//for
        zrodlo.close();
    }//public void wczytajZPliku

}
