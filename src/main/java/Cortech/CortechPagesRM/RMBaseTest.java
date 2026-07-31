package Cortech.CortechPagesRM;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class RMBaseTest extends BaseTest{
    @BeforeEach
    public void startUp() {
        createDriver();
        getDriver().navigate().to("https://tests.routemate.dev/");
    }

    @AfterEach
    public void tareDown() {
        quitDriver();
    }

}
