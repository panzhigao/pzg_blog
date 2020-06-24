package vip.panzhigao.service.impl;

import vip.panzhigao.entity.User;
import vip.panzhigao.mapper.UserMapper;
import vip.panzhigao.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author panzhigao
 * @since 2020-06-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
