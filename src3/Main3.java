import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> listInt = new ArrayList<>();
        int index = 10;
        int minValue = 0;
        int maxValue = 100;
        listIntRandom(listInt, index, minValue, maxValue);
        System.out.println(listInt);

        int minList = minList(listInt);
        int maxList = maxList(listInt);
        double meanList = meanList(listInt);

        System.out.printf(" Минимальное значение  в листе: %d\n Максимальное значение в листе: %d\n" +
                " Среднее арифметическое значение листа: %.2f", minList,maxList,meanList);


    }

    public static void listIntRandom(List<Integer> listInt, int index, int minValue, int maxValue) {

        for (int i = 0; i < index; i++) {
            listInt.add(new Random().nextInt(minValue, maxValue));
        }
    }

    public static int minList(List<Integer> listInt) {
        int minValue = listInt.get(0);
        for (int i = 1; i < listInt.size(); i++) {
            if (listInt.get(i) < minValue) minValue = listInt.get(i);
        }
        return minValue;
    }

    public static int maxList(List<Integer> listInt) {
        int maxValue = listInt.get(0);
        for (int i = 1; i < listInt.size(); i++) {
            if (listInt.get(i) > maxValue) maxValue = listInt.get(i);
        }
        return maxValue;
    }

    public static double meanList(List<Integer> listInt) {
        double sumValue = 0;
        double meanValue;
        for (int i = 0; i < listInt.size(); i++) sumValue += listInt.get(i);
        meanValue = sumValue/listInt.size();
        return meanValue;

    }
}
