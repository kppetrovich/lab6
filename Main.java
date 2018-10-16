import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;

public class Main{

    public static void main(String[]args) throws IOException {
   /* WorldGenertation world = new WorldGenertation();
    world.TypeOfWeather= 3+ (int) ( Math.random() * 0 );
    world.generateWeather();

    if(world.TypeOfWeather==1){
        try{StormCloud stormCloud = new StormCloud();
            Snork snork = new Snork();
        MumiMom Mom = new MumiMom();
        Mom.moor();
        Mom.makeBuilding();
        Mom.gatherMoss();
        Mom.specialMove();
        Mom.checkStamina(Mom.stamina, Mom.hungry, Mom.thirst);
        try {
            snork.digHouse();
        }
        catch (NoStaminaExcep excep){
            System.out.println(excep.getMessage());
            snork.checkStamina(snork.stamina,snork.hungry,snork.thirst);
            }
        snork.checkStamina(snork.stamina, snork.hungry, snork.thirst);
        snork.run();
        Mom.run();
        Mom.checkStamina(Mom.stamina, Mom.hungry, Mom.thirst);
        snork.checkStamina(snork.stamina, snork.hungry, snork.thirst);
        snork.bringItems();
        stormCloud.makeThunder(2);
        Mom.hearThunder(stormCloud);
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(snork);
            System.out.println(json);
    }
    catch (SequenceError sequenceError){
        System.out.println(sequenceError.getMessage());
    }
    }

    if(world.TypeOfWeather==2){
        SunnyWeather sunnyWeather= new SunnyWeather();
        Snork snork = new Snork();
        MumiDad Dad = new MumiDad();
        Dad.moor();
        Dad.makeBuilding();
        Dad.specialMove();
        Dad.checkStamina(Dad.stamina, Dad.hungry, Dad.thirst);
        snork.digCrabsTrick();
        Dad.run();
        Dad.findWater();
        Dad.checkStamina(Dad.stamina, Dad.hungry, Dad.thirst);
        sunnyWeather.incSolarPower();
        ObjectMapper mapper = new ObjectMapper();
    }
    if(world.TypeOfWeather==3){
        Snork snork=new Snork();
        MumiMarshal Marshal = new MumiMarshal();
        Marshal.moor();
        Marshal.makeBuilding();
        Marshal.specialMove();
        Marshal.checkStamina(Marshal.stamina, Marshal.hungry, Marshal.thirst);
        try{snork.digBunker();}
        catch (NoStaminaExcep excep){
            System.out.println(excep.getMessage());
            snork.checkStamina(snork.stamina,snork.hungry,snork.thirst);
        }
        snork.run();
        Marshal.run();
        snork.bringDocs();
        snork.checkStamina(snork.stamina, snork.hungry, snork.thirst);
        Marshal.startTimer();
        snork.closeBunker();
        Marshal.startTheRocket();
        Rocket rocket=new Rocket();
        rocket.makeNoise();
        }
    */
    Client client = new Client();
    client.begin();


}}