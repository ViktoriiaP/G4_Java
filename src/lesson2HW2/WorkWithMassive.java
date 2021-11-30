package lesson2HW2;

/**
 * В основной программе объявить массив {12, 5, -3, 45, 0, 10}
 * В WorkWithArray разработать метод void analyzeMassive (int[] massive, int varForComparing), в котором вывести сообщения
 * Если значение масива больше varForComparing - massive[i] +" Value is more than " + varForComparing
 * Если значение масива равно varForComparing - massive[i] +" Value is equal  " + varForComparing
 * Если значение масива меньше varForComparing - massive[i] +" Value is less than " + varForComparing
 */
public class WorkWithMassive {
    private int[][] matrix;
    private int m;
    private int n;

    public static void analyzeMassive(int[] massive, int varForComparing) {

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > varForComparing) {
                System.out.println(massive[i] + " Value is more than " + varForComparing);
            } else if (massive[i] == varForComparing) {
                System.out.println(massive[i] + " Value is equal  " + varForComparing);
            } else {
                System.out.println(massive[i] + " Value is less than " + varForComparing);
            }
        }
        System.out.println("------------------------------------------------");
    }

    /**
     * Part 1. В  классе WorkWithMassive создать метод который будет создавать матрицу (тип int) и заполнять ее заданным значением
     * (размерность матрицы и значение передаем с основной программы, например по размеру NхN (на пример 3х3) и заполнять ее заданным значением, к примеру 8.).
     * После заполнения возвращать ее .
     * Также в этом классе создать метод fillingOfLeftDiagonal -
     * метод должен принимать на вход матрицу, и значение для заполнения.
     * Проверять квадратная ли она. Если да, то заполнять диагонаkь переданным значением и возвращать матрицу.
     * Если не квадратная - выводить сообщение "Матрица не квадратная" и возвращать неизмененную матрицу
     * Также в этом классе создать метод fillingOfRightDiagonal -
     * аналогично fillingOfLeftDiagonal но заполнять правую диагональ
     * Создать метод по заполнению значениями сразу двух диагоналей переданным значением
     * Метод выведения матрицы в консоль в "красивом виде" - строки - значения через пробел,
     * а каждая строка с новой строки (мы уже создали его на занятии , просто перенести его в класс по работе с массивом) . Например
     * 1 1 1
     * 1 1 1
     * 1 1 1
     * 8 1 1 - левая диагональ
     * 1 8 1
     * 1 1 8
     * 1 1 8 - правая диагональ
     * 1 8 1
     * 8 1 1
     */
    public int[][] matrixCreate(int m, int n, int filler) {
        matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = filler;
            }
        }
        printMatrix(matrix);
        System.out.println("------------------------------------------------");
        return matrix;
    }

    public boolean check(int[][] matrix) {
        boolean isSquare = true;
        if (matrix[0].length != matrix.length) {
            isSquare = false;
            System.out.println("Matrix is not square  ");
        }

        return isSquare;
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public int[][] fillingOfLeftDiagonal(int[][] matrixLeft, int fillerDiagonal) {
        if (check(matrixLeft)) {
            int[][] tmp = matrixLeft;
            for (int i = 0; i < tmp.length; i++) {
                for (int j = 0; j < tmp[i].length; j++) {
                    if (i == j) {
                        tmp[i][j] = fillerDiagonal;
                    } else {
                        tmp[i][j] = matrixLeft[i][j];
                    }
                }
                matrixLeft = tmp;
            }
            System.out.println("------------------------------------------------");
        }
        printMatrix(matrixLeft);
        return matrixLeft;
    }

    public int[][] fillingOfRightDiagonal(int[][] matrixRight, int fDiagonal) {
        if (check(matrixRight)) {
            int tmp[][] = matrixRight;
            for (int i = 0; i < tmp.length; i++) {
                for (int j = 0; j < tmp[i].length; ++j) {
                    if (i + j == tmp[i].length - 1) {
                        tmp[i][j] = fDiagonal;
                    } else {
                        tmp[i][j] = tmp[i][j];
                    }
                }
                matrixRight = tmp;
            }
            System.out.println("------------------------------------------------");
        }
        printMatrix(matrixRight);
        return matrixRight;
    }

    public int[][] fillingBothDiagonal(int[][] matrixBoth, int fDiagonal) {
        if (check(matrixBoth)) {
            int tmp[][] = matrixBoth;
            this.fillingOfLeftDiagonal(tmp, fDiagonal);
            this.fillingOfRightDiagonal(tmp, fDiagonal);
            matrixBoth = tmp;
        }
        printMatrix(matrixBoth);
        return matrixBoth;
    }
}











