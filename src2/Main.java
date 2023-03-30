import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        String enterString = "select * from students where ";
        String inputStr = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        StringBuilder outStr = new StringBuilder();
        String newInputStr = inputStr
                .replace("\"", "")
                .replace("{", "")
                .replace("}", "")
                .replace(" ", "");
        String[] newInputStrArr = newInputStr.split(",");
        System.out.println(Arrays.toString(newInputStrArr));
        for (String x : newInputStrArr) {
            if (!x.contains("null")) {
                outStr.append(enterString + x + "\n");
            }
        }
        System.out.println(outStr);
    }
}
