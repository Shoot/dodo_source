package com.inappstory.sdk.stories.ui.list;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.stories.ui.views.IGetFavoriteListItem;
import com.inappstory.sdk.stories.ui.views.IStoriesListItem;
import com.inappstory.sdk.stories.utils.Sizes;
import com.inappstory.sdk.ugc.list.IStoriesListUGCItem;
/* loaded from: classes3.dex */
public abstract class BaseStoryListItem extends RecyclerView.d0 {
    public Integer backgroundColor;
    public ClickCallback callback;
    protected IGetFavoriteListItem getFavoriteListItem;
    protected IStoriesListItem getListItem;
    protected IStoriesListUGCItem getUGCListItem;
    public boolean isFavorite;
    public boolean isUGC;
    protected AppearanceManager manager;
    protected AppCompatTextView title;

    public BaseStoryListItem(@NonNull View view, AppearanceManager appearanceManager, boolean z, boolean z2) {
        super(view);
        this.manager = appearanceManager;
        this.isFavorite = z;
        this.isUGC = z2;
        this.getFavoriteListItem = appearanceManager.csFavoriteListItemInterface();
        this.getListItem = appearanceManager.csListItemInterface();
        this.getUGCListItem = appearanceManager.csListUGCItemInterface();
        Context context = view.getContext();
        if (appearanceManager.csListItemMargin(context) >= 0) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            qVar.setMargins(Sizes.dpToPxExt(appearanceManager.csListItemMargin(context) / 2, context), 0, Sizes.dpToPxExt(appearanceManager.csListItemMargin(context) / 2, context), 0);
            view.setLayoutParams(qVar);
        }
    }

    public abstract void bind(Integer num, String str, Integer num2, String str2, String str3, Integer num3, boolean z, boolean z2, String str4, ClickCallback clickCallback);

    public abstract void bindFavorite();

    public abstract void bindUGC();
}
