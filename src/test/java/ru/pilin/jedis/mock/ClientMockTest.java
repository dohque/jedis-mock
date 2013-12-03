package ru.pilin.jedis.mock;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClientMockTest {

    @Test
    public void shouldImplementRenameNX() throws Exception {
        ClientMock clientMock = new ClientMock("localhost");
        clientMock.exists("key".getBytes());
        assertEquals(0L, clientMock.getIntegerReply().longValue());
        clientMock.sadd("key".getBytes(), "1".getBytes());
        assertEquals(0L, clientMock.getIntegerReply().longValue());
        clientMock.renamenx("key".getBytes(), "newKey".getBytes());
        assertEquals(1L, clientMock.getIntegerReply().longValue());
        clientMock.exists("newKey".getBytes());
        assertEquals(1L, clientMock.getIntegerReply().longValue());
        clientMock.exists("key".getBytes());
        assertEquals(0L, clientMock.getIntegerReply().longValue());
    }

}
