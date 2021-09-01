function longestToken(s)
{
    var max=0;
    var start=0;
    var end=0;
    var i=0;
    for(x=0;x<s.length;x++)
    {
        if(s[x]=='a' || s[x]=='b')
        {
            len=x-i;
            if(max<len)
            {
                max=len;
                start=i;
                end=x;
            }
            i=x+1;
        }
        if(x==s.length-1 && s[x]!='a' && s[x]!='b')
        {
            len=x+1-i;
            if(max<len)
            {
                start=i;
                end=x+1;    
            }
        }
    }
    return s.slice(start,end);
}


console.log(longestToken("ababcdababefgababhiab"));