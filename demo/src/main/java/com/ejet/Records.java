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
public class Records {

    private static final Random rand = new Random();

    public static double[] get100() {
        final int POPULATION_SIZE = 50;
        double[] population = DoubleStream.generate(()->{
            int min = 90;
            int max = 99;
            return rand.nextInt((max - min) + 1) + min;
        }).limit(POPULATION_SIZE).toArray();
        return population;
    }

    public static double[] get90() {
        final int POPULATION_SIZE = 50;
        double[] population = DoubleStream.generate(()->{
            int min = 90;
            int max = 99;
            return rand.nextInt((max - min) + 1) + min;
        }).limit(POPULATION_SIZE).toArray();
        return population;
    }

    public static double[] get80() {
        final int POPULATION_SIZE = 50;
        double[] population = DoubleStream.generate(()->{
            int min = 90;
            int max = 99;
            return rand.nextInt((max - min) + 1) + min;
        }).limit(POPULATION_SIZE).toArray();
        return population;
    }

    public static double[] get70() {
        final int POPULATION_SIZE = 50;
        double[] population = DoubleStream.generate(()->{
            int min = 90;
            int max = 99;
            return rand.nextInt((max - min) + 1) + min;
        }).limit(POPULATION_SIZE).toArray();
        return population;
    }

    public static double[] get60() {
        final int POPULATION_SIZE = 50;
        double[] population = DoubleStream.generate(()->{
            int min = 90;
            int max = 99;
            return rand.nextInt((max - min) + 1) + min;
        }).limit(POPULATION_SIZE).toArray();
        return population;
    }

    public static double[] get50() {
        final int POPULATION_SIZE = 50;
        double[] population = DoubleStream.generate(()->{
            int min = 90;
            int max = 99;
            return rand.nextInt((max - min) + 1) + min;
        }).limit(POPULATION_SIZE).toArray();
        return population;
    }

    public static double[] get40() {
        final int POPULATION_SIZE = 50;
        double[] population = DoubleStream.generate(()->{
            int min = 90;
            int max = 99;
            return rand.nextInt((max - min) + 1) + min;
        }).limit(POPULATION_SIZE).toArray();
        return population;
    }

    public static double[] get30() {
        final int POPULATION_SIZE = 50;
        double[] population = DoubleStream.generate(()->{
            int min = 90;
            int max = 99;
            return rand.nextInt((max - min) + 1) + min;
        }).limit(POPULATION_SIZE).toArray();
        return population;
    }

    public static double[] generate(int min, int max, int size) {
        double[] population = DoubleStream.generate(()->{
            return rand.nextInt((max - min) + 1) + min;
        }).limit(size).toArray();
        return population;
    }


    public static double generateAfter(int org, int before, int after) {
        int min = org - before;
        int max = org + after;
        return rand.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {

        double[] score100 = generate(100, 118, 5);
        double[] score90 = generate(90, 99, 8);
        double[] score80 = generate(80, 89, 6);
        double[] score70 = generate(70, 79, 7);
        double[] score60 = generate(60, 69, 5);
        double[] score50 = generate(50, 59, 4);
        double[] score40 = generate(40, 49, 3);
        double[] score30 = generate(30, 39, 3);
        double[] score20 = generate(20, 29, 2);
        double[] score10 = generate(0, 19, 3);
        //
        // int length = score100.length + score90.length + score80.length + score70.length;
        // length+= score60.length + score50.length + score40.length + score30.length;

        List scores = new ArrayList<>();
        scores.add(score100);
        scores.add(score90);
        scores.add(score80);
        scores.add(score70);
        scores.add(score60);
        scores.add(score50);
        scores.add(score40);
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

        // Double[] allSocres = new Double[scores.size()];
        // for(int i = 0; i < allSocres.length; i++) {
        //     allSocres[i] = scores.get(i)
        // }

        // Double[][] allSocres = new Double[scores.size()][3];
        // for(int i = 0; i < allSocres.length; i++) { //遍历二维数组，遍历出来的每一个元素是一个一维数组
        //     for (int j = 0; j < allSocres[i].length; j++) { //遍历对应位置上的一维数组
        //         allSocres[i][j] = scores.get(i)
        //     }
        // }

        insertBatch(allSocres);

    }


    public static void insertBatch(List<Double> scores) {
        Connection connection = CoDbFactory.getConnection("com.mysql.cj.jdbc.Driver", "jdbc:mysql://192.168.0.244:3306/data_src?serverTimezone=UTC&characterEncoding=utf8", "root", "123456");
        QueryRunner runner = new QueryRunner();
        try {

            //生成1班
            List<ScoreModel> score1 = new ArrayList<>();
            //生成2班
            List<ScoreModel> score2 = new ArrayList<>();
            for (Double item : scores) {
                ScoreModel model = new ScoreModel();
                model.setClassName("1");
                model.setBefore(item);
                model.setAfter(generateAfter(model.getBefore().intValue(), -5, 19));
                model.setAfter(model.getAfter()>=120 ? 119 : model.getAfter());
                score1.add(model);

                ScoreModel model2 = new ScoreModel();
                model2.setClassName("2");
                model2.setBefore(generateAfter(model.getBefore().intValue(), 0, 6));
                model2.setAfter(generateAfter(model2.getBefore().intValue(), 1, 5));
                model2.setAfter(model2.getAfter()>=120 ? 119 : model2.getAfter());
                score2.add(model2);
            }

            for(ScoreModel model : score1) {
                insert(connection, runner, model);
            }

            for(ScoreModel model : score2) {
                insert(connection, runner, model);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(connection);
        }
    }


    public static int insert(Connection connection, QueryRunner runner, ScoreModel user) {
        String sql="insert into scores values (?, ?, ?)";
        List<Object> list = new ArrayList<>();
        if(user!=null) {
            list.add(user.getClassName());
            list.add(user.getBefore());
            list.add(user.getAfter());
        }
        try {
            return runner.update(connection, sql, list.toArray());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return 0;
    }

}
