package com.ejet;

/**
 * Copyright (C), 2016-2018, 武汉康华数海有限公司
 * FileName: ScoreModel
 * Author:   ShenYijie
 * CreateDate:     2018-12-22 17:24
 * Description:
 * History:
 * Version: 1.0
 */
public class ScoreModel {
    String className;
    Double before;
    Double after;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Double getBefore() {
        return before;
    }

    public void setBefore(Double before) {
        this.before = before;
    }

    public Double getAfter() {
        return after;
    }

    public void setAfter(Double after) {
        this.after = after;
    }
}
