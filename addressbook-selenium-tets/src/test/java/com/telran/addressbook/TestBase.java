package com.telran.addressbook;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() {
        app.start();
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        app.stop();
    }
}
