package ru.geekbrains.javacore.homeworks.hw2;

public class Homework_2 {

    public static int toIntAndSum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            if (arr.length != 0) throw new MyArraySizeException("Ожидался массив размера 4х4, но размер текущего массива: " + arr.length + "x" + arr[0].length);
            else throw new MyArraySizeException("Ожидался массив размера 4х4, но размер текущего массива: 0x0");
        }
        int temp, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    temp = Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("Невозможно привести к типу int ячейку [" + i + "][" + j + "], значение которой \"" + arr[i][j] + "\"");
                }
                sum += temp;
            }
        }
        return sum;
    }

    private static void setRandom(String[][] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                temp = (int) (Math.random() * 1000);
                arr[i][j] = String.valueOf(temp);
            }
        }
    }

    private static void printArr(String[][] arr) {
        for (String[] strings : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }
    }

    private static void doOurMethod(String[][] arr, String name) {
        int result;
        try {
            result = toIntAndSum(arr);
            System.out.println("Sum of " + name + " array = " + result);
        }
        catch (MyArraySizeException e) {
            System.out.println("Сработало исключение MyArraySizeException");
            e.printStackTrace();
        }
        catch (MyArrayDataException e) {
            System.out.println("Сработало исключение MyArrayDataException");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[][] arrNorm = new String[4][4];
        String[][] arrLess = new String[2][2];
        String[][] arrMore = new String[6][6];
        String[][] arrEmpty = new String[0][0];
        String[][] arrWithWrongData = new String[4][4];

        setRandom(arrNorm);
        setRandom(arrLess);
        setRandom(arrMore);
        setRandom(arrWithWrongData);

        arrWithWrongData[2][1] = "NOTINT";

        System.out.println("\nArray 1:");
        printArr(arrNorm);
        System.out.println("\nArray 2:");
        printArr(arrLess);
        System.out.println("\nArray 3:");
        printArr(arrMore);
        System.out.println("\nArray 4:");
        printArr(arrEmpty);
        System.out.println("\nArray 5:");
        printArr(arrWithWrongData);
        System.out.println();

        System.out.println("\nНормальный массив:");
        doOurMethod(arrNorm, "normal");

        System.out.println("\nМассив меньше чем нужно:");
        doOurMethod(arrLess, "small");

        System.out.println("\nМассив больше чем нужно:");
        doOurMethod(arrMore, "big");

        System.out.println("\nПустой массив:");
        doOurMethod(arrEmpty, "empty");

        System.out.println("\nМассив с некорректными данными:");
        doOurMethod(arrWithWrongData, "with wrong data");
    }


}
