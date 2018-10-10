package cn.zybwz.utils;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Redis工具类
 * @author 周倚斌
 * @version 1.0
 * 2018-09-02 10:34
 */

public class RedisConn {
	 @Autowired
	 private RedisTemplate<String, String> redisTemplate;
	 
	 /**
	  * 往Redis数据库插入有效期五分钟的数据
	  * @param key
	  * @param value
	  * @param timeout
	  */
	 public void SMSset(String key,String value,Long timeout) {
		 redisTemplate.opsForValue().set(key, value);
		 redisTemplate.expire(key, 60*5, TimeUnit.SECONDS);
	 }
	 
	 /**
	  * 根据键获取到存入Redis的值
	  * @param key
	  * @return 返回 key对应的value
	  */
	 public String get(String key) {
		 return redisTemplate.opsForValue().get(key);
	 }
}
