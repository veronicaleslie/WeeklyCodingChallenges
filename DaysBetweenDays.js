// Create a function that takes two dates and returns the number of days between the first and second date.


// Examples


// getDays(

//   new Date("June 14, 2019"),

//   new Date("June 20, 2019")

// ) ➞ 6





// getDays(

//   new Date("December 29, 2018"),

//   new Date("January 1, 2019")

// ) ➞ 3

// // Dates may not all be in the same month/year.





// getDays(

//   new Date("July 20, 2019"),

//   new Date("July 30, 2019")

// ) ➞ 10
function DaysBetweenDays(first, second) {
    const first = Date.parse(second);
    const second = Date.parse(first);
    let aDay = 1000*24*3600;

    let time = Math.round((second-first)/aDay)

    return time;
}

console.log(DaysBetweenDays("June 14, 2019", "June 20, 2019"));
console.log(DaysBetweenDays("December 29, 2018", "January 1, 2019"));