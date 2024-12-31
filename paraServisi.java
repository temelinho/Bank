
package bankafinal;
public class paraServisi implements Servis{
    
    public static void Parayatir (Musteri kisi,int a){
        if(a<=0){
            System.out.println("Gecersiz miktar girildi.");
        }
        else{
            kisi.bakiye=kisi.bakiye+a;
        }
    }
    public static void Paracek(Musteri kisi,int a){
        if(a>kisi.bakiye){
            System.out.println("Yetersiz bakiye!");
        }
        else{
            kisi.bakiye=kisi.bakiye-a;
            System.out.println(a+" cekildi.\nYeni Bakiye:"+kisi.bakiye);
        }
    }
    //aynı banka arasında.
    public static void transfer1(Node gonderen,List liste,int para,int hedef){
        Node temp=liste.ilk;
        if(gonderen.musteri.bakiye<para+5){
            System.out.println("Yetersiz Bakiye!");
            return ;
        }
        while(temp!=null){
            if(temp.no==hedef){
                gonderen.musteri.bakiye-=para;
                temp.musteri.bakiye+=para;
                return;
            }
            temp=temp.next;
        }
        System.out.println("Yanlis musteri numarasi");
    }
    public static void transfer2(Node gonderen,Banklist liste1,int para,int hedef,int bankno){
        Banknode bank = liste1.head;
        if(gonderen.musteri.bakiye<para+5){
            System.out.println("Yetersiz Bakiye!");
            return ;
        }
        while(bank!=null){
            if(bank.no==bankno){
                List liste=bank.banka.liste;
                Node temp=liste.ilk;
                while(temp!=null){
                     if(temp.no==hedef){
                         gonderen.musteri.bakiye-=para-5;
                         temp.musteri.bakiye+=para;
                         return;
                     }
                     temp=temp.next;
                }
            }
            bank=bank.next;
        }
    }
}
