package ilapin.common.android.kotlin

import android.view.View

/**
 * @author Игорь on 14.01.2020.
 */

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun View.invisible() {
    visibility = View.GONE
}

fun View.setVisible(isVisible: Boolean) {
    if (isVisible) {
        visible()
    } else {
        gone()
    }
}