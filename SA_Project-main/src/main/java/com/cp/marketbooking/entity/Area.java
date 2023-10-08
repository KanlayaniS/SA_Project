package com.cp.marketbooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@Table(name = "Area")
public class Area {

    @Id
    private String Id;
    private String Area_Name;
    public Area(){

    }

    public Area(String id, String area_Type, String area_Name, String status) {
        Id = id;
        Area_Name = area_Name;

    }
    public String getId() {
        return this.Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }
    public String getArea_Name() {
        return this.Area_Name;
    }
    public void setArea_Name(String Area_Name) {
        this.Area_Name = Area_Name;
    }

}
