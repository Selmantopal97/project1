package work.öbs;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Hoca {
    Scanner input=new Scanner(System.in);
    String name,dal;

    Hoca(String name,String dal){
        this.name=name;
        this.dal=dal;
    }

    void print(){
        System.out.println("Hoca Adı: "+ this.name);
        System.out.println("Hoca Dalı: "+this.dal);

    }
}
