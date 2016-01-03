package com.xyxy.platform.modules.repository.mybatis.showcase;

import com.xyxy.platform.modules.entity.showcase.ShowCaseImageItem;

import java.util.List;

public interface ShowCaseImageItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ShowCaseImageItem record);

    int insertSelective(ShowCaseImageItem record);

    ShowCaseImageItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShowCaseImageItem record);

    int updateByPrimaryKey(ShowCaseImageItem record);

    List<ShowCaseImageItem> findByImagePkgId(Long imagePkgId);
}