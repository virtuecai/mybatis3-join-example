package com.xyxy.platform.modules.repository.mybatis.showcase;

import com.xyxy.platform.modules.entity.showcase.ShowCaseUser;

public interface ShowCaseUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ShowCaseUser record);

    int insertSelective(ShowCaseUser record);

    ShowCaseUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShowCaseUser record);

    int updateByPrimaryKey(ShowCaseUser record);
}