package com.github.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

/**
 * 作者: 赵虔
 * 时间: 2017/10/17
 * 类作用:
 */

public class DialogUtils {
    public static void showMyDiaLog(final Context context, String title, String message) {
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "点击了确定按钮", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "点击了取消按钮", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }

    public static void showIconDiaLog(final Context context, String title, String message) {
        new AlertDialog.Builder(context)
                .setIcon(R.mipmap.logo)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "点击了确定按钮", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "点击了取消按钮", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }

    public static void tipDiaLog(final Context context, final String title, String message) {
        new AlertDialog.Builder(context)
                .setIcon(R.mipmap.tip)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("领取", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "恭喜" + title + "明天到你家", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("不要", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "不要拉倒", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
}
