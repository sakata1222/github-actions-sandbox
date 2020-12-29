package jp.gr.java_conf.saka.github.actions.sandbox.utilities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jp.gr.java_conf.saka.github.actions.sandbox.list.LinkedList;
import org.junit.jupiter.api.Test;

class SplitUtilsTest {

  @Test
  void split() {
    LinkedList list = SplitUtils.split("a b c");
    assertEquals(3, list.size());
    assertEquals("a", list.get(0));
    assertEquals("b", list.get(1));
    assertEquals("c", list.get(2));
  }
}
