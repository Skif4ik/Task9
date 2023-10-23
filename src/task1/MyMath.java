package task1;

public class MyMath {
    Factorial factorial;
    Equation equation;


    public static class Equation {
        public int a, b, c;

        public Equation(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        private double discriminant() {
            double res = Math.pow(b, 2) - 4 * a * c;
            return res;
        }

        private boolean check() {
            if (discriminant() < 0) {
                return false;
            } else {
                return true;
            }
        }

        public Double getX1() {
            if (check()) {
                double x1 = (-b + Math.sqrt(discriminant())) / (2 * a);
                return x1;
            } else {
                System.out.println("Нет корней");
                return null;
            }
        }

        public Double getX2() {
            if (discriminant() == 0 || !check()) {
                Double res = null;
                return res;
            }
            double x2 = (-b - Math.sqrt(discriminant())) / (2 * a);
            return x2;
        }
    }


    public static class Factorial {
        private int value;

        public Integer getFactorial(int value) {
            int res = 1;
            if (value >= 0) {
                res = (value == 0) ? 1 : value * getFactorial(--value);
            } else {
                System.out.println("Невозможно посчитать факториал отрицательного числа");
                return null;
            }
            return res;
        }

    }
}