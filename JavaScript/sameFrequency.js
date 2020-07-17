/* 
  Write a function called sameFrequency. Given two positeve integers, find 
  out if the two numbers have the same frequency of digits.

  Your solution must have the following complexities 

  Time: 0(N)

  Sample imput:
    sameFrequency(182, 281) should return true
    sameFrequency(34, 12) should return false
    sameFrequency(22, 222) should return false
    sameFrequency(3589578, 5879385) should return true

  */

  function sameFrequency(num1, num2) {
        const num1Array = num1.toString().split(' ');
        const num2Array = num2.toString().split(' ');
         
        const obj = {};
        for(let char of num1Array) {
            obj[char] ? ++obj[char] : 1;
        } 

        for(let char of num2Array) {

            for (let char in obj) {
                  if(!obj[char]) {
                      return false;
                  } else {
                      --obj[char]
                  }  
            }

        }
        return true;     
        
  }

  function search(array, val) {
   let min = 0;
   let max = array.length - 1;
  
  while(min <= max) {
    let middle = Math.floor((min + max) / 2 );
    let currentElement = array[middle];
    
    if(array[middle] < val) {
      min = middle + 1;
    } else if(array[middle] > val) {
      max = middle - 1;
    } else {
      return middle;
    }
  }
    return - 1;
    
}
  
 search([1,2,3,4,5,6,7,8], 9)