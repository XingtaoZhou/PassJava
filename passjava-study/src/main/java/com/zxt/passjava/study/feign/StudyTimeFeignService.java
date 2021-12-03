package com.zxt.passjava.study.feign;

import com.zxt.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("passjava-study")
public interface StudyTimeFeignService {

    @RequestMapping("study/studytime/member/list/test")
    public R getMemberStudyTimeListTest();


}

