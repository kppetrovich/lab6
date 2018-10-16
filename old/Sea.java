import java.util.Arrays;
import java.util.Objects;

public class Sea {
    boolean waves=false;
    Time[] times = Time.values();
    Time time = times[(int) (Math.random() * 4)];
     void ReflectLighting(boolean StatusOfLighting){
        if(StatusOfLighting == true){
            StormCloud.StatusOfLighting=false;
            System.out.println(" " + time + " море озарялось ");
        }
    }
    void reflectSunRays(boolean StatusOfRays){
         if(StatusOfRays==true){
             SunnyWeather.StatusOfRays=false;
             System.out.println(" " + time + " море отражало ");
         }


    }
    void playWaves(){
         waves=true;
        System.out.println(" Море "+time+" играло волнами.");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sea sea = (Sea) o;
        return waves == sea.waves &&
                Arrays.equals(times, sea.times) &&
                time == sea.time;
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(waves, time);
        result = 31 * result + Arrays.hashCode(times);
        return result;
    }

    @Override
    public String toString() {
        return "Sea{" +
                "waves=" + waves +
                ", times=" + Arrays.toString(times) +
                ", time=" + time +
                '}';
    }
}