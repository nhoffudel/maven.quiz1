package com.github.perschola;

public class Encryptor {
      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String ans = "";
          String[] split = phrase.split(" ");
          for (String i: split) {
              char[] word = i.toCharArray();
              ans += word[0];
          }
          return ans.toUpperCase();
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          char[] letters  = word.toCharArray();
          String ans = "";
          for (char i: letters) {
              if (((i >= 'x') && (i <= 'z')) || ((i >= 'X') && (i <= 'Z'))) i -= 23;
              else i+= 3;
              ans += i;
          }
          return ans;
      }
}
