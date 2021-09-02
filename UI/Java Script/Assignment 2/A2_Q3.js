function isEven(x){
    return x%2==0;
}

function find(arr, f){
    for(i=0;i<arr.length;i++){
        if(f(arr[i]))
            return arr[i];
    }
    return -1;
}

a=[1,3,4,5,6,9,2]
document.write(find(a,isEven));