function square(x)
{
    return x*x;
}

function double(x)
{
    return x*2;
}

function composedValue(square,double,value)
{
    return square(double(value));
}

console.log(composedValue(square,double,5));