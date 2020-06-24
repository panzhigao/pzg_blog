package vip.panzhigao.base;

import lombok.extern.slf4j.Slf4j;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
@Transactional(transactionManager="transactionManager")//事务管理器，默认数据回滚
@Slf4j
public class BlogTestBase {

    @BeforeClass
    public static void load() {
        log.info("单元测试开始执行....");
    }

}
