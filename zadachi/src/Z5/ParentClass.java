package Z5;
// Задача 5: Создать класс-наследник с переопределенным методом print
public class  ParentClass {
    public void print(String str) {
        System.out.println("Parent: " + str);
    }
}

public class ChildClass extends ParentClass{
    @Override
    public void print(String str) {
        System.out.println("Child: " + str);
    }
}
