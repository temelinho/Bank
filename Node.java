
package bankafinal;

public class Node implements Servis{
    Node next;
    int no;
    Musteri musteri;
    public Node(String isim,int sifre,int no){
        Musteri yeni=new Musteri(isim,sifre,no);
        this.musteri=yeni;
        this.next = null;
        this.no =no;
    }
    
}
