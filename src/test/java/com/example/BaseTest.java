package com.example;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class BaseTest {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new ProducerController());
    }

}
