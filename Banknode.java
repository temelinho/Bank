
package bankafinal;
public class Banknode extends BankServis{
    String isim;
    int no;
    Banka banka;
    Banknode next;
    public Banknode(String isim){
        Banka yeni=new Banka(isim);
        banka=yeni;
        this.isim=isim;
        banka.no=no;
    }
    
}
