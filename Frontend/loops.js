// // // // // for (let i=1; i<=10; i++){
// // // // //     console.log(i);
// // // // // }
// // // // // console.log(".........................................................");
// // // // // for (let i=50; i<=75; i++){
// // // // //     console.log(i);
// // // // // }
// // // // // console.log(".........................................................");
// // // // // for (let i=1; i<=100; i++){
// // // // //     console.log(i);
// // // // // }

// // // // //program to print the numbers from range from 1-10
// // // // //program to print a nujmber range from 1-100
// // // // //program to print a nub=mber range frmo 50-75

// // // // //progarm to print a number the multiple of 2 1-100
// // // // for(let i=0; i<=100; i+=2){
// // // //     console.log(i);
// // // // }

// // // // //program to print a numbe which a divisible by 5 range 1-100
// // // // for(let i=0; i<=100; i+=5){
// // // //     console.log(i);
// // // // }

// // // // //program to print a numbe which a divisible by 10 range 1-1000
// // // // for (let i=0; i<=1000; i+=10){
// // // //     console.log(i);
// // // // }

// // // //program to print range from a and b given by the user
// // // // let a = Number(prompt("Enter the number A: "))
// // // // let b = Number(prompt("Enter the number B: "))
// // // // if(isNaN(a) || isNaN(b) || a>b){
// // // //     console.log("Invalid");
// // // // }
// // // // else{
// // // //     for(let i=a; i<=b; i++){
// // // //         console.log(i);
// // // //     }
// // // // }

// // // //write a program to print multiplication table as per choice
// // // // let a = Number(prompt("Enter the table number: "));
// // // // if (isNaN(a) || a < 0) {
// // // //   console.log("Invalid");
// // // // } else {
// // // //   for (let i = 0; i <= 100; i ++) {
// // // //     console.log(`${a} x ${i} = ${i * a}`);
// // // //   }
// // // // }

// // // //write a program to print of user chosi range frmo a to b// let a = Number(prompt("Enter the table number: "));
// // // // let a = Number(prompt("Enter the table number: "));
// // // // let f = Number(prompt("Enter the Starting Range: "));
// // // // let g = Number(prompt("Enter the Ending Range: "));
// // // // if (isNaN(a) || isNaN(f) || isNaN(g)) {
// // // //   if ( a < 0 ){
// // // //     console.log("No negative numbers");
// // // //   } else {
// // // //     for (let i = f; i <= g; i++) {
// // // //       console.log(`${a} x ${i} = ${i * a}`);
// // // //     }
// // // //   }
// // // // } else {
// // // //   console.log("Invalid string");
// // // // }

// // // // let names = ["Ganesh", "Kantle", "Rukmini", "Vasanth", "Disha", "Patani"]
// // // // for(let i=0; i<names.length; i++){
// // // //   console.log(names[i]);
// // // // }

// // // //write a program to write the names of the fruits and print fruits in capitleltter
// // // // let fruits = ["banana","apple","pineapple","mango","grapes","guava","watermelon","chikku","jackfruit","custurd apple"]
// // // // for(let i=0; i<fruits.length; i++){
// // // //   console.log(fruits[i].toUpperCase());
// // // // }

// // // //write a program to print a names of 10 students in array if our names is prsetn make it captile
// // // // let names = ["Ganesh", "Kantle", "Rukmini", "Vasanth", "Disha", "Patani"];

// // // //write 10 names in that print the name of 10 names
// // // // let names = ["Ganesh", "Kantle", "Rukmini", "Vasanth", "Disha", "Patani", "Rashmika" ,"Mandanna", "Vijay", "Devarkonda"];
// // // // for (let i = 0; i < names.length; i++) {
// // // //     let a = names[i].charAt(0).toUpperCase();
// // // //     let c = names[i].slice(1,names[i].length-1)
// // // //     let b = names[i].charAt(names[i].length-1).toUpperCase();
// // // //     console.log(a.concat(c).concat(b));

