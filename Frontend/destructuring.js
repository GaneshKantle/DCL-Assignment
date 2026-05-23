let emp = {
    name: "Ganesh",
    contact: 56789302,
    address: "Bangalore",
    education: "BE",
    company: "DCL",
    hobbies: ["reading", "coding", "cleaning", "desk setup", "singer"],
    laptop : {
        brand: "HP",
        model: "14 Series Pavillion",
        price: "60k",
        color: "Silver",
        storage: "512GB",
        mfc_year: 2021
    }
} 

let {name,contact, education, hobbies, company, address, laptop} = emp;
let {brand, model, price, color, storage, mfc_year} = laptop

console.log(name);
console.log(contact);
console.log(education);
console.log(hobbies);
console.log(company);
console.log(address);
// console.log(laptop);
console.log(brand);
console.log(model);
console.log(color);
console.log(price);
console.log(storage);
console.log(mfc_year);
