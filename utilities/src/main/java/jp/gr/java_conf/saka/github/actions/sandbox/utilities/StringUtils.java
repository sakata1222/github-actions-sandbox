/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jp.gr.java_conf.saka.github.actions.sandbox.utilities;

import jp.gr.java_conf.saka.github.actions.sandbox.list.LinkedList;

public class StringUtils {

  private StringUtils() {
  }

  public static String join(LinkedList source) {
    return JoinUtils.join(source);
  }

  public static LinkedList split(String source) {
    return SplitUtils.split(source);
  }
}
