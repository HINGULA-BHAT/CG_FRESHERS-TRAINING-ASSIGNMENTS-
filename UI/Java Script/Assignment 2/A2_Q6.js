function square(x){
    return x*x;
}

function map(a, f){
    console.log(a);
    if(a.length==1){
        return f(a[0]);
    }

    a[0]=f(a[0]);

    return a.slice(0,1).concat(map(a.slice(1),f));
}

arr=[1, 2, 3, 4, 5];
document.write(map(arr, square)+"<br>");
arr=[1, 4, 9, 16, 25];
document.write(map(arr, Math.sqrt));