package ru.pilin.jedis.mock;

import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import redis.clients.jedis.Client;
import redis.clients.jedis.Connection;
import redis.clients.jedis.DebugParams;
import redis.clients.jedis.Protocol.Command;
import redis.clients.jedis.SortingParams;
import redis.clients.jedis.ZParams;

// Not Thread safe
public class ClientMock extends Client {

    private final Logger log = LoggerFactory.getLogger(ClientMock.class);

    private boolean isInMulti = false;

    private Long integerReply;

    private byte[] binaryBulkReply;

    private Map<ByteArrayKey, Object> store = new HashMap<>();

    private String statusCodeReply;

    private List<byte[]> binaryMultiBulkReply;

    public ClientMock(String host) {
        super(host);
        log.debug("Creating {}", this);
    }

    @Override
    public void set(String key, String value) {
        throw new NotImplementedException();
    }

    @Override
    public void get(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void exists(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void del(String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public void type(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void keys(String pattern) {
        throw new NotImplementedException();
    }

    @Override
    public void rename(String oldkey, String newkey) {
    }

    @Override
    public void renamenx(String oldkey, String newkey) {
        throw new NotImplementedException();
    }

    @Override
    public void expire(String key, int seconds) {
        throw new NotImplementedException();
    }

    @Override
    public void expireAt(String key, long unixTime) {
        throw new NotImplementedException();
    }

    @Override
    public void ttl(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void move(String key, int dbIndex) {
        throw new NotImplementedException();
    }

    @Override
    public void getSet(String key, String value) {
        throw new NotImplementedException();
    }

    @Override
    public void mget(String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public void setnx(String key, String value) {
        throw new NotImplementedException();
    }

    @Override
    public void setex(String key, int seconds, String value) {
        throw new NotImplementedException();
    }

    @Override
    public void mset(String... keysvalues) {
        throw new NotImplementedException();
    }

    @Override
    public void msetnx(String... keysvalues) {
        throw new NotImplementedException();
    }

    @Override
    public void decrBy(String key, long integer) {
        throw new NotImplementedException();
    }

    @Override
    public void decr(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void incrBy(String key, long integer) {
        throw new NotImplementedException();
    }

    @Override
    public void incr(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void append(String key, String value) {
        throw new NotImplementedException();
    }

    @Override
    public void substr(String key, int start, int end) {
        throw new NotImplementedException();
    }

    @Override
    public void hset(String key, String field, String value) {
        throw new NotImplementedException();
    }

    @Override
    public void hget(String key, String field) {
        throw new NotImplementedException();
    }

    @Override
    public void hsetnx(String key, String field, String value) {
        throw new NotImplementedException();
    }

    @Override
    public void hmset(String key, Map<String, String> hash) {
        throw new NotImplementedException();
    }

    @Override
    public void hmget(String key, String... fields) {
        throw new NotImplementedException();
    }

    @Override
    public void hincrBy(String key, String field, long value) {
        throw new NotImplementedException();
    }

    @Override
    public void hexists(String key, String field) {
        throw new NotImplementedException();
    }

    @Override
    public void hdel(String key, String... fields) {
        throw new NotImplementedException();
    }

    @Override
    public void hlen(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void hkeys(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void hvals(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void hgetAll(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void rpush(String key, String... string) {
        throw new NotImplementedException();
    }

    @Override
    public void lpush(String key, String... string) {
        throw new NotImplementedException();
    }

    @Override
    public void llen(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void lrange(String key, long start, long end) {
        throw new NotImplementedException();
    }

    @Override
    public void ltrim(String key, long start, long end) {
        throw new NotImplementedException();
    }

    @Override
    public void lindex(String key, long index) {
        throw new NotImplementedException();
    }

    @Override
    public void lset(String key, long index, String value) {
        throw new NotImplementedException();
    }

    @Override
    public void lrem(String key, long count, String value) {
        throw new NotImplementedException();
    }

    @Override
    public void lpop(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void rpop(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void rpoplpush(String srckey, String dstkey) {
        throw new NotImplementedException();
    }

    @Override
    public void sadd(String key, String... members) {
        throw new NotImplementedException();
    }

    @Override
    public void smembers(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void srem(String key, String... members) {
        throw new NotImplementedException();
    }

    @Override
    public void spop(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void smove(String srckey, String dstkey, String member) {
        throw new NotImplementedException();
    }

    @Override
    public void scard(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void sismember(String key, String member) {
        throw new NotImplementedException();
    }

    @Override
    public void sinter(String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public void sinterstore(String dstkey, String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public void sunion(String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public void sunionstore(String dstkey, String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public void sdiff(String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public void sdiffstore(String dstkey, String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public void srandmember(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void zadd(String key, double score, String member) {
        throw new NotImplementedException();
    }

    @Override
    public void zrange(String key, long start, long end) {
        throw new NotImplementedException();
    }

    @Override
    public void zrem(String key, String... members) {
        throw new NotImplementedException();
    }

    @Override
    public void zincrby(String key, double score, String member) {
        throw new NotImplementedException();
    }

    @Override
    public void zrank(String key, String member) {
        throw new NotImplementedException();
    }

    @Override
    public void zrevrank(String key, String member) {
        throw new NotImplementedException();
    }

    @Override
    public void zrevrange(String key, long start, long end) {
        throw new NotImplementedException();
    }

    @Override
    public void zrangeWithScores(String key, long start, long end) {
        throw new NotImplementedException();
    }

    @Override
    public void zrevrangeWithScores(String key, long start, long end) {
        throw new NotImplementedException();
    }

    @Override
    public void zcard(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void zscore(String key, String member) {
        throw new NotImplementedException();
    }

    @Override
    public void watch(String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public void sort(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void sort(String key, SortingParams sortingParameters) {
        throw new NotImplementedException();
    }

    @Override
    public void blpop(String[] args) {
        throw new NotImplementedException();
    }

    @Override
    public void sort(String key, SortingParams sortingParameters, String dstkey) {
        throw new NotImplementedException();
    }

    @Override
    public void sort(String key, String dstkey) {
        throw new NotImplementedException();
    }

    @Override
    public void brpop(String[] args) {
        throw new NotImplementedException();
    }

    @Override
    public void zcount(String key, double min, double max) {
        throw new NotImplementedException();
    }

    @Override
    public void zcount(String key, String min, String max) {
        throw new NotImplementedException();
    }

    @Override
    public void zrangeByScore(String key, double min, double max) {
        throw new NotImplementedException();
    }

    @Override
    public void zrangeByScore(String key, String min, String max) {
        throw new NotImplementedException();
    }

    @Override
    public void zrangeByScore(String key, double min, double max, int offset,
        int count) {
        throw new NotImplementedException();
    }

    @Override
    public void zrangeByScoreWithScores(String key, double min, double max) {
        throw new NotImplementedException();
    }

    @Override
    public void zrangeByScoreWithScores(String key, double min, double max,
        int offset, int count) {
        throw new NotImplementedException();
    }

    @Override
    public void zrevrangeByScore(String key, double max, double min) {
        throw new NotImplementedException();
    }

    @Override
    public void zrangeByScore(String key, String min, String max, int offset,
        int count) {
        throw new NotImplementedException();
    }

    @Override
    public void zrangeByScoreWithScores(String key, String min, String max) {
        throw new NotImplementedException();
    }

    @Override
    public void zrangeByScoreWithScores(String key, String min, String max,
        int offset, int count) {
        throw new NotImplementedException();
    }

    @Override
    public void zrevrangeByScore(String key, String max, String min) {
        throw new NotImplementedException();
    }

    @Override
    public void zrevrangeByScore(String key, double max, double min,
        int offset, int count) {
        throw new NotImplementedException();
    }

    @Override
    public void zrevrangeByScore(String key, String max, String min,
        int offset, int count) {
        throw new NotImplementedException();
    }

    @Override
    public void zrevrangeByScoreWithScores(String key, double max, double min) {
        throw new NotImplementedException();
    }

    @Override
    public void zrevrangeByScoreWithScores(String key, String max, String min) {
        throw new NotImplementedException();
    }

    @Override
    public void zrevrangeByScoreWithScores(String key, double max, double min,
        int offset, int count) {
        throw new NotImplementedException();
    }

    @Override
    public void zrevrangeByScoreWithScores(String key, String max, String min,
        int offset, int count) {
        throw new NotImplementedException();
    }

    @Override
    public void zremrangeByRank(String key, long start, long end) {
        throw new NotImplementedException();
    }

    @Override
    public void zremrangeByScore(String key, double start, double end) {
        throw new NotImplementedException();
    }

    @Override
    public void zremrangeByScore(String key, String start, String end) {
        throw new NotImplementedException();
    }

    @Override
    public void zunionstore(String dstkey, String... sets) {
        throw new NotImplementedException();
    }

    @Override
    public void zunionstore(String dstkey, ZParams params, String... sets) {
        throw new NotImplementedException();
    }

    @Override
    public void zinterstore(String dstkey, String... sets) {
        throw new NotImplementedException();
    }

    @Override
    public void zinterstore(String dstkey, ZParams params, String... sets) {
        throw new NotImplementedException();
    }

    @Override
    public void strlen(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void lpushx(String key, String string) {
        throw new NotImplementedException();
    }

    @Override
    public void persist(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void rpushx(String key, String string) {
        throw new NotImplementedException();
    }

    @Override
    public void echo(String string) {
        throw new NotImplementedException();
    }

    @Override
    public void linsert(String key, LIST_POSITION where, String pivot,
        String value) {
        throw new NotImplementedException();
    }

    @Override
    public void brpoplpush(String source, String destination, int timeout) {
        throw new NotImplementedException();
    }

    @Override
    public void setbit(String key, long offset, boolean value) {
        throw new NotImplementedException();
    }

    @Override
    public void getbit(String key, long offset) {
        throw new NotImplementedException();
    }

    @Override
    public void setrange(String key, long offset, String value) {
        throw new NotImplementedException();
    }

    @Override
    public void getrange(String key, long startOffset, long endOffset) {
        throw new NotImplementedException();
    }

    @Override
    public void publish(String channel, String message) {
        throw new NotImplementedException();
    }

    @Override
    public void unsubscribe(String... channels) {
        throw new NotImplementedException();
    }

    @Override
    public void psubscribe(String... patterns) {
        throw new NotImplementedException();
    }

    @Override
    public void punsubscribe(String... patterns) {
        throw new NotImplementedException();
    }

    @Override
    public void subscribe(String... channels) {
        throw new NotImplementedException();
    }

    @Override
    public void configSet(String parameter, String value) {
        throw new NotImplementedException();
    }

    @Override
    public void configGet(String pattern) {
        throw new NotImplementedException();
    }

    @Override
    public void eval(String script, int keyCount, String... params) {
        throw new NotImplementedException();
    }

    @Override
    public void evalsha(String sha1, int keyCount, String... params) {
        throw new NotImplementedException();
    }

    @Override
    public void scriptExists(String... sha1) {
        throw new NotImplementedException();
    }

    @Override
    public void scriptLoad(String script) {
        throw new NotImplementedException();
    }

    @Override
    public void zadd(String key, Map<Double, String> scoreMembers) {
        throw new NotImplementedException();
    }

    @Override
    public void objectRefcount(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void objectIdletime(String key) {
        throw new NotImplementedException();
    }

    @Override
    public void objectEncoding(String key) {
        throw new NotImplementedException();
    }

    @Override
    public boolean isInMulti() {
        return isInMulti;
    }

    @Override
    public void setPassword(String password) {
        throw new NotImplementedException();
    }

    @Override
    public void connect() {
        throw new NotImplementedException();
    }

    @Override
    public void ping() {
        throw new NotImplementedException();
    }

    @Override
    public void set(byte[] key, byte[] value) {
        throw new NotImplementedException();
    }

    @Override
    public void get(byte[] key) {
        throw new NotImplementedException();
    }

    @Override
    public void quit() {
        throw new NotImplementedException();
    }

    @Override
    public void exists(byte[] key) {
        throw new NotImplementedException();
    }

    @Override
    public void del(byte[]... keys) {
        throw new NotImplementedException();
    }

    @Override
    public void type(byte[] key) {
        throw new NotImplementedException();
    }

    @Override
    public void flushDB() {
        throw new NotImplementedException();
    }

    @Override
    public void keys(byte[] pattern) {
        throw new NotImplementedException();
    }

    @Override
    public void randomKey() {
        throw new NotImplementedException();
    }

    @Override
    public void rename(byte[] oldkey, byte[] newkey) {
        throw new NotImplementedException();
    }

    @Override
    public void renamenx(byte[] oldkey, byte[] newkey) {
        throw new NotImplementedException();
    }

    @Override
    public void dbSize() {
        throw new NotImplementedException();
    }

    @Override
    public void expire(byte[] key, int seconds) {
        throw new NotImplementedException();
    }

    @Override
    public void expireAt(byte[] key, long unixTime) {
        throw new NotImplementedException();
    }

    @Override
    public void ttl(byte[] key) {
        throw new NotImplementedException();
    }

    @Override
    public void select(int index) {
        throw new NotImplementedException();
    }

    @Override
    public void move(byte[] key, int dbIndex) {
        throw new NotImplementedException();
    }

    @Override
    public void flushAll() {
        throw new NotImplementedException();
    }

    @Override
    public void getSet(byte[] key, byte[] value) {
        throw new NotImplementedException();
    }

    @Override
    public void mget(byte[]... keys) {
        throw new NotImplementedException();
    }

    @Override
    public void setnx(byte[] key, byte[] value) {
        throw new NotImplementedException();
    }

    @Override
    public void setex(byte[] key, int seconds, byte[] value) {
        throw new NotImplementedException();
    }

    @Override
    public void mset(byte[]... keysvalues) {
        throw new NotImplementedException();
    }

    @Override
    public void msetnx(byte[]... keysvalues) {
        throw new NotImplementedException();
    }

    @Override
    public void decrBy(byte[] key, long integer) {
        throw new NotImplementedException();
    }

    @Override
    public void decr(byte[] key) {
        throw new NotImplementedException();
    }

    @Override
    public void incrBy(byte[] key, long integer) {
        throw new NotImplementedException();
    }

    @Override
    public void incr(byte[] key) {
        throw new NotImplementedException();
    }

    @Override
    public void append(byte[] key, byte[] value) {
        throw new NotImplementedException();
    }

    @Override
    public void substr(byte[] key, int start, int end) {
        throw new NotImplementedException();
    }

    @SuppressWarnings("unchecked")
    @Override
    public void hset(byte[] key, byte[] field, byte[] value) {
        ByteArrayKey structureKey = new ByteArrayKey(key);
        ByteArrayKey fieldKey = new ByteArrayKey(field);
        if (store.containsKey(structureKey)) {
            Object structure = store.get(structureKey);
            if (structure instanceof Map) {
                ((Map<ByteArrayKey, byte[]>) structure)
                    .put(fieldKey, value);
            }
            integerReply = 0L;
        } else {
            Map<ByteArrayKey, byte[]> map = new HashMap<>();
            map.put(fieldKey, value);
            store.put(structureKey, map);
            integerReply = 1L;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public void hget(byte[] key, byte[] field) {
        ByteArrayKey structureKey = new ByteArrayKey(key);
        if (store.containsKey(structureKey)) {
            Object structure = store.get(structureKey);
            if (structure instanceof Map) {
                ByteArrayKey fieldKey = new ByteArrayKey(field);
                Map<ByteArrayKey, byte[]> map = (Map<ByteArrayKey, byte[]>) structure;
                binaryBulkReply = map.get(fieldKey);
            } else {
                throw new IllegalArgumentException("Structure for key " + structureKey + " is not Map");
            }
        } else {
            binaryBulkReply = null;
        }
    }

    @Override
    public void hsetnx(byte[] key, byte[] field, byte[] value) {
        throw new NotImplementedException();
    }

    @Override
    public void hmset(byte[] key, Map<byte[], byte[]> hash) {
        ByteArrayKey structureKey = new ByteArrayKey(key);
        if (store.containsKey(structureKey)) {
            Object structure = store.get(structureKey);
            if (structure instanceof Map) {
                @SuppressWarnings("unchecked")
                Map<ByteArrayKey, byte[]> map = (Map<ByteArrayKey, byte[]>) structure;
                for (Map.Entry<byte[], byte[]> entry : hash.entrySet()) {
                    map.put(new ByteArrayKey(entry.getKey()), entry.getValue());
                }
                statusCodeReply = "OK";
            } else {
                throw new IllegalArgumentException("Structure for key " + structureKey + " is not Map");
            }
        } else {
            Map<ByteArrayKey, byte[]> map = new HashMap<>();
            for (Map.Entry<byte[], byte[]> entry : hash.entrySet()) {
                map.put(new ByteArrayKey(entry.getKey()), entry.getValue());
            }
            store.put(structureKey, map);
            statusCodeReply = "OK";
        }
    }

    @Override
    public void hmget(byte[] key, byte[]... fields) {
        throw new NotImplementedException();
    }

    @Override
    public void hincrBy(byte[] key, byte[] field, long value) {
        throw new NotImplementedException();
    }

    @Override
    public void hexists(byte[] key, byte[] field) {
        throw new NotImplementedException();
    }

    @Override
    public void hdel(byte[] key, byte[]... fields) {
        throw new NotImplementedException();
    }

    @Override
    public void hlen(byte[] key) {
        throw new NotImplementedException();
    }

    @Override
    public void hkeys(byte[] key) {
        throw new NotImplementedException();
    }

    @Override
    public void hvals(byte[] key) {
        throw new NotImplementedException();
    }

    @Override
    public void hgetAll(byte[] key) {
        ByteArrayKey structureKey = new ByteArrayKey(key);
        if (store.containsKey(structureKey)) {
            @SuppressWarnings("unchecked")
            Map<ByteArrayKey, byte[]> map =
                (Map<ByteArrayKey, byte[]>) store.get(structureKey);
            binaryMultiBulkReply = new ArrayList<>(map.size() * 2);
            for (Map.Entry<ByteArrayKey, byte[]> entry : map.entrySet()) {
                binaryMultiBulkReply.add(entry.getKey().toArray());
                binaryMultiBulkReply.add(entry.getValue());
            }
        } else {
            binaryMultiBulkReply = null;
        }
    }

    @Override
    public void rpush(byte[] key, byte[]... strings) {
        throw new NotImplementedException();
    }

    @Override
    public void lpush(byte[] key, byte[]... strings) {
        throw new NotImplementedException();
    }

    @Override
    public void llen(byte[] key) {
        throw new NotImplementedException();
    }

    @Override
    public void lrange(byte[] key, long start, long end) {
        throw new NotImplementedException();
    }

    @Override
    public void ltrim(byte[] key, long start, long end) {
        throw new NotImplementedException();
    }

    @Override
    public void lindex(byte[] key, long index) {
        throw new NotImplementedException();
    }

    @Override
    public void lset(byte[] key, long index, byte[] value) {
        throw new NotImplementedException();
    }

    @Override
    public void lrem(byte[] key, long count, byte[] value) {
        throw new NotImplementedException();
    }

    @Override
    public void lpop(byte[] key) {
        throw new NotImplementedException();
    }

    @Override
    public void rpop(byte[] key) {
        throw new NotImplementedException();
    }

    @Override
    public void rpoplpush(byte[] srckey, byte[] dstkey) {
        throw new NotImplementedException();
    }

    @Override
    public void sadd(byte[] key, byte[]... members) {
        throw new NotImplementedException();
    }

    @Override
    public void smembers(byte[] key) {
        throw new NotImplementedException();
    }

    @Override
    public void srem(byte[] key, byte[]... members) {
        throw new NotImplementedException();
    }

    @Override
    public void spop(byte[] key) {
        throw new NotImplementedException();
    }

    @Override
    public void smove(byte[] srckey, byte[] dstkey, byte[] member) {
        throw new NotImplementedException();
    }

    @Override
    public void scard(byte[] key) {
        throw new NotImplementedException();
    }

    @Override
    public void sismember(byte[] key, byte[] member) {
        throw new NotImplementedException();
    }

    @Override
    public void sinter(byte[]... keys) {
        throw new NotImplementedException();
    }

    @Override
    public void sinterstore(byte[] dstkey, byte[]... keys) {
        throw new NotImplementedException();
    }

    @Override
    public void sunion(byte[]... keys) {
        throw new NotImplementedException();
    }

    @Override
    public void sunionstore(byte[] dstkey, byte[]... keys) {
        throw new NotImplementedException();
    }

    @Override
    public void sdiff(byte[]... keys) {
        throw new NotImplementedException();
    }

    @Override
    public void sdiffstore(byte[] dstkey, byte[]... keys) {
        throw new NotImplementedException();
    }

    @Override
    public void srandmember(byte[] key) {
        throw new NotImplementedException();
    }

    @Override
    public void zadd(byte[] key, double score, byte[] member) {
        throw new NotImplementedException();
    }

    @Override
    public void zaddBinary(byte[] key, Map<Double, byte[]> scoreMembers) {
        throw new NotImplementedException();
    }

    @Override
    public void zrange(byte[] key, long start, long end) {
        throw new NotImplementedException();
    }

    @Override
    public void zrem(byte[] key, byte[]... members) {
        throw new NotImplementedException();
    }

    @Override
    public void zincrby(byte[] key, double score, byte[] member) {
        throw new NotImplementedException();
    }

    @Override
    public void zrank(byte[] key, byte[] member) {
        throw new NotImplementedException();
    }

    @Override
    public void zrevrank(byte[] key, byte[] member) {
        throw new NotImplementedException();
    }

    @Override
    public void zrevrange(byte[] key, long start, long end) {
        throw new NotImplementedException();
    }

    @Override
    public void zrangeWithScores(byte[] key, long start, long end) {
        throw new NotImplementedException();
    }

    @Override
    public void zrevrangeWithScores(byte[] key, long start, long end) {
        throw new NotImplementedException();
    }

    @Override
    public void zcard(byte[] key) {
        throw new NotImplementedException();
    }

    @Override
    public void zscore(byte[] key, byte[] member) {
        throw new NotImplementedException();
    }

    @Override
    public void multi() {
        throw new NotImplementedException();
    }

    @Override
    public void discard() {
        throw new NotImplementedException();
    }

    @Override
    public void exec() {
        throw new NotImplementedException();

    }

    @Override
    public void watch(byte[]... keys) {
        throw new NotImplementedException();

    }

    @Override
    public void unwatch() {
        throw new NotImplementedException();

    }

    @Override
    public void sort(byte[] key) {
        throw new NotImplementedException();

    }

    @Override
    public void sort(byte[] key, SortingParams sortingParameters) {
        throw new NotImplementedException();

    }

    @Override
    public void blpop(byte[][] args) {
        throw new NotImplementedException();

    }

    @Override
    public void sort(byte[] key, SortingParams sortingParameters, byte[] dstkey) {
        throw new NotImplementedException();

    }

    @Override
    public void sort(byte[] key, byte[] dstkey) {
        throw new NotImplementedException();

    }

    @Override
    public void brpop(byte[][] args) {
        throw new NotImplementedException();

    }

    @Override
    public void auth(String password) {
        throw new NotImplementedException();

    }

    @Override
    public void subscribe(byte[]... channels) {
        throw new NotImplementedException();

    }

    @Override
    public void publish(byte[] channel, byte[] message) {
        throw new NotImplementedException();

    }

    @Override
    public void unsubscribe() {
        throw new NotImplementedException();

    }

    @Override
    public void unsubscribe(byte[]... channels) {
        throw new NotImplementedException();

    }

    @Override
    public void psubscribe(byte[]... patterns) {
        throw new NotImplementedException();

    }

    @Override
    public void punsubscribe() {
        throw new NotImplementedException();

    }

    @Override
    public void punsubscribe(byte[]... patterns) {
        throw new NotImplementedException();

    }

    @Override
    public void zcount(byte[] key, byte[] min, byte[] max) {
        throw new NotImplementedException();

    }

    @Override
    public void zrangeByScore(byte[] key, byte[] min, byte[] max) {
        throw new NotImplementedException();

    }

    @Override
    public void zrevrangeByScore(byte[] key, byte[] max, byte[] min) {
        throw new NotImplementedException();

    }

    @Override
    public void zrangeByScore(byte[] key, byte[] min, byte[] max, int offset,
        int count) {
        throw new NotImplementedException();

    }

    @Override
    public void zrevrangeByScore(byte[] key, byte[] max, byte[] min,
        int offset, int count) {
        throw new NotImplementedException();

    }

    @Override
    public void zrangeByScoreWithScores(byte[] key, byte[] min, byte[] max) {
        throw new NotImplementedException();

    }

    @Override
    public void zrevrangeByScoreWithScores(byte[] key, byte[] max, byte[] min) {
        throw new NotImplementedException();

    }

    @Override
    public void zrangeByScoreWithScores(byte[] key, byte[] min, byte[] max,
        int offset, int count) {
        throw new NotImplementedException();

    }

    @Override
    public void zrevrangeByScoreWithScores(byte[] key, byte[] max, byte[] min,
        int offset, int count) {
        throw new NotImplementedException();

    }

    @Override
    public void zremrangeByRank(byte[] key, long start, long end) {
        throw new NotImplementedException();

    }

    @Override
    public void zremrangeByScore(byte[] key, byte[] start, byte[] end) {
        throw new NotImplementedException();

    }

    @Override
    public void zunionstore(byte[] dstkey, byte[]... sets) {
        throw new NotImplementedException();

    }

    @Override
    public void zunionstore(byte[] dstkey, ZParams params, byte[]... sets) {
        throw new NotImplementedException();

    }

    @Override
    public void zinterstore(byte[] dstkey, byte[]... sets) {
        throw new NotImplementedException();

    }

    @Override
    public void zinterstore(byte[] dstkey, ZParams params, byte[]... sets) {
        throw new NotImplementedException();

    }

    @Override
    public void save() {
        throw new NotImplementedException();

    }

    @Override
    public void bgsave() {
        throw new NotImplementedException();

    }

    @Override
    public void bgrewriteaof() {
        throw new NotImplementedException();

    }

    @Override
    public void lastsave() {
        throw new NotImplementedException();

    }

    @Override
    public void shutdown() {
        throw new NotImplementedException();

    }

    @Override
    public void info() {
        throw new NotImplementedException();

    }

    @Override
    public void monitor() {
        throw new NotImplementedException();

    }

    @Override
    public void slaveof(String host, int port) {
        throw new NotImplementedException();

    }

    @Override
    public void slaveofNoOne() {
        throw new NotImplementedException();

    }

    @Override
    public void configGet(byte[] pattern) {
        throw new NotImplementedException();

    }

    @Override
    public void configSet(byte[] parameter, byte[] value) {
        throw new NotImplementedException();

    }

    @Override
    public void strlen(byte[] key) {
        throw new NotImplementedException();

    }

    @Override
    public void sync() {
        throw new NotImplementedException();

    }

    @Override
    public void lpushx(byte[] key, byte[] string) {
        throw new NotImplementedException();

    }

    @Override
    public void persist(byte[] key) {
        throw new NotImplementedException();

    }

    @Override
    public void rpushx(byte[] key, byte[] string) {
        throw new NotImplementedException();

    }

    @Override
    public void echo(byte[] string) {
        throw new NotImplementedException();

    }

    @Override
    public void linsert(byte[] key, LIST_POSITION where, byte[] pivot,
        byte[] value) {
        throw new NotImplementedException();

    }

    @Override
    public void debug(DebugParams params) {
        throw new NotImplementedException();

    }

    @Override
    public void brpoplpush(byte[] source, byte[] destination, int timeout) {
        throw new NotImplementedException();

    }

    @Override
    public void configResetStat() {
        throw new NotImplementedException();

    }

    @Override
    public void setbit(byte[] key, long offset, byte[] value) {
        throw new NotImplementedException();

    }

    @Override
    public void getbit(byte[] key, long offset) {
        throw new NotImplementedException();

    }

    @Override
    public void setrange(byte[] key, long offset, byte[] value) {
        throw new NotImplementedException();

    }

    @Override
    public void getrange(byte[] key, long startOffset, long endOffset) {
        throw new NotImplementedException();

    }

    @Override
    public Long getDB() {
        throw new NotImplementedException();

    }

    @Override
    public void disconnect() {
        throw new NotImplementedException();

    }

    @Override
    public void eval(byte[] script, byte[] keyCount, byte[][] params) {
        throw new NotImplementedException();

    }

    @Override
    public void evalsha(byte[] sha1, byte[] keyCount, byte[][] params) {
        throw new NotImplementedException();

    }

    @Override
    public void scriptFlush() {
        throw new NotImplementedException();

    }

    @Override
    public void scriptExists(byte[]... sha1) {
        throw new NotImplementedException();

    }

    @Override
    public void scriptLoad(byte[] script) {
        throw new NotImplementedException();

    }

    @Override
    public void scriptKill() {
        throw new NotImplementedException();

    }

    @Override
    public void slowlogGet() {
        throw new NotImplementedException();

    }

    @Override
    public void slowlogGet(long entries) {
        throw new NotImplementedException();

    }

    @Override
    public void slowlogReset() {
        throw new NotImplementedException();

    }

    @Override
    public void slowlogLen() {
        throw new NotImplementedException();

    }

    @Override
    public void objectRefcount(byte[] key) {
        throw new NotImplementedException();

    }

    @Override
    public void objectIdletime(byte[] key) {
        throw new NotImplementedException();

    }

    @Override
    public void objectEncoding(byte[] key) {
        throw new NotImplementedException();

    }

    @Override
    public Socket getSocket() {
        throw new NotImplementedException();

    }

    @Override
    public int getTimeout() {
        throw new NotImplementedException();

    }

    @Override
    public void setTimeout(int timeout) {
        throw new NotImplementedException();

    }

    @Override
    public void setTimeoutInfinite() {
        throw new NotImplementedException();

    }

    @Override
    public void rollbackTimeout() {
        throw new NotImplementedException();

    }

    @Override
    protected void flush() {
        throw new NotImplementedException();

    }

    @Override
    protected Connection sendCommand(Command cmd, String... args) {
        throw new NotImplementedException();

    }

    @Override
    protected Connection sendCommand(Command cmd, byte[]... args) {
        throw new NotImplementedException();

    }

    @Override
    protected Connection sendCommand(Command cmd) {
        throw new NotImplementedException();

    }

    @Override
    public String getHost() {
        throw new NotImplementedException();

    }

    @Override
    public void setHost(String host) {
        throw new NotImplementedException();

    }

    @Override
    public int getPort() {
        throw new NotImplementedException();
    }

    @Override
    public void setPort(int port) {
        throw new NotImplementedException();
    }

    @Override
    public boolean isConnected() {
        throw new NotImplementedException();
    }

    @Override
    protected String getStatusCodeReply() {
        return statusCodeReply;
    }

    @Override
    public String getBulkReply() {
        throw new NotImplementedException();
    }

    @Override
    public byte[] getBinaryBulkReply() {
        return binaryBulkReply;
    }

    @Override
    public Long getIntegerReply() {
        return integerReply;
    }

    @Override
    public List<String> getMultiBulkReply() {
        throw new NotImplementedException();
    }

    @Override
    public List<byte[]> getBinaryMultiBulkReply() {
        return binaryMultiBulkReply;
    }

    @Override
    public List<Object> getObjectMultiBulkReply() {
        throw new NotImplementedException();
    }

    @Override
    public List<Long> getIntegerMultiBulkReply() {
        throw new NotImplementedException();
    }

    @Override
    public List<Object> getAll() {
        throw new NotImplementedException();
    }

    @Override
    public List<Object> getAll(int except) {
        throw new NotImplementedException();
    }

    @Override
    public Object getOne() {
        throw new NotImplementedException();
    }
}
