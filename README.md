# Java Data Structures & Algorithms

A portfolio of runnable Java examples covering array algorithms, binary search, matrix manipulation, and recursion. The examples show how the implementation choices affect runtime and memory use. The repository also includes exercises in object-oriented design and the Java standard library.

## Featured implementations

| Implementation | Approach | Time | Extra space |
| --- | --- | --- | --- |
| [Bubble sort](DSA/Bubble_sort.java) | Swaps adjacent values in place and stops when a pass makes no swaps | O(n) best, O(n²) worst | O(1) |
| [First occurrence with binary search](DSA/Lower_bound.java) | Continues searching to the left after finding a match in a sorted array | O(log n) | O(1) |
| [Clockwise matrix rotation](DSA/Rotate2D.java) | Maps each cell in an r × c matrix into a new c × r matrix | O(r × c) | O(r × c) |
| [Exponentiation by squaring](DSA/Power.java) | Recursively halves a positive integer exponent and reuses the result of the smaller computation | O(log p) | O(log p) call stack |

Complexities describe the algorithm itself and exclude console input and output. In the table, *n* is the number of elements and *p* is the exponent.

## Run the examples

Install JDK 17 or later. The examples use the Java standard library, and compile directly with `javac`.

```sh
git clone https://github.com/Souchikjoardar1/Java_DSA.git
cd Java_DSA
javac -d out DSA/Bubble_sort.java DSA/Lower_bound.java DSA/Rotate2D.java DSA/Power.java
java -cp out Bubble_sort
```

Bubble sort prints the original array and then `[2, 10, 33, 56, 70, 78]`.

| Run | Input to enter when prompted | Expected result |
| --- | --- | --- |
| `java -cp out Lower_bound` | Enter `5` for the length, `1 2 2 2 5` for the sorted values, and `2` for the target | First match at zero-based index `1` |
| `java -cp out Rotate2D` | Enter `2` rows, `3` columns, and `1 2 3 4 5 6` as the values | Three rows with values `[4, 1]`, `[5, 2]`, and `[6, 3]` |
| `java -cp out Power` | Uses `2` and `32` from the demo | `4294967296` |

## More Java examples

| Area | Where to look |
| --- | --- |
| Arrays and data structures | [Array rotation](Basics/Rotate.java), [last occurrence](DSA/Lastindex.java), and the [DSA directory](DSA/) |
| Object-oriented programming | [Constructor chaining](Basics/Chaining.java), [interfaces](Basics/Smartphone.java), and [inheritance](Basics/Revision/Inherit.java) |
| Collections and generics | [Hash maps](Advanced/Hashmap.java), [priority queues](Advanced/Priorityqueue.java), and [generic types](Advanced/Generics.java) |
| Concurrency | [Runnable tasks](Threads/Interfacethread.java) and [synchronized methods](Threads/Monitors.java) |
| Standard library | [Date and time APIs](Date%20time%20API/DateDemo.java), [buffered reading](Revision/Buffered_reader.java), and [serialization](Revision/Serialization.java) |

Most exercises are standalone console programs. Compile them individually from the repository root. When a file declares a package, run it by its fully qualified class name, for example `java -cp out Threads.Interfacethread`. The serialization pair compiles together, and the reader uses the file produced by the writer.

```sh
javac -d out Revision/Serialization.java Revision/Deserialization.java
java -cp out Serialization
java -cp out Deserialization
```
