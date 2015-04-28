import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NotesGlowna {
    /* Stałe - Po wpisaniu danej liczby mamy :    
     1 - możliwość dodania osoby do listy 
     2 - możliwość dodania numeru do listy
     3 - możliwość wyszukania danej osoby z listy
     4 - możliwość wyświetlenia całej listy 
     5 - możliwość usunięcia interesującej nas osoby
     0 - wpisanie zera powoduje zakończenie programu
     */

    /**
     * Metoda pozwalająca na dodanie osoby do listy
     *
     * @param sc
     * @throws InputMismatchException
     * @throws ArrayIndexOutOfBoundsException
     */
    private static void dodajPersone(Scanner sc) throws InputMismatchException, ArrayIndexOutOfBoundsException {

    }

    /**
     * Metoda pozwalająca na dodanie numeru do listy
     *
     * @param sc
     * @throws InputMismatchException
     * @throws ArrayIndexOutOfBoundsException
     */
    private static void DodajNumer(Scanner sc) throws InputMismatchException, ArrayIndexOutOfBoundsException {

    }

    /**
     * Metoda wyszukująca daną osobę
     */
    private static void WyszukajPersone() {

    }

    /**
     * Metoda wyświetlająca listę zapamiętanych osób i numerów
     */
    private static void WyświetlListę() {

    }

    /**
     * Metoda pozawalająca na usunięcie danej osoby
     */
    private static void UsuńPersone() {

    }

    /**
     * Metoda wyświetlająca możliwe opcje wyboru
     */
    /*private static void printOptions() {
        System.out.println("--------------------");
        System.out.println("Dostępne opcje: ");
        System.out.println(DodajPersone() + " - Dodaj Personę");
        System.out.println(DodajNumer() + " - Dodaj numer");
        System.out.println(WyszukajPersone() + " - Wyszukaj personę");
        System.out.println(Wyświetl() + " - Wyświetl listę");
        System.out.println(UsuńPersone() + " - Usuń personę");
        System.out.println(koniec + " - Wyjście z programu");
        System.out.println("Wybierz opcję: ");
    }
*/
    public static void main(String[] args) {

        List<Persona> lista=new ArrayList<>();
        
        int opcja=4;
        while(opcja!=0){
            System.out.println("Podaj numer opcji: /n 1. Dodawanie nowej osoby;"
                    + "/n 2. Dodanie numeru do już istniejącej osoby; /n"
                    + "3. Wyszukiwanie danych osobowych; /n"
                    + "4. Wyswietlanie wszystkich kontaktow; /n"
                    + "5. Usuwanie konkretnej pozycji; /n"
                    + "0. Koniec pracy programu.");
            //dodac wczytywanie opcji
            if(opcja==1){
                System.out.println("Wybrałeś dodawanie nowej osoby");
                lista.dodajPersone();
            }
            if(opcja==2){
                System.out.println("Wybrałeś dodawanie numery do osoby");
                lista.dodajNumer();
            }
            if(opcja==3){
                System.out.println("Wybrałeś szukanie w bazie");
                lista.znajdzPersone();
            }
            if(opcja==4){
                System.out.println("Wybrałeś wyswietlanie wszystich kontaktow");
                lista.wyswietl();
            }
            if(opcja==5){
                System.out.println("Wybrałeś usuwanie konkretnej pozycji");
                lista.usunPersone();
            }
        }
        
    }

|
