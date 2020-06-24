package vip.panzhigao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @author panzhigao
 */
@SpringBootApplication
@MapperScan("vip.panzhigao.mapper")
public class StarterMain {

    public static void main(String[] args) {
        System.out.println(1233333+"2-----------");
        SpringApplication.run(StarterMain.class,args);
    }

}
