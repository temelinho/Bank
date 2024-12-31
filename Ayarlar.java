
package bankafinal;

public class Ayarlar implements Servis{
    public static int Ayarlar(Node kisi,int sifre,int yenisifre) {
        if(kisi.musteri.sifre==sifre){
            kisi.musteri.sifre=sifre;
            return 1;
        }
        else{
            System.out.println("Hatali Sifre!");
            return -1;
        }
    }
    
}
