package References.Array;

public class SumArrays {
    public int forEachSumArray (int[] arr) {
        int sum = 0;

        // for each loop allows direct access to elements in an array
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }
    public int standardForLoopSumArray (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // summing up indicies
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        SumArrays object = new SumArrays();
        int[] arr = {1,2,3,4,5};
        System.out.println(object.forEachSumArray(arr));
        System.out.println(object.standardForLoopSumArray(arr));
    }
}
