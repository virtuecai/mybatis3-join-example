package com.xyxy.platform.modules.repository.mybatis.showcase;

import com.xyxy.platform.modules.entity.showcase.ShowCaseImagePkg;

public interface ShowCaseImagePkgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ShowCaseImagePkg record);

    int insertSelective(ShowCaseImagePkg record);

    ShowCaseImagePkg selectByPrimaryKey(Long id);
}