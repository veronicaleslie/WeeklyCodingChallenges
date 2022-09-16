
    
// JavaScript:
// a) Create a function that determines whether a number is Oddish or Evenish. A number is Oddish if the sum of all of its digits is odd, and a number is Evenish if the sum of all of its digits is even. If a number is Oddish, return "Oddish". Otherwise, return "Evenish".

// For example, oddishOrEvenish(121) should return "Evenish", since 1 + 2 + 1 = 4. oddishOrEvenish(41) should return "Oddish", since 4 + 1 = 5.

// Examples:
// oddishOrEvenish(43) ➞ "Oddish"
// // 4 + 3 = 7
// // 7 % 2 = 1

// oddishOrEvenish(373) ➞ "Oddish"
// // 3 + 7 + 3 = 13
// // 13 % 2 = 1

// oddishOrEvenish(4433) ➞ "Evenish"
// // 4 + 4 + 3 + 3 = 14
// // 14 % 2 = 0



function EvenishOddish(){
    
    var value = document.getElementById("91").value
    var result = 0;
    var temp = " ";

  while (value) {
      result += value % 10;
      value = Math.floor(value / 10);
  }
  
  var sum = document.getElementById("result");
  sum.value = result;
  if(result % 2 === 0){
    temp = "Evenish";
  }
  else{
    temp = "Oddish";
  }
  return temp;

}


