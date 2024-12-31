package bankafinal;

import java.util.Scanner;

public class BankaFinal extends List {

    public static void main(String[] args) {
        Banklist liste = new Banklist();

        Banknode Garanti = AddBank.ekle(liste, "Garanti", 1.7, 70000, 1111);
        Banknode Ziraat = AddBank.ekle(liste, "Ziraat", 1.5, 50000, 0000);

        Node Mehmet = Add.add(Garanti, "Mehmet", 1511);
        Node Ali = Add.add(Garanti, "Ali", 1511);
        Node bakkal = Add.add(Garanti, "Bakkal", 1511);
        Node Ahmet = Add.add(Ziraat, "Ahmet", 1511);
        Node Mutait = Add.add(Garanti, "Mutahit", 1511);

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("0-Cikis.\n1-Bireysel.\n2-Kurumsal");
            int a = scan.nextInt();
            if (a == 0) {
                System.out.println("Sistemden Cikiliyor...");
                break;
            } else if (a == 1) {
                while (true) {
                    Node kisi = null;
                    liste.print();
                    int b = scan.nextInt();
                    Banka banka = liste.search(b);
                    System.out.println("0-Ust menu.\n1-Kayit ol.\n2-Giris");
                    int e = scan.nextInt();
                    int i = 0, f = 0;
                    if (e == 0) {
                        break;
                    } else if (e == 1) {
                        System.out.println("Isım Soyisim:");
                        String isim = scan.next();
                        System.out.println("Sifre Belirleyiniz.");
                        int sifre = scan.nextInt();
                        kisi = Add.add(Garanti, isim, sifre);
                        kisi.toString();
                    } else if (e == 2) {
                        System.out.println("Musteri no giriniz:");
                        f = scan.nextInt();
                        int sifre = -1;

                        while (i < 3) {
                            System.out.println("0-Cikis.\nSifrenizi girin:");
                            i++;
                            sifre = scan.nextInt();
                            if (sifre == 0) {
                                break;
                            } else {
                                kisi = banka.liste.ara(f, sifre);
                                if (kisi != null) {
                                    break;
                                }
                            }
                        }
                        if (i == 3) {
                        }
                    } 
                    else {
                        System.out.println("Hatali Giris!");
                    }
                    if (kisi == null && i == 3) {
                        banka.liste.GA(f);
                        System.out.println("Sifre hakkiniz kalmadi.Guvenlik nedeni ile bakiyeniz sifirlanmistir.");
                    }
                    if (kisi != null) {
                        System.out.println("Hosgeldiniz Sayin " + kisi.musteri.isim + " TR" + kisi.no);
                        while (true) {
                            System.out.println("0-Ust menu\n1-Para servsisi.\n2-Kredi servisi.\n3-Ayarlar");
                            int g = scan.nextInt();
                            if (g == 0) {
                                break;
                            }
                            if (g == 1) {
                                while (true) {
                                    System.out.println("Bakiyeniz:" + kisi.musteri.bakiye + "\n0-Cikis\n1-Para Cekme.\n2-Para Yatirma.\n3-Para transferi.");
                                    int h = scan.nextInt();
                                    if (h == 0) {
                                        break;
                                    } else if (h == 1) {
                                        System.out.println("Miktar girin");
                                        int j = scan.nextInt();
                                        paraServisi.Paracek(kisi.musteri, j);
                                    } else if (h == 2) {
                                        System.out.println("Miktar girin");
                                        int j = scan.nextInt();
                                        paraServisi.Parayatir(kisi.musteri, j);
                                    } else if (h == 3) {
                                        System.out.println("0-Cikis.\n1-Bankamiz musterisine\n2-Farkli bankaya.");
                                        int k = scan.nextInt();
                                        if (k == 0) {
                                            break;
                                        } else if (k == 1) {
                                            System.out.println("Miktar girin");
                                            int j = scan.nextInt();
                                            System.out.println("Musteri no girin:");
                                            int m = scan.nextInt();
                                            paraServisi.transfer1(kisi, banka.liste, j, m);
                                        } else if (k == 2) {
                                            System.out.println("Miktar girin");
                                            int j = scan.nextInt();
                                            liste.print();
                                            System.out.println("Banka seciniz.");
                                            int l = scan.nextInt();
                                            System.out.println("Musteri no girin:");
                                            int m = scan.nextInt();
                                            paraServisi.transfer2(kisi, liste, j, m, l);
                                        }

                                    }

                                }
                            } else if (g == 2) {
                                while (true) {
                                    System.out.println("Borcunuz:" + kisi.musteri.borc);
                                    System.out.println("0-Ust menu.\n1-Kredi cekme.\n2-Borc odeme.\n3-Kredi notu ogrenme.");
                                    int h = scan.nextInt();
                                    if (h == 0) {
                                        break;
                                    } else if (h == 1) {
                                        System.out.println("Miktar girirniz:");
                                        int j = scan.nextInt();
                                        if (banka.kredi.krediCek(kisi.musteri, j) == 1) {
                                            banka.kasa -= j;
                                        }
                                    } else if (h == 2) {
                                        System.out.println("Miktar girirniz:");
                                        int j = scan.nextInt();
                                        if (banka.kredi.krediOde(kisi.musteri, j) == 1) {
                                            banka.kasa += j;
                                        }
                                    } else if (h == 3) {
                                        banka.kredi.not(kisi.musteri);
                                    }
                                }
                            }
                            if (g == 3) {
                                while (true) {
                                    System.out.println("0-Ust menu.\n1-Sifre Degistirme.");
                                    int h = scan.nextInt();
                                    if (h == 0) {
                                        break;
                                    } else if (h == 1) {

                                        i = 0;
                                        while (i < 3) {
                                            System.out.println("Sifre Gir:");
                                            int j = scan.nextInt();
                                            System.out.println("Yeni Sifre Gir:");
                                            int k = scan.nextInt();
                                            if (Ayarlar.Ayarlar(kisi, j, k) == 1) {
                                                break;
                                            }
                                            i++;
                                        }
                                        if (i == 3) {
                                            System.out.println("Sifre hakkiniz kalmadi.Guvenlik nedeni ile bakiyeniz sifirlanmistir.");
                                            banka.liste.GA(kisi.no);
                                        }
                                    }
                                }
                            } else {
                                System.out.println("Hatali Giris!");
                            }
                        }
                    }
                }
            } 
            else if (a == 2) {
                while (true) {
                    System.out.println("0-Ust Menu.\n1-Giris.\n2-Banka Kurma.");
                    int i = 0;
                    int b = scan.nextInt();
                    Banka banka = null;
                    if (b == 0) {
                        break;
                    } else if (b == 1) {
                        i = 0;
                        while (i < 5) {
                            liste.print();
                            int c = scan.nextInt();
                            System.out.println("Sifrenizi Girin");
                            int d = scan.nextInt();
                            banka = liste.giris(c, d);
                            if (banka != null) {
                                break;
                            } else {
                                System.out.println("Yanlis Sifre!");
                                i++;
                            }
                        }
                    } else if (b == 2) {
                        int c = 0;
                        while (c != -1) {
                            System.out.println("50000000TL vergi ve en az 1tl sermaye");
                            c = scan.nextInt();
                            if (c >= 50000001) {
                                break;
                            }
                            System.out.println("Gecersiz miktar girilidi.");
                        }
                        if (c != -1) {

                            System.out.println("Banka adini giriniz:");
                            String d = scan.next();
                            System.out.println("Sifre Giriniz:");
                            int z = scan.nextInt();
                            System.out.println("Faiz orani giriniz:");
                            double e = scan.nextDouble();
                            System.out.println("Faizsiz kredi miktarini giriniz:");
                            int f = scan.nextInt();
                            Banknode banknode = AddBank.ekle(liste, d, e, f, z);

                            banka = banknode.banka;
                            banka.kasa += (c - 50000000);
                            System.out.println(banka.toString());
                        }
                    }
                    if (banka != null) {
                        while (true) {
                            System.out.println("0-Cikis.\n1-Musteri Islemleri.\n2-Kredi Islemleri.");
                            int g = scan.nextInt();
                            if (g == 0) {
                                break;
                            } else if (g == 1&&banka.liste.ilk!=null) {
                                System.out.print("Siralaniyor...");
                                banka.liste.printAll();
                            } else if (g == 2) {
                                while (true) {
                                    System.out.println("0-Ust Menu.\n1-Faiz Orani Guncelleme.\n2-Limit Guncelleme");
                                    int h = scan.nextInt();
                                    if (h == 0) {
                                        break;
                                    } else if (h == 1) {
                                        System.out.println("Yeni Faiz Oranini Giriniz:");
                                        int j = scan.nextInt();
                                        System.out.println("Faiz orani guncelleniyor...");
                                        banka.setFaiz(j);
                                    } else if (h == 2) {
                                        System.out.println("Yeni Faizsiz Kredi Limiti Giriniz:");
                                        int j = scan.nextInt();
                                        System.out.println("Limit guncelleniyor...");
                                        banka.setLimit(j);
                                    }
                                }
                            }
                        }
                    }

                }
            }
            else {
                System.out.println("Hatali Giris.");
            }
        }

    }

}
