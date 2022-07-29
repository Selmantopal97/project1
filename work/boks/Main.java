package work.boks;

public class Main {
    public static void main(String[] args) {
        Fighter mike=new Fighter("Mike", 120 , 95, 25, 20);
        Fighter joshua=new Fighter("Joshua", 100, 100, 19, 15);

        Match m1=new Match(mike, joshua, 85, 100);

        m1.Basla();
    
    }
}
