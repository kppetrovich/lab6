public class SunnyWeather extends Weather implements Sun {
   static boolean StatusOfRays=false;
    @Override
    void setTemperature(){
        this.temperature=25+(int)(Math.random()*20);
    }
    @Override
    void setAir_humidity(){
        this.air_humidity=Math.random()*0.5;
    }
    @Override
    void setSolar_power(){
        ColoursOfSun[] suncolours = ColoursOfSun.values();
        ColoursOfSun suncolour = suncolours[(int) (Math.random() * 3)];
        this.solar_power=40+(int)(Math.random()*60);
        System.out.println("В небе огненным шаром висело "+suncolour+" солнце");
    }
    @Override
    void setWind_speed(){
        this.wind_speed=(int)(Math.random()*20);

    }
    @Override
    void setNebulosity(){
        this.nebulosity=Math.random()*0.3;
    }
    @Override
     public void incSolarPower(){
        this.solar_power+=10;
        System.out.println( "Солнце пекло все сильнее и сильнее...");
    }
    @Override
    public void radiateHeat(){
        this.temperature+= 1 + (int)(Math.random()*2);
        System.out.print( "и излучало невероятно сильный поток тепла. ");
    }
    @Override
    public void makeRays(Sea sea){
        StatusOfRays=true;
        sea.reflectSunRays(StatusOfRays);
        if(solar_power>50){
            System.out.println( "яркие солнечные лучи.");}
        else{
            System.out.println( "солнечные лучи. "); }
        }

    @Override
    public String toString() {
        return "SunnyWeather{}";
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

