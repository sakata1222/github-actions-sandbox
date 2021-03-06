/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jp.gr.java_conf.saka.github.actions.sandbox.app;

import jp.gr.java_conf.saka.github.actions.sandbox.list.LinkedList;

import static jp.gr.java_conf.saka.github.actions.sandbox.utilities.StringUtils.join;
import static jp.gr.java_conf.saka.github.actions.sandbox.utilities.StringUtils.split;
import static jp.gr.java_conf.saka.github.actions.sandbox.app.MessageUtils.getMessage;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        System.out.println(join(tokens));
    }
}
