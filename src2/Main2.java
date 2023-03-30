import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.*;

public class Main2 {
    public static void main(String[] args) throws IOException {

        Logger log2 = Logger.getLogger(Main2.class.getName());
        FileHandler file2 = new FileHandler("src/log2.txt",true);
        log2.addHandler(file2);
        List<Integer> listInt = new ArrayList<>();
        SimpleFormatter sFormat = new SimpleFormatter();
        file2.setFormatter(sFormat);
        log2.setUseParentHandlers(true); // вывод логов в терминал, true and false
        for (int i = 0; i < 10; i++) {
            listInt.add(new Random().nextInt(0, 100));
        }
        log2.info("массив до сортировки: " + listInt);
        for (int i = 0; i < listInt.size(); i++) {
            for (int j = 0; j < listInt.size() - 1; j++) {
                int temp;
                if (listInt.get(j) > listInt.get(j + 1)) {
                    temp = listInt.get(j + 1);
                    listInt.set(j+1,listInt.get(j)) ;
                    listInt.set(j,temp);
                }
            }
            log2.info("Проход №"+ (i+1) + " Массив: " + listInt);
        }
        log2.info("Сортировка окончена");
    }
}
