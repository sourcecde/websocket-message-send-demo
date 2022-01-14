package com.example.websocketdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloMessageTest {

    @Test
    public void testGetName(){
        HelloMessage helloMessage = new HelloMessage();
        helloMessage.setName("Debraj");
        assertEquals(helloMessage.getName(), "Debraj");
    }

}