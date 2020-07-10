/*Given two strings, write a function to determine if the second string is an anagram of the first. 
An anagram is a word, phrase, or name formed by rearranging the letters of another, such as*/

function validAnagram(str1, str2) {
    // add whatever parameters you deem necessary - good luck!
    //0(n) implementation
    
    if (str1.length !== str2.length) {
        return false;
    }
    const frequence1 = {};
    const frequence2 = {};

    for (let str of str1) {
        frequence1[str] = ++frequence1[str] || 1;
    }

    for (let str of str2) {
        frequence2[str] = ++frequence2[str] || 1;
    }

    for (let key in frequence1) {
        if (!(frequence1[key] == frequence2[key])) {
            return false;
        }
    }
    return true;
}