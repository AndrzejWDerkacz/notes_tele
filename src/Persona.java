/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrzej + Lukasz
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
     * pole przechowuje numer telefonu 1
     */
    private String numerTelefonu1;
    /**
     * pole przechowuje numer telefonu 2
     */
    private String numerTelefonu2;
      /**
     * pole przechowuje numer telefonu 3
     */
    private String numerTelefonu3;
      /**
     * pole przechowuje numer telefonu 4
     */
    private String numerTelefonu4;
      /**
     * pole przechowuje numer telefonu 5
     */
    private String numerTelefonu5;

      /**
     *  konstruktor zawierający  pola : 
     *  - imie
     *  - nazwisko
     *  - pseudonim
     *  - adresZamieszkania
     *  - data urodznia 
     *  - numerTelefonu1
     *  - numerTelefonu2
     *  - numerTelefonu3
     *  - numerTelefonu4
     *  - numerTelefonu5
     */
    public Persona(String imie, String nazwisko, String pseudonim, 
            String adresZamieszkania, String dataUrodzenia, 
            String numerTelefonu1, String numerTelefonu2, 
            String numerTelefonu3, String numerTelefonu4, 
            String numerTelefonu5) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pseudonim = pseudonim;
        this.adresZamieszkania = adresZamieszkania;
        this.dataUrodzenia = dataUrodzenia;
        this.numerTelefonu1 = numerTelefonu1;
        this.numerTelefonu2 = numerTelefonu2;
        this.numerTelefonu3 = numerTelefonu3;
        this.numerTelefonu4 = numerTelefonu4;
        this.numerTelefonu5 = numerTelefonu5;
    }

    /**
     * metoda pobierająca imie 
     * @return 
     */
    
    public String getImie() {
        return imie;
    }

    /**
     * metoda ustawiająca imie
     * @param imie 
     */
    public void setImie(String imie) {
        this.imie = imie;
    }

    /**
     * metoda pobierająca naziwsko
     * @return 
     */ 
    public String getNazwisko() {
        return nazwisko;
    }
     /**
      * metoda ustawiająca nazwisko
      * @param nazwisko 
      */
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
     /**
      * metoda pobierająca  pseudonim
      * @return 
      */
    public String getPseudonim() {
        return pseudonim;
    }
     /** 
      * metoda ustawiająca pseudonim 
      * @param pseudonim 
      */
    public void setPseudonim(String pseudonim) {
        this.pseudonim = pseudonim;
    }
    /**
     * metoda  pobierająca adres zamieszkania
     * @return 
     */
    public String getAdresZamieszkania() {
        return adresZamieszkania;
    }
    /**
     * metoda  ustawiająca adres zamieszkania
     * @param adresZamieszkania 
     */
    public void setAdresZamieszkania(String adresZamieszkania) {
        this.adresZamieszkania = adresZamieszkania;
    }
    /**
     * metoda  pobierająca date urodzenia 
     * @return 
     */
    public String getDataUrodzenia() {
        return dataUrodzenia;
    }
    /**
     * metoda ustawiająca date urodzenia 
     * @param dataUrodzenia 
     */
    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }
     /** metoda pobierająca numer  telefonu 1
      * 
      * @return 
      */
    public String getNumerTelefonu1() {
        return numerTelefonu1;
    }
     /** 
      *  metoda ustawiająca numer telefonu 1  
      * @param numerTelefonu1 
      */
    public void setNumerTelefonu1(String numerTelefonu1) {
        this.numerTelefonu1 = numerTelefonu1;
    }
      /** metoda pobierająca numer  telefonu 2
      * 
      * @return 
      */
    public String getNumerTelefonu2() {
        return numerTelefonu2;
    }
     /** 
      *  metoda ustawiająca numer telefonu 1  
      * @param numerTelefonu2 
      */
    public void setNumerTelefonu2(String numerTelefonu2) {
        this.numerTelefonu2 = numerTelefonu2;
    }
      /** metoda pobierająca numer  telefonu 3
      * 
      * @return 
      */
    public String getNumerTelefonu3() {
        return numerTelefonu3;
    }
    /** 
      *  metoda ustawiająca numer telefonu 1  
      * @param numerTelefonu3 
      */
    public void setNumerTelefonu3(String numerTelefonu3) {
        this.numerTelefonu3 = numerTelefonu3;
    }
      /** metoda pobierająca numer  telefonu 4
      * 
      * @return 
      */
    public String getNumerTelefonu4() {
        return numerTelefonu4;
    }
    /** 
      *  metoda ustawiająca numer telefonu 4 
      * @param numerTelefonu4 
      */
    public void setNumerTelefonu4(String numerTelefonu4) {
        this.numerTelefonu4 = numerTelefonu4;
    }

      /** metoda pobierająca numer  telefonu 5
      * 
      * @return 
      */
    public String getNumerTelefonu5() {
        return numerTelefonu5;
    }
      /** 
      *  metoda ustawiająca numer telefonu 5  
      * @param numerTelefonu5 
      */
    public void setNumerTelefonu5(String numerTelefonu5) {
        this.numerTelefonu5 = numerTelefonu5;
    }

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
