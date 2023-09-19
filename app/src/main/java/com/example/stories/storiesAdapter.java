package com.example.stories;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class storiesAdapter extends RecyclerView.Adapter<storiesAdapter.storyViewHolder> {
            List<sroriesDataClass>items;
            storiesAdapter(List<sroriesDataClass>items){
                this.items=items;
            }

    @NonNull
    @Override
    public storyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(
                parent.getContext()
        ).inflate(R.layout.stories_layout,parent,false);
        storyViewHolder viewHolder =new storyViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull storyViewHolder holder, int position) {
        sroriesDataClass item = items.get(position);
        holder.storyImage.setImageResource(item.storyimage);
        holder.profImage.setImageResource(item.profImage);
    }

    @Override
    public int getItemCount() {
        return items==null? 0 : items.size();
    }

    class storyViewHolder extends RecyclerView.ViewHolder{
        ImageView profImage;
        ImageView storyImage;

        public storyViewHolder(@NonNull View itemView) {
            super(itemView);
            profImage = itemView.findViewById(R.id.profimage);
            storyImage = itemView.findViewById(R.id.storyimage);
        }
    }


}
