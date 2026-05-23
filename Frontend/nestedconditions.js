// // // let age = Number(prompt("Enter the Number"));
// // // if((age>120)||age<0){
// // //     alert("Enter Correct Age");
// // // }
// // // else if(age>=18){
// // //     console.log("Eligible to vote");
// // //     let gender = prompt("Enter you gender").toLowerCase();
// // //     if(gender=== "m" || gender === "male"){
// // //         console.log("Stand in Male line");
// // //     }
// // //     else if(gender=== "f" || gender === "female"){
// // //         console.log("Stand in Female line");
// // //     }
// // //     else{
// // //         console.log("Stand in others line");
// // //     }
// // // }
// // // else{
// // //     console.log("Not eligible to vote you mf");
// // // }

// // //to calucte total amount after discount if he bought for 5k 5% discount etc

// // let shopping = Number(prompt("Enter shopping amount: "));
// // let discount = 0;

// // if (shopping >= 10000) discount = 0.10;
// // else if (shopping >= 9000) discount = 0.09;
// // else if (shopping >= 8000) discount = 0.08;
// // else if (shopping >= 7000) discount = 0.07;
// // else if (shopping >= 6000) discount = 0.06;
// // else if (shopping >= 5000) discount = 0.05;

// // let finalPrice = shopping - shopping * discount;

// // if (discount > 0) {
// //     console.log(`You got ${discount * 100}% discount`);
// //     console.log("Final price:", finalPrice);
// // } else {
// //     console.log("Shop more for discount");
// // }

// //to check wetaher has secured dic\

// let marks1 = Number(prompt("Enter the marks 1"))
// let marks2 = Number(prompt("Enter the marks 2"))
// let marks3 = Number(prompt("Enter the marks 3"))
// let marks4 = Number(prompt("Enter the marks 4"))
// let marks5 = Number(prompt("Enter the marks 5"))
// let totalmarks = marks1 + marks2 + marks3+marks4+marks5;

// if(isNaN(totalmarks)){
//     console.log("Enter Numbers only Gulduu");
// }
// else if ((marks1>100 || marks1 <0) && (marks2>100 || marks2 <0) && (marks3>100 || marks3 <0) && (marks4>100 || marks4 <0) && (marks5>100 || marks5 <0)){
//     console.log("Enter valid Number");
// }

// else if ((marks1<35) || (marks5<35) || (marks3<35) || (marks4<35) || (marks2<35) ){
//     console.log("Fail");
// }

// else{
//     let  percentage = totalmarks/500*100;
//     if(percentage>=85){
//         console.log("Distiction");
//     }
//     else if(percentage>=60){
//         console.log("First ");
//     }
//     else if(percentage>=50){
//         console.log("Second");
//     }
//     else if(percentage>=35){
//         console.log("Pass");
//     }
//     else if(percentage<35){
//         console.log("Fail");
//     }
// }

// write a program to calcutae the total aount unites comnsumed
// condition: 0-100 units is 4 rupess per nunit
// condition: 101-200 units is 6 rupess per nunit
// condition: 201-400 units is 8 rupess per nunit
// condition: >400 units is 10 rupess per nunit
// condition: 700+ units is 10 rupess per nunit

// let units = Number(prompt("Ente the usage units: "))
// if(units<0 || isNaN(units)){
//     console.log("Enter Valid Units");
// }
// else if(units>0 && units<=100){
//     console.log(units*4);
// }
// else if(units>=101 && units<=200){
//     console.log(units*6);
// }
// else if(units>=201 && units<=400){
//     console.log(units*8);
// }
// else if(units>400){
//     let unit = units - 400
//     if(unit>0){
//         // console.log(unit*4);
//         console.log((unit*4)+units*4);

//     }
//     else if(unit>=101 && unit<=200){
//         // console.log(unit*6);
//         console.log((unit*6)+units*6);
//         // console.log(unit+units);
//     }
//     else if(unit>=201 && unit<=400){
//         // console.log(unit*8);
//         console.log((unit*8)+units*8);
//     }
// }
// else{
//     console.log("Invalid");
// }

// let unitss = Number(prompt("Enter the units"))
// let amount = 0;
// if(isNaN(unitss<0)){
//     alert("Enter Valid Input")
// }
//  if(unitss>400){
//     amount += (unitss-400) * 10;
//     unitss=400;
// }
// if(unitss>200){
//     amount += (unitss-200) * 8;
//     unitss=200;
// }
// if(unitss>100){
//     amount += (unitss-100) * 6;
//     unitss=100;
// }
//  if(unitss>0){
//     amount += unitss * 4;
// }
// else{
//     console.log("Enter Valid");
// }
// console.log(amount);

// let amount = Number(prompt("Enter the amount: "))

// if ( amount<=0 || isNaN(amount)){
//     console.log("Enter Valid Number Gulduu");
// }
// else{

//     let notes = [500,200,100,50,20,10,5,2,1]

//     for(let i=0; i<notes.length; i++){
//         let count = Math.floor(amount / notes[i]);
//         if (count > 0)
//             {
//             console.log(notes[i] + " : " + count);
//             amount = amount % notes[i];
//         }
//     }
//     4
// }

//program to check given nubmmber is valid or not
// let number =prompt("Enter the nujmber")
// let a = number.length;
// if(a!=10 || isNaN(number)){
//     console.log("Invalid");
// }
// else{
//     console.log("Correct you are number is",number);
// }

//to check current time is gm, 5am - 12pm morinig 12-4pm, afternon, 4pm+ evening

// let date = new Date();
// let time = date.getHours();
// console.log(time);

// if(time>17){
//     console.log("Good Eveing");
// }
// else if(time>13 && time<=4){
//     console.log("Good Afternoon");
// }
// else(time>5 && time<=12){
//     console.log("Good Morning");
// }

//
// let a = prompt("Enter the input")
// if( isNaN(a) || a.length!=0){
//     console.log("Guldu");
// }
// else{
//     console.log("No input");
// }

//
let balance = 0;
const pinNum = 5167; 
let again = true;
pin = Number(prompt("Enter Pin"))

if(pin === pinNum){
while (again) {
    let options = Number(prompt(
      "Welcome to DCL Bank\n1.Deposit\n2.Withdrawal\n3.Balance"
    ));
  
    if (isNaN(options) || options < 1 || options > 4) {
      alert("Provide Proper Input");
    }
  
    else if (options === 1) {
  
      let amt = Number(prompt("Enter Deposit Amount"));
  
      if (isNaN(amt) || amt <= 0) {
        console.log("Invalid amount");
      } 
      else {
        balance += amt;
        // balance  = balance+ amt;
        console.log("Deposited:", amt);
        console.log("Balance:", balance);
      }
  
    }
  
    else if (options === 2) {
  
      let amt = Number(prompt("Enter Withdrawal Amount"));
  
      if (isNaN(amt) || amt <= 0) {
        console.log("Invalid Input");
      }
      else if (balance >= amt) {
        balance -= amt;
        console.log("Withdrawn:", amt);
        console.log("Balance:", balance);
      } 
      else {
        console.log("Insufficient Balance, try to robber the DCL Bank!!"); n
      }
  
    }
  
    else if (options === 3) {
      console.log("Current Balance:", balance);
    }
  
    else if (options === 4) {
      console.log("Thank you for using DCL Bank ATM");
      break;
    }
  
    again = confirm("Do you want to continue?");
  }
  }
  else{
    console.log("Enter the correct pin you uneducated fellow!!!");
    // break;
  }