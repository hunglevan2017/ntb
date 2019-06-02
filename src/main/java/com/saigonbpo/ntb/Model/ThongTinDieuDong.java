package com.saigonbpo.ntb.Model;

import java.util.Date;

public class ThongTinDieuDong {
    private Integer id;

    private Integer tauid;

    private Integer thuyenvienid;

    private Date tungay;

    private Date denngay;

    private String ghichuon;

    private String ghichuoff;

    private Date ngaytao;

    private Integer nguoitaoid;

    private Date ngaycapnhat;

    private Integer nguoicapnhatid;

    private Integer chucdanhid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTauid() {
        return tauid;
    }

    public void setTauid(Integer tauid) {
        this.tauid = tauid;
    }

    public Integer getThuyenvienid() {
        return thuyenvienid;
    }

    public void setThuyenvienid(Integer thuyenvienid) {
        this.thuyenvienid = thuyenvienid;
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

    public String getGhichuon() {
        return ghichuon;
    }

    public void setGhichuon(String ghichuon) {
        this.ghichuon = ghichuon;
    }

    public String getGhichuoff() {
        return ghichuoff;
    }

    public void setGhichuoff(String ghichuoff) {
        this.ghichuoff = ghichuoff;
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

    public Integer getChucdanhid() {
        return chucdanhid;
    }

    public void setChucdanhid(Integer chucdanhid) {
        this.chucdanhid = chucdanhid;
    }
}