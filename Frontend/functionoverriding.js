// function overriding(a=10, b=20){
//     console.log(a+b);
// }
// overriding(100,200);
// overriding(1000,2000);

// function one(){
//     let a =10;
//     console.log(a);
    
//     function two(){
//         let b = 20;
//         console.log(b);
//         function three(){
//             let c =30;
//             console.log(c);

//             console.log(a);
//             console.log(b);
//         }three()
//         // console.log(a);
//         // console.log(b);
//         // console.log(c);
//     }two()
//     // console.log(a);
//     // console.log(b);
//     // console.log(c);
// }
// one()


// let first = "Ganesh";
// let last = "Kantle";

// function Test(){
//     let full = first.concat(last);
//     console.log(full);
//     return full;
// }
// let x = Test();

// function Test1(){
//     console.log(`hello my name is ${x}`); 
// }
// Test1()

// function full(){
//     let x = "Ganesh";
//     let y = "Kantle";
//     console.log(x,y);
//     return ("Ganesh", "Kantle")
//     // return ("Ganesh", "Kantle")
// }
// let a = full()
// console.log(a);

function first(){
    let a = 10;
    return a
}
let x = first();

function second(){
    let b = 20;
    return b
}
let y = second();

function add(){
    return x+y
}
console.log(add());

function sub(){
    return x-y
}
console.log(sub());

function div(){
    return x/y
}
console.log(div());

function mul(){
    return x*y
}
console.log(mul());

function mod(){
    return x%y;
}
console.log(mod());

function grethn(){
    return x>y;
}
console.log(grethn());

function lesthan(){
    return x<y;
}
console.log(lesthan());

function grtheqal(){
    return x<=y;
}
console.log(grtheqal());

function lesthequ(){
    return x>=y;
}
console.log(lesthequ());

function equ(){
    return x==y;
}
console.log(equ());

function treqa(){
    return x===y;
}
console.log(treqa());

function preinc(){
    return ++x;
}
console.log(preinc());

function postinc(){
    return x++;
}
console.log(postinc());

function predec(){
    return --x;
}
console.log(predec());

function postdec(){
    return x--;
}
console.log(postdec());

function a1(){
    return x+=y;
}
console.log(a1());

function a12(){
    return x-=y;
}
console.log(a2());

function a3(){
    return x*=y;
}
console.log(a3());

function a4(){
    return x/=y;
}
console.log(a4());

function a5(){
    return x%=y;
}
console.log(a5());
 