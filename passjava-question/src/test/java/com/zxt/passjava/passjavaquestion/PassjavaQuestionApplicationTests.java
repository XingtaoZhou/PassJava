package com.zxt.passjava.passjavaquestion;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zxt.passjava.question.PassjavaQuestionApplication;
import com.zxt.passjava.question.entity.TypeEntity;
import com.zxt.passjava.question.service.TypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@SpringBootTest(classes = PassjavaQuestionApplication.class)
class PassjavaQuestionApplicationTests {

    @Resource
    TypeService typeService;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void TestStringRedisTemplate() {
        // 初始化 redis 组件
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        // 存储数据
        ops.set("悟空", "悟空聊架构_" + UUID.randomUUID().toString());
        // 查询数据
        String wukong = ops.get("悟空");
        System.out.println(wukong);
    }


    // 创建题目类型
    @Test
    void testCreateType() {
        TypeEntity typeEntity = new TypeEntity();
        typeEntity.setType("javaBasic");
        typeEntity.setId(1L);
        typeService.save(typeEntity);
        System.out.println("创建成功");
    }

    // 更新type=jvm
    @Test
    void testUpdateType() {
        TypeEntity typeEntity = new TypeEntity();
        typeEntity.setId(1L);
        typeEntity.setType("jvm");
        typeService.updateById(typeEntity);
        System.out.println("修改成功");
    }
    // 查询题目类型
    @Test
    void testSelectType() {
        List<TypeEntity> typeEntityList = typeService.list(new QueryWrapper<TypeEntity>().eq("id",1L));
        typeEntityList.forEach((item)-> {
            System.out.println(item);
        });
        System.out.println("查询成功");
    }

    // 删除题目类型记录
    @Test
    void testRemoveType() {
        typeService.removeById(1L);
        System.out.println("删除成功");
    }


}
