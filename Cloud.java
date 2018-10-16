abstract class Cloud {
    static double x,y,z;
    static protected String colour;
    abstract void setCoordinates();

    @Override
    public String toString() {
        return "Cloud{}";
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
