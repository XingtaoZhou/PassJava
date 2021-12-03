package com.zxt.passjava.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.zxt.passjava.member.feign.StudyTimeFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zxt.passjava.member.entity.MemberEntity;
import com.zxt.passjava.member.service.MemberService;
import com.zxt.common.utils.PageUtils;
import com.zxt.common.utils.R;

/**
 * 会员-会员表
 *
 * @author zxt
 * @email 1632561836@qq.com
 * @date 2021-12-03 11:55:48
 */
@RefreshScope
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    StudyTimeFeignService studyTimeFeignService;

    @Value("${member.nickname}")
    private  String nickname;

    @Value("${member.age}")
    private  Integer age;


    @RequestMapping("/test-local-config")
    public R testLocalConfig() {
        return R.ok().put("nickname", nickname).put("age", age);
    }


    @RequestMapping("/studytime/list/test/{id}")
    public R getMemberStudyTimeListTest(@PathVariable("id") Long id) {
        //mock数据库查到的会员信息
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(id); // 学习时长：100分钟
        memberEntity.setNickname("悟空聊架构");

        //远程调用拿到该用户的学习时长（学习时长是mock数据）
        R memberStudyTimeList = studyTimeFeignService.getMemberStudyTimeListTest(id);
        return R.ok().put("member", memberEntity).put("studyTime", memberStudyTimeList.get("studyTime"));
    }

    @RequestMapping("/studytime/list/test")
    public R getMemberStudyTimeListTest() {

        //远程调用拿到该用户的学习时长（学习时长是mock数据）
        R memberStudyTimeList = studyTimeFeignService.getMemberStudyTimeListTest();
        return R.ok().put("studyTime", memberStudyTimeList.get("studyTime"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
