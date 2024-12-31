
package bankafinal;

public class Banklist extends BankServis{
    Banknode head;
    int sayac=0;
    public Banklist() { head=null; }
    public Banknode ekle(String isim){
        Banknode yeni=new Banknode(isim);
        sayac++;
        yeni.no=sayac;
        yeni.banka.no=sayac;
        if(head==null){
            head=yeni;
            return head;
        }
        else{
            Banknode temp=head;
            while(temp!=null){
                if(temp.next==null){
                    temp.next=yeni;
                    return temp.next;
                }
                else{
                    temp=temp.next;
                }
            }
        }
        return null;
    }
    public void print(){
        int s=1;
        Banknode temp=head;
        while(temp!=null){
            System.out.println(s+"-"+temp.banka.isim);
            temp=temp.next;
            s++;
        }
    }  
    public Banka search(int a){
        Banknode temp=head;
        while(temp!=null){
            if(temp.no==a){
                return temp.banka;
            }
            temp=temp.next;
        }
        return null;
    }
    public Banka search(Banklist liste,int no){
        Banknode temp=liste.head;
        while(temp!=null){
            if(temp.no==no){
                return temp.banka;
            }
            temp=temp.next;
        }
        return null;
    }
    public Banka giris(int no,int sifre){
        Banka yeni=search(no);
        if(sifre==yeni.sifre){
            return yeni;
        }
        else{
            System.out.println("Hatali Sifre");
            return null;
        }
    }
}
