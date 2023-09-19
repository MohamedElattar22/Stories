package com.example.stories;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class postsAdapter extends RecyclerView.Adapter<postsAdapter.postViewHolder> {

    List<postData>items;
    postsAdapter(List<postData>items){
        this.items=items;
    }
    @NonNull
    @Override
    public postViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(
                parent.getContext()
        ).inflate(R.layout.post_layout,parent,false);
        postViewHolder viewHolder = new postViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull postViewHolder holder, int position) {
        postData item = items.get(position);
        holder.acc_name.setText(item.acc_name);
        holder.POST_Cont.setText(item.POST_Cont);
        holder.post_img.setImageResource(item.post_img);
        holder.fol_num.setText(item.fol_num);
        holder.acc_img.setImageResource(item.acc_img);
    }

    @Override
    public int getItemCount() {
        return items==null? 0 : items.size();
    }

    class postViewHolder extends RecyclerView.ViewHolder {
        TextView acc_name;
        TextView fol_num;
        TextView POST_Cont;
        ImageView acc_img;
        ImageView post_img;
        public postViewHolder(View itemView){
            super(itemView);
            acc_name = itemView.findViewById(R.id.account_name);
            fol_num = itemView.findViewById(R.id.followers_num);
            POST_Cont = itemView.findViewById(R.id.postContent);
            post_img=itemView.findViewById(R.id.postImg);
            acc_img = itemView.findViewById(R.id.imageView2);



        }
    }
}
