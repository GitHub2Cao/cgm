package org.softnovo.seckill.dao.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.softnovo.seckill.entity.Seckill;
import org.softnovo.seckill.exception.RedisException;

import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.runtime.RuntimeSchema;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisDao {
	private static final Logger LOGGER = LoggerFactory.getLogger(RedisDao.class);
	private final JedisPool jedisPool;

	public RedisDao(String ip, int port) {
		jedisPool = new JedisPool(ip, port);
	}
	
	private RuntimeSchema<Seckill> schema = RuntimeSchema.createFrom(Seckill.class);
	
	public Seckill getSeckill(long seckillId) throws RedisException {
		try { // 异常try
			Jedis jedis = jedisPool.getResource();
			try { // close try
				String key = "seckill:" + seckillId;
				byte[] bytes = jedis.get(key.getBytes());
				if (bytes != null) {
		            Seckill seckill = schema.newMessage();
		            ProtostuffIOUtil.mergeFrom(bytes, seckill, schema);
		            return seckill;
		        }
			} finally {
				jedis.close();
			}
			
		} catch (Exception e) {
			LOGGER.error("get date erroe", e);
			throw new RedisException(e);
		}
		
		return null;
	}
	
	public String putSeckill(Seckill seckill) throws RedisException {
		try {
			Jedis jedis = jedisPool.getResource();
			try {
				String key = "seckill:" + seckill.getSeckillId();
				byte[] bytes = ProtostuffIOUtil.toByteArray(seckill, schema, LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));
				int timeout = 60 * 60;// 1小时
				String result = jedis.setex(key.getBytes(), timeout, bytes);
				return result;
			} finally {
				jedis.close();
			}
		} catch (Exception e) {
			LOGGER.error("put date erroe", e);
			throw new RedisException(e);
		}
	}
}
