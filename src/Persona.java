/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALA
 */
public class Persona {
    /**
     * pole przechowuje imie
     */
    private String imie;
   /**
     * pole przechowuje nazwisko
     */
    private String nazwisko;
   /**
     * pole przechowuje pseudonim 
     */
    private String pseudonim;
    /**
     * pole przechowuje adres zamieszkania
     */
    private String adresZamieszkania;
    /**
     * pole przechowuje date urodzenia
     */
    private String dataUrodzenia;
    /**
     * pole tablicy przechowujacej numeryTelefonow
     */   
    //private String[] numeryTelefonu;
    
    /**
     * konstruktor inicjalizujacy pola
     * @param imie - pole przechowujace imie
     * @param nazwisko - pole przechowujace nazwisko
     * @param pseudonim - pole przechowujace pseudonim
     * @param adresZamieszkania -pole przechowujace adres
     * @param dataUrodzenia - pole przechowujace DataUrodzenia
     * @param numeryTelefonu - pole przechowuje numery teleronow;
     */
   /*public Persona(String imie, String nazwisko, String pseudonim, String adresZamieszkania,
            String dataUrodzenia, String[] numeryTelefonu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pseudonim = pseudonim;
        this.adresZamieszkania = adresZamieszkania;
        this.dataUrodzenia = dataUrodzenia;
        this.numeryTelefonu = numeryTelefonu;
    }*/
    public Persona(String imie, String nazwisko, String pseudonim, String adresZamieszkania, String dataUrodzenia) {    
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pseudonim = pseudonim;
        this.adresZamieszkania = adresZamieszkania;
        this.dataUrodzenia = dataUrodzenia;
    }

    /**
     * pusty konstruktor
     */
    public Persona() {
    }

    /**
     * metoda pobierająca imie 
     * @return - wartosc pola imie
     */
    
    public String getImie() {
        return imie;
    }

    /**
     * metoda ustawiająca imie
     * @param imie - ustawia wartosc w pole imie
     */
    public void setImie(String imie) {
        this.imie = imie;
    }

    /**
     * metoda pobierająca naziwsko
     * @return  - wartosc pola nazwisko
     */ 
    public String getNazwisko() {
        return nazwisko;
    }
     /**
      * metoda ustawiająca nazwisko
      * @param nazwisko - ustawia wartosc w pole nazwisko
      */
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
     /**
      * metoda pobierająca  pseudonim
      * @return  - wartosc pola pseudonim
      */
    public String getPseudonim() {
        return pseudonim;
    }
     /** 
      * metoda ustawiająca pseudonim 
      * @param pseudonim - ustawia wartosc w pole pseudonim
      */
    public void setPseudonim(String pseudonim) {
        this.pseudonim = pseudonim;
    }
    /**
     * metoda  pobierająca adres zamieszkania
     * @return  - wartosc pola adres
     */
    public String getAdresZamieszkania() {
        return adresZamieszkania;
    }
    /**
     * metoda  ustawiająca adres zamieszkania
     * @param adresZamieszkania - ustawia wartosc w pole adress
     */
    public void setAdresZamieszkania(String adresZamieszkania) {
        this.adresZamieszkania = adresZamieszkania;
    }
    /**
     * metoda  pobierająca date urodzenia 
     * @return  - wartosc pola data
     */
    public String getDataUrodzenia() {
        return dataUrodzenia;
    }
    /**
     * metoda ustawiająca date urodzenia 
     * @param dataUrodzenia - ustawia wartosc w pole data
     */
    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }
/**
 * metoda pobiera tablice z numerami
 * @return tablice numeryTelefonu
 */
    /*public String[] getNumeryTelefonu() {
        return numeryTelefonu;
    }
/**
 * metoda pobiera numeryTelefonu
 * @param numeryTelefonu - ustawia przyjete numeryTelefonu
 */
    /*public void setNumeryTelefonu(String[] numeryTelefonu) {
        this.numeryTelefonu = numeryTelefonu;
    }
*/

    /**
     * Metoda wyswietlajaca dane jednej osoby
     * @return "Persona{" + "imie=" + imie + ", nazwisko=" + 
     * nazwisko + ", pseudonim=" + pseudonim + ", adresZamieszkania="
     * + adresZamieszkania + ", dataUrodzenia=" + dataUrodzenia +
     * ", numerTelefonu1=" + numerTelefonu1 + ", numerTelefonu2=" 
     * + numerTelefonu2 + ", numerTelefonu3=" + numerTelefonu3 + ",
     * numerTelefonu4=" + numerTelefonu4 + ", numerTelefonu5=" 
     * + numerTelefonu5 + '}';

     */
    
    public String toString() {
        return "Persona{" + '}';
    }
    
    
}
