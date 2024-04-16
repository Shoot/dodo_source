package com.inappstory.sdk.stories.ui.views.goodswidget;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.inappstory.sdk.AppearanceManager;
/* loaded from: classes3.dex */
public class GoodsWidgetItem extends RecyclerView.d0 {
    GoodsWidgetAdapter adapter;
    ICustomGoodsItem customGoodsItem;
    GoodsItemData data;

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        final /* synthetic */ GetGoodsDataCallback a;

        a(GetGoodsDataCallback getGoodsDataCallback) {
            this.a = getGoodsDataCallback;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AppearanceManager.getCommonInstance().csCustomGoodsWidget().onItemClick(GoodsWidgetItem.this.data, this.a);
            GoodsWidgetItem goodsWidgetItem = GoodsWidgetItem.this;
            GoodsWidgetAdapter goodsWidgetAdapter = goodsWidgetItem.adapter;
            if (goodsWidgetAdapter != null) {
                goodsWidgetAdapter.onItemClick(goodsWidgetItem.data);
            }
        }
    }

    public GoodsWidgetItem(ICustomGoodsItem iCustomGoodsItem, GoodsWidgetAdapter goodsWidgetAdapter, Context context) {
        super(iCustomGoodsItem.getView(context));
        this.customGoodsItem = iCustomGoodsItem;
        this.adapter = goodsWidgetAdapter;
    }

    public void bind(GoodsItemData goodsItemData, GetGoodsDataCallback getGoodsDataCallback) {
        this.data = goodsItemData;
        this.itemView.setOnClickListener(new a(getGoodsDataCallback));
        ICustomGoodsItem iCustomGoodsItem = this.customGoodsItem;
        if (iCustomGoodsItem != null) {
            iCustomGoodsItem.bindView(this.itemView, goodsItemData);
        }
    }
}
