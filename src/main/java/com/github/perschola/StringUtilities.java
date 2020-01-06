package com.github.perschola;

public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        char str[] = valueToBeReversed.toCharArray();
        String ans = "";
        for(int i = str.length - 1; i >= 0; i--) ans += str[i];
        return ans;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        char str[] = word.toCharArray();
        return str[str.length / 2];
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        char str[] = value.toCharArray();
        String ans = "";
        for(int i = 0; i < str.length; i++) {
            if (str[i] != charToRemove) ans += str[i];
        }
        return ans;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] split = sentence.split(" ");
        return split[split.length - 1];
    }
}
