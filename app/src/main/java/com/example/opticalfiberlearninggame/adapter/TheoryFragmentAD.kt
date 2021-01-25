package com.example.opticalfiberlearninggame.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.opticalfiberlearninggame.R
import com.example.opticalfiberlearninggame.fragment.TheoryFR
import com.example.opticalfiberlearninggame.model.Topic

class TheoryFragmentAD(val listener: TheoryFR.TheoryFragmentListener?) : RecyclerView.Adapter<TheoryFragmentAD.ViewHolder>() {

    var topics = emptyList<Topic>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view), View.OnClickListener {
        val tvTitle : TextView = view.findViewById(R.id.tv_title)

        init {
            view.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val  topic = topics[adapterPosition]
            listener?.onTheoryItemClicked(topic.tid, topic.title)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.general_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvTitle.text = topics.get(position).title
    }

    override fun getItemCount(): Int {
        return topics.size
    }
}
