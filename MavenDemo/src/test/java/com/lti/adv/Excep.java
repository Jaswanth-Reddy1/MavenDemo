package com.lti.adv;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

class Excep {
	@Test
    void testExpection() {



       Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("100");
        });
    }
	
}
