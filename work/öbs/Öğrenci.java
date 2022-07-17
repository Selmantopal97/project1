package work.öbs;

public class Öğrenci {
    Ders d1,d2,d3;
    String name,ogrNo,sinif;
    double ortalama;
    boolean durumu;

    Öğrenci(String name,String ogrNo,String sinif,Ders d1,Ders d2,Ders d3){
        this.name=name;
        this.ogrNo=ogrNo;
        this.sinif=sinif;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.ortalama=0.0;
        this.durumu=false;
    }

    void sinavNotuEkle(int notd1, int notd2,int notd3){
        if(notd1>=0 && notd1<=100){
            this.d1.puan=notd1;
        }
        if(notd2>=0 && notd2<=100){
            this.d2.puan=notd2;
        }
        if(notd3>=0 && notd3<=100){
            this.d3.puan=notd3;
        }
    }
    
    void notuYazdır(){
        System.out.println(this.d1.name+ " Dersi Notu: "+this.d1.puan);
        System.out.println(this.d2.name+ " Dersi Notu: "+this.d2.puan);
        System.out.println(this.d3.name+ " Dersi Notu: "+this.d3.puan);
    }

    void ogrenciBilgi(){
        System.out.println("Öğrenci Adı: "+this.name);
        System.out.println("Öğrenci Numarası: "+this.ogrNo);
        System.out.println("Öğrenci Sınıfı: "+this.sinif);
    }
    
    void basariDurumu(){
        System.out.println("_______________________");
        ogrenciBilgi();
        notuYazdır();
        ortalama=(d1.puan+d2.puan+d3.puan)/3.0;
        System.out.println("Ortalama: "+ortalama);
        if(ortalama>=60){
            System.out.println("Sınıfı Geçti.");
        }else{
            System.out.println( "Sınıfı Geçemedi.");
        }
    }
}

