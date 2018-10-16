import java.util.Objects;

public class WindyWeather extends  Weather implements Wind {
    boolean waves=false;
    @Override
    void setTemperature(){
        this.temperature=15+(int)(Math.random()*8);
    }
    @Override
    void setAir_humidity(){
        this.air_humidity=Math.random()*0.3;
    }
    @Override
    void setSolar_power(){
        this.solar_power=(int)(Math.random());
    }

    @Override
    void setWind_speed(){
        this.wind_speed=12+(int)(Math.random()*8);
        System.out.print(", дул сильный ветер.");

    }
    @Override
    void setNebulosity(){
        this.nebulosity=1;
    }
    @Override
    public void incWindSpeed(){
        this.wind_speed+=2;
    }
    @Override
    public void moveClouds(CommonCloud cloud){
        cloud.x+=wind_speed;
        cloud.y+=wind_speed;
        cloud.z+=wind_speed;
    }
    int count_clouds=(int) (100*nebulosity);
    @Override
    public void moveStormCloud(){}
    public void setClouds(){
        CommonCloud[] cloud = new CommonCloud[count_clouds];
        for (int i = 0; i < count_clouds; i++) {
            cloud[i]=new CommonCloud();
            cloud[i].setCoordinates();
    }
        System.out.print("Высоко в небе быстро бежали облака");
    }
    Sea sea = new Sea();
    @Override
    public void makeWaves(){
        sea.playWaves();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WindyWeather that = (WindyWeather) o;
        return waves == that.waves &&
                count_clouds == that.count_clouds &&
                Objects.equals(sea, that.sea);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), waves, count_clouds, sea);
    }

    @Override
    public String toString() {
        return "WindyWeather{" +
                "waves=" + waves +
                ", count_clouds=" + count_clouds +
                ", sea=" + sea +
                '}';
    }

}
