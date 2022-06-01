package com.dpf.in.spring.ioc.overview.domain;

import com.dpf.in.spring.ioc.overview.annotation.Super;

/**
 * @author Pikachues
 * Created 2022/6/1
 */
@Super
public class SuperUser extends User{
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "address='" + address + '\'' +
                "} " + super.toString();
    }
}
