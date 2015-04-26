
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
    private static void DodajPersone(Scanner sc) throws InputMismatchException, ArrayIndexOutOfBoundsException {

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
    private static void printOptions() {
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

    public static void main(String[] args) {

    }

|
