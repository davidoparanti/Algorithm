function binarySearch(arr, val) {
    let min = 0; 
    let max = array.length - 1;
     
    while (min <= max) {                                                    // 1 2 3 4 5 6 7 8 9
        let middle = Math.floor((min + max) / 2);
        
        if(arr[middle] < val) {
            min = middle + 1;
        } else if(arr[middle] > val) {
            max = middle - 1
        } else {
            return middle
        }
    }
    return - 1;
}