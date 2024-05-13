package singleton;

public class Temp {

    public void main() {

        RedisConfig redisConfig = RedisConfig.getInstance();


        System.out.println(redisConfig.getUrl());
    }
}
