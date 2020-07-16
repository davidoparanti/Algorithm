function countUnique(arr) {
    let i = 0;
    for(let j = 1; j < arr.length; j++) {
        if(arr[i] === arr[j]) {
            j++
        } else {
            i++
            arr[i] = arr[j];
        }
    }
    return i + 1;
}