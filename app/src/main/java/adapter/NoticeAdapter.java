package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.reubrotest.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import model.Notice;

public class NoticeAdapter extends RecyclerView.Adapter<NoticeAdapter.NoticeViewHolder> {

    public ArrayList<Notice> dataList;
    Context context;

    public NoticeAdapter(ArrayList<Notice> dataList) {
        this.dataList = dataList;
    }

    @Override
    public NoticeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.single_row_view, parent, false);
        return new NoticeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NoticeViewHolder holder, int position) {
        holder.name.setText(dataList.get(position).getCategories().getCategory_name());

        Picasso.with(holder.image.getContext()).load(dataList.get(position).getCategories().getImage()).resize(400,500).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class NoticeViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        ImageView image;


        NoticeViewHolder(View itemView) {
            super(itemView);
            name =  itemView.findViewById(R.id.name);

            image = itemView.findViewById(R.id.imageView);

        }
    }
}