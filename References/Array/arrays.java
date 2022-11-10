// javac arrays.java
// move to parent folder in order to run
// cd ../..
// java References.Array.ArrayDemo
package References.Array;
class ArrayDemo {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9};

        for(int i = 0; i <= array.length; i++) {
            System.out.println("Element at index " + i + " is " + array[i]);
        }
    }
}
