

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.AccessDeniedException;

public class Client {
    private SnorksCollection snorksCollection = new SnorksCollection();
    static String link;
    WorkJSON wj = new WorkJSON();
    public void begin() {
        System.out.println("\n");
        System.out.println("\n Тебя я слушаю, странник");
        System.out.println(" \n" +
                "                   ____\n" +
                "                _.' :  `._\n" +
                "            .-.'`.  ;   .'`.-.\n" +
                "   __      / : ___\\ ;  /___ ; \\      __\n" +
                " ,'_ \"\"--.:__;\".-.\";: :\".-.\":__;.--\"\" _`,\n" +
                " :' `.t\"\"--.. '<@.`;_  ',@>` ..--\"\"j.' `;\n" +
                "      `:-.._J '-.-'L__ `-- ' L_..-;'\n" +
                "        \"-.__ ;  .-\"  \"-.  : __.-\"\n" +
                "            L ' /.------.\\ ' J\n" +
                "             \"-.   \"--\"   .-\"\n" +
                "            __.l\"-:_JL_;-\";.__\n" +
                "         .-j/'.;  ;\"\"\"\"  / .'\\\"-.\n" +
                "       .' /:`. \"-.:     .-\" .';  `.\n" +
                "    .-\"  / ;  \"-. \"-..-\" .-\"  :    \"-.\n" +
                " .+\"-.  : :      \"-.__.-\"      ;-._   \\\n" +
                " ; \\  `.; ;                    : : \"+. ;\n" +
                " :  ;   ; ;                    : ;  : \\:\n" +
                ": `.\"-; ;  ;                  :  ;   ,/;\n" +
                " ;    -: ;  :                ;  : .-\"'  :\n" +
                " :\\     \\  : ;             : \\.-\"      :\n" +
                "  ;`.    \\  ; :            ;.'_..--  / ;\n" +
                "  :  \"-.  \"-:  ;          :/.\"      .'  :\n" +
                "    \\       .-`.\\        /t-\"\"  \":-+.   :\n" +
                "     `.  .-\"    `l    __/ /`. :  ; ; \\  ;\n" +
                "       \\   .-\" .-\"-.-\"  .' .'j \\  /   ;/\n" +
                "        \\ / .-\"   /.     .'.' ;_:'    ;\n" +
                "         :-\"\"-.`./-.'     /    `.___.'");
        System.out.println("Куда путь ты свой держишь?");
        Thread t = Thread.currentThread();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Инициировано закрытие программы");
            try {
                save();
                t.join();
            } catch (InterruptedException| NullPointerException e) {
            }
        }));
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Client.link = br.readLine().trim();
            System.out.println("Загружен путь: " + Client.link);
            snorksCollection.snorks = wj.jsonToObject(Client.link);
            System.out.println("Доступные тебе команды: \n info, clear, remove_greater, add_if_min, save, stop, import, insert. Ах, да, есть еще один secret");
            String thisLine;
            while (!((thisLine = br.readLine())).trim().equals("stop")) {
                snorksCollection.doThisCommand(thisLine);
            }
            save();
        } catch (NullPointerException e) {
            System.out.println("Пустой ввод");
        } catch (AccessDeniedException f){
            System.out.println("Проблема с правами");
        } catch (IOException d){

        };

    }
    public void save(){
        wj.jsonToFile(snorksCollection.snorks, Client.link);
    }
}
