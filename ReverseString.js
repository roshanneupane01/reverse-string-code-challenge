let word = "helloWorld";

let reverseString = (word) => {
    let resultString = '';
    for(let i = word.length-1; i>=0; i--){
        resultString += word.charAt(i)
    }
    return resultString
};

console.log(reverseString(word));
