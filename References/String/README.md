# Java Strings

## String

String are widely used in Java, they are a sequence of characters. Strings are objects in Java

Java platform provides the `String` class to create and manipulate strings

## Creating Strings

A String literal is a series of characters that is enclosed in double quotes. The compiler creates a String object when it encounters a string literal.

```java
String sequenceOfChars = "Hi, I'm a String";
char[] helloArray = {"h","e","l","l","l","o"};
String helloString = new String(helloArray);
System.out.prinln(helloString);
```

The String class is immutable; once it is created a String object cannot be changed

The String class has many methods that allow you to manipulate them. Since strings are immutable many of the methods create and return a new string with the result of the operation.

## String Length

Methods used to obtain information about an object are known as _accessor methods_. One accessor method that you can use on Strings is the `length()` method.

```java
String palindrome = "Dot saw I was Tod";
int len = palindrome.length();
// len will equal 17
// a palindrome is a word or sentence that is symmetric; spelled the same backward and forward ignoring space, case, and puctuation
```

The following is a program to reverse a palindrome string. It invokes a `String` method `charAt(i)`, which returns the ith character in the string, counting from 0.

```java
public class StringDemo {
    public static void main(Sting[] args){
        String palindrom = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        // put original string in an array of chars
        for(int i = 0; i < len; it++) {
            tempCharArray[i] = palindrome.charAt(i);
        }

        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];
        }

        String reversePalindrome = new String(charArray);

        System.out.println(reversePalindrome);
    }
    // output: doT saw I was toD
}
```

To accomplish this, the program had to convert the string to an array of chars, reverse the array into a second array, then convert back to a string. The `String` class includes a method, `getChars()`, to convert a string or portion of it, into an array of chars. So we can replace the first for loop above with

```java
palindrome.getChars(0, len, tempCharArray, 0);
```

## Concatenating Strings

The `String` class includes a method for concatenating two strings `string1.concat(string2)`

String are more commonly concatenated with the + operator

```java
String string1 = "saw I was";
System.out.prinln("Dot" + string1 + "Tod");
```

Such a concatenation can be a mixture of any objects. For each object that is not a String it `toString()` method is called to convert it to a String.

\n is used to create a new line in a String

## Creating Format Strings

Using String's static format() method allows you to create a formatted string that you can resuse, as opposed to a one time print statement.

```java
String fs;
fs = String.format"The value of the float " +
                   "variable is %f, while " +
                   "the value of the " +
                   "integer variable is %d, " +
                   " and the string is %s",
                   floatVar, intVar, stringVar);
System.out.println(fs);)
```
