public class PangramChecker {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog"; // Replace with your sentence
        boolean isPangram = checkPangram(sentence);
        
        if (isPangram) {
            System.out.println("The sentence is a pangram!");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
    
    public static boolean checkPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        int index;
        
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                index = Character.toLowerCase(sentence.charAt(i)) - 'a';
                alphabet[index] = true;
            }
        }
        
        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }
        
        return true;
    }
}