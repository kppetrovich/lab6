public class Rocket {
     int power=200000;
    public void start() {}
        public void makeNoise(){
            power-=50000;
            System.out.print("раздается свист ракет...");
        }

    @Override
    public String toString() {
        return "Rocket{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
