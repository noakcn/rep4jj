package com.jj.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yewangwang on 2016/5/10.
 */
public class DateUtils {

    private static SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
    public static String format(int geshi,Date date){
        String dateStr=null;
        if(date==null)return null;
        switch (geshi){
            case 1:dateStr=sdf1.format(date);
                break;
        }
        return dateStr;
    }
}
