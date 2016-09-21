package com.lwb.disconf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lwb on 2016/9/21.
 */
@Service
public class DisconfDemoTask {
    private static final Logger logger = LoggerFactory.getLogger(DisconfDemoTask.class);

    @Autowired
    private SimpleRedisService simpleRedisService;

    @Autowired
    private JedisConfig jedisConfig;

    private static final String REDIS_KEY = "disconf_key";

    public int run(){
        try {
            while (true){
                Thread.sleep(5000);
                System.out.println("redis( " + jedisConfig.getHost() + ","
                        + jedisConfig.getPort() + ")  get key: " + REDIS_KEY);
            }
        }catch (Exception e){
            logger.error(e.toString(),e);
        }
        return 0;
    }
}
