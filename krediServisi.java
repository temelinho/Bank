
package bankafinal;

public class krediServisi implements Servis{
    static double faiz=1;
    int limit=20000;
    
    public krediServisi() {
    }
    
    public krediServisi(double faiz,int limit){
        this.limit=limit;
        krediServisi.faiz=faiz;
    }
    public static int krediCek(Musteri kisi,int para){
        if(kisi.kredinotu<500){
            System.out.println("Kredi notunuz yetersiz");
            return -1;
        }
        else if(para>kisi.kredinotu*10){
            System.out.println("Kredi notunuz yetersiz");
            return -1;
        }
        else if(para<=0){
            System.out.println("Gecersiz miktar girildi!");
            return -1;
        }
        else{
            kisi.kredinotu-=para/500;
            kisi.borc+=(para/100+faiz)*100;
            System.out.println("Guncel bakiyeniz: "+kisi.bakiye);
            return 1;
        }
    }
    public static int krediOde(Musteri kisi, int para){
        if(kisi.borc==0){
            System.out.println("Borcunuz bulunmamakta");
            return -1;
        }
        else{
            kisi.kredinotu+=para/100;
            kisi.borc-=para;
            if(kisi.borc<0){
                kisi.bakiye+=(-kisi.borc) ;
                return 1;
            }
        }
        return 0;
    }
    public static void not(Musteri kisi){
        kisi.kredinotu-=30;
        System.out.println("Kredi notunuz:"+kisi.kredinotu);
    }
}
