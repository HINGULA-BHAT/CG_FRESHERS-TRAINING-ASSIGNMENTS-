const list = [1, 2, 3, 4, 5, 6];
const rotateBy = 2;

function rotate(list, rotateBy) 
{
    const result = [];
    for (let i = rotateBy % list.length, len = list.length; result.length < len; i = ++i % len) 
    {
         result.push(list[i]);
    }
    return result;
}

console.log(rotate(list, rotateBy));