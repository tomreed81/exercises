import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List test = new ArrayList(Arrays.asList(1,2,3,4,5,6,4,5,6,7,7,7));
        ListCount testList = new ListCount(test);

        System.out.println("Map (key=count) :\n" + testList.count());
    }
}
