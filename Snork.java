import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Snork extends Mumi {

   public Snork() {
       }

    public int getHungry() {
        return this.hungry;
    }

    public int getThirst() {
        return this.thirst;
    }

    @Override
    void specialMove() {

        this.stamina += 204;
        this.thirst += 150;
        this.hungry += 125;

    }

    @Override
    public String toString() {
        return "Snork{" +
                "stamina=" + stamina +
                ", thirst=" + thirst +
                ", hungry=" + hungry +
                ", name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }



    void run() {
        this.stamina -= 74;
        this.thirst -= 15;
        this.hungry -= 25;
    }

    public void digBunker() {
        this.stamina -= 74;
        this.thirst -= 15;
        this.hungry -= 25;
        if (stamina < 0 || thirst < 0 || hungry < 0) {
            System.out.println("Ошибка, действие digBunker не может быть выполнено");
        }
        System.out.print(name + " выкопал спуск в бункер. ");
    }

    public void digHouse() {
        this.stamina -= 44;
        this.thirst -= 19;
        this.hungry -= 15;
        if (stamina < 0 || thirst < 0 || hungry < 0) {
            System.out.println("Ошибка, действие digHouse не может быть выполнено");
        }
        System.out.print(name + " окопал дом канавой для отвода воды. ");
    }

    public void digCrabsTrick() {
        this.stamina -= 45;
        this.thirst -= 24;
        this.hungry -= 18;
        System.out.print(name + " прокопал траншею для ловли крабов. ");
    }

    public void closeBunker() {
        this.stamina -= 44;
        this.thirst -= 22;
        this.hungry -= 21;
        System.out.print(" крышка бункера захлопнулась. ");
    }
    public String getName() {
        return this.name;
    }

    public int getStamina() {
        return this.stamina;
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
