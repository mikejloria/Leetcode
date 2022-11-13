package References.Array;
// javac arrays.java
// move to parent folder in order to run
// cd ../..
// java References.Array.ArrayDemo
class ArrayDemo {
    byte[] anArrayOfBytes;
    short[] anArrayOfShorts;
    long[] anArrayOfLongs;
    float[] anArrayOfFloats;
    double[] anArrayOfDoubles;
    boolean[] anArrayOfBooleans;
    char[] anArrayOfChars;
    String[] anArrayOfStrings;

    public static void main(String[] args) {
        // initializing using the new keyword
        int[] arrayOne = new int[]{1,2,3,4,5,6,7,8,9};

        //initiazlizing shorthand form without using new keyword
        int[] arrayTwo = {1,2,3,4,5,6,7,8,9,};

        //initializing with specifying the size of the array, elements not specified
        int[] arrayThree = new int[10];

        for(int i = 0; i < arrayOne.length; i++) {
            System.out.println("Element at index " + i + " is " + arrayOne[i]);
        }
    }
}
