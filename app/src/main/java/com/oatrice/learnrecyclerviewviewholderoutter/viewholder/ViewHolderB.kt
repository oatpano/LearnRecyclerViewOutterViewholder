package com.oatrice.learnrecyclerviewviewholderoutter.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import com.oatrice.learnrecyclerviewviewholderoutter.Model
import kotlinx.android.synthetic.main.view_b.view.*

/**
 * Created by aniru on 09-Jan-18.
 */
class ViewHolderB(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(data: Model, listener: () -> Unit) = with(itemView) {
        tvA.text = data.text
    }

}