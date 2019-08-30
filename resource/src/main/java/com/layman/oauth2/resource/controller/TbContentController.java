package com.layman.oauth2.resource.controller;

import com.layman.oauth2.resource.dto.ResponseResult;
import com.layman.oauth2.resource.entity.TbContent;
import com.layman.oauth2.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName TbContentController
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/8/30 10:41
 * @Version 3.0
 **/
@RestController
public class TbContentController {

    @Autowired
    private TbContentService tbContentService;

    @RequestMapping("/")
    public ResponseResult<List<TbContent>> list() {
        List<TbContent> tbContents = tbContentService.selectAllTbContent();
        return new ResponseResult<List<TbContent>>(Integer.valueOf(HttpStatus.OK.value()), HttpStatus.OK.toString(), tbContents);
    }


}
