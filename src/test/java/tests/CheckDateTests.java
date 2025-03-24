package tests;

import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckDateTests {

    @Test
    @AllureId("100")
    @DisplayName("Текущее число месяца делится без остатка на 2")
    public void testDateIsAMultipleOfTwo() {
        assertEquals(0, LocalDate.now().getDayOfMonth() % 2);
    }
}
