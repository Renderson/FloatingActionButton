package com.br.renderson.floatingactionbutton.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.br.renderson.floatingactionbutton.R;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by renderson.silva on 28/02/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.View_Holder> {

    List list = Collections.emptyList();
    Context context;

    public RecyclerViewAdapter(List list, Context context){
        this.list = list;
        this.context = context;
    }

    @Override
    public RecyclerViewAdapter.View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        View_Holder holder = new View_Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.View_Holder holder, int position) {
        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }

    public class View_Holder extends RecyclerView.ViewHolder {
        View_Holder(View itemView) {
            super(itemView);
        }
    }
}
