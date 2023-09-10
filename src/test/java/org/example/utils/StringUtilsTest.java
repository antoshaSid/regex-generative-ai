package org.example.utils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = { "fRgy43_", "mFr3Lg_e#", "klFK)*34", "p_W2" })
    void isStrongPassword__valid(final String value) {
        assertTrue(StringUtils.isStrongPassword(value, 10));
    }

    @ParameterizedTest
    @ValueSource(strings = { "  fRgy43_", "mFr3 Lg_e#", "klFK)*34  " })
    void isStrongPassword__with_whitespace(final String value) {
        assertFalse(StringUtils.isStrongPassword(value, 10));
    }

    @ParameterizedTest
    @ValueSource(strings = { "fRgy_", "mFrLg_e#", "klFK)*" })
    void isStrongPassword__without_digit(final String value) {
        assertFalse(StringUtils.isStrongPassword(value, 10));
    }

    @ParameterizedTest
    @ValueSource(strings = { "R43_", "F3L_#", "FK)*34" })
    void isStrongPassword__without_lower_case(final String value) {
        assertFalse(StringUtils.isStrongPassword(value, 10));
    }

    @ParameterizedTest
    @ValueSource(strings = { "fgy43_", "mr3g_e#", "kl)*34" })
    void isStrongPassword__without_upper_case(final String value) {
        assertFalse(StringUtils.isStrongPassword(value, 10));
    }

    @ParameterizedTest
    @ValueSource(strings = { "fRg%Fe24fPlr[y43_", "mFr3Lg_e#@tF84", "klFK()*3fS4&fdWq" })
    void isStrongPassword__too_long(final String value) {
        assertFalse(StringUtils.isStrongPassword(value, 10));
    }
}
