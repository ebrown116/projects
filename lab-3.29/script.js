function divideArray(numbers){
    let evenNums = [];
    let oddNums = [];

    for (let i = 0; i < numbers.length; i++) {
        if (numbers[i] % 2 == 0) {
            evenNums.push(numbers[i]);
        } else {
            oddNums.push(numbers[i]);
        }
    }
    evenNums.sort(function(a, b){return a - b});
    oddNums.sort(function(a, b){return a - b});
    console.log("Even numbers:");
    if(evenNums.length == 0){
        console.log("None");
    }else{
        for(let x = 0; x < evenNums.length; x++){
            console.log(evenNums[x]);
        }
    }
    console.log("Odd numbers:");
    if(oddNums.length == 0){
        console.log("None");
    }else{
        for(let y = 0; y < oddNums.length; y++){
            console.log(oddNums[y]);
        }
    }
}