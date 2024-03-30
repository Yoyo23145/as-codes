package com.example.newapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ImageButtonAdapter extends RecyclerView.Adapter<ImageButtonAdapter.ImageButtonViewHolder> {

    private List<Integer> imageButtonList;
    private Context context;

    public ImageButtonAdapter(Context context, List<Integer> imageButtonList) {
        this.context = context;
        this.imageButtonList = imageButtonList;
    }

    public static class ImageButtonViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageButton;

        public ImageButtonViewHolder(View itemView) {
            super(itemView);
            imageButton = itemView.findViewById(R.id.imageButton);
        }
    }

    @NonNull
    @Override
    public ImageButtonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image_button, parent, false);
        return new ImageButtonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageButtonViewHolder holder, int position) {
        holder.imageButton.setImageResource(imageButtonList.get(position));
    }

    @Override
    public int getItemCount() {
        return imageButtonList.size();
    }
}
