package tests;

import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SlowTests {

    @Test
    @AllureId("133")
    @DisplayName("Тест с паузой 5 секунд")
    public void testWith5SecondsDelay() throws InterruptedException {
        Thread.sleep(5_000);
        assertEquals(0, System.currentTimeMillis() % 2);
    }

    @Test
    @AllureId("134")
    @DisplayName("Тест с паузой 8 секунд")
    public void testWith8SecondsDelay() throws InterruptedException {
        Thread.sleep(8_000);
        assertEquals(0, System.currentTimeMillis() % 2);
    }

    @Test
    @AllureId("135")
    @DisplayName("Тест с паузой 10 секунд")
    public void testWith10SecondsDelay() throws InterruptedException {
        Thread.sleep(10_000);
        assertEquals(0, System.currentTimeMillis() % 2);
    }

    @Test
    @AllureId("136")
    @DisplayName("Тест с паузой случайное количество секунд")
    public void testWithRandomSecondsDelay() throws InterruptedException {
        Thread.sleep((long) (1_000 * Math.random() * 10));
        assertEquals(0, System.currentTimeMillis() % 2);
    }
}
