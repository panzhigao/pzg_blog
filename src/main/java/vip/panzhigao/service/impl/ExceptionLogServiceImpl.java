package vip.panzhigao.service.impl;

import vip.panzhigao.entity.ExceptionLog;
import vip.panzhigao.mapper.ExceptionLogMapper;
import vip.panzhigao.service.IExceptionLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 异常信息日志表 服务实现类
 * </p>
 *
 * @author panzhigao
 * @since 2020-06-24
 */
@Service
public class ExceptionLogServiceImpl extends ServiceImpl<ExceptionLogMapper, ExceptionLog> implements IExceptionLogService {

}
