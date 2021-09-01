let numbers=[10,20,30,40,50]
let sum=0;

for(let i=0;i<numbers.length;i++)
{
    sum+=numbers[i];
}

console.log("For Loop: ",sum);


let i=0,add=0;
while(i<numbers.length)
{
    add+=numbers[i];
    i++;
}

console.log("While Loop: ",add);

let j=0,cal=0;
do{
    cal+=numbers[j];
    j++;
}
while(j<numbers.length)

console.log("Do While Loop: ",cal);