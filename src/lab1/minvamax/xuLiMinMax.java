package lab1.minvamax;

public class xuLiMinMax {
    public int min(int[] arr){
        int min = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (min > arr[i] ){
                min = arr[i];
            }
        }
        return  min;
    }

    public int max(int[] arr){
        int max = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (max < arr[i] ){
                max = arr[i];
            }
        }
        return  max;
    }

}
