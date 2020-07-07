package cn.rt.service.impl;

import cn.rt.vo.Bigdata;
import cn.rt.mapper.BigdataMapper;
import cn.rt.service.IBigdataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author redsun
 * @since 2020-07-07
 */
@Service
public class BigdataServiceImpl extends ServiceImpl<BigdataMapper, Bigdata> implements IBigdataService {

}
