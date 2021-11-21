public class Kicks extends Attack {

    private final static String techniques[] ={
            "Left-front-kick",
            "Right-front-kick",
            "Left-low-kick",
            "Right-low-kick",
            "Left-middle-kick",
            "Right-middle-kick",
            "Left-high-kick",
            "Right-high-kick",
            "Spinning-high-kick"
    };

    public Kicks(int technique_number) {
        this.body_part = getClass().getName();
        this.technique = techniques[technique_number-1];
    }

    public static void getTechniques() {
        for (int i = 1; i <= techniques.length; i++) {
            System.out.println(String.valueOf(i) + " " + techniques[i-1]);
        }
    }
}
