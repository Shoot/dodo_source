package com.inappstory.sdk.stories.ui.views.goodswidget;

import java.util.ArrayList;
/* loaded from: classes3.dex */
public interface GetGoodsDataCallback {
    void itemClick(String str);

    void onClose();

    void onError();

    void onSuccess(ArrayList<GoodsItemData> arrayList);
}
