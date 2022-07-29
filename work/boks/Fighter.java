package work.boks;

public class Fighter {
    String name;
    int health;
    int weight;
    int damage;
    int dodge;

    Fighter (String name,int health,int weight,int damage,int dodge){
        this.name=name;
        this.health=health;
        this.weight=weight;
        this.damage=damage;
        if(dodge>=0 && dodge<=100){
        this.dodge=dodge;
        }else{
            this.dodge=0;
        }
    }

    public int darbe(Fighter rakip){
        System.out.println(this.name+ "=>" +rakip.name+" "+this.damage +" hasar vurdu!");
        if(rakip.dodge()){
            System.out.println(rakip.name+" darbeyi engelledi.");
            return rakip.health;
        }
        
        if(rakip.health-this.damage<0){
        return 0;
    }
        
        return rakip.health-this.damage;    
    }

    public boolean dodge(){
        double randomSayı= Math.random() * 100;
        return randomSayı<=this.dodge;
    }

    



}
