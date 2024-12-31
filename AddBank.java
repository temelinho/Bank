
package bankafinal;

public class AddBank extends BankServis{
    public static Banknode ekle(Banklist liste,String isim,double faiz,int limit,int sifre){
        Banknode yeni=liste.ekle(isim);
        Banka bank=yeni.banka;
        bank.faiz=faiz;
        bank.limit=limit;
        bank.sifre=sifre;
        return yeni;
    }
}
