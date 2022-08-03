public class Main {
    public static void main(String[] args) {

        // Task №1
        int[] ints = new int[3]; // объявление массива
        for (int i = 0; i < ints.length; i++) { // цикл по элементам массива. i изначально равна нулю, так как первая ячейка массива равна нулю. Если i < длины массива, прибавляем единицу.
            ints[i] = i + 1; //  заполнение массива значениями
        }
        double[] doubles = {1.57, 7.654, 9.986};
        boolean[] booleans = {true, false};

        // Task №2

        for (int i = 0; i < ints.length; i++) { // цикл по элементам первого массива в прямом порядке
            System.out.print(ints[i]); // вывод элемента массива под индексом i
            if (i != ints.length - 1) { // проверка, что индекс не последний
                System.out.print(", "); // вывод запятой
            }
        }

        System.out.println();

        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i]);
            if (i != doubles.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < booleans.length; i++) {
            System.out.print(booleans[i]);
            if (i != booleans.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        // Task №3

        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i]);
            if (i != 0) {
                System.out.print((", "));
            }
        }

        System.out.println();

        for (int i = doubles.length - 1; i >= 0; i--) {
            System.out.print(doubles[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = booleans.length - 1; i >= 0; i--) {
            System.out.print(booleans[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        // Task №4

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 1) { // Если i (как часть массива) не делится на 2 без остатка, то
                ints[i]++;          // прибавляем 1
            }
            System.out.print(ints[i]);
            if (i != ints.length - 1) { // Если i не равно длине массива минус 1 (3 - 1 = 2)
                System.out.print(", "); // То ставим запятую и пробел
            }
        }

    }
}

