package work.maaş;

public class Personel {
    String isim;
    int maas;
    int saat;
    String yıl;
    int vergi=60;
    int bonus=150;
    int tmaas;
    int artis=0;

    Personel (String isim,int maas,int saat,String yıl){
        this.isim=isim;
        this.maas=maas;
        this.saat=saat;
        this.yıl=yıl;
    }

    void Hesapla(){
        personelBilgi();
        toplamMaas(2300);
        vergiBonus();
        System.out.println("Toplam Maaş: "+tmaas);
    }

    void personelBilgi(){
        System.out.println("Adı: "+this.isim);
        System.out.println("Maaşı:  "+this.maas);
        System.out.println("Çalışma Saati: "+this.saat);
        System.out.println("Başlangıç Yılı: "+this.yıl);
        System.out.println("Vergi: "+ vergi);
        System.out.println("Bonus: "+bonus);
    }

    void toplamMaas(int tmaas){
        this.tmaas=tmaas;
        artis=tmaas-this.maas;
        System.out.println("Maaş Artışı: "+artis);
    }

    void vergiBonus(){
        int vergilibonusluMaas;
        vergilibonusluMaas=this.maas-vergi+bonus;
        System.out.println("Vergi ve Bonus Sonrası Maaş: "+vergilibonusluMaas);
    }


}
