import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        List<String> nullList = new ArrayList<>();

        Map<String, List<String>> PhoneBook = new HashMap<>();

        while (true) {
            System.out.print("Введите Имя или exit для выхода: ");
            String name = sc.next();
            if (name.equals("exit")) {
                System.out.println(PhoneBook);
                return;
            }
            System.out.print("Введите номер или exit для выхода: ");
            String phone = sc.next();
            if (phone.equals("exit")) {
                System.out.println(PhoneBook);
                return;
            }
            PhoneBook.putIfAbsent(name, nullList);
            for (String key : PhoneBook.keySet()) {
                if (name.equals(key)) {
                    List<String> temp = new ArrayList<>(PhoneBook.get(name));
                    temp.add(phone);
                    PhoneBook.put(name, temp);
                }
            }
        }
    }
}
