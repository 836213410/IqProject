package cn.rt.test;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import cn.rt.mapper.BigdataMapper;
import cn.rt.vo.Bigdata;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestModel {
	
	@Autowired
	private BigdataMapper mapper;
	
	@Test
	public void test() {
		QueryWrapper<Bigdata> queryWrapper = new QueryWrapper<>();
		queryWrapper.like("color", "黑");
		
        Page<Bigdata> page = new Page<>(1,2);
        
        IPage<Bigdata> selectPage = mapper.selectPage(page, queryWrapper);
        

	}

}
