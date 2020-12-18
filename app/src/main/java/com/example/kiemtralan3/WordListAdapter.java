package com.example.kiemtralan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    LinkedList<TuVung> lst_word;
    LayoutInflater inflater;
    Context context;
    private int limit=100;

    public WordListAdapter(LinkedList<TuVung> lst_word, Context context) {
        this.lst_word = lst_word;
        this.context = context;
        inflater= LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= inflater.inflate(R.layout.wordlist_item, parent, false);
        return new WordViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {

        TuVung word= lst_word.get(position);
        holder.tvTu.setText(word.getWord());
        holder.tvDinhNghia.setText(word.getDefinition());
        Picasso.get().load(word.getImage()).into(holder.imageView);
    }


    @Override
    public int getItemCount() {
        return lst_word.size();
    }

    public class WordViewHolder extends RecyclerView.ViewHolder {
        WordListAdapter adapter;
        TextView tvTu, tvDinhNghia;
        ImageView imageView;
        public WordViewHolder(@NonNull View itemView,WordListAdapter wordListAdapter) {
            super(itemView);

            tvTu= itemView.findViewById(R.id.tvTu);
            tvDinhNghia= itemView.findViewById(R.id.tvDinhNghia);
            imageView= itemView.findViewById(R.id.imageView);

            adapter= wordListAdapter;
        }
    }
}