package com.xyxy.platform.modules.repository.mybatis.showcase;

import com.xyxy.platform.modules.entity.showcase.ShowCaseIdCard;

public interface ShowCaseIdCardMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ShowCaseIdCard record);

    int insertSelective(ShowCaseIdCard record);

    ShowCaseIdCard selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShowCaseIdCard record);

    int updateByPrimaryKey(ShowCaseIdCard record);
}