function binarySearch(arr, val) {
    let min = 0; 
    let max = array.length - 1;
     
    while (man <= max) {
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