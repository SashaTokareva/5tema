package Z4;
// Задача 4: Создайте класс с методом `print`, который принимает две строки и выводит их конкатенацию на экран.
public class OverloadingOverrideHidingExample {

    public void print(String str1, String str2) {
        System.out.println("Concatenated String: " + str1 + str2);
    }

    public static void main(String[] args) {
        OverloadingOverrideHidingExample example = new OverloadingOverrideHidingExample();
        example.print("Hello, ", "Java!");
    }
}
