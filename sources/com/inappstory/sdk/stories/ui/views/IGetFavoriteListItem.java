package com.inappstory.sdk.stories.ui.views;

import android.view.View;
import java.util.List;
/* loaded from: classes3.dex */
public interface IGetFavoriteListItem {
    void bindFavoriteItem(View view, List<Integer> list, int i);

    View getFavoriteItem();

    void setImages(View view, List<String> list, List<Integer> list2, int i);
}
