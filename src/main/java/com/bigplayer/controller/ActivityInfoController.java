package com.bigplayer.controller;

import com.bigplayer.beans.ActivityInfo;
import com.bigplayer.beans.model.JsonResult;
import com.bigplayer.service.ActivityInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by Kane on 2017/6/13.
 */
@RestController
@RequestMapping(path = "activity")
@CrossOrigin(origins = "*")
public class ActivityInfoController {

    @Autowired
    private ActivityInfoService activityInfoService;

    @PostMapping
    public JsonResult insertActivity(@RequestBody @Valid ActivityInfo activityInfo){
        JsonResult result = new JsonResult();
        int insertFlag = activityInfoService.insertActivity(activityInfo);
        if(insertFlag > 0 ){
            result.setSuccess(true);
            result.setMessage("发布活动成功！");
        }else{
            result.setSuccess(false);
            result.setMessage("发布活动失败！");
        }
        return result;
    }

}
