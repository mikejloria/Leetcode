# Java Arrays

## Arrays

An _array_ is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed.

![alt text](img/1.jpeg)

Each item in an array is called an _element_, and each element is accessed by its numerical _index_.

```java
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
        int[] array = {1,2,3,4,5,6,7,8,9};

        for(int i = 0; i <= array.length; i++) {
            System.out.println("Element at index " + i + " is " + array[i]);
        }
    }
}

```

## Creating, Initializing, and Accessing an Array

One way to create an array is with the new operator.

```java
int[] integerArray = new int[n];
integerArray[0] = 1;
// can also use a for loop to populate the array that is initialized with a specified length
```

Alternatively you can use shorthand syntax. The length is determined by the number of values provided between the braces.

```java
int[] integerArray = {0...n};
```

You can also declare an array of arrays (multidimensional). One consequence is that the rows are allowed to vary in length.

```java
class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[][] names = {
            {"Mr.","Mrs.","Ms."},
            {"Smith","Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
    }
}
```

You can use the built in length property to determine the size of any array.

```java
System.out.println(anArray.length);
```

## Copying Arrays

The built in `System` class has an `arraycopy` method

```java
public static void araycopy(Object src, int srcPos, Object dest, int destPos, int length);
```

```java
class ArrayCopyDemo {
    public static void main(String[] args) {
        String[] copyFrom = {"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino", "Ristretto"};

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for(String coffee: copyTo) {
            System.out.println(coffee + " ");
        }
    }
    // output: Cappuccino Corretto Cortado Doppio Espresso Frappucino Freddo
}

```

ArrayCopyDemo example uses `arraycopy` method of the `System` class, instead of manually iterating through the elements of the source array and placing each one into the destination array. Java provides several methods for performing array manipulations (common operations, copying, sorting, searching) int the `java.util.Arrays` class.

## Array Manipulations

```java
class ArrayCopyOfRangeDemo {
    public static void main(String[] args) {
        String[] copyFrom = {"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino", "Ristretto"}

        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        for(String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
    }
    // output: Cappuccino Corretto Cortado Doppio Espresso Frappucino Freddo
}
```

`copyOfRange` in `java.util.Arrays` does not require you to create the destination array before calling the method, becuase the destination array is returned by the method

Some other useful operations provided by methods in the `java.util.Arrays` class are:

- searching an array for a specific value to get the index at which it is placed (the `binarySearch` method)
- comparing two arrays to determine if they are equal or not (the `equals` method)
- filling an array to place a specific value at each index (the `fill` method)
- sorting an array into ascending order. This can be done either sequentially, using the `sort` method, or concurrently using the `parallelSort` method. Parallel sorting of large arrays on multiprocessor systems is faster than sequentially array sorting.
- creating a stream tha uses an array as its source (the `stream` method). For example, the following statement prints the contents of the copyTo array in the same way as in the previous example. See Aggregate Operations for more information about streams.

```java
java.util.Arrays.stream(copyTo).map(coffee -> cofee + " ").forEach(System.out::print);
```

- converting an array to a string. The `toString` method converts each element of the array to a string, separates them with commas, then surrounds them with brackets. For example:

```java
System.out.println(java.util.Arrays.toString(copyTo));
// output: [Cappuccino, Corretto, Cortado, Doppio, Espresso, Frappucino, Freddo]
```
