// console.log(abc, xyz);
// var abc=100
// let xyz=200

// function closure(){
//     var abc=100;
//     function example(){
//         console.log(abc);

//     }
// }

// console.log(0.1+0.2===0.3); //false
// console.log(0.1+0.2); // 0.30000000000000004 because of floating point

// const obj ={
//     a:1,
//     b:2
// }

// obj.toString()

// const obj1 = {
//      name:"ganesh",
//     age: 26
// }

// const obj2 = {
//     name: "kantleeee",
//     age: 30,
// }

// const result = {
//     ...obj1, ...obj2
// }

// console.log(result);

// let array = [1,2,3,4,5];
// const results = array.map((a,b)=> a*b)
// const results = array.filter((a)=> a>2)
// console.log(results);

// const user = {
//     name: "Gani",
//     age: 22,
//     city: "Pune"
//   };

//   const { name} = user;

//   console.log(user);

// const arrary = [18,10,12,10,15,9,11];

// const result = () => {
//     for (let i=0; i<arrary.length-1; i++)
//     {
//         for (let j=0; j<arrary.length-1-i; j++)
//         if(arrary[j]>arrary[j+1])
//         {
//             let temp = arrary[j]
//             arrary[j]=arrary[j+1]
//             arrary[j+1]=temp
//         }
//     }
//     return arrary
// }

// console.log(result());

//  const arr = [2,3,1]

//  const res = arr.forEach(a => {
//      let b = a*2;
//     console.log(b);
//  })

//  let users = [10,20,30,40,50];
// users.splice(1, 1); // remove B
// let b = users.splice(1,2);

//  console.log(users);

// any();

// function any() {
//     console.log("This is Ganesh");
//   }
// any();

// function any() {
//     console.log("I'm there");
//   }

// var any = function() {
//     console.log("Im here");
// };
// console.log(any);

// any();

// abc=1000
// console.log(abc);


// console.log([]===[]);
// console.log([]==[]);

// Function Currying
// function sum(a) {
//     return function(b) {
//       return function(c) {
//         return a + b + c;
//       }
//     }
//   }
  
//   sum(1)(2)(3); 

// Infinite Currying
// function sum(a){
//     return function (b){
//         if (b!==undefined){
//             return sum(a + b);
//         }
//         return a;
//     }
// }
// console.log(sum(1)(2)(1)());

// function outer() {
    
//     function inner() {
//         return "Hello"
//     }
//     return inner();
//   }
  
//   console.log(outer());
  

// function reverse() {
//     let a = "Nitin";
//     let b = a.split("").reverse().join("").toLowerCase();
//     console.log(b);
//     let c = (b==a.toLowerCase());
//     console.log(c);
    
// }
// reverse()


// function sLargest(){
//     let arr = [9,1,1,8,5,6]
//     let b = [...new Set(arr)];
//     let c = b.max;
//     console.log(c);   
    
// }
// sLargest();

// function asc(){
//     let arr = [9,1,1,8,5,6];
//     console.log(arr.sort((a,b)=> b-a));
// }
// asc();

// const map = () => {
//     const arr = [9,1,1,8,5,6];
//    arr.forEach((num)=>console.log(num*2));
// }
// map()

const arr = [9,1,1,8,5,6];
console.log(arr.splice(0,0,"jsdf"));
console.log(arr);

