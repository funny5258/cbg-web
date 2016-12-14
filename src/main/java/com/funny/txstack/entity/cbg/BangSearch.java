package com.funny.txstack.entity.cbg;

import com.funny.txstack.common.PageCondition;

/**
 * Created by fangli@autohome.com.cn on 2016/11/16.
 */
public class BangSearch extends PageCondition{
    private Integer school;
    private Integer level;

    public Integer getSchool() {
        return school;
    }

    public void setSchool(Integer school) {
        this.school = school;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
