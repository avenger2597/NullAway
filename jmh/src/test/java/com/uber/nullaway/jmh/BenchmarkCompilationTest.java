package com.uber.nullaway.jmh;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import org.junit.Ignore;
import org.junit.Test;

/** Tests that all our JMH benchmarks compile successfully */
public class BenchmarkCompilationTest {

  @Test
  public void testAutodispose() throws IOException {
    assertTrue(new AutodisposeCompiler().compile());
  }

  @Test
  @Ignore("Need to update caffeine version; https://github.com/uber/NullAway/issues/1108")
  public void testCaffeine() throws IOException {
    assertTrue(new CaffeineCompiler().compile());
  }

  @Test
  public void testNullawayRelease() throws IOException {
    assertTrue(new NullawayReleaseCompiler().compile());
  }

  @Test
  public void testDFlowMicro() throws IOException {
    assertTrue(new DataFlowMicroBenchmarkCompiler().compile());
  }
}
