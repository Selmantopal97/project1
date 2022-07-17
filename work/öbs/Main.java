package work.öbs;

public class Main {
    public static void main(String[] args) {
        Hoca hoca1=new Hoca("Mahmut", "Matematik");
        Hoca hoca2=new Hoca("Ahmet","Tarih");
        Hoca hoca3=new Hoca("Ayşe", "Fizik");
        
        Ders matematik= new Ders(1,"Matematik", "Matematik");
        matematik.hocaEkle(hoca1);
        
        Ders tarih=new Ders(2,"Tarih", "Tarih");
        tarih.hocaEkle(hoca2);

        Ders fizik=new Ders(3,"Fizik", "Fizik");
        fizik.hocaEkle(hoca3);

        Öğrenci ogr1=new Öğrenci("Kerim", "1", "9", matematik, tarih , fizik);
        ogr1.sinavNotuEkle(60, 30, 80);
        ogr1.basariDurumu();

        Öğrenci ogr2=new Öğrenci("Selman", "2", "9", matematik, tarih, fizik);
        ogr2.sinavNotuEkle(86, 95, 79);
        ogr2.basariDurumu();
    }
}
