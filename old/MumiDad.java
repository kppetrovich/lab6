public class MumiDad extends Mumi {
    {name="Муми-папа";stamina=200;thirst=120;hungry=85;x=(int) (Math.random()*100);
        y=(int)(Math.random()*100);
        z=1+(int)(Math.random()*100);}
    @Override
    void specialMove(){
        stamina-=120; thirst-=50; hungry-=25;
        System.out.print( name + " поставил навес от солнца. ");
    }
    @Override
    void run(){
        stamina-=130; thirst-=50;hungry-=15;
        System.out.print("Папа носился ");
    }

    @Override
    public String toString() {
        return "MumiDad{}";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
