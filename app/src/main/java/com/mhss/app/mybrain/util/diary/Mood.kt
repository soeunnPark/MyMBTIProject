package com.mhss.app.mybrain.util.diary

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.Color
import com.mhss.app.mybrain.R
import com.mhss.app.mybrain.ui.theme.*

enum class Mood(@DrawableRes val icon: Int, val color: Color, @StringRes val title: Int, val value: Int) {
    AWESOME(R.drawable.ic_very_happy, Green, R.string.ESTP, 5),
    GOOD(R.drawable.ic_time, Blue, R.string.INTJ, 4),
    OKAY(R.drawable.ic_happy, Purple, R.string.ESFJ, 3),
    BAD(R.drawable.ic_sad, Orange, R.string.INFP, 2),
    TERRIBLE(R.drawable.ic_sad, Color.Red, R.string.ENFP, 1)
}