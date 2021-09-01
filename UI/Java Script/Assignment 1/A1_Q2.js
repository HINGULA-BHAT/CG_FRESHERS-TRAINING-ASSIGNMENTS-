console.log('sum-of-multiples-of-3-and-5');

function sumOfMultiples(curLimit) {

  let sumOfMultipleValue = 0;

  for(let i = 0; i <= curLimit; i++) {
    if (i % 3 === 0 || i % 5 === 0) {
      // console.log(i);
      sumOfMultipleValue +=i;
    }
  }
  // return sumOfMultipleValue;
  console.log(`sumOfMultipleValue of 3 & 5 upto ${curLimit} digit is:`, sumOfMultipleValue);
}

sumOfMultiples(100);
