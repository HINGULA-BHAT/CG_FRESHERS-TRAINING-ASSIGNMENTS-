var obj= { "firstName": "Hingulal", "lastName": "Bhat" };

var p1= JSON.parse(JSON.stringify(obj));

console.log(p1.firstName+" "+p1.lastName);

p1.lastName="H";

console.log(p1.firstName+" "+p1.lastName);

console.log(p1.middleName);

p1.middleName= "B";

console.log(p1.middleName);