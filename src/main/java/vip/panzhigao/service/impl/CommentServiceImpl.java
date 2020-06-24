package vip.panzhigao.service.impl;

import vip.panzhigao.entity.Comment;
import vip.panzhigao.mapper.CommentMapper;
import vip.panzhigao.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论信息 服务实现类
 * </p>
 *
 * @author panzhigao
 * @since 2020-06-24
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
