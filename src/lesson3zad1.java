//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
public class lesson3zad1 {

    public static void main(String[] args) {

        ArrayList<Integer> speeds = new ArrayList<>(); // объявление списка
        speeds.add(120);
        speeds.add(75);
        speeds.add(42);
        speeds.add(60);
        speeds.add(110);
        speeds.add(20);

        int sum = 0;
        for (int speed : speeds) { // цикл for-each для суммирования значений
            sum += speed;
        }

        int averageSpeed = sum / speeds.size(); // вычисление средней скорости
        System.out.println("Средняя скорость равна " + averageSpeed + " км/ч");
    }
}