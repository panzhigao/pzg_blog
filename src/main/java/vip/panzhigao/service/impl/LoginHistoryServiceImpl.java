package vip.panzhigao.service.impl;

import vip.panzhigao.entity.LoginHistory;
import vip.panzhigao.mapper.LoginHistoryMapper;
import vip.panzhigao.service.ILoginHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author panzhigao
 * @since 2020-06-24
 */
@Service
public class LoginHistoryServiceImpl extends ServiceImpl<LoginHistoryMapper, LoginHistory> implements ILoginHistoryService {

}
