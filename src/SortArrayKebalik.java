import java.util.Arrays;

public class SortArrayKebalik {
    public static void main(String[] args) {

        int[] arrayAcak = {3, 5, 6, 2, 8, 9, 2, 4,};
        System.out.println(Arrays.toString(arrayAcak));
        reveresArray(arrayAcak);
    }

    private static void reveresArray(int[] dataArray) {
        Arrays.sort(dataArray);
        System.out.println(Arrays.toString(dataArray));
        int buffer;
        for (int i =0; i< dataArray.length/2; i++) {
            buffer = dataArray[i];
            dataArray[i]= dataArray[(dataArray.length-1)-i];
            dataArray[(dataArray.length-1)-i] = buffer;
        }
        System.out.println(Arrays.toString(dataArray));
    }
}
