

import java.util.Arrays;
import java.util.Objects;

public class StormCloud extends Cloud {
    private int energy = 100;
    static boolean StatusOfLighting = false;

    public void moveClouds(double x1, double y1, double z1) {
        x += RainyWeather.wind_speed;
        y += RainyWeather.wind_speed * 0.11;
        z += RainyWeather.wind_speed * 0.1;
        x1 += RainyWeather.wind_speed;
        y1 = RainyWeather.wind_speed * 0.11;
        z1 = RainyWeather.wind_speed * 0.1;

    }
    ColoursOfStormCloud[] colours = ColoursOfStormCloud.values();
    ColoursOfStormCloud colour = colours[(int) (Math.random() * 4)];

    @Override
    public void setCoordinates() {
        x = (int) (Math.random() * 100);
        y = (int) (Math.random() * 100);
        z = 1 + (int) (Math.random() * 100);
        System.out.println("Над горизонтом стеною вздымалась грозная " + colour + " туча ");
    }

    public void makeLighting(Sea sea) {
        if (energy > 0) {
            StatusOfLighting = true;
            sea.ReflectLighting(StatusOfLighting);
            energy -= 10;
            System.out.print(" бледным светом зарниц. ");
        }
    }

    public void makeThunder(int num) {
        class Thunder {
            protected int thundpower = 50;

            protected void makeNoiseAway() {
                System.out.println("Вдали глухо грохотало.");
            }

            protected void makeNoiseNear() {
                System.out.print("Громовые раскаты ");
            }
        }
        if (num == 1) {
            Thunder thunder = new Thunder();
            thunder.makeNoiseAway();
        }
        if (num == 2) {
            Thunder thunder = new Thunder();
            thunder.makeNoiseNear();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StormCloud that = (StormCloud) o;
        return energy == that.energy &&
                Arrays.equals(colours, that.colours) &&
                colour == that.colour;
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(super.hashCode(), energy, colour);
        result = 31 * result + Arrays.hashCode(colours);
        return result;
    }

    @Override
    public String toString() {
        return "StormCloud{" +
                "energy=" + energy +
                ", colours=" + Arrays.toString(colours) +
                ", colour=" + colour +
                '}';
    }

    public enum ColoursOfStormCloud {
        СИНЯЯ, ЧЕРНОСИНЯЯ, ТЕМНОСИНЯЯ, ГРАЗНОЛИЛОВАЯ
    }

}
