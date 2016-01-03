package com.xyxy.platform.modules.entity.showcase;

import java.io.Serializable;

/**
 * 用户
 */
public class ShowCaseUser implements Serializable {
    private Long id;

    private String name;

    private Long idCardId;

    /**
     * 生成后新增的
     */
    private ShowCaseIdCard showCaseIdCard;

    private Long imagePkgId;

    /**
     * 生成后新增的
     */
    private ShowCaseImagePkg showCaseImagePkg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getIdCardId() {
        return idCardId;
    }

    public void setIdCardId(Long idCardId) {
        this.idCardId = idCardId;
    }

    public Long getImagePkgId() {
        return imagePkgId;
    }

    public void setImagePkgId(Long imagePkgId) {
        this.imagePkgId = imagePkgId;
    }

    public ShowCaseIdCard getShowCaseIdCard() {
        return showCaseIdCard;
    }

    public void setShowCaseIdCard(ShowCaseIdCard showCaseIdCard) {
        this.showCaseIdCard = showCaseIdCard;
    }


    public ShowCaseImagePkg getShowCaseImagePkg() {
        return showCaseImagePkg;
    }

    public void setShowCaseImagePkg(ShowCaseImagePkg showCaseImagePkg) {
        this.showCaseImagePkg = showCaseImagePkg;
    }

    @Override
    public String toString() {
        return "ShowCaseUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idCardId=" + idCardId +
                ", showCaseIdCard=" + showCaseIdCard +
                ", imagePkgId=" + imagePkgId +
                ", showCaseImagePkg=" + showCaseImagePkg +
                '}';
    }
}