# Minimum Triangle Path

This program evaluates minimum triangle path as described in [Project Euler #18](https://projecteuler.net/problem=18) and [Project Euler #67](https://projecteuler.net/problem=67)


Starting from the top of a pyramid of numbers like this, you can walk down going one step on the right or on the left, until you reach the bottom row:
```
    7
   6 3
  3 8 5
11 2 10 9
```

One of such walks is  7 + 6 + 3 + 2.
You can compute the total of the numbers you have seen in such walk,
in this case it's 18.

Your problem is to find the *minimum* total among all possible paths from the top to the bottom row of the triangle.



## Usage

The program is implemented with Scala and can be executed e.g. using `sbt`:
```
user@localhost:/minimumtrianglepath$ sbt run
```

Afterwards, the user might decide to put the payload into stdin like so:
```
4
5 6
1 1 1
```

The input can be terminated with `Ctrl+D` (Linux/Mac) or `Ctrl+Z` (Windows).
This should trigger the computation that will output the result:
```
Minimal path is: 4 + 5 + 1 = 10
```


Alternatively, one can use `sbt package` to build executable `.jar` file.