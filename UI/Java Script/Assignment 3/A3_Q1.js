var Rectangle= function(height, width){
    this.width=width;
    this.height=height;
};

var r1= new Rectangle(5, 3);
var r2= new Rectangle(3,7);

console.log("The height of r1 is "+r1.height+" and width is "+r1.width);
console.log("The height of r2 is "+r2.height+" and width is "+r2.width);

r1.height=4;
console.log("The height of r1 is "+r1.height+" and width is "+r1.width);