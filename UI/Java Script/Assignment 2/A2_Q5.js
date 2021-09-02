function isEven(x){
    return x%2==0;
}

function find(a, f){
    if(a.length==1){
        if(f(a[0]))
            return a[0];    
        else
            return -1;
    }
    if(f(a[0]))
        return a[0];
    return find(a.slice(1),f);
}

a=[1,3,5,9]
document.write(find(a,isEven));