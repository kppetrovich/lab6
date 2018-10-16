import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class SnorksCollection  implements Comparator<Snork> {
    ObjectMapper objectMapper = new ObjectMapper();
    Gson gson = new Gson();
    private final Date createDate;
    private Date changeDate;
    WorkJSON workJSON = new WorkJSON();
    LinkedHashMap<String, Snork> snorks;
    SnorksCollection() {
        createDate = new Date();
        changeDate = createDate;
    }
    public void info() {
        System.out.println("Тип коллекции: " + snorks.getClass());
        System.out.println("Количество элементов в коллекци: " + snorks.size());
        System.out.println("Дата создания: " + createDate);
        System.out.println("Дата изменения: " + changeDate);
    }
    public void clear(){
        snorks.clear();
        System.out.println("Коллекция очищена");
    }
    private void removeGreater(String JSON){
        try { JSON= JSON.trim();
            Snork element = objectMapper.readValue(JSON, Snork.class);
            int count = 0;
            Iterator<Snork> it = snorks.values().iterator();
            while (it.hasNext()) {
                if ( compare(it.next(), element) == 0) {
                    it.remove();
                    count++;
                }
            }
            System.out.println("Удалилось: " + count + " элементов");
        }catch (Exception e){
            System.out.println("Неправильный формат объекта JSON");
        }}
        private void addIfMin(String JSON){
            try {
                JSON=JSON.trim();
                Snork element = objectMapper.readValue(JSON, Snork.class);
                Iterator<Snork> iterator = snorks.values().iterator();
                int res=0;
                while(iterator.hasNext()){
                    res = res + compare(iterator.next(),element);
                }
                if(res==0){
                    snorks.put("min", element);
                    System.out.println("Добавлен");
                }else {
                    System.out.println("Не добавлен ");
                };
            } catch (Exception e){
                System.out.println( "Неверный формат задания");
            };
        }
        public void insert(String JSON){
            try{ JSON=JSON.trim();
                List<LinkedHSSnork> snorksList = gson.fromJson(JSON, new TypeToken<List<LinkedHSSnork>>() {
                }.getType());
                Iterator<LinkedHSSnork> iterator = snorksList.iterator();
                while (iterator.hasNext()){
                    LinkedHSSnork a = iterator.next();
                    snorks.put(a.key,a.snork);
                }
                System.out.println("Добавлено");

            } catch (Exception e){
                System.out.println("Неверный формат задания");};
        }

        public void inport(String path){
            try { path=path.trim();
                jsonToObject(path);
                System.out.println("Импортировано");
            } catch (Exception F) {
                System.out.println("Неверный формат задания");
            }

    }


        @Override
    public int compare(Snork o1, Snork o2) {
            int c=0;

                if(o1.getStamina()<o2.getStamina()){
                    c+=1;
                }
            return c;
    }
    public void doThisCommand(String command){
        if(command.trim().startsWith("clear")){
            this.clear();
        }else if(command.trim().startsWith("info")){
            this.info();
        }else if(command.trim().startsWith("remove_greater ")) {
            String JSON = command.trim().substring("remove_greater".length(),
                    command.trim().length()).trim();
            this.removeGreater(JSON);
        }else if(command.trim().startsWith("import ")){
            String path = command.trim().substring("import".length(),
                    command.trim().length()).trim();
            this.inport(path);}
        else if(command.trim().startsWith("insert ")){
            String JSON = command.trim().substring("insert".length(),
                    command.trim().length()).trim();
            this.insert(JSON);}
        else if(command.trim().startsWith("secre")) {
            System.out.println("\n" +
                    " \n" +
                    "\n" +
                    "           ___________    ____\n" +
                    "    ______/   \\__//   \\__/____\\\n" +
                    "  _/   \\_/  :           //____\\\\\n" +
                    " /|      :  :  ..      /        \\\n" +
                    "| |     ::     ::      \\        /\n" +
                    "| |     :|     ||     \\ \\______/\n" +
                    "| |     ||     ||      |\\  /  |\n" +
                    " \\|     ||     ||      |   / | \\\n" +
                    "  |     ||     ||      |  / /_\\ \\\n" +
                    "  | ___ || ___ ||      | /  /    \\\n" +
                    "   \\_-_/  \\_-_/ | ____ |/__/      \\\n" +
                    "                _\\_--_/    \\      /\n" +
                    "               /____             /\n" +
                    "              /     \\           /\n" +
                    "              \\______\\_________/");
            System.out.println("Поставь лк, плез");

            System.out.println(" \n" +
                    "\n" +
                    "                                       .;;;..\n" +
                    "                                    ;<!!!!!!!!;\n" +
                    "                                 .;!!!!!!!!!!!!>\n" +
                    "                               .<!!!!!!!!!!!!!!!\n" +
                    "                              ;!!!!!!!!!!!!!!!!'\n" +
                    "                            ;!!!!!!!!!!!!!!!!!'\n" +
                    "                           ;!!!!!!!!!!!!!!!''\n" +
                    "                         ,!!!!!!!!!!!!!'` .::\n" +
                    "                  ,;!',;!!!!!!!!!!!'` .::::''  .,,,,.\n" +
                    "                 !!!!!!!!!!!!!!!'`.::::' .,ndMMMMMMM,\n" +
                    "                !!!!!!!!!!!!!' .::'' .,nMMP\"\"',nn,`\"MMbmnmn,.\n" +
                    "                `!!!!!!!!!!` :'' ,unMMMM\" xdMMMMMMMx`MMn\n" +
                    "             _/  `'!!!!''`  ',udMMMMMM\" nMMMMM??MMMM )MMMnur=\n" +
                    ",.... ......--~   ,       ,nMMMMMMMMMMnMMP\".,ccc, \"M MMMMP' ,,\n" +
                    " `--......--   _.'        \" MMP??4MMMMMP ,c$$$$$$$ ).MMMMnmMMM\n" +
                    "     _.-' _..-~            =\".,nmnMMMM .d$$$$$$$$$L MMMMMMMMMP\n" +
                    " .--~_.--~                  '.`\"4MMMM  $$$$$$$$$$$',MMMMMPPMM\n" +
                    "`~~~~                      ,$$$h.`MM   `?$$$$$$$$P dMMMP , P\n" +
                    "                           <$\"\"?$ `\"     $$$$$$$$',MMMP c$\n" +
                    "                           `$c c$h       $$$$$$$',MMMM  $$\n" +
                    "                            $$ $$$       $$$$$$',MMMMM  `?\n" +
                    "                            `$.`$$$c.   z$???\"  \"',,`\"\n" +
                    "                             3h $$$$$cccccccccc$$$$$$$$$$$=r\n" +
                    "                             `$c`$$$$$$$$$$$$$$$??$$$$F\"$$ \"\n" +
                    "                           ,mr`$c`$$$$$$$$$$$$$$c 3$$$$c$$\n" +
                    "                        ,mMMMM.\"$.`?$$$$$$$$$$$$$$$$$$$$$$h,\n" +
                    ";.   .               .uMMMMMMMM \"$c,`\"$$$$$$$$$$$$$$$$C,,,,cccccc,,..\n" +
                    "!!;,;!!!!> .,,...  ,nMMMMMMMMMMM.`?$c  `\"?$$$$$$$$$$$$$$$$$$$$$$$$$$$$h.\n" +
                    "!!!!!!!!! uMM\" <!!',dMMMMMMMMMMPP\" ?$h.`::..`\"\"???????\"\"'..  -==cc,\"?$$P\n" +
                    "!!!!!!!!'.MMP <!',nMMMMMMMMP\" .;    `$$c,`'::::::::::::'.$F\n" +
                    "!!!!!!!! JMP ;! JMMMMMMMP\" .;!!'      \"?$hc,.````````'.,$$\n" +
                    "!!!!'''' 4M(;',dMMMP\"\"\" ,!!!!` ;;!!;.   \"?$$$$$?????????\"\n" +
                    "!!! ::. 4b ,MM\" .::: !''`` <!!!!!!!!;\n" +
                    " `!::::.`' 4M':::::'',mdP <!!!!!!!!!!!;\n" +
                    "! :::::: ..  :::::: \"\"'' <!!!!!!!!!!!!!!;\n" +
                    "!! ::::::.::: .::::: ;!!> <!!!!!!!!!!!!!!!!!;.\n" +
                    "!! :::::: `:'::::::!!' <!!!!!!!!!!!!!!!!!!!!!;;.\n" +
                    "! ::::::' .::::' ;!' .!!!!!!!!!!!!!!'`!!!!!!!!!!!;.\n" +
                    "; `::';!>  ::' ;<!.;!!!!!!!''''!!!!' <!! !!!!!!!!!!!>\n");}
        else if(command.trim().startsWith("save")) {
            try{ workJSON.jsonToFile(snorks, Client.link);
            }
            catch (Exception e){}
            System.out.println("Сохранено");
        }
        else if(command.trim().startsWith("add_if_min ")) {
            String JSON = command.trim().substring("add_if_min".length(),
                    command.trim().length()).trim();
            this.addIfMin(JSON);
        }else System.out.println("Команда не найдена");
    }
    public LinkedHashMap<String, Snork> jsonToObject(String path) {

        List<LinkedHSSnork> snorksList= getSnorks(path);
        for (LinkedHSSnork linkedHSSnorksnork:snorksList){
            snorks.put(linkedHSSnorksnork.key, linkedHSSnorksnork.snork);
        }


        return snorks;}
    public List<LinkedHSSnork> getSnorks(String path){
        List<LinkedHSSnork> list=new ArrayList<>();
        try {
            list= Arrays.asList(objectMapper.readValue( new File(path),LinkedHSSnork[].class ));
        }catch (NullPointerException f) {
            System.out.println("Пустой ввод");
        } catch(IllegalStateException z){
            System.out.println("Неправильное представление json");
        }
        catch (FileNotFoundException e){
            System.out.println("Файл не найден, нет доступа");
        } catch (IOException s){
            System.out.println("Неправильное представление json");
        }

        return list;
    }

}
