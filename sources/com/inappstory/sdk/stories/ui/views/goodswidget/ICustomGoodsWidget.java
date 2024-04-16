package com.inappstory.sdk.stories.ui.views.goodswidget;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public interface ICustomGoodsWidget {
    RecyclerView.o getDecoration();

    ICustomGoodsItem getItem();

    void getSkus(ArrayList<String> arrayList, GetGoodsDataCallback getGoodsDataCallback);

    IGoodsWidgetAppearance getWidgetAppearance();

    View getWidgetView(Context context);

    void onItemClick(GoodsItemData goodsItemData, GetGoodsDataCallback getGoodsDataCallback);
}
