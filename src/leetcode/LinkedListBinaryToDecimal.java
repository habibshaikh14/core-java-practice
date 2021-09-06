package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import leetcode.helper.classes.ListNode;

public class LinkedListBinaryToDecimal {
  /**
   * A class to convert Binary to Decimal.
   */
  private static final ListNode BINARY = new ListNode("1 0 1 0 0 1");
  private static final Logger LOGGER = LogManager.getLogger(LinkedListBinaryToDecimal.class);

  public static void main(String[] args) {
    LOGGER.info(BINARY.getString());
    LOGGER.info(getDecimal(BINARY));
  }

  private static int getDecimal(ListNode head) {
    int decimal = head.getVal();
    while (head.getNext() != null) {
      head = head.getNext();
      decimal = decimal * 2 + head.getVal();
    }
    return decimal;
  }
}
