package com.xjx.mvp.base;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public abstract class BaseAdapter<B> extends RecyclerView.Adapter {

    private Context mContext;
    private List<B> mList;
    public OnItemClickListener mOnItemClickListener;

    public abstract int getHolderLayout();

    public abstract void bindHolder(BaseAdapter.BaseViewHolder holder, B b);

    public BaseAdapter(Context context, List<B> list) {
        this.mContext = context;
        this.mList = list;
    }

    public interface OnItemClickListener {

        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder mViewHolder;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        if (viewType == 0) {
            mViewHolder = new EmptyHolder(inflater.inflate(getHolderLayout(), parent, false));
        } else {
            mViewHolder = new BaseViewHolder(inflater.inflate(getHolderLayout(), parent, false));
        }
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (mList.size() != 0) {
            BaseAdapter.BaseViewHolder baseViewHolder = (BaseViewHolder) holder;
            B b = mList.get(position);
            bindHolder(baseViewHolder, b);

            baseViewHolder.itemView.setOnClickListener(v -> {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(position);
                }
            });
        }
    }


    @Override
    public int getItemCount() {
        if (mList.size() == 0) {
            return 1;
        } else {
            return mList.size();
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (mList.size() == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    /**
     * 封装 ViewHolder
     */
    public class BaseViewHolder extends RecyclerView.ViewHolder {

        // item 中的控件缓存在这里
        private SparseArray<View> views;

        public BaseViewHolder(View itemView) {
            super(itemView);
            views = new SparseArray<>();
        }

        /**
         * 获取 itemView 中的控件
         *
         * @param id
         * @return
         */
        public View getView(int id) {
            View view = views.get(id);
            if (view == null) {
                view = itemView.findViewById(id);
                views.put(id, view);
            }
            return view;
        }
    }

    public class EmptyHolder extends RecyclerView.ViewHolder {
        public EmptyHolder(View view) {
            super(view);
        }
    }
}
