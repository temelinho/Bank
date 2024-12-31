
package bankafinal;

public class Add implements Servis{
    public static Node add(Banknode banka,String isim,int sifre){
        return banka.banka.liste.ekle(isim, sifre);
    }
    
}
