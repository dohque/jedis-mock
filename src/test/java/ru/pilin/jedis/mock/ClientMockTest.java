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
        assertEquals(1L, clientMock.getIntegerReply().longValue());
        clientMock.renamenx("key".getBytes(), "newKey".getBytes());
        assertEquals(1L, clientMock.getIntegerReply().longValue());
        clientMock.exists("newKey".getBytes());
        assertEquals(1L, clientMock.getIntegerReply().longValue());
        clientMock.exists("key".getBytes());
        assertEquals(0L, clientMock.getIntegerReply().longValue());
    }

    @Test
    public void shouldImplementDel() throws Exception {
        ClientMock clientMock = new ClientMock("localhost");
        clientMock.sadd("key".getBytes(), "value".getBytes());
        assertEquals(1L, clientMock.getIntegerReply().longValue());
        clientMock.del("key".getBytes());
        assertEquals(1L, clientMock.getIntegerReply().longValue());
    }

    @Test
    public void shouldSetGetValue() throws Exception {
        ClientMock clientMock = new ClientMock("localhost");
        clientMock.set("key".getBytes(), "value".getBytes());
        assertEquals("OK", clientMock.getStatusCodeReply());
        clientMock.get("key".getBytes());
        assertArrayEquals("value".getBytes(), clientMock.getBinaryBulkReply());
    }

    @Test
    public void shouldImplementSMembers() throws Exception {
        ClientMock clientMock = new ClientMock("localhost");
        clientMock.sadd("key".getBytes(), "value".getBytes());
        assertEquals(1L, clientMock.getIntegerReply().longValue());
        clientMock.smembers("key".getBytes());
        assertArrayEquals("value".getBytes(),
            clientMock.getBinaryMultiBulkReply().get(0));
    }
}
