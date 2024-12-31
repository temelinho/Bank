package bankafinal;
public class List extends Banka{
    Node ilk;
    static int no= 10000;
    public List() {
        ilk = null;
    }
    public Node ekle(String isim,int sifre){
        Node yeni=new Node(isim,sifre,no);
        no++;
        if(ilk==null){
            ilk=yeni;
            return ilk;
        }
        else{
            Node temp=ilk;
            while(temp!=null){
                if(temp.next==null){
                    temp.next=yeni;
                    return temp.next;
                }
                temp=temp.next;
            }
        }
        return null;
    }
    public Node ara(int a,int sifre){
        Node temp=ilk;
            while(temp!=null){
                if(temp.no==a){
                    if(temp.musteri.sifre==sifre){
                        return temp;
                    }
                    else if(temp.musteri.sifre!=sifre){
                        System.out.println("Sifre yanlis!");
                        
                    }
                }
                temp=temp.next;
            }
            return null;
    }
    //guvenlik sorunları olması durumunda bununla hesap askıya alınacak.
    public void GA(int a){
        Node temp=ilk;
            while(temp!=null){
                if(temp.no==a){
                       temp.musteri.bakiye=0;
                      
                    
                }
                temp=temp.next;
            }
    }
    public void printAll(){
        Node temp=ilk;
        int i=1;
        System.out.println(ilk.musteri.musteriNumarasi);
        while(temp!=null){
            
            System.out.println(i+"-"+temp.musteri.isim+"-TR"+temp.no);
            temp=temp.next;
            i++;
        }
   }
}
