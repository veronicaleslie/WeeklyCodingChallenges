// (ii) Create a function that checks if a given integer is exactly the factorial of an integer or not. true if it is, false otherwise.

// Examples


// isFactorial(2) ➞ true

// // 2 = 2 * 1 = 2!

 

// isFactorial(27) ➞ false

 

// isFactorial(24) ➞ true

// // 24 = 4 * 3 * 2 * 1 = 4!


// Notes


	
// No error handling is necessary. Inputs are all positive integers.
	
// Alternatively, you can solve this with a recursive approach.


function isFactorial(n){


for (var i = 1;; i++)
{
    if (n % i == 0)
    {
        n = parseInt(n/i);
    }
    else
    {
        break;
    }
}

if (n == 1)
{
    return true;
}
else
{
    return false;
}
}

var n = 120;
 var ans = isFactorial(n);
 if (ans == 1)
 {
 	console.log("true");
 }
 else
 {
 	console.log(false);
 }

 var n = 50;
 var ans = isFactorial(n);
 if (ans == 1)
 {
 	console.log("true");
 }
 else
 {
 	console.log(false);
 }

 
 var n = 3628800;
 var ans = isFactorial(n);
 if (ans == 1)
 {
 	console.log("true");
 }
 else
 {
 	console.log(false);
 }