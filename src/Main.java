public class Main {
    public static void main(String[] args) {
        int[] weights = {90, 91, 93, 92, 85, 87, 89, 0, 0, 0, 0, 0}; //массив из 12 элементов
        int[] weightsCopy = {90, 91, 93, 92, 85, 87, 89, 0, 0, 0, 0, 0}; //массив из 12 элементов
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }

        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("Массивы разные");
        }

        int maxWeight = -1;
        for (int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);
        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++) {
            System.out.println(weights[i + 1] - weights[i]);
        }
        // Задание 1
        // бухгалтеры попросили посчитать сумму всех выплат за месяц.

        int[] arr = generateRandomArray();
        int totalMonth = 0;
        for (int i = 0; i < arr.length; i++) { // цикл для подсчета умма трат за месяц
            totalMonth += arr[i];
            // System.out.print(arr[i] + " ");
        }
        System.out.println("Сумма трат за месяц составила " + totalMonth + " рублей");

        // Задание 2
        // найти минимальную и максимальную трату за день.

        int minConsumption = 200000;
        for (int current : arr) {
            if (current < minConsumption) {
                minConsumption = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + minConsumption + " рублей");

        int maxConsumption = 0;
        for (int current : arr) {
            if (current > maxConsumption) {
                maxConsumption = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxConsumption + " рублей");

        // реализация решения в одном цыкле
        int minConsumption1 = 200000;
        int maxConsumption1 = 0;
        for (int current : arr) {
            if (current < minConsumption1) {
                minConsumption1 = current;
            }
            if (current > maxConsumption1) {
                maxConsumption1 = current;
            }
        }
        System.out.println();
        System.out.println("Максимальная сумма трат за день составила " + minConsumption1 + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxConsumption1 + " рублей");

        // Задача 3
        /* Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц
        поделить на количество дней), и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        */
        double averageAmount = totalMonth / 30; // totalMonth был рассчитан в первой задаче
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + "рублей");

        // Задача 4
        // Напишите код, который в случае бага будет выводить Ф. И. О. сотрудников в корректном виде
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) { // цикл для вывода в консоль значений массива в обратном порядке
            System.out.print(reverseFullName[i]);
        }
    }



    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;



    }
}






