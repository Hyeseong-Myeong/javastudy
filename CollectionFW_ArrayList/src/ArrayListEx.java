import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/Jsp");
        list.add(2, "Database");
        list.add("iBATIS");

        int size = list.size();
        System.out.println("총 객체 수: " + size);

        for(String s : list){
            System.out.println(s);
        }

    }

}
