package vip.panzhigao.service.impl;

import vip.panzhigao.entity.Picture;
import vip.panzhigao.mapper.PictureMapper;
import vip.panzhigao.service.IPictureService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 图片信息表 服务实现类
 * </p>
 *
 * @author panzhigao
 * @since 2020-06-24
 */
@Service
public class PictureServiceImpl extends ServiceImpl<PictureMapper, Picture> implements IPictureService {

}
