
package bankafinal;

public class Musteri {
    int borc;
    String isim;
    int kredinotu;
    int musteriNumarasi;
    int bakiye;
    int sifre;
    public Musteri(String isim,int sifre,int no){
        kredinotu =1000;
        this.isim = isim;
        this.musteriNumarasi = no;
        bakiye=0;
        this.sifre=sifre;
    }
    

    public int getMusteriNumarasi() {
        return musteriNumarasi;
    }


    public int getKredinotu() {
        return kredinotu;
    }

    public int getBakiye() {
        return bakiye;
    }

    @Override
    public String toString() {
        return "Musteri Adi: " + isim + ", Musteri Numarasi: " + musteriNumarasi +", Bakiye: "+bakiye;
    }
}


