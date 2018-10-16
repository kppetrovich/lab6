import java.util.Objects;

public class RainyWeather extends Weather implements Wind {
    @Override
    void setTemperature() {
        this.temperature = 15 + (int) (Math.random() * 12);
    }

    @Override
    void setAir_humidity() {
        this.air_humidity = 0.6 + Math.random() * 0.4;
    }

    @Override
    void setSolar_power() {
        this.solar_power = (int) (Math.random());
    }

    @Override
    void setWind_speed() {
        this.wind_speed = 8 + (int) (Math.random() * 12);

    }

    @Override
    void setNebulosity() {
        this.nebulosity = 0.74 + Math.random() * 0.26;
    }
    static int count_clouds= (int)(25*nebulosity);
    @Override
    public void incWindSpeed(){
        this.wind_speed+=1;
    }
    @Override
    public void moveClouds(CommonCloud cloud){
        cloud.x+=wind_speed*0.89;
        cloud.y+=wind_speed*0.11;
        cloud.z+= wind_speed*0.1; }
    @Override
    public void moveStormCloud(){
    stormCloud.x+=wind_speed;
    stormCloud.y+=wind_speed*0.11;
    stormCloud.z+=wind_speed*0.1;
    }


    StormCloud stormCloud=new StormCloud();

    public void setCommonClouds() {
        boolean CloudMoves=false;
        CommonCloud[] cloud = new CommonCloud[count_clouds];
        for (int i = 0; i < count_clouds; i++) {
         cloud[i]=new CommonCloud();
         cloud[i].setCoordinates();
         if( stormCloud.x-cloud[i].x<10 && stormCloud.y-cloud[i].y<10 && stormCloud.z-cloud[i].z<10){
             stormCloud.moveClouds(cloud[i].x, cloud[i].y,cloud[i].z);
            CloudMoves=true; }
        }
        if(CloudMoves || CloudMoves==false){
            System.out.print(" и гнала перед собой клочья голубых облаков.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RainyWeather that = (RainyWeather) o;
        return Objects.equals(stormCloud, that.stormCloud);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), stormCloud);
    }

    @Override
    public String toString() {
        return "RainyWeather{" +
                "stormCloud=" + stormCloud +
                '}';
    }
}

