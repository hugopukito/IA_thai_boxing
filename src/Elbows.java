public class Elbows extends Attack {

    private final static String techniques[] ={
            "Left-elbow",
            "Right-elbow",
            "Left-descendant-elbow",
            "Right-descendant-elbow",
            "Left-ascendant-elbow",
            "Right-ascendant-elbow",
            "Left-spinning-elbow",
            "Right-spinning-elbow"
    };

    public Elbows(int technique_number) {
        this.body_part = getClass().getName();
        this.technique = techniques[technique_number-1];
    }

    public static void getTechniques() {
        for (int i = 1; i <= techniques.length; i++) {
            System.out.println(String.valueOf(i) + " " + techniques[i-1]);
        }
    }
}
