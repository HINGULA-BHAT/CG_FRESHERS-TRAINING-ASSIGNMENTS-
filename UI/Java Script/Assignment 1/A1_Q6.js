var list = ["Hello", "World", "in", "a", "frame"];

    function printFrame(list) 
    {
        function fill(str, length, char) 
        {
            return (str.length < length) ? fill(str + char, length, char) : str;
        }

        let size = list.map((str) => {
                return str.length;
            })
            .reduce((a, b) => {
                return Math.max(a, b);
            });

        let line = fill('', size + 4, '*');

        list = list.map((element) => 
        {
            return '* ' + fill(element, size, ' ') + ' *';
        })
        list.unshift(line);
        list.push(line);

        return list.join('\n');
    }

    function show() {
        console.log(printFrame(list));
    }

    show();  