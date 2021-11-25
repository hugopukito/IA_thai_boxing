import java.util.HashMap;

public class Learning {

    private HashMap<String, Integer> map = new HashMap<String, Integer>();

    public void add (String s) {
        if (contains(s)) {
            int i = map.get(s);
            map.replace(s, i += 1);
        }
        else {
            map.put(s,0);
        }
    }

    public boolean contains (String s) {
        if (map.containsKey(s)) {
            return true;
        }
        return false;
    }

    public int getValue (String s) {
        return map.get(s);
    }
}
