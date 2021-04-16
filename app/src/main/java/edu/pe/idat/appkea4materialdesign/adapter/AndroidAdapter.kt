package edu.pe.idat.appkea4materialdesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.pe.idat.appkea4materialdesign.R
import edu.pe.idat.appkea4materialdesign.model.Android

class AndroidAdapter(private var lstandroid: List<Android>,
                    private val context: Context)
    : RecyclerView.Adapter<AndroidAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivandroid = itemView.findViewById<ImageView>(R.id.ivandroid)
        val tvnomandroid = itemView.findViewById<TextView>(R.id.tvnomandroid)
        val tvversionandroid = itemView.findViewById<TextView>(R.id.tvversionandroid)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(
            R.layout.item_android, parent, false))
    }

    override fun onBindViewHolder(holder: AndroidAdapter.ViewHolder, position: Int) {
        val objandroid = lstandroid[position]
        holder.tvnomandroid.text = objandroid.nombre
        holder.tvversionandroid.text = objandroid.version
        holder.ivandroid.setImageResource(objandroid.imagen)
    }

    override fun getItemCount(): Int {
        return lstandroid.size
    }


}