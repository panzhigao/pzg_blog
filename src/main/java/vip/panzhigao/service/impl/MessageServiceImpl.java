package vip.panzhigao.service.impl;

import vip.panzhigao.entity.Message;
import vip.panzhigao.mapper.MessageMapper;
import vip.panzhigao.service.IMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 消息通知表 服务实现类
 * </p>
 *
 * @author panzhigao
 * @since 2020-06-24
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements IMessageService {

}
