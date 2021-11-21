public class Tips extends Defense {

    private final static String techniques[] ={
            "Left-leg-tip",
            "Right-leg-tip",
            "Left-middle-tip",
            "Right-middle-tip",
            "Left-spinning-tip",
            "Right-spinning-tip"
    };

    public Tips(int technique_number) {
        this.defense_type = getClass().getName();
        this.technique = techniques[technique_number-1];
    }

    public static void getTechniques() {
        for (int i = 1; i <= techniques.length; i++) {
            System.out.println(String.valueOf(i) + " " + techniques[i-1]);
        }
    }
}
