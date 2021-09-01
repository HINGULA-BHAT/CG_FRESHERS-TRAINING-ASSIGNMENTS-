function headsratio(numberofflips)
{
    let headscounter=0;
    let tailscounter=0;

    for(let count=0;count<numberofflips;count++)
    {
        let flips=Math.floor(Math.random()*2);
        if(flips==0)
        {
            headscounter+=1;
        }
        else
        {
            tailscounter+=1;
        }
    }

    console.log(`Heads: ${headscounter}`);
    console.log(`Tails: ${tailscounter}`);
    console.log(`result: ${headscounter/numberofflips}`);
    console.log("--------------------");
    
}
headsratio(10);
headsratio(100);
headsratio(10000);
headsratio(10000000)