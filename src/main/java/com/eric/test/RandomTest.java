package com.eric.test;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.TreeSet;

/**
 * @author liuBing
 */
public class RandomTest {

    public static void main(String[] args) {
        /*for (int i = 0 ; i <5;i++){
            System.out.println(RandomStringUtils.randomAlphanumeric(8));
        }

        for (int i = 0 ; i <5;i++){
            System.out.println(RandomStringUtils.randomPrint(8));
        }

        for (int i = 0 ; i <5;i++){
            System.out.println(RandomStringUtils.randomNumeric(6));
        }*/


        TreeSet<String> treeSet = new TreeSet<>();
        System.out.println(treeSet.size());
        while (treeSet.size() < 20){
            treeSet.add(RandomStringUtils.randomNumeric(6));
        }
        System.out.println(treeSet.size());
        System.out.println(IdWorker.getId());
    }
}
