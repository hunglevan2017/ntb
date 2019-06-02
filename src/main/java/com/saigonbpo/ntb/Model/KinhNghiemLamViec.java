package com.saigonbpo.ntb.Model;

import java.util.Date;

public class KinhNghiemLamViec {
    private Integer id;

    private String tentau;

    private Integer loaitau;

    private String tencongty;

    private Date tungay;

    private Date denngay;

    private String ghichu;

    private String chucdanh;

    private Integer thuyenvienid;

    private Integer mycompany;

    private String trongtai;

    private String congsuatmay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTentau() {
        return tentau;
    }

    public void setTentau(String tentau) {
        this.tentau = tentau;
    }

    public Integer getLoaitau() {
        return loaitau;
    }

    public void setLoaitau(Integer loaitau) {
        this.loaitau = loaitau;
    }

    public String getTencongty() {
        return tencongty;
    }

    public void setTencongty(String tencongty) {
        this.tencongty = tencongty;
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

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getChucdanh() {
        return chucdanh;
    }

    public void setChucdanh(String chucdanh) {
        this.chucdanh = chucdanh;
    }

    public Integer getThuyenvienid() {
        return thuyenvienid;
    }

    public void setThuyenvienid(Integer thuyenvienid) {
        this.thuyenvienid = thuyenvienid;
    }

    public Integer getMycompany() {
        return mycompany;
    }

    public void setMycompany(Integer mycompany) {
        this.mycompany = mycompany;
    }

    public String getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(String trongtai) {
        this.trongtai = trongtai;
    }

    public String getCongsuatmay() {
        return congsuatmay;
    }

    public void setCongsuatmay(String congsuatmay) {
        this.congsuatmay = congsuatmay;
    }
}