// // // // let first = names[i].slice(0,1).toUpperCase();
// // // // let middle = names[i].slice(1,names[i].length-1);
// // // // let last = names[i].slice(-1).toUpperCase();
// // // // console.log(first+middle+last);
// // // // }

// // // //write a program to print the names of 10 names in array each names make it capitle and return it inside new array
// // // // let names = ["Ganesh", "Kantle", "Rukmini", "Vasanth", "Disha", "Patani", "Rashmika" ,"Mandanna", "Vijay", "Devarkonda"];
// // // // for(let i=0; i<names.length; i++){
// // // //  let a = names[i].toUpperCase();
// // // //  let b = [...a];
// // // // //  console.log(b);
// // // // console.log(names);
// // // // }

// // // // let names = [
// // // //   "Ganesh",
// // // //   "Kantle",
// // // //   "Rukmini",
// // // //   "Vasanth",
// // // //   "Disha",
// // // //   "Patani",
// // // //   "Rashmika",
// // // //   "Mandanna",
// // // //   "Vijay",
// // // //   "Devarkonda",
// // // // ];
// // // // for (let i = names.length-1; i >= 0; i--) {
// // // //   console.log(names[i]);
// // // // }

// // // // let names = [
// // // //   "Rukmini",
// // // //   "Vasanth",
// // // //   "Disha",
// // // //   "Patani",
// // // //   "Rashmika",
// // // //   "Mandanna",
// // // //   "Vijay",
// // // //   "Devarkonda",
// // // //   "Ganesh",
// // // //   "Kantle",
// // // // ];
// // // // let newarry = [];
// // // // for (let i = names.length - 1; i >= 0; i--) {
// // // //   if (names[i] === "Ganesh" || names[i] === "Kantle") {
// // // //     newarry.push(names[i].toUpperCase());
// // // //   }
// // // //   else{
// // // //     newarry.push(names[i]);
// // // //   }
// // // // }
// // // // console.log(newarry);

// // // //write a program to calculate sum of even number range from 0-100
// // // let num=0;
// // // for(let i=0; i<=100; i++){
// // //   if(i%2==0){
// // //     num+=i;
// // //   }
// // // }
// // // console.log(num);

// // // //sum of odd num 0 -100

// // // num=0;
// // // for(let i=0; i<=100; i++){
// // //   if(i%2==1){
// // //     num+=i;
// // //   }
// // // }
// // // console.log(num);

// // // //to check given number i range prime or not

// // // function isPrimr(n) {
// // //   if (n == 2 || n == 3) {
// // //     return true;
// // //   }
// // //   if (n < 0 || n % 2 == 0) {
// // //     return false;
// // //   }
// // //   for (let i = 2; i < Math.sqrt(n); i++) {
// // //     if (i % n == 0) {
// // //       return false;
// // //     }
// // //   }
// // //   return true;
// // // }
// // // console.log(isPrimr(5));

// // // //write a program whather the given string is palindrom or not

// // // let c = "nitinn";
// // // if(isNaN(c)){
// // //   let palindrome = c.split("").reverse().join("").toLowerCase();
// // // if (c == palindrome) {
// // //   console.log("It is palindrome");
// // // } else {
// // //   console.log("Not is palindrome");
// // // }
// // // }
// // // else{
// // //   console.log("Invalid Input");

// // // }

// // // let a = 12;

// // // let prime = true;
// // // for(let i=2; i<a; i++){
// // //   if(a%i===0){
// // //     console.log("Not Prime");
// // //     prime = false;
// // //     break;
// // //   }
// // //   else{
// // //     console.log("Prime");
// // //     prime = true;
// // //     break;
// // //   }
// // // }

// // // //WRITE A PROGRAM to calculate the factorial of given number let prime = true;

// // // let fact=1;
// // // for(let i=1; i<=5; i++){
// // //   fact*=i;
// // // }
// // // console.log(fact);

