
package bankafinal;

public class transfer extends paraServisi{
    //aynı banka arasında.
    public static void transfer1(List liste,int para,int hedef){
        Node temp=liste.ilk;
        while(temp!=null){
            if(temp.no==hedef){
                temp.musteri.bakiye=+para;
                return;
            }
            temp=temp.next;
        }
        System.out.println("Yanlis musteri numarasi");
    }
    //farklı bankalar arası.
    public static void transfer2(Banklist liste1,int para,int hedef,int bankno){
        Banknode bank = liste1.head;
        while(bank!=null){
            if(bank.no==bankno){
                List liste=bank.banka.liste;
                Node temp=liste.ilk;
                while(temp!=null){
                     if(temp.no==hedef){
                         temp.musteri.bakiye=+para+(-5);
                         return;
                     }
                     temp=temp.next;
                }
            }
            bank=bank.next;
        }
    }
}
