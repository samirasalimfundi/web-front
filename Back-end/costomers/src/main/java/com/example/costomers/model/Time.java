package com.example.costomers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Time {
    @Id
    @GeneratedValue
    private int Kilimanjaro4;
    private int Kilimanjaro5;
    private int Kilimanjaro6;


    public int getKilimanjaro4() {
        return Kilimanjaro4;
    }

    public void setKilimanjaro4(int Kilimanjaro4) {
        this.Kilimanjaro4= Kilimanjaro4;
    }

    public int getKilimanjaro5() {
        return Kilimanjaro5;
    }

    public void setKilimanjaro5(int Kilimanjaro5) {
        this.Kilimanjaro5=Kilimanjaro5;
    }

    public int getKilimanjaro6() {
        return Kilimanjaro6;
    }

    public void setKilimanjaro6(int Kilimanjaro5) {
        Kilimanjaro6=Kilimanjaro6;
    }

}



