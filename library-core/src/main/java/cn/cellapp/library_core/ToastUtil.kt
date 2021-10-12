package cn.cellapp.library_core

import android.content.Context
import android.widget.Toast

class ToastUtil {
    fun showMsg(context: Context) {
        Toast.makeText(context, "测试", Toast.LENGTH_SHORT).show()
    }
}