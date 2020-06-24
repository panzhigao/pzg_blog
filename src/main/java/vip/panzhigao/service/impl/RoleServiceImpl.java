package vip.panzhigao.service.impl;

import vip.panzhigao.entity.Role;
import vip.panzhigao.mapper.RoleMapper;
import vip.panzhigao.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author panzhigao
 * @since 2020-06-24
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
