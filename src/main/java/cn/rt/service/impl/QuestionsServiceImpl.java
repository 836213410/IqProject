package cn.rt.service.impl;

import cn.rt.vo.Questions;
import cn.rt.mapper.QuestionsMapper;
import cn.rt.service.IQuestionsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author redsun
 * @since 2020-07-08
 */
@Service
public class QuestionsServiceImpl extends ServiceImpl<QuestionsMapper, Questions> implements IQuestionsService {

}
