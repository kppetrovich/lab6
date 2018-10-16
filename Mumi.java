import java.util.Objects;

abstract class Mumi {
    protected  int stamina,thirst,hungry;
    protected String name;
    protected int x,y,z;
    final static void moor() {
        Transport[] transports = Transport.values();
        Transport transport = transports[(int) (Math.random() * 3)];

        System.out.print(" Они вытащили " + transport + " на берег");
    }
    final  void makeBuilding() {
        Materials[] materials = Materials.values();
        Materials materal = materials[(int) (Math.random() * 3)];
        TypesOfBuildings[] apartments = TypesOfBuildings.values();
        TypesOfBuildings apartment = apartments[(int) (Math.random() * 3)];
        Place[] place = Place.values();
        Place placec = place[(int) (Math.random() * 3)];
        stamina -= 25;
        thirst -= 35;
        hungry-=19;
        System.out.println(" и " + placec + " мигом сделали " + apartment + " из " + materal + ". ");
    }

    abstract void run();
    public int getX(){
        return this.x;
    }
    public String getName(){
        return this.name;
    }
    public int getStamina(){
        return this.stamina;
    }
    public int getHungry(){
        return this.hungry;
    }
    public int getThirst(){
        return this.thirst;
    }
    public int getY(){
        return this.y;
    }
    public int getZ(){
        return this.z;
    }

    abstract void specialMove();

    final void bringItems() {
        stamina -= 50;
        hungry -= 35;
        thirst -= 16;
        System.out.println("перетаскивая вещи в укрытие.");
    }

    final void findWater() {
        stamina -= 50;
        hungry -= 5;
        thirst -= 10;
        System.out.print(" пытаясь найти воду.");

    }

    final void bringDocs() {
        stamina-=14;
        hungry-=10;
        thirst-=13;
        System.out.println(" перетаскивая важные документы.");
    }

    final void getRest() {
        stamina += 200;
        hungry += 100;
        thirst += 80;
        System.out.println(name + " устал(a), решил(a) отдохнуть.");
    }

    final void checkStamina(int stamina, int hungry, int thirst) {
        if (stamina <= 0 || hungry <= 0 || thirst <= 0) {
            getRest();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mumi mumi = (Mumi) o;
        return Objects.equals(name, mumi.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Mumi{" +
                "name='" + name + '\'' +
                '}';
    }
}
