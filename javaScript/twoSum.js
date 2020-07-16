function twoSum(array) {
    let left = 0;
    let rigth = array.length -1;
  
    while(left < right) {
        let sum = array[left] + array[rigth];
        if(sum === 0) {
            return [array[left], array[rigth]];
        } else if (sum > 0) {
            rigth++
        } else {
            left++
        }
        
    }
    return null; 
}

twoSum([-2,-1, 0,2,3])