// // //100- to 1
// // //50 to 25
// // //which is multiple of 5 range from w/o if conditino
// // //number multiple of 10 range from 100 to 0
// // //program to print a nujmber range a to b, from user
// // //divisble by 3 range 100 to 0 sum of these nujmber
// // //printa number divible by 10 a nd b , input by user, sum of these number
// // //print a find the factorial of given number using reverse order
// // //find the sum of factorial of given number
// // //print a number which is divisble by 3 range from 100 to 0 and find the sum of even numbers

// // ////////////////////////////////////////////////////
// // for(let i=100; i>=0; i--){
// //   console.log(i);
// // }
// // ////////////////////////////////////////////////////
// // for(let i=50; i>=25; i--){
// //   console.log(i);
// // }
// // ////////////////////////////////////////////////////
// // for(let i=100; i>=0; i-=5){
// //   console.log(i);
// // }

// // ////////////////////////////////////////////////////
// // for(let i=100; i>=0; i-=10){
// //   console.log(i);
// // }
// // ////////////////////////////////////////////////////
// // let a= Number(prompt("Enter starting range"));
// // let b= Number(prompt("Enter ending range"));
// // if(isNaN(a) || isNaN(b)||a<0 || b<0){
// //   console.log("Invalid Input");
// // }
// // else{
// //   for(let i=a; i<=b; i++){
// //     console.log(i);
// //   }
// // }
// // ////////////////////////////////////////////////////
// // sum=0;
// // for(let i=100; i>=0; i--){
// //   if(i%3==0){
// //     sum+=i;
// //   }
// // }
// // console.log(sum);

// // ////////////////////////////////////////////////////
// // let c= Number(prompt("Enter starting range"));
// // let d= Number(prompt("Enter ending range"));
// // for(let i=c; i<=d; i++){
// //   if(i%10==0){
// //     sum+=i;
// //   }
// // }
// // console.log(sum);
// // // ////////////////////////////////////////////////////
// // let sum=0;
// // for(let i=100; i>=0; i--){
// //   if((i%3==0)){
// //     if(i%2==0){
// //       sum+=i;
// //     }
// //   }
// // }
// // console.log(sum);
// // ////////////////////////////////////////////////////
// // let fact=1;
// // for(let i=fact-1; i>=1; i--){
// //   fact*=i;
// // }
// // console.log(fact);
// // ////////////////////////////////////////////////////
// // sum=fact;
// // fact=5;
// // for(let i=fact-1; i>=1; i--){
// //   sum+-i;
// //   fact*=i;
// // }
// // console.log(sum);
// // console.log(fact);
// // ////////////////////////////////////////////////////
// sum=0;
// let r= Number(prompt("Enter the number"))
// for(let i=0; r>0; i++){
//   let id = r%10;
//   sum +=id;
//   r= Math.floor(r/10);
// }
// console.log(sum);

// for(let i=0; i<=r.length; i++){
//   sum+=r[i];
// }
// console.log(sum);
//Write∈a program to reverse the array apple, mango, graephes, orange

// let a =["apple","mango","grapes","orange"]
// for(let i=a.length; i>=0; i--){
//   console.log(a[i]);
// }

//write a program reverse the elements in the array of ravi shastry

// let a = ["apple", "mango", "ravi", "grapes", "shastry", "orange"];


// let arr = [];
// for(let i=a.length-1; i>=0; i--){
  
// }

// let arr = [];
// for (let i = a.length-1; i >= 0; i--) {
//   if (a[i] === "ravi" || a[i] === "shastry") {
//     arr[i]=a[i].toUpperCase();
//   } else {
//     arr[i]=a[i];
//   }
// }

// let arr = [];
// let k=0;
// for (let i = a.length-1; i >= 0; i--) {
//   if (a[i] === "ravi" || a[i] === "shastry") {
//     arr[i]=reverse(a[i]);
//   } else {
//     arr[i]=a[i];
//   }
// }

// function reverse(s){
//   let n=s.length;
//   let str=""
//   for(let i=0; i<s.length-1; i++){
//     str +=s.charAt(i)
//   }
//   return str.toUpperCase();
// } 
// console.log(arr);


