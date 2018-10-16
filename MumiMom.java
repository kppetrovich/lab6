import java.util.Objects;

public class MumiMom extends Mumi {
    {
        name = "Муми-мама";
        stamina = 130;
        thirst = 50;
        hungry = 100;
        x = (int) (Math.random() * 100);
        y = (int) (Math.random() * 100);
        z = 3;
    }

    int countOfMoss = 0;

    void hearThunder(StormCloud stormCloud) {
        if (stormCloud.x - x < 20 || stormCloud.y - y < 20 || stormCloud.z - z < 20) {
            System.out.print(" слышались все ближе и ближе.");
        } else {
            System.out.println(" не были слышны.");
        }
    }

    public void gatherMoss() {
        stamina -= 15;
        thirst -= 10;
        hungry -= 6;
        countOfMoss += 25;
    }

    @Override
    public void specialMove(){
        if(countOfMoss<25){
            throw new SequenceError("Ошибка последовательности вызова методов! Завершение программы. ");
        }
        else{stamina -= 100;
        thirst -= 10;
        hungry -= 10;
        countOfMoss -= 25;
        System.out.println(name + " законопатила мхом все щели. ");}
    }

    @Override
    public void run() {
        stamina -= 16;
        thirst -= 14;
        hungry -= 11;
        System.out.println(" Все носились, ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MumiMom mumiMom = (MumiMom) o;
        return countOfMoss == mumiMom.countOfMoss;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), countOfMoss);
    }

    @Override
    public String toString() {
        return "MumiMom{" +
                "countOfMoss=" + countOfMoss +
                '}';
    }
}

