var year = prompt("please input a year to find out the next 20 leap years");
var counter = 20;

function leapyear(years, num) {
  
    years = parseInt(years);
    
    var origNum = num;
   
    years++;
    
    var leapYears = '';
    
    while (num > 0) {
       
        if (years % 4 === 0 && (years % 100 !== 0 || ( years % 100 === 0 && years % 400 === 0))) {
           
            if (num === 1) {
              
                leapYears += years + ".";
            }
            else {
               
                leapYears += years + ", ";
            }
           
            years++;
             num--;
        }
        else {
          
            years++;
        }
    }
    //returns sentence after while loop is done
    return "The next " + origNum + " leap years are " + leapYears;
}

//write to document the result of running leapyear
document.write(leapyear(year, counter));
