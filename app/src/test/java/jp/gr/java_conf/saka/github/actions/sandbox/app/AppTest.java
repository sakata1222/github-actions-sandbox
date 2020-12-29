package jp.gr.java_conf.saka.github.actions.sandbox.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AppTest {

  static PrintStream systemOut;

  @BeforeAll
  static void beforeAll() {
    systemOut = System.out;
  }

  @AfterAll
  static void afterAll() {
    System.setOut(systemOut);
  }

  @Test
  void main() {
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(bos, false, StandardCharsets.UTF_8);
    System.setOut(ps);
    App.main(new String[]{});
    ps.close();
    assertEquals(
        "Hello World!" + System.lineSeparator(),
        bos.toString(StandardCharsets.UTF_8)
    );
  }
}
