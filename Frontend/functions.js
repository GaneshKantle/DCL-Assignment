// function Test(){
//     console.log("Testing");
// }
// Test();
// Test();
// Test();
// Test();
// Test();
// Test();

// function add(a,b){
//     let c = a+b;
//     console.log(c);
// }
// add(1,2);
// add(6,8);
// add(9,4);

// //Spread Operator
// let a=  ["reading", "coding", "cleaning", "desk setup", "singer"];
// let b=  ["reading", "coding", "cleaning", "desk setup", "singer"];
// console.log(...a, ...b);


// function greet(){
//     console.log("Helloall good morning");
//     console.log("This is Ganesh Kantle");
//     console.log("Happy Holi All");
// };
// greet();

//DEFUALT VARIABLE
// function greet(a=10, b=10){
//     console.log(a+b);
    
// };
// greet();

// function greet(a= prompt("enter the number man"), b= prompt("enter you number man")){
//     console.log(a-b);
// };
// greet();

//
// function add(){
//     let a = 100;
//     let b = 200;
//     let c = a+b;
//     console.log(c, "this is addition");
// }
// add();
// console.log(c);

// function concat(a="Ganesh", b=" Kantle"){
//     console.log(a.concat(b));
// }
// concat();
// function charAt(a="Ganesh"){
//     console.log(a.charAt(0));
// }
// charAt();
// function endsWith(a="Ganesh"){
//     console.log(a.endsWith("h"));
// }
// endsWith();
// function startsWith(a="Ganesh"){
//     console.log(a.startsWith("G"));
// }
// startsWith();
// function uppercase(a="Ganesh"){
//     console.log(a.toUpperCase());
// }
// uppercase();
// function lowercase(a="Ganesh"){
//     console.log(a.toLowerCase());
// }
// lowercase();
// function includes(a="Ganesh"){
//     console.log(a.includes("Ganesh"));
// }
// includes();
// function indexOf(a=["Ganesh", "Kantle", "Rukmini"]){
//     console.log(a.indexOf("Ganesh"));
// }
// indexOf();
// function padEnd(a="Ganesh"){
//     console.log(a.padEnd(10,"h"));
// }
// padEnd();
// function padStart(a="Ganesh"){
//     console.log(a.padStart(10,"G"));
// }
// padStart();
// function repeat(a="Ganesh"){
//     console.log(a.repeat(2));
// }
// repeat();
// function slice(a="Ganesh"){
//     console.log(a.slice(0,2));
// }
// slice();
// function substring(a="Ganesh"){
//     console.log(a.substring(0,2));
// }
// substring();
// function toString(a=10){
//     console.log(a.toString());
// }
// toString();
// function trimStart(a="        Ganesh"){
//     console.log(a.trimStart(0,2));
// }
// trimStart();
// function trimEnd(a="Ganesh          "){
//     console.log(a.trimEnd(0,2));
// }
// trimEnd();

// OPERATORS
// 1. Arithimetic Operators: +.-.*,/,%,**,++,--
// 2. Assignment Operators: =, +=, -=, *=, /=, %=, **=
// 3. Comparsion Operators: <,>,<=,>=,!=<,[==,===]
// 4. Logical Operators &&, ||

// function Operator(a=20, b=10){
//     console.log(a+b);
//     console.log(a-b);
//     console.log(a*b);
//     console.log(a/b);
//     console.log(a%b);
//     console.log(a>b);
//     console.log(a<b);
//     console.log(a<=b);
//     console.log(a>=b);
//     console.log(a==b);
//     console.log(a===b);
//     console.log(a===b);
//     console.log(a!=b);
//     console.log(a++);
//     console.log(a--);
//     console.log(b++);
//     console.log(b--);
//     console.log(b+=a);
//     console.log(b-=a);
//     console.log(b/=a);
//     console.log(b*=a);
//     console.log(b%=a);
//     console.log(a+=b);
//     console.log(a-=b);
//     console.log(a/=b);
//     console.log(a*=b);
//     console.log(a%=b);
//     console.log(a==b && b==a);
//     console.log(a==b || b==a);
// }
// Operator();

// let a = ["Ganesh", "Kantle", "Rukmini", "Vasnath", "Sonali", "Bindhre", "Ganesh"];
// let b = a.reverse();
// let c = ["Ganesh", ["Kantle", ["Rukmini", "Vasnath"], "Sonali"], "Bindhre"];

// function flat(){
//     let c= a.flat()
//     console.log(c, "this is flat");   
// }
// flat();
// function include(){
//     let c = a.includes("Ganesh")
//     console.log(c, "this is includes");   
// }
// include()
// function indexof(){
//     let c = a.indexOf("Ganesh")
//     console.log(c, "this is indexof");   
// }
// indexof()
// function include(){
//     let c = a.includes("Ganesh")
//     console.log(c, "this is includes");   
// }
// include()
// function join(){
//     let c = a.join(" ")
//     console.log(c, "this is join");   
// }
// join()
// function lastindexof(){
//     let c = a.lastIndexOf("Ganesh")
//     console.log(c, "this is includes");   
// }
// lastindexof()
// function pop(){
//     let c = a.pop()
//     console.log(c, "this is pop");  
// }
// pop()
// function push(){
//     let c = a.push()
//     console.log(c, "this is push");  
// }
// push()
// function shift(){
//     let c = b.shift()
//     console.log(c, "this is shift");  
// }
// shift()
// function unshift(){
//     let c = b.unshift()
//     console.log(c, "this is unshift");  
// }
// unshift()
// function splice(){
//     let c = b.splice(0,1)
//     console.log(c, "this is splice");  
// }
// splice()


// console.log("Before");

// setTimeout(function test(){
//     console.log("Timeout");
// },1000);

// console.log("After");