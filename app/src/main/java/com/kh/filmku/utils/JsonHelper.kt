package com.kh.filmku.utils

import android.content.Context
import java.io.IOException

class JsonHelper(private val context: Context) {
    companion object{
        val TAG = JsonHelper::class.java.simpleName
    }

    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)

        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }
}