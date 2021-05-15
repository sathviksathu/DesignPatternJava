#Streams

Added in JDK8 as java.util.stream

* This package contains interfaces for using streams.
* A stream represents a sequence of elements.
* The stream package was added to traverse collections.
* Most stream operations take a lambda expression.

Stream operations are either intermediate or terminal
* Terminal operations are either void or return a type.
* Intermediate operations return the stream itself.

Intermediate operations are useful to chain multiple operations in what is typically reffered to as Stream pipeline.

* Commonly used operations include **`map`**, **`filter`**, **`forEach`**
map and filter are intermediate operator and forEach is terminal operator.

**`map`** -> Returns a stream consisting of the results of applying the given
             function to the elements of this stream. It is an intermediate operaiton.

`<R> Stream<R> map(Function<? super T, ? extends R> mapper);`

**`filter`** -> Returns a stream consisting of the elements of this stream that match
                the given predicate.

`Stream<T> filter(Predicate<? super T> predicate);`

**`forEach`** -> Performs an action for each element of this stream.
`void forEach(Consumer<? super T> action);`


* Other useful operations include **`sorted`** and **`collect`**

**`sorted`** -> Returns a stream consisting of the elements of this stream, sorted
                according to natural order.  If the elements of this stream are not
                Comparable, a  java.lang.ClassCastException may be thrown
                when the terminal operation is executed.

`Stream<T> sorted();`

**`collect`** -> collect is used as a terminal operation

## Elements in collections cannot be changed or mutated with streams, but they can be manipulated and saved to new collection.


