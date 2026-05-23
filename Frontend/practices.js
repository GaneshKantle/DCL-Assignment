// let menuItems = Number(prompt("Which food you want ??"));
// if (isNaN(menuItems) || menuItems < 0 || 4 > menuItems) {
//   alert("Enter the proper input man");
// } else {
//   alert(
//     "Welcome to DCL Hotel\nMenu: (Select the number to order the foods)\n1. Burger - 120/-\n2. Pizza - 150/-\n3.Coke - 40/-\n4. Show Bill",
//   );
//   if (menuItems === 1) {
//     console.log("You ordered Burger worth of 120/-");
//   } else if (menuItems === 2) {
//     console.log("You ordered Pizza worth of 150/-");
//   } else if (menuItems === 3) {
//     console.log("You ordered Coke worth of 40/-");
//   } else if (menuItems === 4) {
//     console.log(menuItems);

//   }

// }

// let currentTime = 11.00;
// let correctTime = 11.01;
// let currentMinutes = Math.floor(currentTime * 60);
// let correctMinutes = Math.floor(correctTime * 60);
// let c = correctMinutes - currentMinutes;
// let count = 0;
// while (currentMinutes + 60 <= correctMinutes) {
//   ++count;
//   currentMinutes += 60;
// }
// while (currentMinutes + 10 <= correctMinutes) {
//   ++count;
//   currentMinutes += 10;
// }
// while (currentMinutes + 50 <= correctMinutes) {
//   ++count;
//   currentMinutes += 5;
// }
// while (currentMinutes + 1 <= correctMinutes) {
//   ++count;
//   currentMinutes += 1;
// }

// console.log(count);

// console.log(currentMinutes, correctMinutes, c);

// let a = 10;
// let b = 40;
// console.log(a);
// console.log(b);

// if(a>b && a>c){
//     console.log("A is greater");
// }
// else if(b>c && b>a){
//     console.log("B is greater");
// }
// else{
//     console.log("C is greater");

// }

// console.log(Math.max(a,b,c));

// Swap two numbers without a third variable//////////////////////////////////////////////////////////////////////////////////////
// let a = 10;
// let b = 40;
// console.log(a);
// console.log(b);
// a=a+b;
// b=a-b;
// a=a-b;
// console.log(a);
// console.log(b);

// Check if a number is prime//////////////////////////////////////////////////////////////////////////////////////
// let count = 0;

function isPrime(n){
    for (let i = 2; i < n; i++) {
        if (n % i === 0) {
          return false;
        }
        return true;
      }      
}

if(isPrime(7)){
    console.log("It is a Prime Number");
}else{
    console.log("Not an prime number");
}

let fact=1;
let n=5;
for(let i=2; i<=n;i++){
  fact*=i;
}
console.log(fact);



