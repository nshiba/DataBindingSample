package net.nshiba.databindingsample

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter(value = ["app:visibleFromLike", "app:visibleFromLikeMax"], requireAll = false)
fun View.setVisibleFromLike(likes: Int?, max: Int?) {
    visibility = if (likes ?: 0 < 4) {
        View.GONE
    } else {
        View.VISIBLE
    }
}
