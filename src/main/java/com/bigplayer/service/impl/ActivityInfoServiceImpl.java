package com.bigplayer.service.impl;

import com.bigplayer.beans.ActivityInfo;
import com.bigplayer.dao.ActivityInfoMapper;
import com.bigplayer.service.ActivityInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Kane on 2017/6/13.
 */
@Service
public class ActivityInfoServiceImpl implements ActivityInfoService{

    @Autowired
   private ActivityInfoMapper activityInfoMapper;

    @Override
    public int insertActivity(ActivityInfo record) {
        return activityInfoMapper.insertSelective(record);
    }
}
