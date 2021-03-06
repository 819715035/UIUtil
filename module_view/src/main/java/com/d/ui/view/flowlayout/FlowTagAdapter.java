package com.d.ui.view.flowlayout;

import android.content.Context;
import android.view.View;

import com.d.lib.common.component.lv.CommonHolder;
import com.d.lib.ui.view.flowlayout.FlowLayoutAdapter;
import com.d.ui.view.R;

import java.util.List;

/**
 * FlowTagAdapter
 * Created by D on 2018/10/23.
 **/
class FlowTagAdapter extends FlowLayoutAdapter<FlowBean> {
    private OnClickListener onClickListener;

    FlowTagAdapter(Context context, List<FlowBean> datas, int layoutId) {
        super(context, datas, layoutId);
    }

    @Override
    public void convert(int position, CommonHolder holder, final FlowBean item) {
        holder.setText(R.id.tv_tag, item.tag);
        holder.getConvertView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onClickListener != null) {
                    onClickListener.onClick(v, item.tag);
                }
            }
        });
    }

    public interface OnClickListener {
        void onClick(View v, String tag);
    }

    public void setOnClickListener(OnClickListener l) {
        this.onClickListener = l;
    }
}
