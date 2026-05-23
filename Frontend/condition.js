// let x = 21230;
// let num = x.toString()
// function nums(num) {
//     let sum = 0;
//     let sum1 = 0;
//     for(let i=0; i < num.length; i++){
//         if(i % 2 === 0){
//              sum = sum + num[i];
//         }else{
//              sum1 = sum1 + num[i];
//         }
//     }
//     if(sum==sum1){
//         console.log("Balanced");
//     }else{
//         console.log("Nope");

//     }
// };
// nums(num)
// write a program to check elgiible to vote or not
// write a program wether the user is

// let a = Number(prompt("Enter age"));
// if (a>=18){
//     console.log("yes");
// }
// else{
//     console.log("No");

// }

//write a program positive neagtive or zero
//if the user is elgible to vote to not the confitin is max age 120 and below 0
// the user has selected for balance, withdrawal
// program to check whtaer the input is string or number
// let a = prompt("Enter the Value")

// if (typeof(a)=="string"){
//     console.log("It's string");
// }
// else if (typeof(a)=="number"){
//     console.log("It's Number");
// }
// else{
//     console.log("Something else");
// }

// ////////////////////////////////////////////////////////////////////////////

// let user = prompt("Enter Gender").toLowerCase()
// if(user === 'm' || user === "male"){
//     console.log("You are male");
// }
// else{
//     console.log("You female");
// }

// /////////////////////////////////////////////////////////

// let a = Number(prompt("Enter first no: "))
// let b = Number(prompt("Enter second no: "))
// if(a>b){
//     console.log("A is greater");
// }
// else{
//     console.log("B is greater");
// }

// ///////////////////////////////////////////////////////////

// let gender = prompt("Enter Gender: ").toLowerCase();

// if(gender === "m" || gender === "male"){
//     console.log("You are male");
// }
// else if(gender === "f" || gender === "female"){
//     console.log("You are female");
// }
// else if(gender === "o" || gender === "other"){
//     console.log("You are others");
// }
// else{
//     console.log("Enter correct input");
// }

//write a program to check wtaeeather the number is divisble by 3
//to check by 5
//by 3 & 5
//current time is am or pm
//to check which date today
//which month is today
//to convert hours to am pm timing
//to check wtberet s passed or fail 5 sub

// let a= Number(prompt("Enter the number"))
// if (a % 3 === 0){
//     console.log("It is divisble by 3");
// }
// else{
//     console.log("Not ");
// }

// let b = Number(prompt("Enter the number"))
// if (b % 5 === 0){
//     console.log("It is divisble by 3");
// }
// else{
//     console.log("Not ");
// }

// let c= Number(prompt("Enter the number"))
// if (c % 3 === 0 && c % 5===0){
//     console.log("It is divisble by 3 and 5");
// }
// else{
//     console.log("Nope");
// }

// const monthNames = ["January", "February", "March", "April", "May", "June",
//     "July", "August", "September", "October", "November", "December"
//   ];

//   const d = new Date();

//   const monthIndex = d.getMonth();
//   const monthName = monthNames[monthIndex];

//   console.log(monthName);

// let day = d.getDate();
// console.log(day);

let z = Number(prompt("Enter 1st sub marks"));
let x = Number(prompt("Enter 2nd sub marks"));
let n = Number(prompt("Enter 3rd sub marks"));
let v = Number(prompt("Enter 4th sub marks"));
let m = Number(prompt("Enter 5th sub marks"));
let studentmarks = z + x + n + v + m;
// console.log(studentmarks);
let l = (studentmarks / 500) * 100;
console.log(`User has got ${l}% in the exam`);
if (l > 35) {
  console.log("Congrats you are fail");
} else {
  console.log("Pass");
}

const time12hr = d.toLocaleString("en-US", {
  hour: "numeric",
  minute: "numeric",
  hour12: true,
});

console.log(time12hr);
