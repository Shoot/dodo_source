package com.inappstory.sdk.stories.ui.views.goodswidget;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
/* loaded from: classes3.dex */
public interface ICustomGoodsItem {
    void bindView(View view, GoodsItemData goodsItemData);

    @NonNull
    View getView(Context context);
}
