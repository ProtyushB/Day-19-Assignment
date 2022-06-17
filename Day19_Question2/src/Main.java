import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>(5);

        linkedHashMap.put("West Bengal","Kolkata");
        linkedHashMap.put("Tamil Nadu","Chennai");
        linkedHashMap.put("Goa","Panaji");
        linkedHashMap.put("Sikkim","Gangtok");
        linkedHashMap.put("Rajasthan","Jaipur");


        for (Map.Entry<String,String> l:linkedHashMap.entrySet()){
            System.out.println(l);
        }
    }
}
