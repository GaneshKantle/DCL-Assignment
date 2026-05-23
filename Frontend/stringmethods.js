// let a  = "Ganesh"
// // console.log(a.charAt(3));

// let b ="Ganesh"
// let c = " Kantle"

// let d = "Rukku"

// console.log(b.concat(c).concat(" ").concat(d));

// console.log(a.endsWith("h"));
// console.log(a.startsWith("g"));
// console.log(a.includes("G"));
// console.log(a.indexOf("G"));
// console.log("5394".padEnd(12, "X"));
// console.log(d.padStart(12, "X"));

// console.log(a.repeat(2));

// console.log(a.slice(0, 4));
// console.log(a.slice(4,a.length));

// console.log(a.substring(0, 5));
// console.log(a.substring(5));

// console.log(a.toUpperCase());
// console.log(a.toLowerCase());

// let r ="    skjfsfnfk    ";
// console.log(a.length);

// console.log(r.length);
// // console.log(a.trimEnd());
// console.log(r.trim());
// console.log(r.length);




const n = "ravishastry"
let add= "bangalore"
let company = "dheecodinglab"

const halfLength = Math.floor(n.length / 2);
const firstHalf = n.slice(0, halfLength);
const secondHalf = n.slice(halfLength);
const abc1 = firstHalf + add + secondHalf;

const halfLength1 = Math.floor(abc1.length / 2);
const firstHalf1 = abc1.slice(0, halfLength1);
const secondHalf1 = abc1.slice(halfLength1);
const abc2 = firstHalf1 + company + secondHalf1;
const abc3 = (abc2)+(abc2)+(abc2)+(abc2)+(abc2);

const halfLength3 = Math.floor(abc3.length / 2);
const firstHalf3 = abc3.slice(0, halfLength3);
const secondHalf3 = abc3.slice(halfLength3);
const abc4 = firstHalf3 + n.toUpperCase() + secondHalf3;

console.log(abc1);
// console.log(abc2);
// console.log(abc3);
// console.log(abc4);

// console.log(abc4.length);
