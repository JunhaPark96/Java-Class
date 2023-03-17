package dayTenth;

public class Word {
    private String letters;

    public Word(String letters) {
        this.letters = letters;
    }

    public boolean isVowel(int i) {
        char letter = letters.charAt(i);
        letter = Character.toLowerCase(letter);
        if (letter == 'a'|| letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isConsonant(int i) {
        return !isVowel(i);
    }
}

//String string = "aeiouAEIOU";
//String letter = letters.substring(i, i + 1);
//return string.contains(letter);