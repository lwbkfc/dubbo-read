package com.lwb.disconf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

/**
 * Created by lwb on 2016/9/21.
 */
@Service
public class SimpleRedisService implements InitializingBean,DisposableBean {
    private static final Logger logger = LoggerFactory.getLogger(SimpleRedisService.class);

    private Jedis jedis = null;
    @Autowired
    private JedisConfig jedisConfig;

    @Override
    public void destroy() throws Exception {
        if (jedis != null){
            jedis.disconnect();
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Jedis jedis = new Jedis(jedisConfig.getHost(),Integer.parseInt(jedisConfig.getPort()));
//        jedis.auth("123456");
    }

    public String getKey(String key){
        if (jedis != null){
            return jedis.get(key);
        }
        return null;
    }
}
