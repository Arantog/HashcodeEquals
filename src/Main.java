import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        Computer computer = new Computer("processor",2048,"1");
//        Computer computer2 = new Computer("processor",2048,"1");
//        Computer computer3 = new Computer("processor2",2048,"2");
//        Map<Computer,String> computerMap = new HashMap<>();
//        computerMap.put(computer,"computer");
//        computerMap.put(computer2,"computer2");
//        computerMap.put(computer3,"computer3");
//        computerMap.entrySet().forEach(entry ->System.out.println(entry));
        Laptop laptop1 = new Laptop("processor",2048,"1","battery");
        Laptop laptop2 = new Laptop("processor",2048,"1","battery");
        System.out.println(laptop1.equals(laptop2));
    }
}
