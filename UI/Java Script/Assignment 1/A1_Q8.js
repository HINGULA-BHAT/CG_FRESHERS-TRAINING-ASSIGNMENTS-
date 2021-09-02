function con(a1, a2){
    for(i=0;i<a2.length;i++)
        a1.push(a2[i]);
    return a1;
}

a1=["a", "b", "c"];
a2=[1, 2, 3];

document.write(con(a1, a2));