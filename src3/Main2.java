import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {

        List<Integer> listInt = new ArrayList<>();
        int index = 20;
        int minValue = 0;
        int maxValue = 100;
        listIntRandom(listInt, index, minValue, maxValue);
        System.out.println(listInt);
        ListDelEvenNumbers(listInt);
        System.out.println(listInt);


    }

    public static void listIntRandom(List<Integer> listInt, int index, int minValue, int maxValue) {

        for (int i = 0; i < index; i++) {
            listInt.add(new Random().nextInt(minValue, maxValue));
        }
    }

    public static void ListDelEvenNumbers(List<Integer> listInt) {
        int index1 = 0;
        int index2 = listInt.size();

        while (index1 < index2) {
            if (listInt.get(index1) % 2 != 0) {
                index1++;
            } else {
                listInt.remove(index1);
                index2--;
            }
        }
    }
}
