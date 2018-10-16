

import java.io.*;
import java.nio.file.AccessDeniedException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jvnet.ws.wadl.Link;


public class WorkJSON {
    ObjectMapper mapper = new ObjectMapper(); //.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    LinkedHashMap<String, Snork> snorks = new LinkedHashMap<>();
    public void jsonToFile(LinkedHashMap<String, Snork> snorks, String path) {
        try { List result= new LinkedList<>();
            String json="";
            for ( Map.Entry<String, Snork> entry : snorks.entrySet()) {
                String key = entry.getKey();
                String snork = mapper.writeValueAsString(entry.getValue());
                json+="{\"key\":"+"\""+key+"\""+",\"snork\":"+snork+"},";
                }
                json=removeLastChar(json);
                json="["+json+"]";
            result= Arrays.asList(mapper.readValue( json, LinkedHSSnork[].class ));
            String s = mapper.writeValueAsString(result);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
           bufferedWriter.write(s);
            bufferedWriter.close();
        } catch (IOException | NullPointerException e) {
            System.out.println("Проверьте доступ к файлу вывода");
        }
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
                    list= Arrays.asList(mapper.readValue( new File(path),LinkedHSSnork[].class ));
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
    public String removeLastChar(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        return s.substring(0, s.length()-1);
    }
    }
