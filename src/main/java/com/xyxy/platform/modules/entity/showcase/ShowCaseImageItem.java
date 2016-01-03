package com.xyxy.platform.modules.entity.showcase;

import java.io.Serializable;

/**
 * 图片
 */
public class ShowCaseImageItem implements Serializable {
    private Long id;

    private String url;

    private Long imagePkgId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getImagePkgId() {
        return imagePkgId;
    }

    public void setImagePkgId(Long imagePkgId) {
        this.imagePkgId = imagePkgId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", url=").append(url);
        sb.append(", imagePkgId=").append(imagePkgId);
        sb.append("]");
        return sb.toString();
    }
}