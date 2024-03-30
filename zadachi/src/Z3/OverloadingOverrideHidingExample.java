package Z3;
// Задача 3: Создайте класс с методом `print`, который принимает два целых числа и выводит их сумму на экран.
public class OverloadingOverrideHidingExample {

    public void print(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));
    }

    public static void main(String[] args) {
        OverloadingOverrideHidingExample example = new OverloadingOverrideHidingExample();
        example.print(5, 7);
    }
}