public class Knees extends Attack {

    private final static String techniques[] ={
            "Left-knee",
            "Right-knee",
            "Left-circular-knee",
            "Right-circular-knee",
            "Left-jumping-knee",
            "Right-jumping-knee"
    };

    public Knees(int technique_number) {
        this.body_part = getClass().getName();
        this.technique = techniques[technique_number-1];
    }

    public static void getTechniques() {
        for (int i = 1; i <= techniques.length; i++) {
            System.out.println(String.valueOf(i) + " " + techniques[i-1]);
        }
    }
}
