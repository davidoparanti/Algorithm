
// Write a program that reads an array of ints and outputs the length of the longest sequence in strictly ascending order. Elements of the sequence must go one after another. A single number is assumed to be ordered sequence with the length = 1.

// Input data format

// The first line contains the size of an array.
// The second line contains elements of the array separated by spaces.

// Example

// The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence in ascending order is 5. It includes the following elements: 1 2 3 5 7.

// Sample Input 1:

// 10
// 1 2 4 1 2 3 5 7 4 3

// Sample Output 1:

// 5

function longest(array) {
    //debugger
    let highest = 0;
    let count = 1;
    let first = 0;

    for (let i = 1; i < array.length; i++) {
        if (array[i] > array[first]) {
            count++;
            first++;
            highest = Math.max(highest, count);

        } else {
            highest = Math.max(highest, count);
            count = 1;
            first++
        }
    }
    return array.length === 1 ? 1 : highest;
}

longest([1, 2, 4, 1, 3, 2, 3, 4, 5, 6, 7])