var Rectangle= function(height, width){
    this.width=width;
    this.height=height;
};

var r1= new Rectangle(4, 5);

console.log(Rectangle.prototype);

Rectangle.prototype.getArea=function(){
    return this.height*this.width;
};

console.log("Area is "+r1.getArea());

r1.hieght=40; // the variable name is incorrect...It should be 'height' instead of 'hieght'

console.log("Area is "+r1.getArea());