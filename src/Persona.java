/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrzej
 */
public class Persona {
    
    private String imie;
    private String nazwisko;
    private String pseudonim;
    private String adresZamieszkania;
    private String dataUrodzenia;
    private String numerTelefonu1;
    private String numerTelefonu2;
    private String numerTelefonu3;
    private String numerTelefonu4;
    private String numerTelefonu5;

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

    public String getPseudonim() {
        return pseudonim;
    }

    public void setPseudonim(String pseudonim) {
        this.pseudonim = pseudonim;
    }

    public String getAdresZamieszkania() {
        return adresZamieszkania;
    }

    public void setAdresZamieszkania(String adresZamieszkania) {
        this.adresZamieszkania = adresZamieszkania;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNumerTelefonu1() {
        return numerTelefonu1;
    }

    public void setNumerTelefonu1(String numerTelefonu1) {
        this.numerTelefonu1 = numerTelefonu1;
    }

    public String getNumerTelefonu2() {
        return numerTelefonu2;
    }

    public void setNumerTelefonu2(String numerTelefonu2) {
        this.numerTelefonu2 = numerTelefonu2;
    }

    public String getNumerTelefonu3() {
        return numerTelefonu3;
    }

    public void setNumerTelefonu3(String numerTelefonu3) {
        this.numerTelefonu3 = numerTelefonu3;
    }

    public String getNumerTelefonu4() {
        return numerTelefonu4;
    }

    public void setNumerTelefonu4(String numerTelefonu4) {
        this.numerTelefonu4 = numerTelefonu4;
    }

    public String getNumerTelefonu5() {
        return numerTelefonu5;
    }

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
