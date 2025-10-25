public class MathOperations {

    public static int add(int x,  int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return (a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        int addOperation = add(5, 7);
        System.out.println("Сумма чисел: " + addOperation);

        int subtractOperation = subtract(10, 3);
        System.out.println("Разница чисел: " + subtractOperation);

        int multiplyOperation = multiply(5, 4);
        System.out.println("Произведение чисел: " + multiplyOperation);

        double divideOperation = divide(10, 3);
        System.out.println("Деление чисел: " + divideOperation);

        int findMaxOperation = findMax(33, 44);
        System.out.println("Выводим наибольшее целочисленное число: " + findMaxOperation);

        int differenceOperation = difference(55, 33);
        System.out.println("Вывод разницы между двумя числами: " + differenceOperation);

        int squareAreaOperation = squareArea(4);
        System.out.println("Возвращаем площадь квадрата: " + squareAreaOperation);

        int squarePerimeterOperation = squarePerimeter(5);
        System.out.println("Возвращаем периметр квадрата: " + squarePerimeterOperation);

        double convertSecondsToMinutesOperation = convertSecondsToMinutes(456);
        System.out.println("Возвращаем значение перевода секунд в минуты: " + convertSecondsToMinutesOperation);

        double averageSpeedOperation = averageSpeed(600, 60);
        System.out.println("Возвращаем среднюю скорость: " + averageSpeedOperation);

        double findHypotenuseOperation1 = findHypotenuse(12, 2);
        System.out.println("Возвращаем гипотенузу 1: " + findHypotenuseOperation1);

        double findHypotenuseOperation2 = findHypotenuse(14, 3);
        System.out.println("Возвращаем гипотенузу 2: " + findHypotenuseOperation2);

        double circleCircumferenceOperation = circleCircumference(22);
        System.out.println("Возвращаем длину окружности: " + circleCircumferenceOperation);

        double calculatePercentageOperation = calculatePercentage(22, 5);
        System.out.println("Возвращаем проценты: " + calculatePercentageOperation);

        double celsiusToFahrenheitOperation = celsiusToFahrenheit(500);
        System.out.println("Возвращаем Фаренгейты: " + celsiusToFahrenheitOperation);

        double fahrenheitToCelsiusOperation = fahrenheitToCelsius(300);
        System.out.println("Возвращаем Цельсии: " + fahrenheitToCelsiusOperation);
    }
}
