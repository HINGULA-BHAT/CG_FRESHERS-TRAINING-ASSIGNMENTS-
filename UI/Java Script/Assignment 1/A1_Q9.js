function con(a1, a2){
    var a=[]
    if(a1.length<a2.length){
        for(i=0;i<a1.length;i++){
            a.push(a1[i]);
            a.push(a2[i]);
        }
        for(i=a1.length;i<a2.length;i++)
            a.push(a2[i]);
    }
    else if(a2.length<a1.length){
        for(i=0;i<a2.length;i++){
            a.push(a1[i]);
            a.push(a2[i]);
        }
        for(i=a2.length;i<a1.length;i++)
            a.push(a1[i]);
    }
    else{
        for(i=0;i<a2.length;i++){
            a.push(a1[i]);
            a.push(a2[i]);
        }
    }
    return a;
}

a1=["a", "b", "c"];
a2=[1, 2, 5, 6, 3];

document.write(con(a1, a2));