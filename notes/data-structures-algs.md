data structures
* arrays
* stacks
* lists
* queues
* hashtables
* trees
* heaps
* sets

oranises and stores data
each has strengths and weaknesses

algorithms
* search algorithms
* sort algorithms
* recursion algorithms

steps you have to perform to get a specific result
an implementation is the code that you write to perform an algorithm
* you can implment the same algorithm in multiple different ways

- there can be many algorithms that accomplish the same task
- there can be many implementations of the same algorithm

O(1) constant
O(logn) logarithmic
O(n) linear
O(nlogn) n log-star n
O(n^2) quadratic

-----

arrays:
- contiguous block in memory
- every element occupies the same amount of space in memory 
    - in an array of objects, because what is actually stored in the array is only the object reference, which are all of equal size
- if an array starts at memory address x, and the size of each element in the array is y, we
can calculate the memory address of the ith element by using x + i*y
- if we know the index of an element, the time to retrieve the element will be the same, no matter where it is in the array
- arrays are quite time and memory efficient

Operation | Time Complexity
--- |  --- 
Retrieve with index | O(1) - constant time
Retrieve without index | O(n) - linear time
Add an element to a full array | O(n) -> because the length of java array is fixed, 
... | the only way to "push" another element into the array is to create a new array with length arr.length + 1, 
... | then copy the array elements of the original array, and add the new array element to the end
add an element to the end of an array (has space) | O(1)
insert or update an element at a specific index | O(1)
delete an element by setting it to null | O(1)
delete an element by shifting elements | O(1)

-----

Bubble Sort

- array is split in sorted and unsorted partition
- sorted and unsorted partition are going to be located within the array; entire sort takes place within the array
- unsortedPartitionIndex = arr.length - 1; this is the last index of the unsorted partition
- i = 0; i <= unsortedPartitionIndex; i++ - index used to traverse the array from left to right
- at the end of the first traversal we will put unsortedPartitionIndex--, then repeat the cycle
- bubble sort because the larger numbers are going to bubble over to the back of the array; step by step
- in-place algorithm -> if the extra memeory you're using doesn't increase if the length of the input increases (the array)
  then it's still an in-place algorithm
- O(n^2) time complexity - quadratic
- algorithms with quadratic time complexity degrade quickly

Stable vs unstable sort

- relative ordering of duplicate items must be preserved for a sort to be stable
- stable sort is generally preferred
- a sort shouldn't change the order of duplicate items
- our bubble sort implementation is a stable sorting algorithm because we only switch adjacent items when the first item
  is larger than the second item; if we instead put >= then the implementation would become an unstable sort
- be aware of possibility of unstable sort implementations if you use ==, >=, <= condition wrongly

Selection Sort

- in-place algorithm
- O(n^2) time complexity - quadratic
- doesn't require as much swapping as bubble sort
- unstable algorithm (?)

Insertion Sort

- in-place algorithm
- O(n^2) time complexity - quadratic
- stable algorithm