package cn.rt.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import cn.rt.mapper.BigdataMapper;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestModel {
	
	@Autowired
	private BigdataMapper mapper;
	
	@Test
	public void test() {
		Integer selectCount = mapper.selectCount(new QueryWrapper<>());
		System.out.println(selectCount);
	}

}
