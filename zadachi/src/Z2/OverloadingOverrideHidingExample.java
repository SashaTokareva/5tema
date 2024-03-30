package Z2;
// Задача 2: Создайте класс с методом `print`, который принимает строку и выводит ее на экран.
public class OverloadingOverrideHidingExample {
    public void print(String str) {
        System.out.println("String: " + str);
}
    public static void main(String[] args) {
        OverloadingOverrideHidingExample example = new OverloadingOverrideHidingExample();
        example.print("Hello, mir!");
    }
}
