function square(x){
    return x*x;
}

function map(a,f){
    for(i=0;i<a.length;i++){
        a.push(f(a.shift()))
    }
    return a;
}

arr=[1, 2, 3, 4, 5];
document.write(map(arr, square)+"<br>");
arr=[1, 4, 9, 16, 25];
document.write(map(arr, Math.sqrt));