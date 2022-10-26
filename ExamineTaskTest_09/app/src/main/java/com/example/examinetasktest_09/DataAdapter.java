package com.example.examinetasktest_09;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHoder> {

    private List<Data.DataBean.DatasBean> datasBeans = new ArrayList<>();
    private Context context;


    public DataAdapter(List<Data.DataBean.DatasBean> datasBeans, Context context) {
        this.datasBeans = datasBeans;
        this.context = context;
    }


    static class MyViewHoder extends RecyclerView.ViewHolder{
        TextView title;
        TextView time;

        public MyViewHoder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.text_view1);
            time = itemView.findViewById(R.id.text_view2);
        }

    }



    @NonNull
    @Override
    public MyViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        final MyViewHoder myViewHoder = new MyViewHoder(view);
        return myViewHoder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHoder holder, final int position) {
        Data.DataBean.DatasBean data = datasBeans.get(position);
        holder.title.setText(data.getTitle());
        holder.time.setText(data.getNiceDate());

        if (mOnItemClickListener != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    mOnItemClickListener.onItemClick(view,holder.getLayoutPosition());
                    Intent intent = new Intent();
                    intent.addCategory("com.example.examinetasktest_09.MY_CATEGORY");
                    context.startActivity(intent);
                }
            });
        }
    }

    public interface OnItemClickListener{
        void onItemClick(View view,int position);

    }

    private OnItemClickListener mOnItemClickListener;

    public void setmOnItemClickListener(OnItemClickListener mOnItemClickListener){
        this.mOnItemClickListener = mOnItemClickListener;
    }


    @Override
    public int getItemCount() {
        return datasBeans.size();
    }
}
