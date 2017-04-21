package com.example.akshay_20.assignment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;

import java.util.List;

public class DetailsAdapter2 extends RecyclerView.Adapter<DetailsAdapter2.MyViewHolder> {
    private Context mContext;
    private List<Details> detailList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        EditText desc;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            desc = (EditText) view.findViewById(R.id.desc);
            thumbnail = (ImageView) view.findViewById(R.id.img);


        }
    }

    public DetailsAdapter2(Context mContext, List<Details> detailList) {
        this.mContext = mContext;
        this.detailList = detailList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.detail_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Details album = detailList.get(position);
        holder.title.setText(album.getTitle());
        holder.desc.setText(album.getDesc());
        Glide.with(mContext).load(album.getThumbnail()).into(holder.thumbnail);

    }

    @Override
    public int getItemCount() {
        return detailList.size();
    }
}
