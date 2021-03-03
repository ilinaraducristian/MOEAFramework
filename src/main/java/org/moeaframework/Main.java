package org.moeaframework;

import org.moeaframework.analysis.collector.Accumulator;
import org.moeaframework.util.progress.ProgressEvent;
import org.moeaframework.util.progress.ProgressListener;

public class Main {

  public static void main(String[] args) {

    for ( String arg : args) {
      switch (arg) {

      }
    }
    System.out.println(args[0]);
    System.out.println(args[1]);
    System.out.println(args[2]);
    System.out.println(args[3]);
//    Instrumenter instrumenter = new Instrumenter().attachAll().withProblem("Belegundu");
//    ProgressListener listener = (ProgressEvent event) -> {
//      if(event.isSeedFinished()) {
//        Accumulator lastAccumulator = instrumenter.getLastAccumulator();
//        int igdSize = lastAccumulator.size("InvertedGenerationalDistance");
//        System.out.println("event");
//      }
//    };
//
//    Executor executor = new Executor()
//        .withInstrumenter(instrumenter)
//        .withProgressListener(listener)
//        .withAlgorithm("NSGAIII")
//        .withSameProblemAs(instrumenter)
//        .withMaxEvaluations(10000);
//    executor.runSeeds(10);
  }

}
