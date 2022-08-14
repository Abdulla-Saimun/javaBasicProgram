package aggregation;
import java.net.*;
public class socket {
    public static void main(String[] args) {
        try{
            InetAddress ip=InetAddress.getByName("195.201.10.8");

            System.out.println("Host Name: "+ip.getHostName());
        }catch(Exception e){System.out.println(e);}
    }
}

