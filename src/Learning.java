import java.util.ArrayList;
import java.util.HashMap;

public class Learning {

    private HashMap<String, Integer> map = new HashMap<String, Integer>();

    public void add (HashMapData h) {

        String total = h.stringify();

        if (containsMap(total)) {
            int i = map.get(total);
            map.replace(total, i + 1);
        }
        else {
            map.put(total,1);
        }
    }

    public boolean containsMap (String s) {
        if (map.containsKey(s)) {
            return true;
        }
        return false;
    }

    public int getValue (String s) {
        return map.get(s);
    }

    public void getBestOptions (Techniques[] t) {

        String find = "";
        ArrayList<String> list = new ArrayList<String>();

        for (Techniques i : t) {
            find += i.toString();
        }

        for (String key : map.keySet()) {
            String[] part = key.split("1");
            String first = part[0];
            /*System.out.println("first : " + first);
            System.out.println("find  : " + find);*/
            if (find.equals(first)) {
                list.add(key);
            }
        }

        for(int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
            System.out.println(getValue(list.get(i)));
        }
    }
}
