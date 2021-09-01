var arr=[];
var even=0,odd=0,sum=0,avg=0;
for(var i=0;i<100;i++)
{
    arr.push(Math.floor(Math.random() * 100) + 1);
}

console.log(arr);

console.log(Math.max.apply(null, arr));
console.log(Math.min.apply(null, arr));

for(var i=0;i<100;i++)
{
    if(arr[i]%2==0)
    {
        even++;
    }
    else
    {
        odd++;
    }
    sum=sum+arr[i];
}

avg=sum/100;

console.log("Sum: ",sum);

console.log("Average: ",avg);

if(even>odd)
{
    console.log("Even count: ",even);
}

else
{
    console.log("Odd count: ",odd);
}