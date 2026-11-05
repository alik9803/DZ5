import java.util.Scanner;

void main(String[] args) {
    //task1();
   // task2();
  // task3();
   // task4();
   task5();
}

// Задание № 1. Использование цикла for
    public static void task1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println(" должно быть натуральным числом (N >= 125).");
            return;
        }
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.printf("Сумма = %.3f%n", sum);
    }


// Задание № 2. Использование цикла while
public static void task2() {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
int number = scanner.nextInt();
    number = Math.abs(number);
int sum = 0;
int temp = number;

        while (temp > 0) {
           int digit = temp % 10;
            if (digit % 2 != 0) {
            sum += digit;
            }
               temp = temp / 10;
        }
        System.out.println("Сумма нечётных цифр " + number + " = " + sum);
    }


    //Задание № 3. Использование цикла do while
public static void task3() {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    do {

        System.out.print("Введите число (для завершения введите -1): ");
        int number = scanner.nextInt();
        if (number == -1) {
            break;
        }

        if (number % 5 == 0) {
            sum += number;
        }

        count++;
    } while (count < 20);

    System.out.println("Введено чисел: " + count);
    System.out.println("Сумма чисел, делящихся на 5 без остатка: " + sum);
}

// Задание № 4. Использование вложенных циклов
public static void task4() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите количество строк R: ");

    int r = scanner.nextInt();

    System.out.print("Введите количество столбцов C: ");
    int c = scanner.nextInt();
    for (int i = 1; i <= r; i++) {
        for (int j = 1; j <= c; j++) {
            System.out.printf("%5d", i * j);
        }
        System.out.println();
    }
}

//Задание № 5. Использование операторов break и continue
public static void task5() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите количество чисел N (от 1 до 30): ");
    int n = scanner.nextInt();
    int sum = 0;
    int count = 0;
    for (int i = 1; i <= n; i++) {
        System.out.print("Введите число " + i + ": ");
        int number = scanner.nextInt();
        if (number == 0) {
            break;
        }

        if (number < 0) {
            continue;
        }

        if (number % 2 != 0) {
            sum += number * number;
            count++;
        }
    }
    if (count == 0) {
        System.out.println("Подходящих чисел не найдено.");
    } else {
        System.out.println("Сумма квадратов положительных нечётных чисел: " + sum);
    }
}

