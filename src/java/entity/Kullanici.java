/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Tevhid
 */
public class Kullanici {
     private Long kullaniciid;
    private String email;
    private String kullaniciadi;
    private String sifre;
    private String telefon;
    private String adres;
    private Grup grup;

    public Kullanici() {
    }

    public Long getKullaniciid() {
        return kullaniciid;
    }

    public void setKullaniciid(Long kullaniciid) {
        this.kullaniciid = kullaniciid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Grup getGrup() {
        return grup;
    }

    public void setGrup(Grup grup) {
        this.grup = grup;
    }

    @Override
    public String toString() {
        return "Kullanici{" + "kullaniciid=" + kullaniciid + ", email=" + email + ", kullaniciadi=" + kullaniciadi + ", sifre=" + sifre + ", telefon=" + telefon + ", adres=" + adres + ", grup=" + grup + '}';
    }

}
