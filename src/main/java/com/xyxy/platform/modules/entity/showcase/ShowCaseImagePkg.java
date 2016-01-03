package com.xyxy.platform.modules.entity.showcase;

import java.io.Serializable;
import java.util.List;

/**
 * 图片组ID
 */
public class ShowCaseImagePkg implements Serializable {

    private Long id;

    /**
     * 生成后新增的
     */
    private List<ShowCaseImageItem> showCaseImageItemList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ShowCaseImageItem> getShowCaseImageItemList() {
        return showCaseImageItemList;
    }

    public void setShowCaseImageItemList(List<ShowCaseImageItem> showCaseImageItemList) {
        this.showCaseImageItemList = showCaseImageItemList;
    }

    @Override
    public String toString() {
        return "ShowCaseImagePkg{" +
                "id=" + id +
                ", showCaseImageItemList=" + showCaseImageItemList +
                '}';
    }
}