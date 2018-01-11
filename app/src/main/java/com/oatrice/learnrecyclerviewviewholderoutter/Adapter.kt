package com.oatrice.learnrecyclerviewviewholderoutter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.oatrice.learnrecyclerviewviewholderoutter.Model
import com.oatrice.learnrecyclerviewviewholderoutter.R
import com.oatrice.learnrecyclerviewviewholderoutter.Type_A
import com.oatrice.learnrecyclerviewviewholderoutter.Type_B
import com.oatrice.learnrecyclerviewviewholderoutter.viewholder.ViewHolderA
import com.oatrice.learnrecyclerviewviewholderoutter.viewholder.ViewHolderB

/**
 * Created by aniru on 09-Jan-18.
 */
class Adapter(var context: Context, var dataList: ArrayList<Model>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun getItemViewType(position: Int): Int {
        return dataList[position].type
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {

        if (viewType == Type_A) {
            val view = LayoutInflater.from(parent?.context).inflate(R.layout.view_a, parent, false)
            return ViewHolderA(view)

        } else if (viewType == Type_B) {
            val view = LayoutInflater.from(parent?.context).inflate(R.layout.view_b, parent, false)
            return ViewHolderA(view)

        }

        throw IllegalStateException("View type is not correct.")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if (holder is ViewHolderA) {
            holder.bind(dataList[position], {
                //doing something
                Toast.makeText(context, "View type: A, position:$position", Toast.LENGTH_SHORT).show()
            })
        } else if (holder is ViewHolderB) {
            holder.bind(dataList[position], {
                //doing something
                Toast.makeText(context, "View type: B, position:$position", Toast.LENGTH_SHORT).show()
            })
        }

    }
}