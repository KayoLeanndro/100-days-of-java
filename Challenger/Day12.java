public class Day12 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(mediaArray(arr));
    }

    public static double mediaArray(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double media = (double) sum / array.length;
        return media;
    }
}
