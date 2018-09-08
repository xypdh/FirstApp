import java.util.HashMap;

/**
 * @author xy
 * @create 2018-09-08-21:17
 */
public class First {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        Add();
    }
    public static void  Add(){
       int a=1,b=20;
       int c=a+b;
        System.out.println("c");
        HashMap<String, String> map = new HashMap<>();
        map.put("name","tom");
        map.put("age","10");
        String ss = map.get("name");
        System.out.println("ss = " + ss);
    }
}
