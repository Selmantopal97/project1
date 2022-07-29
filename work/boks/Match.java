package work.boks;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    public void Basla(){
        if(kiloKontrol()){
            while(this.f1.health>0 && this.f2.health>0){
                double ilkBaslama =Math.random() * 100;
                if(ilkBaslama<50){
                f2.health=f1.darbe(f2);
                if(isWin()){
                break;
            }
                }if(ilkBaslama>=50){    
                f1.health=f2.darbe(f1);
                if(isWin()){
                break;
                }
            }
                printHealt();
            }
        }
        else{
            System.out.println("Boksörlerin sikletleri uyuşmuyor");
        }
    }
    
    public boolean kiloKontrol(){
        return (this.f1.weight>=this.minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }

    boolean isWin(){
        if(this.f1.health==0){
            System.out.println(this.f2.name+ " kazandı.");
            return true;
        }

        if(this.f2.health==0){
            System.out.println(this.f1.name+ " kazandı.");
            return true;
        }
        return false;
    }

    public void printHealt(){
        System.out.println(this.f1.name+" kalan can: "+this.f1.health);
        System.out.println(this.f2.name+" kalan can: "+this.f2.health);
    }
    
}
