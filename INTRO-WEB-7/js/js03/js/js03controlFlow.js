/* Part 1
First, build a function called "businessHours". */
let dayNum = new Date();
let hourNum = dayNum.getHours();
function businessHours( dayNum, hourNum ) {
    //tercer rango: 9 - 18 - It's business hours.
    if ( businessHours >= 9 && businessHours <= 18 ) {
        document.write( "It's business hours!" )
        //Si está fuera del rango mencionado anteriormente, simplemente, no son business hours.
    } else if ( businessHours >= 19 && businessHours <= 24 ) {
        document.write("It's NOT business hours.")
    }
}

console.log( businessHours(dayNum, hourNum) );

/*Similar to the day of the week class exercise, this function should accept two parameters: dayNumber and hourNumber.
By reading the dayNumber and the hourNumber, your program should print whether it is business hours or not. 
It should return true if it is business hours, and false if not.
function businessHours(dayNumber, hourNumber)
Obs: consider business hours 9am - 6pm. Use the 24-hour clock system (6pm = 18).*/
//Hay que usar método .getHours();

//Exercise 2
/*Part 2
Now, create the function getDayNumber.*/
let janFirstDayNumber = 3;
let yearDayNumber = 45;

function getDayNumber( janFirstDayNumber, yearDayNumber ) {
    // return yearDayNumber % 7
}

/*It should accept two parameters: janFirstDayNumber and yearDayNumber.
The yearDayNumber will be an int ranging from 0 to 365.
janFirstDayNumber will be an int ranging from 0 to 6, representing the day of the week of January 1st.
Your function should then calculate and return the day of the week corresponding to the yearDayNumber passed.
Hint: use the remainder operator (%), dividing your yearDayNumber by 7.*/

/* Part 3: Finally, build a function that, from a yearDayNumber (int, 0-365) and an hourNumber 
(int, 0-23), returns true if it is business hours.*/
function yearBusinessHrs() {
    //if yearsBusinessHrs 
}

/*Challenge: Replace the yearDayNumber and hourNumber parameters with a Date() variable.*/