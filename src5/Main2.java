import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, String> staff = new HashMap<>();
        String tempWriter;

        try {
            BufferedReader br = new BufferedReader(new FileReader("src2/Staff.txt"));
            while ((tempWriter = br.readLine()) != null) {
                String[] tempWrArr = tempWriter.split(" ");
                staff.putIfAbsent(tempWrArr[1], tempWrArr[0]);
            }

        } catch (Exception e) {
            System.out.println("Файл не найден");
            System.exit(0);
        }
        List<String> nameStr = new ArrayList<>();
        for (String i : staff.values()) {
            nameStr.add(i);


        }
        Map<String, Integer> mp = new HashMap<>();
        Set<String> unique = new HashSet<>(nameStr);
        for (String key : unique) {
            mp.put(key, Collections.frequency(nameStr, key));
        }
        mp.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
