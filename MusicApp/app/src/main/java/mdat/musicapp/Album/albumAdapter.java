package mdat.musicapp.Album;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import mdat.musicapp.R;

public class albumAdapter extends RecyclerView.Adapter<albumAdapter.albumViewHolder>{
    private List<album> mAlbums;
    public void setData(List<album> list){
        this.mAlbums = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public albumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_album, parent, false);
        return new albumViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull albumViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        if(mAlbums != null)
            return mAlbums.size();
        return 0;
    }

    public class albumViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgAlbum;
        private TextView txtContent;
        public albumViewHolder(@NonNull View itemView) {
            super(itemView);

            imgAlbum = itemView.findViewById(R.id.img_album);
            txtContent = itemView.findViewById(R.id.tv_content);
        }
    }
}
