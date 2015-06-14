
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
    private static void WyświetlListę(ListaKontaktow lista) {
        lista.wyswietl();
    }

    /**
     * Metoda pozawalająca na usunięcie danej osoby
     */
    private static void UsuńPersone() {

    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //List<Persona> lista = new ArrayList<>();
        
        /* do obsługi plików
         File plik = new File("notes_tele.txt");
         Scanner odczyt = new Scanner(new File("notes_tele.txt"));
         */
        /**
         * Inicjalizacja pola String potrzebnego do odbierania wyboru
         * uzytkownika
         */
        File plik_notesu = new File("notes_tele.txt");;
        boolean bool = false;

        try {

            // testuje czy plik istnieje
            bool = plik_notesu.exists();

            // wypisanie rezultatu
            System.out.println("Sprawdzenie istnienia pliku bazy danych: "
                    + bool);

            if (bool == false) {
                // create new files
                //plik_notesu = new File("notes_tele.txt");

                // create new file in the system
                plik_notesu.createNewFile();
                // testuje czy plik istnieje
                bool = plik_notesu.exists();

                // wypisanie rezultatu
                System.out.println("Utworzenie pliku bazy danych: "
                        + bool);
            }

            if (bool == true) {
                System.out.println("Plik notes_tele.txt już isnieje, "
                        + "Wybierz opcje");
            }

        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
        BufferedReader zrodlo=new BufferedReader(new FileReader(plik_notesu));
        int liczbaKontaktow;
        liczbaKontaktow = Integer.parseInt(zrodlo.readLine());
        ListaKontaktow lista = new ListaKontaktow(liczbaKontaktow);
        lista.wczytajZPliku("notes_tele.txt");
        String wartosc = "4"; //inicjalizacja pola wartoscia String = 4
        Scanner wczytaj = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
        int opcja = Integer.parseInt(wartosc); //konwersja Stringa na liczbe calkowita
        /**
         * peta programu obslugujaca dzialanie wedle wyboru uzytkownika
         */
        while (opcja != 0) {
            System.out.println("Podaj numer opcji: \n"
                    + "1. Dodawanie nowej osoby;\n"
                    + "2. Dodanie numeru do już istniejącej osoby; \n"
                    + "3. Wyszukiwanie danych osobowych; \n"
                    + "4. Wyswietlanie wszystkich kontaktow; \n"
                    + "5. Usuwanie konkretnej pozycji; \n"
                    + "0. Koniec pracy programu.");
            wartosc = wczytaj.nextLine();
            System.out.println("Wybrałeś " + wartosc); //potwierdzenie wyboru usera
            opcja = Integer.parseInt(wartosc);
            if (opcja == 0) {
                System.out.println("Zamknięcie programu.");
            }
            if (opcja == 1) {
                System.out.println("Inicjalizacja dodawania nowej osoby");
                //lista.dodajPersone();
            }
            if (opcja == 2) {
                System.out.println("Inicjalizacja dodawania numeru do istniejacej osoby");
                //lista.dodajNumer();
            }
            if (opcja == 3) {
                System.out.println("Inicjalizacja szukania pozycji w bazie");
                //lista.znajdzPersone();
            }
            if (opcja == 4) {
                System.out.println("Inicjalizacja wyswietlania wszystich kontaktow");
                //lista.wyswietl();
            }
            if (opcja == 5) {
                System.out.println("Inicjalizacja usuwania konkretnej pozycji");
                //lista.usunPersone();
            }
        }

    }
}
