package work.öbs;

public class Ders {
    Hoca hoca;
    String name,prefix;
    int kod,puan;

    Ders(int kod,String prefix,String name){
        this.name=name;
        this.kod=kod;
        this.hoca=hoca;
        this.prefix=prefix;
        int puan=0;
    }

    void hocaEkle(Hoca hoca){
        if(hoca.dal.equals(this.prefix)){
        this.hoca=hoca;
        }else{
            System.out.println("Ders ve Öğretmen bölümleri uyuşmuyor!");
        }
    }

    void printHoca(){
       this.hoca.print();
    }
}
