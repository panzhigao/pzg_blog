package vip.panzhigao.service;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import vip.panzhigao.base.BlogTestBase;
import vip.panzhigao.entity.LoginHistory;

public class ILoginHistoryServiceTest extends BlogTestBase{

    @Autowired
    private ILoginHistoryService loginHistoryService;

    @Test
    public void test1(){
        LoginHistory history = loginHistoryService.getById(1L);
        System.out.println(history);
    }

}