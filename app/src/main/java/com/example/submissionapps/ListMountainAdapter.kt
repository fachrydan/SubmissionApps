package com.example.submissionapps

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMountainAdapter(private val listMountain: ArrayList<Gunung>) : RecyclerView.Adapter<ListMountainAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_mountain, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val mountain = listMountain[position]
        Glide.with(holder.itemView.context)
                .load(mountain.photo)
                .apply(RequestOptions().override(620, 400))
                .into(holder.imgPhoto)

        holder.tvName.text = mountain.name
        holder.tvDetail.text = mountain.location

        holder.btnLihatDetail.setOnClickListener {
            val context= holder.btnLihatDetail.context
            val mountainDetailActivity= Intent(context, DetailGunung::class.java)
            mountainDetailActivity.putExtra(DetailGunung.DATA_NAMA, mountain.name)
            mountainDetailActivity.putExtra(DetailGunung.DATA_LOKASI, mountain.location)
            mountainDetailActivity.putExtra(DetailGunung.DATA_GAMBAR, mountain.photo)
            context.startActivity(mountainDetailActivity)
        }
    }

    override fun getItemCount(): Int {
        return listMountain.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvName: TextView = itemView.findViewById(R.id.tv_nama_gunung)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_lokasi_gunung)
        var imgPhoto: ImageView = itemView.findViewById(R.id.foto_gunung)
        var btnLihatDetail: Button = itemView.findViewById(R.id.btn_lihat_detail)
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Gunung)
    }

}