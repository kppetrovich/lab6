import java.util.Objects;

public class WorldGenertation {
    protected int TypeOfWeather;
    protected void generateWeather(){
        if(TypeOfWeather==1){
            RainyWeather rainyWeather = new RainyWeather();
            rainyWeather.setAir_humidity();
            rainyWeather.setTemperature();
            rainyWeather.setNebulosity();
            rainyWeather.setSolar_power();
            rainyWeather.setWind_speed();
            StormCloud stormCloud = new StormCloud();
            stormCloud.makeThunder(1);
            stormCloud.setCoordinates();
            rainyWeather.setCommonClouds();
            Sea sea = new Sea();
            stormCloud.makeLighting(sea);
        }
        if(TypeOfWeather==2){
            SunnyWeather sunnyWeather = new SunnyWeather();
            sunnyWeather.setAir_humidity();
            sunnyWeather.setTemperature();
            sunnyWeather.setNebulosity();
            sunnyWeather.setSolar_power();
            sunnyWeather.setWind_speed();
            sunnyWeather.radiateHeat();
            Sea sea = new Sea();
            sunnyWeather.makeRays(sea);
        }
        if(TypeOfWeather==3){
            WindyWeather windyWeather = new WindyWeather();
            windyWeather.setAir_humidity();
            windyWeather.setTemperature();
            windyWeather.setNebulosity();
            windyWeather.setSolar_power();
            windyWeather.setClouds();
            windyWeather.setWind_speed();
            windyWeather.makeWaves();

        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorldGenertation that = (WorldGenertation) o;
        return TypeOfWeather == that.TypeOfWeather;
    }

    @Override
    public int hashCode() {

        return Objects.hash(TypeOfWeather);
    }

    @Override
    public String toString() {
        return "WorldGenertation{" +
                "TypeOfWeather=" + TypeOfWeather +
                '}';
    }
}

