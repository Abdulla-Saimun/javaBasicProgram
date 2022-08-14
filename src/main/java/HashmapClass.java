import java.util.HashMap;

public class HashmapClass {
    public static void main(String[] args) {
        HashMap<String, String> capital = new HashMap<String , String >();
        capital.put("bangladesh", "dhaka");
        capital.put("Srilanka", "ceylon");
        capital.put("Indonesia", "jakarta");
        System.out.println(capital);
        for(String i: capital.keySet()) {
            System.out.println("country: "+i+", capital: "+capital.get(i));
        }
    }
}
