package local.pac;
import java.util.*;
public class LocalExample {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayName());
    }
}
