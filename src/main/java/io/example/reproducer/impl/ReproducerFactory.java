package io.example.reproducer.impl;

import io.example.reproducer.Reproducer;
import io.example.reproducer.ReproducerTypeWrapper;

/**
 * @author eric.wittmann@gmail.com
 */
public class ReproducerFactory {

    public static Reproducer createReproducer(ReproducerTypeWrapper wrapper) {
        switch (wrapper.getType()) {
            case alpha:
                return new AlphaReproducer();
            case beta:
                return new BetaReproducer();
            default:
                throw new RuntimeException("Failed to create a reproducer: " + wrapper.getType());
        }
    }

}
