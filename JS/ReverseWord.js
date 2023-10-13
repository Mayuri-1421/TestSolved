function reverseWords(sentence) {
  var words = sentence.split(" ");  // Split the sentence into individual words
  var reversedWords = words.map(function(word) {
    return word.split("").reverse().join("");  // Reverse each word
  });
  var reversedSentence = reversedWords.join(" ");  // Join the reversed words back into a sentence
  return reversedSentence;
}

// Example usage:
var sentence = prompt("Enter Statement :");
var reversedSentence = reverseWords(sentence);
console.log(reversedSentence);
