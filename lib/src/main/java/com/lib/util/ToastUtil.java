package com.lib.util;

import android.widget.Toast;

import com.lib.app.ComContext;

/**
 * Title:
 * Description:
 * <p>
 * Created by pei
 * Date: 2018/2/9
 */
public class ToastUtil {

    /**短吐司**/
    public static void shortShow(String msg){
        if(StringUtil.isNotEmpty(msg)){
            Toast.makeText(ComContext.getInstance(),msg,Toast.LENGTH_SHORT).show();
        }
    }

    /**长吐司**/
    public static void longShow(String msg){
        if(StringUtil.isNotEmpty(msg)){
            Toast.makeText(ComContext.getInstance(),msg,Toast.LENGTH_LONG).show();
        }
    }

}
