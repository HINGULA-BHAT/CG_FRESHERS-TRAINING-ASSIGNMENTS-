function isEven(num)
{
    return (num%2==0);
}

function find(arr,isEven)
{
    for(var i=0;i<arr.length;i++)
    {
        if(isEven(arr[i]))
        {
            return arr[i];
            break;
        }
    }
}

console.log(isEven(3));
console.log(isEven(4));
console.log(find([1,3,5,4,2],isEven));