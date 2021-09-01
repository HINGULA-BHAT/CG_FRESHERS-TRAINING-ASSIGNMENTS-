function reverseArrayInPlace(arr) 
{
    for (var i = 0; i <= (arr.length / 2); i++) 
    {
        let el = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = el;
    }
    return arr;
  }

  num=[5,8,2,9,5,6,3,1];
  console.log(reverseArrayInPlace(num));