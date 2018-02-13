package se.sjolinder.advent01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlockCounterTest {

    @Test
    void part1_1() {
        String route = "R2, L3";
        assertEquals(5, BlockCounter.part2(route));
    }

    @Test
    void part1_2() {
        String route = "R2, R2, R2";
        assertEquals(2, BlockCounter.part2(route));
    }

    @Test
    void part1_3() {
        String route = "R5, L5, R5, R3";
        assertEquals(12, BlockCounter.part2(route));
    }

    @Test
    void part2() {
        String route = "R8, R4, R4, R8";
        assertEquals(4, BlockCounter.part2(route));
    }
}