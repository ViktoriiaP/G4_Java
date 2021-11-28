package lesson2HW2;

public class MainClassForHW3 {
    private static int[] massive = {12, 5, -3, 45, 0, 10};

    public static void main(String[] args) {
        Calculator3 calculator3 = new Calculator3();
        System.out.println(calculator3.division(2.45, 8));
        System.out.println(calculator3.division(5, 0));
        WorkWithMassive workWithArray = new WorkWithMassive();
        workWithArray.analyzeMassive(massive, 7);



        int[][] matrix= workWithArray.matrixCreate(5,5,7);
        workWithArray.printMatrix(matrix);
        workWithArray.fillingBothDiagonal(matrix,1);
        workWithArray.printMatrix(matrix);















        System.out.println("-----------------------------Happy End-------------------------------");
    }
}

