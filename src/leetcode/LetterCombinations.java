package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

  /**
   * Given a string containing digits from 2-9 inclusive, return all possible
   * letter combinations that the number could represent. Return the answer in any
   * order.
   * 
   * Input: digits = "23" Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
   * 
   */
  public static void main(String[] args) {
    letterCombinations("234").forEach(System.out::println);
  }

  private static List<String> letterCombinations(String digits) {
    List<String> res = new ArrayList<>();
    Map<Character, Character[]> keyBindings = new HashMap<>(8);
    keyBindings.put('2', new Character[] { 'a', 'b', 'c' });
    keyBindings.put('3', new Character[] { 'd', 'e', 'f' });
    keyBindings.put('4', new Character[] { 'g', 'h', 'i' });
    keyBindings.put('5', new Character[] { 'j', 'k', 'l' });
    keyBindings.put('6', new Character[] { 'm', 'n', 'o' });
    keyBindings.put('7', new Character[] { 'p', 'q', 'r', 's' });
    keyBindings.put('8', new Character[] { 't', 'u', 'v' });
    keyBindings.put('9', new Character[] { 'w', 'x', 'y', 'z' });
    int combinations = 1;
    for (Character c : digits.toCharArray()) {
      if (c == '7' || c == '9') {
        combinations *= 4;
      } else {
        combinations *= 3;
      }
    }

    for (Character c : digits.toCharArray()) {
      if (c == '7' || c == '9') {
        for (int i = 0; i < combinations; i++) {

        }
      } else {
        combinations *= 3;
      }

    }
    System.out.println(combinations);
    return res;
  }
}
