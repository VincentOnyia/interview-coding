package com.mastercard.interview;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SpecialIteratorTests {
    private SpecialIterator specialIterator;

    @Test
    void hasNext() {
        SpecialIterator specialIterator = new SpecialIterator(new String[]{"2", "2"});
        Assertions.assertThat(specialIterator.hasNext()).isTrue();
    }

    @Test
    void next() {
        SpecialIterator specialIterator = new SpecialIterator(new String[]{"1", "2"});
        Assertions.assertThat(specialIterator.next()).isEqualTo("2");
    }
}