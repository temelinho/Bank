package bankafinal;

public class Banka extends BankServis{
    int sifre;
    double faiz;
    String isim;
    int limit;
    List liste;
    int no;
    int kasa;
    krediServisi kredi;
    public Banka(){}
    public Banka(String isim) {
        this.isim = isim;
        List yeni= new List();
        this.liste= yeni;
        krediServisi kredi=new krediServisi();
        this.kredi=kredi;
        sifre=0;
        kasa=0;
    }
    public Banka(String isim,int sifre) {
        int limitim=limit;
        double faizim=faiz;
        this.isim = isim;
        List yeni= new List();
        this.liste= yeni;
        krediServisi kredi=new krediServisi(faizim,limitim);
        this.kredi=kredi;
        this.sifre=sifre;
    }
    public void setFaiz(int faiz) {
        this.faiz = faiz;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getFaiz() {
        return faiz;
    }

    public String getIsim() {
        return isim;
    }
    
    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Banka{" + "faiz=" + faiz + ", isim=" + isim + ", limit=" + limit + ", no=" + no + ", kasa=" + kasa + '}';
    }

    
    

   
    
    
}