import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListCount {

    private List list;
    private Map<Integer,Integer> counts;

    ListCount(List list) {
        this.list = list;
        counts = new HashMap<Integer,Integer>();
    }

    public Map<Integer,Integer> count() {
        for (Object item : list) {
            int value = (Integer) item;
            if (counts.containsKey(value)) {
                counts.put(value, counts.get(value) + 1);
            } else {
                counts.put(value,1);
            }
        }
     return counts;
    }

}
