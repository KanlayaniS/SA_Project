package com.cp.marketbooking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Area_detail")

public class AreaDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Area_ID")
    private int Area_id;

    @Column(name="Area_Mark")
    private String Area_mark;

    @Column(name="Area_Desc")
    private String AreaDesc;

    @Column(name="Area_Type")
    private String Area_Type;

    @Column(name="Status")
    private String status;

    public int getArea_id() {
        return this.Area_id;
    }

    public void setArea_id(int Area_id) {
        this.Area_id = Area_id;
    }

    public String getArea_mark() {
        return this.Area_mark;
    }

    public void setArea_mark(String Area_mark) {
        this.Area_mark = Area_mark;
    }

    public String getAreaDesc() {
        return this.AreaDesc;
    }

    public void setAreaDesc(String AreaDesc) {
        this.AreaDesc = AreaDesc;
    }

    public AreaDetail() {

    }

    public AreaDetail(int area_id, String area_mark, String areaDesc, String area_Type, String status) {
        Area_id = area_id;
        Area_mark = area_mark;
        AreaDesc = areaDesc;
        Area_Type = area_Type;
        this.status = status;
    }

    
    

}
