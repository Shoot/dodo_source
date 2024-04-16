package com.inappstory.sdk.stories.ui.views.goodswidget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.views.goodswidget.GoodsWidget;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class GoodsWidgetAdapter extends RecyclerView.h<GoodsWidgetItem> {
    GetGoodsDataCallback callback;
    GoodsWidget.GoodsWidgetConfig config;
    ArrayList<GoodsItemData> items;

    public GoodsWidgetAdapter(ArrayList<GoodsItemData> arrayList, GoodsWidget.GoodsWidgetConfig goodsWidgetConfig, GetGoodsDataCallback getGoodsDataCallback) {
        ArrayList<GoodsItemData> arrayList2 = new ArrayList<>();
        this.items = arrayList2;
        this.callback = getGoodsDataCallback;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.config = goodsWidgetConfig;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i) {
        return i;
    }

    public void onItemClick(GoodsItemData goodsItemData) {
        if (goodsItemData != null && this.config != null && StatisticManager.getInstance() != null) {
            StatisticManager statisticManager = StatisticManager.getInstance();
            GoodsWidget.GoodsWidgetConfig goodsWidgetConfig = this.config;
            statisticManager.sendGoodsClick(goodsWidgetConfig.storyId, goodsWidgetConfig.slideIndex, goodsWidgetConfig.widgetId, goodsItemData.sku, goodsWidgetConfig.feedId);
        }
    }

    public void setItems(ArrayList<GoodsItemData> arrayList) {
        if (arrayList != null) {
            this.items.clear();
            this.items.addAll(arrayList);
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NonNull GoodsWidgetItem goodsWidgetItem, int i) {
        goodsWidgetItem.bind(this.items.get(i), this.callback);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    public GoodsWidgetItem onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ICustomGoodsItem item = AppearanceManager.getCommonInstance().csCustomGoodsWidget().getItem();
        if (item != null) {
            return new GoodsWidgetItem(item, this, viewGroup.getContext());
        }
        return new GoodsWidgetItem(new SimpleCustomGoodsItem(), this, viewGroup.getContext());
    }
}
