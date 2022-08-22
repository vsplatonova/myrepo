public class Main {
    public static class MyArraySizeException extends Exception {
    }

    public static class MyArrayDataException extends Exception {
    }

    public static void main(String args[]) {
        try {


            String[][] arr = {{"1", "2", "3", "4"}, {"i", "6", "7", "8"}, {"9", "6", "7", "8"}, {"5", "6", "7", "8"}};

            int sum = sumArr(arr);

            System.out.println(sum);
        } catch (MyArraySizeException e) {
            System.out.println("Wrong size");

        } catch (MyArrayDataException e) {
            System.out.println("Wrong format");

        }
    }


    public static int sumArr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr == null || arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }
        try {


            int sumResult = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    int number = Integer.parseInt(arr[i][j]);
                    sumResult = sumResult + number;
                }


            }
            return sumResult;
        } catch (NumberFormatException ex) {
            throw new MyArrayDataException();


        }
    }
}
