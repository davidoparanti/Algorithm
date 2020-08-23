// Given the number n, not exceeding 10, and a matrix of size n × n.

// Check whether this matrix is symmetric in relation to the main diagonal.Output the word “YES”, if it is symmetric and the word “NO” otherwise.

// Sample Input 1:

// 3
// 0 1 2
// 1 2 3
// 2 3 4

// Sample Output 1:

// YES

function isSynmetric(arr) {
    let synmetric = true;

    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr[i].length) {
            if (arr[i][j] !== arr[j][i]) {
                synmetric = false;
            }
        }
    }
    return synmetric
}