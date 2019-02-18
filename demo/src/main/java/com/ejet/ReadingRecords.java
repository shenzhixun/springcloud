package com.ejet;

import com.ejet.comm.db.CoDbFactory;
import com.ejet.comm.utils.io.IOUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;

/**
 * Copyright (C), 2016-2018, 武汉康华数海有限公司
 * FileName: Records
 * Author:   ShenYijie
 * CreateDate:     2018-12-22 11:15
 * Description:
 * History:
 * Version: 1.0
 */
public class ReadingRecords {

    public static void main(String[] args) {

        double[] score30 = Records.generate(30, 118, 5);
        // double[] score90 = Records.generate(90, 99, 8);
        // double[] score80 = Records.generate(80, 89, 6);
        // double[] score70 = Records.generate(70, 79, 7);
        // double[] score60 = Records.generate(60, 69, 5);
        // double[] score50 = Records.generate(50, 59, 4);
        // double[] score40 = Records.generate(40, 49, 3);
        // double[] score30 = Records.generate(30, 39, 3);
        double[] score20 = Records.generate(20, 29, 2);
        double[] score10 = Records.generate(0, 19, 3);
        //
        List scores = new ArrayList<>();
        // scores.add(score100);
        // scores.add(score90);
        // scores.add(score80);
        // scores.add(score70);
        // scores.add(score60);
        // scores.add(score50);
        // scores.add(score40);
        scores.add(score30);
        scores.add(score20);
        scores.add(score10);

        List<Double> allSocres = new ArrayList<>();
        for (Object item : scores) {
            double[] tmp = (double[])item;
            for(double t : tmp) {
                allSocres.add(Double.valueOf(t));
            }
        }
        Records.insertBatch(allSocres);

    }



}
