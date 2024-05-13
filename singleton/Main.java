package singleton;

public class Main {
    public static void main(String[] args) {


        RedisConfig rc = RedisConfig.getInstance();
        System.out.println(rc.getUrl());

        Temp temp = new Temp();
        temp.main();

    }
}
