package Z1;
// Задача 1: Создайте класс с методом `print`, который принимает целое число и выводит его на экран.
public class OverloadingOverrideHidingExample {

    public void print(int num) {
        System.out.println("Number: " + num);
    }

    public static void main(String[] args) {
        OverloadingOverrideHidingExample example = new OverloadingOverrideHidingExample();
        example.print(10);
    }
}