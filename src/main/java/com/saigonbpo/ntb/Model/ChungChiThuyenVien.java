package com.saigonbpo.ntb.Model;

import java.util.Date;

public class ChungChiThuyenVien {
    private Integer id;

    private Integer thuyenvienid;

    private Integer tenchungchival;

    private String so;

    private Date tungay;

    private Date denngay;

    private Date ngaytao;

    private Integer nguoitaoid;

    private Date ngaycapnhat;

    private Integer nguoicapnhatid;

    private Integer hinhscan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getThuyenvienid() {
        return thuyenvienid;
    }

    public void setThuyenvienid(Integer thuyenvienid) {
        this.thuyenvienid = thuyenvienid;
    }

    public Integer getTenchungchival() {
        return tenchungchival;
    }

    public void setTenchungchival(Integer tenchungchival) {
        this.tenchungchival = tenchungchival;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public Date getTungay() {
        return tungay;
    }

    public void setTungay(Date tungay) {
        this.tungay = tungay;
    }

    public Date getDenngay() {
        return denngay;
    }

    public void setDenngay(Date denngay) {
        this.denngay = denngay;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public Integer getNguoitaoid() {
        return nguoitaoid;
    }

    public void setNguoitaoid(Integer nguoitaoid) {
        this.nguoitaoid = nguoitaoid;
    }

    public Date getNgaycapnhat() {
        return ngaycapnhat;
    }

    public void setNgaycapnhat(Date ngaycapnhat) {
        this.ngaycapnhat = ngaycapnhat;
    }

    public Integer getNguoicapnhatid() {
        return nguoicapnhatid;
    }

    public void setNguoicapnhatid(Integer nguoicapnhatid) {
        this.nguoicapnhatid = nguoicapnhatid;
    }

    public Integer getHinhscan() {
        return hinhscan;
    }

    public void setHinhscan(Integer hinhscan) {
        this.hinhscan = hinhscan;
    }
}