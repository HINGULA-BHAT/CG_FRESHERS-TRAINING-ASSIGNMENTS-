function alternate(list1,list2)
{
    var list=[];
    for(let i=0; i<list1.length;i++)
    {
        list.push(list1[i]);
        list.push(list2[i]);
    }
    return list;
}

console.log(alternate(['a','b','c'],[1,2,3]));