// 👉 Reverse the array, then take the second string and reverse its characters and convert to uppercase.
// let arr = [1, 2, "hello", 4, "world", 6, "dev", 8];
// const x = arr.reverse();
// const x1= x[1].split("").reverse().join("").toUpperCase();
// x[1]=x1;
// console.log(x);


// 👉 Replace every string with its length while keeping numbers unchanged.
// let arr = ["apple", 10, "banana", 20, "mango", 30];
// let x = arr.map( item => 
//     typeof item === "string" ? item.length : item
// )
// console.log(x);


// 👉  Swap the first and last string elements only.
// let arr = [5, "alpha", 9, "beta", 12, "gamma", 15];
// let x = arr[1]
// let y = arr[5]
// arr[5] = x
// arr[1] = y
// console.log(arr);

// 👉 Capitalize only the strings that are at even indexes.
// let arr = ["cat", 3, "dog", 7, "elephant", 9, "tiger", "sdfgf"];
// let x = arr.map((item, index) =>
//     index % 2 === 0 && typeof item === "string" ? item.toUpperCase() : item
// )
// console.log(x);

// 👉 Reverse each string but keep them in the same positions.
// let arr = [1, "sun", 2, "moon", 3, "star", 4];
// let x = arr.map(item =>
//     typeof item === "string" ? item.split("").reverse().join("") : item
// )
// console.log(x);

// 👉 Reverse the array and rotate the last 3 elements to the front.
// let arr = [10, 20, 30, 40, 50, 60, 70, 80];
// let x = arr.splice(0,3).reverse()
// let x1 = arr.splice(0,arr.length).reverse()
// console.log(x+","+x1);

// 👉 Replace the middle element with its reversed string.
// let arr = ["one", "two", "three", "four", "five"];
// let x = arr[2].split("").reverse().join("");
// arr[2] =x
// console.log(arr);

// 👉 Swap every pair of adjacent elements.
// let arr = [1, 2, 3, 4, 5, 6, 7, 8];
// for (i=0; i<arr.length; i+=2){
//     let temp=arr[i];
//     arr[i]=arr[i+1]
//     arr[i+1]=temp
// }
// console.log(arr);

//👉 Create a new array where each word becomes its reversed uppercase version.
// let arr = ["hello", "world", "javascript", "logic"];
// let x = arr.map(item => item.split("").reverse().join("").toUpperCase());
// let x1 =x.reverse();
// console.log(x);

//👉 Replace each string with its first and last character combined.
// let arr = ["apple", "banana", "kiwi", "mango"];
// let x = arr.map(item =>
//     item.slice(0,1)+arr.slice(1,arr.length-1)+item.slice(item.length-1,item.length)
// )


// console.log(x);

// const arr = [15,20,35,60,30];

// for(let i=0; i<arr.length-2; i++){
//     for(let j=0; j<arr.length-1; j++){
//         for(let k=0; k<arr.length; k++){
//             if(arr[i]+arr[j]+arr[k]==125){
//                 console.log(arr[i], arr[j], arr[k]);
//                 console.log(i,j,k);
//             }
//         }
//     }
// }


// var checkPrimeFrequency = function(nums) {
//     let b = nums.sort((a,b)=>a-b);

//      for(let i=0; i<b.length; i++){
//         if(b[i] == b[i+1]){
//             b.push();
//         }
//      }
//      console.log(b);
     
//     //  for(let i=0; i<nums[i].sqrt; i++){

//     //  }
// };
// checkPrimeFrequency([1,2,3,4,5,4])


// let x = 10;
// let y = 20;

// x = x ^ y; 
// y = x ^ y; 
// x = x ^ y;

// console.log(x,y);
