/*
Do zrobienia:
dodac
import java.util.ArrayList;
import java.util.List;
*/

public class NotesGlowna {
/*dodac metody pobierajace od uzytkownika dane osobowe, czy to przez SWINGa
    i JPaneOption czy poprzez wczytywanie z terminala
    dodac metode pobierajaca od uzytkownika wymagane dane do wyszukiwania
    dodac metode wyswietlajaca wszystkie pozycje
    dodac metode pobierajaca od uzytkownika index pozycji ktora chce uzynac
    WAZNE! na razie trzeba tylko stworzyc te metody! nie trzeba pisac ich
    kodu wewnetrzenego! zatem public static Persona dodajPersone(){}
    public static void znajdzPersone(){};
    public static void wyswietlListe(){};
    publicstatic void usunPozycje(){};
    wazne jedynie by przy wyswietlaniu wszystkich pozycji kazda zaczynala sie 
    indexem pod ktorym sie znajduje, ale to juz przy implementacji, na razie
    wystarczy przygotowac puste metody
*/
    public static void main(String[] args) {
       /*
       wstawić         List<Persona> lista=new ArrayList<>(); 
        wywolac wczytywanie opcji do wybporu przez uzytkownika w petli,
        najlepiej chyba while np. while()
        int opcja=4;(1 dla dodawania osob, 2 dla dodawania numeru
        3 dla znajdowania, 4 dla wyswietlania listy z pozycjami i 5 do usuwania,
        0 do zamkniecia)
        while(opcje!=0){
        if(opcja==1){}
        if(opcja==2){}
        itd.
        }
        edit
       */
        
        /*while(opcja!=0){
            System.out.println("Podaj numer opcji: /n 1. Dodawanie nowej osoby;"
                    + "/n 2. Dodanie numeru do już istniejącej osoby; /n"
                    + "3. Wyszukiwanie danych osobowych; /n"
                    + "4. Wyswietlanie wszystkich kontaktow; /n"
                    + "5. Usuwanie konkretnej pozycji; /n"
                    + "0. Koniec pracy programu.");
            if(opcja--1){
                System.out.println("Wybrałeś dodawanie nowej osoby");
                lista.dodajPersone();
            }
            if(opcja--2){
                System.out.println("Wybrałeś dodawanie numery do osoby");
                lista.dodajNumer();
            }
            if(opcja--3){
                System.out.println("Wybrałeś szukanie w bazie");
                lista.znajdzPersone();
            }
            if(opcja--4){
                System.out.println("Wybrałeś wyswietlanie wszystich kontaktow");
                lista.wyswietl();
            }
            if(opcja--5){
                System.out.println("Wybrałeś usuwanie konkretnej pozycji");
                lista.usunPersone();
            }
        }*/
    }
    
}
