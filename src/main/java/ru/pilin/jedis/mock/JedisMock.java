package ru.pilin.jedis.mock;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import redis.clients.jedis.BinaryClient.LIST_POSITION;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;
import redis.clients.jedis.SortingParams;
import redis.clients.jedis.Tuple;
import redis.clients.jedis.ZParams;
import redis.clients.util.Slowlog;

public class JedisMock extends Jedis {

    private static final Logger log = LoggerFactory.getLogger(JedisMock.class); 

    public JedisMock() {
        super("localhost");
        this.client = new ClientMock("localhost");
    }

    @Override
    public void connect() {
        log.trace(".connect()");
    }

    @Override
    public void disconnect() {
        log.trace(".disconnect()");
    }

    @Override
    public String ping() {
        throw new NotImplementedException();
    }

    @Override
    public String set(final String key, String value) {
        throw new NotImplementedException();
    }

    @Override
    public String get(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public String quit() {
        log.trace(".quit()");
        return "OK";
    }

    @Override
    public Boolean exists(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public Long del(final String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public String type(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public String flushDB() {
        throw new NotImplementedException();
    }

    @Override
    public Set<String> keys(final String pattern) {
        throw new NotImplementedException();
    }

    @Override
    public String randomKey() {
        throw new NotImplementedException();
    }

    @Override
    public String rename(final String oldkey, final String newkey) {
        throw new NotImplementedException();
    }

    @Override
    public Long renamenx(final String oldkey, final String newkey) {
        throw new NotImplementedException();
    }

    @Override
    public Long expire(final String key, final int seconds) {
        throw new NotImplementedException();
    }

    @Override
    public Long expireAt(final String key, final long unixTime) {
        throw new NotImplementedException();
    }

    @Override
    public Long ttl(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public String select(final int index) {
        throw new NotImplementedException();
    }

    @Override
    public Long move(final String key, final int dbIndex) {
        throw new NotImplementedException();
    }

    @Override
    public String flushAll() {
        throw new NotImplementedException();
    }

    @Override
    public String getSet(final String key, final String value) {
        throw new NotImplementedException();
    }

    @Override
    public List<String> mget(final String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public Long setnx(final String key, final String value) {
        throw new NotImplementedException();
    }

    @Override
    public String setex(final String key, final int seconds, final String value) {
        throw new NotImplementedException();
    }

    @Override
    public String mset(final String... keysvalues) {
        throw new NotImplementedException();
    }

    @Override
    public Long msetnx(final String... keysvalues) {
        throw new NotImplementedException();
    }

    @Override
    public Long decrBy(final String key, final long integer) {
        throw new NotImplementedException();
    }

    @Override
    public Long decr(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public Long incrBy(final String key, final long integer) {
        throw new NotImplementedException();
    }

    @Override
    public Long incr(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public Long append(final String key, final String value) {
        throw new NotImplementedException();
    }

    @Override
    public String substr(final String key, final int start, final int end) {
        throw new NotImplementedException();
    }

    @Override
    public Long hset(final String key, final String field, final String value) {
        throw new NotImplementedException();
    }

    @Override
    public String hget(final String key, final String field) {
        throw new NotImplementedException();
    }

    @Override
    public Long hsetnx(final String key, final String field, final String value) {
        throw new NotImplementedException();
    }

    @Override
    public String hmset(final String key, final Map<String, String> hash) {
        throw new NotImplementedException();
    }

    @Override
    public List<String> hmget(final String key, final String... fields) {
        throw new NotImplementedException();
    }

    @Override
    public Long hincrBy(final String key, final String field, final long value) {
        throw new NotImplementedException();
    }

    @Override
    public Boolean hexists(final String key, final String field) {
        throw new NotImplementedException();
    }

    @Override
    public Long hdel(final String key, final String... fields) {
        throw new NotImplementedException();
    }

    @Override
    public Long hlen(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public Set<String> hkeys(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public List<String> hvals(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public Map<String, String> hgetAll(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public Long rpush(final String key, final String... strings) {
        throw new NotImplementedException();
    }

    @Override
    public Long lpush(final String key, final String... strings) {
        throw new NotImplementedException();
    }

    @Override
    public Long llen(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public List<String> lrange(final String key, final long start,
        final long end) {
        throw new NotImplementedException();
    }

    @Override
    public String ltrim(final String key, final long start, final long end) {
        throw new NotImplementedException();
    }

    @Override
    public String lindex(final String key, final long index) {
        throw new NotImplementedException();
    }

    @Override
    public String lset(final String key, final long index, final String value) {
        throw new NotImplementedException();
    }

    @Override
    public Long lrem(final String key, final long count, final String value) {
        throw new NotImplementedException();
    }

    @Override
    public String lpop(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public String rpop(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public String rpoplpush(final String srckey, final String dstkey) {
        throw new NotImplementedException();
    }

    @Override
    public Long sadd(final String key, final String... members) {
        throw new NotImplementedException();
    }

    @Override
    public Set<String> smembers(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public Long srem(final String key, final String... members) {
        throw new NotImplementedException();
    }

    @Override
    public String spop(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public Long smove(final String srckey, final String dstkey,
        final String member) {
        throw new NotImplementedException();
    }

    @Override
    public Long scard(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public Boolean sismember(final String key, final String member) {
        throw new NotImplementedException();
    }

    @Override
    public Set<String> sinter(final String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public Long sinterstore(final String dstkey, final String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public Set<String> sunion(final String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public Long sunionstore(final String dstkey, final String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public Set<String> sdiff(final String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public Long sdiffstore(final String dstkey, final String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public String srandmember(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public Long zadd(final String key, final double score, final String member) {
        throw new NotImplementedException();
    }

    @Override
    public Long zadd(final String key, final Map<Double, String> scoreMembers) {
        throw new NotImplementedException();
    }

    @Override
    public Set<String> zrange(final String key, final long start, final long end) {
        throw new NotImplementedException();
    }

    @Override
    public Long zrem(final String key, final String... members) {
        throw new NotImplementedException();
    }

    @Override
    public Double zincrby(final String key, final double score,
        final String member) {
        throw new NotImplementedException();
    }

    @Override
    public Long zrank(final String key, final String member) {
        throw new NotImplementedException();
    }

    @Override
    public Long zrevrank(final String key, final String member) {
        throw new NotImplementedException();
    }

    @Override
    public Set<String> zrevrange(final String key, final long start,
        final long end) {
        throw new NotImplementedException();
    }

    @Override
    public Set<Tuple> zrangeWithScores(final String key, final long start,
        final long end) {
        throw new NotImplementedException();
    }

    @Override
    public Set<Tuple> zrevrangeWithScores(final String key, final long start,
        final long end) {
        throw new NotImplementedException();
    }

    @Override
    public Long zcard(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public Double zscore(final String key, final String member) {
        throw new NotImplementedException();
    }

    @Override
    public String watch(final String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public List<String> sort(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public List<String> sort(final String key,
        final SortingParams sortingParameters) {
        throw new NotImplementedException();
    }

    @Override
    public List<String> blpop(final int timeout, final String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public Long sort(final String key, final SortingParams sortingParameters,
        final String dstkey) {
        throw new NotImplementedException();
    }

    @Override
    public Long sort(final String key, final String dstkey) {
        throw new NotImplementedException();
    }

    @Override
    public List<String> brpop(final int timeout, final String... keys) {
        throw new NotImplementedException();
    }

    @Override
    public String auth(final String password) {
        throw new NotImplementedException();
    }

    @Override
    public void subscribe(JedisPubSub jedisPubSub, String... channels) {
        throw new NotImplementedException();
    }

    @Override
    public Long publish(String channel, String message) {
        throw new NotImplementedException();
    }

    @Override
    public void psubscribe(JedisPubSub jedisPubSub, String... patterns) {
        throw new NotImplementedException();
    }

    @Override
    public Long zcount(final String key, final double min, final double max) {
        throw new NotImplementedException();
    }

    @Override
    public Long zcount(final String key, final String min, final String max) {
        throw new NotImplementedException();
    }

    @Override
    public Set<String> zrangeByScore(final String key, final double min,
        final double max) {
        throw new NotImplementedException();
    }

    @Override
    public Set<String> zrangeByScore(final String key, final String min,
        final String max) {
        throw new NotImplementedException();
    }

    @Override
    public Set<String> zrangeByScore(final String key, final double min,
        final double max, final int offset, final int count) {
        throw new NotImplementedException();
    }

    @Override
    public Set<String> zrangeByScore(final String key, final String min,
        final String max, final int offset, final int count) {
        throw new NotImplementedException();
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(final String key,
        final double min, final double max) {
        throw new NotImplementedException();
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(final String key,
        final String min, final String max) {
        throw new NotImplementedException();
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(final String key,
        final double min, final double max, final int offset,
        final int count) {
        throw new NotImplementedException();
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(final String key,
        final String min, final String max, final int offset,
        final int count) {
        throw new NotImplementedException();
    }

    @Override
    public Set<String> zrevrangeByScore(final String key, final double max,
        final double min) {
        throw new NotImplementedException();
    }

    @Override
    public Set<String> zrevrangeByScore(final String key, final String max,
        final String min) {
        throw new NotImplementedException();
    }

    @Override
    public Set<String> zrevrangeByScore(final String key, final double max,
        final double min, final int offset, final int count) {
        throw new NotImplementedException();
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(final String key,
        final double max, final double min) {
        throw new NotImplementedException();
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(final String key,
        final double max, final double min, final int offset,
        final int count) {
        throw new NotImplementedException();
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(final String key,
        final String max, final String min, final int offset,
        final int count) {
        throw new NotImplementedException();
    }

    @Override
    public Set<String> zrevrangeByScore(final String key, final String max,
        final String min, final int offset, final int count) {
        throw new NotImplementedException();
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(final String key,
        final String max, final String min) {
        throw new NotImplementedException();
    }

    @Override
    public Long zremrangeByRank(final String key, final long start,
        final long end) {
        throw new NotImplementedException();
    }

    @Override
    public Long zremrangeByScore(final String key, final double start,
        final double end) {
        throw new NotImplementedException();
    }

    @Override
    public Long zremrangeByScore(final String key, final String start,
        final String end) {
        throw new NotImplementedException();
    }

    @Override
    public Long zunionstore(final String dstkey, final String... sets) {
        throw new NotImplementedException();
    }

    @Override
    public Long zunionstore(final String dstkey, final ZParams params,
        final String... sets) {
        throw new NotImplementedException();
    }

    @Override
    public Long zinterstore(final String dstkey, final String... sets) {
        throw new NotImplementedException();
    }

    @Override
    public Long zinterstore(final String dstkey, final ZParams params,
        final String... sets) {
        throw new NotImplementedException();
    }

    @Override
    public Long strlen(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public Long lpushx(final String key, final String string) {
        throw new NotImplementedException();
    }

    @Override
    public Long persist(final String key) {
        throw new NotImplementedException();
    }

    @Override
    public Long rpushx(final String key, final String string) {
        throw new NotImplementedException();
    }

    @Override
    public String echo(final String string) {
        throw new NotImplementedException();
    }

    @Override
    public Long linsert(final String key, final LIST_POSITION where,
        final String pivot, final String value) {
        throw new NotImplementedException();
    }

    @Override
    public String brpoplpush(String source, String destination, int timeout) {
        throw new NotImplementedException();
    }

    @Override
    public Boolean setbit(String key, long offset, boolean value) {
        throw new NotImplementedException();
    }

    @Override
    public Boolean getbit(String key, long offset) {
        throw new NotImplementedException();
    }

    @Override
    public Long setrange(String key, long offset, String value) {
        throw new NotImplementedException();
    }

    @Override
    public String getrange(String key, long startOffset, long endOffset) {
        throw new NotImplementedException();
    }

    @Override
    public List<String> configGet(final String pattern) {
        throw new NotImplementedException();
    }

    @Override
    public String configSet(final String parameter, final String value) {
        throw new NotImplementedException();
    }

    @Override
    public Object eval(String script, int keyCount, String... params) {
        throw new NotImplementedException();
    }

    @Override
    public Object eval(String script, List<String> keys, List<String> args) {
        throw new NotImplementedException();
    }

    @Override
    public Object eval(String script) {
        throw new NotImplementedException();
    }

    @Override
    public Object evalsha(String script) {
        throw new NotImplementedException();
    }

    @Override
    public Object evalsha(String sha1, List<String> keys, List<String> args) {
        throw new NotImplementedException();
    }

    @Override
    public Object evalsha(String sha1, int keyCount, String... params) {
        throw new NotImplementedException();
    }

    @Override
    public Boolean scriptExists(String sha1) {
        throw new NotImplementedException();
    }

    @Override
    public List<Boolean> scriptExists(String... sha1) {
        throw new NotImplementedException();
    }

    @Override
    public String scriptLoad(String script) {
        throw new NotImplementedException();
    }

    @Override
    public List<Slowlog> slowlogGet() {
        throw new NotImplementedException();
    }

    @Override
    public List<Slowlog> slowlogGet(long entries) {
        throw new NotImplementedException();
    }

    @Override
    public Long objectRefcount(String string) {
        throw new NotImplementedException();
    }

    @Override
    public String objectEncoding(String string) {
        throw new NotImplementedException();
    }

    @Override
    public Long objectIdletime(String string) {
        throw new NotImplementedException();
    }
}
