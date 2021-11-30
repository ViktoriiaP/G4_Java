package lesson2HW2;

public class MainClassForHW3 {
    private static int[] massive = {12, 5, -3, 45, 0, 10};

    public static void main(String[] args) {
        Calculator3 calculator3 = new Calculator3();
        System.out.println(calculator3.division(2.45, 8));
        System.out.println(calculator3.division(5, 0));
        WorkWithMassive workWithArray = new WorkWithMassive();
        workWithArray.analyzeMassive(massive, 7);


        int[][] matrix=workWithArray.matrixCreate(7,7,1);
        workWithArray.fillingOfRightDiagonal(matrix,8);
        int [][] matrix1=workWithArray.matrixCreate(6,6, 1);
        workWithArray.fillingOfLeftDiagonal(matrix1,8);
        int [][] matrix2= workWithArray.matrixCreate(8,8,1);
        workWithArray.fillingBothDiagonal(matrix2,8);
        int [][] matrix3= workWithArray.matrixCreate(2,3,1);
        workWithArray.fillingOfLeftDiagonal(matrix3,8);
        int [][] matrix4= workWithArray.matrixCreate(2,3,1);
        workWithArray.fillingOfRightDiagonal(matrix4,8);
        int [][] matrix5= workWithArray.matrixCreate(2,3,1);
        workWithArray.fillingBothDiagonal(matrix5,8);


        System.out.println("-----------------------------Happy End-------------------------------");
    }
}

