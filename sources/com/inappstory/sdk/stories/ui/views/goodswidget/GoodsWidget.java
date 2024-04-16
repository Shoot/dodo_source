package com.inappstory.sdk.stories.ui.views.goodswidget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.stories.utils.Sizes;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class GoodsWidget extends RecyclerView {
    GoodsWidgetAdapter adapter;
    GoodsWidgetConfig config;
    Context context;

    /* loaded from: classes3.dex */
    public static class GoodsWidgetConfig {
        public String feedId;
        public int slideIndex;
        public int storyId;
        public String widgetId;

        public GoodsWidgetConfig(String str, int i, int i2, String str2) {
            this.widgetId = str;
            this.storyId = i;
            this.feedId = str2;
            this.slideIndex = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends RecyclerView.o {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.a0 a0Var) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            rect.left = Sizes.dpToPxExt(4, GoodsWidget.this.getContext());
            rect.right = Sizes.dpToPxExt(4, GoodsWidget.this.getContext());
            if (childAdapterPosition == 0) {
                rect.left = Sizes.dpToPxExt(8, GoodsWidget.this.getContext());
            } else if (childAdapterPosition == GoodsWidget.this.adapter.getItemCount() - 1) {
                rect.right = Sizes.dpToPxExt(8, GoodsWidget.this.getContext());
            }
        }
    }

    public GoodsWidget(@NonNull Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        this.context = context;
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        if (AppearanceManager.getCommonInstance().csCustomGoodsWidget().getDecoration() != null) {
            addItemDecoration(AppearanceManager.getCommonInstance().csCustomGoodsWidget().getDecoration());
        } else {
            addItemDecoration(new a());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public GoodsWidgetAdapter getAdapter() {
        return this.adapter;
    }

    public void setConfig(GoodsWidgetConfig goodsWidgetConfig) {
        this.config = goodsWidgetConfig;
    }

    public void setItems(ArrayList<GoodsItemData> arrayList, GetGoodsDataCallback getGoodsDataCallback) {
        GoodsWidgetAdapter goodsWidgetAdapter = new GoodsWidgetAdapter(arrayList, this.config, getGoodsDataCallback);
        this.adapter = goodsWidgetAdapter;
        setAdapter(goodsWidgetAdapter);
    }

    public GoodsWidget(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public GoodsWidget(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
