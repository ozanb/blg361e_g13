/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.entityBean;

import java.util.Date;

/**
 *
 * @author ozan
 */
public class Message {
    
    private int id;
    private String baslik;
    private String tarih;
    private String icerik;
    private Boolean okundu_mu;
    private Person kimden;
    private Person kime;

    public Message(){
    }
    
    public Message(int id, String baslik, String tarih, String icerik, 
            Boolean okundu_mu, Person kimden, Person kime){
        
        this.id = id;
        this.baslik = baslik;
        this.tarih = tarih;
        this.icerik = icerik;
        this.okundu_mu = okundu_mu;
        this.kimden = kimden;
        this.kime = kime;
    
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the baslik
     */
    public String getBaslik() {
        return baslik;
    }

    /**
     * @param baslik the baslik to set
     */
    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    /**
     * @return the tarih
     */
    public String getTarih() {
        return tarih;
    }

    /**
     * @param tarih the tarih to set
     */
    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    /**
     * @return the icerik
     */
    public String getIcerik() {
        return icerik;
    }

    /**
     * @param icerik the icerik to set
     */
    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    /**
     * @return the okundu_mu
     */
    public Boolean getOkundu_mu() {
        return okundu_mu;
    }

    /**
     * @param okundu_mu the okundu_mu to set
     */
    public void setOkundu_mu(Boolean okundu_mu) {
        this.okundu_mu = okundu_mu;
    }

    /**
     * @return the kimden
     */
    public Person getKimden() {
        return kimden;
    }

    /**
     * @param kimden the kimden to set
     */
    public void setKimden(Person kimden) {
        this.kimden = kimden;
    }

    /**
     * @return the kime
     */
    public Person getKime() {
        return kime;
    }

    /**
     * @param kime the kime to set
     */
    public void setKime(Person kime) {
        this.kime = kime;
    }
}
