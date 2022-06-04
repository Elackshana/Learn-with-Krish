
var array = [21, 25, 29, 28, 22, 24, 27, 26, 30, 23];	//input : set of numbers here

var find = function(arr){
console.log("Given number seq : "+ array);

    var min= arr[0];
    var max= arr[0];
    ///find minimum(min) in the given array
    for(var i=1; i < arr.length; i++){
        
        if(arr[i] < min){
            min= arr[i];
        }
        if(arr[i] > max){
            max= arr[i];
        }
    }
    
    var sum = 0;
    for(var i=0; i < arr.length; i++){
        arr[i] = arr[i] - (min-1);
        sum = sum + arr[i]; 
    }
    var l = arr.length + 1;
    var totalsum = (l*(l+1))/2;

    var missingvalue = (totalsum - sum) +(min-1);

    max=max+1;
    if(missingvalue == max){
		
		console.log(f(arr.length,missingvalue));
		return "Missing end number : "+missingvalue;
		
    }
    else{
		return "Missing number : "+missingvalue;
    }
}
function f(l,mv){

	var startnumber = mv - l-1;
	return "Missing start number : "+startnumber;
	
}

var n = find(array);

console.log(n);