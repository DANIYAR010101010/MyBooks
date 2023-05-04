package com.example.mybooks.ui.audio

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.mybooks.databinding.ItemAudioBinding
import com.example.mybooks.databinding.ItemBooksBinding
import com.example.mybooks.ui.main.BooksAdapter

class AudioAdapter(private var list: List<Int>) :
    RecyclerView.Adapter<AudioAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        return BooksViewHolder(
            ItemAudioBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        val books: Int = list[position]
        holder.imageView.setImageResource(books)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class BooksViewHolder(binding: ItemAudioBinding) : RecyclerView.ViewHolder(binding.root) {
        val imageView: ImageView = binding.ivLarge
    }
}