import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Student> studentHashMap = new HashMap<>();

        studentHashMap.put("Telangana",new Student(2,"A",650));
        studentHashMap.put("West Bengal",new Student(4,"C",780));
        studentHashMap.put("Mumbai",new Student(3,"A",910));
        studentHashMap.put("Chennai",new Student(1,"D",450));
        studentHashMap.put("Tamil Nadu",new Student(5,"B",820));

        Set<Map.Entry<String,Student>> set = studentHashMap.entrySet();

        List<Map.Entry<String,Student>> stduentArraylist = new ArrayList<>(set);

        Collections.sort(stduentArraylist, (o1, o2) -> o1.getValue().getMarks()>o2.getValue().getMarks() ?1:-1);

        for (Map.Entry<String,Student> s:stduentArraylist){
            System.out.println(s);
        }
    }
}
