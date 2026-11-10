# Java Data Structures & Algorithms

A collection of Java practice programs covering arrays, sorting, binary search, recursion, and linked lists. The repository also includes smaller examples of object-oriented programming, collections, concurrency, and file I/O.

## Start here

| Example | What it demonstrates |
| --- | --- |
| [Bubble sort](DSA/Bubble_sort.java) | In-place sorting with an early exit when a pass makes no swaps |
| [First occurrence with binary search](DSA/Lower_bound.java) | Finding the first index of a target in a sorted array |
| [Matrix rotation](DSA/Rotate2D.java) | Rotating a rectangular matrix 90 degrees clockwise |
| [Exponentiation by squaring](DSA/Power.java) | Computing an integer power by recursively halving the exponent |

## Run an example

With JDK 17 or later installed, run these commands from the repository root. The examples use only the Java standard library. Most can be compiled individually.

```sh
javac -d out DSA/Bubble_sort.java
java -cp out Bubble_sort
```

The example prints the original array and then the sorted array, `[2, 10, 33, 56, 70, 78]`.

## Browse the repository

| Folder | Topics |
| --- | --- |
| [DSA](DSA/) | Array and matrix exercises, sorting, searching, recursion, and a singly linked list |
| [Basics](Basics/) | Constructors, inheritance, exceptions, strings, and nested classes |
| [Advanced](Advanced/) | Collections, generics, lambdas, and thread exercises |
| [Threads](Threads/) | Runnable tasks and synchronization |
| [Date and time](Date%20time%20API/) | Java date and time APIs |
| [Revision](Revision/) | File I/O, object serialization, and thread practice |

Some examples prompt for console input. For examples with a package declaration, use the fully qualified class name when running them, such as `Threads.Threaddemo`. For the file I/O exercises, run a writer such as `Read_write` before its reader. Compile `Serialization.java` and `Deserialization.java` together and run the writer first to create the serialized data.
