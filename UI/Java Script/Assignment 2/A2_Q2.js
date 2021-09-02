function square(x){
    return x*x;
}

function double(x){
    return x*2;
}

function compose(f1,f2){
    
    function x(x){
        return f1(f2(x));
    }

    return x;
}

var f= compose(square, double);
document.write(f(10));