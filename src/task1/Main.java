package task1;

//1. Создать класс MyMath. В классе MyMath определить два статических
//вложенных класса Equation и Factorial. Equation - аналогичный заданию из Tasks3-4 (класс
//квадратное уравнение). Factorial: поле – значение для вычисления факториала,
//конструктор с параметром, метод для вычисления значения факториала. Создать по два
//объекта каждого класса и продемонстрировать работу методов решения соответствующих
//математических задач.

public class Main {
    public static void main(String[] args) {
        MyMath.Equation equation1 = new MyMath.Equation(1,4,3);
        MyMath.Equation equation2 = new MyMath.Equation(3,-18,27);
        MyMath.Factorial factorial1 = new MyMath.Factorial();
        MyMath.Factorial factorial2 = new MyMath.Factorial();

        System.out.println("equation1");
        System.out.println("x1 = " + equation1.getX1() + "\nx2 = " + equation1.getX2());
        System.out.println("equation2");
        System.out.println("x1 = " + equation2.getX1() + "\nx2 = " + equation2.getX2());
        System.out.println("factorial1");
        System.out.println(factorial1.getFactorial(5));
        System.out.println("factorial2");
        System.out.println(factorial1.getFactorial(0));
    }
}
