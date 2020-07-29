package enhancedLoop;

import java.util.ArrayList;
import java.util.List;

public class UseForEachLoop {
    public static void main(String[] args) {

        List<Character> nameList = new ArrayList<>();
        nameList.add('S');
        nameList.add('R');
        nameList.add('J');
        nameList.add('R');

        for (Character st: nameList) {
            System.out.println(st);

        }
    }
}
