public abstract class Weather {
    static int temperature;
    static double air_humidity;
    static int wind_speed;
    static double nebulosity;
    static int solar_power;
    abstract void setSolar_power();
    abstract void setTemperature();
    abstract void setAir_humidity();
    abstract void setWind_speed();
    abstract void setNebulosity();
    static  double g_y1=0,_g_y2=100,g_z1=0, g_z2=0, g_x1=0, g_x2=100; // координаты линии горизонта

    @Override
    public String toString() {
        return "Weather{}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
