package org.example.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Class3Test {
    Class3 obj = new Class3();

    @Test
    void testMethod1() {
        assert(obj.method1()).equals("bye");
    }

}