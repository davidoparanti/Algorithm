function ajacentMatric(arr) {
    //debugger;
    let check =  true;
    
    for(let i = 0; i < arr.length -1; i++) {
        for(let j = 0; j < arr[i].length -1; j++) {
           // let a = arr[i][j], b = arr[i][j+1] , c = arr[i][j], d = arr[i+1][j]; 
            if(arr[i][j] == arr[i][j+1] && arr[i+1][j] == arr[i][j] && arr[i][j] == arr[i+1][j+1]){
                 check = false;
                                
            }
               
            }
        }
   // return check
    }
let mat = [
    ['b','b','b','b'],
    ['w','w','w','w'],
    ['b','b','b','b'],
    ['w','w','w','w']]  