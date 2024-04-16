package com.inappstory.sdk.stories.ui.views.goodswidget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.inappstory.sdk.R;
import com.inappstory.sdk.stories.utils.Sizes;
import im.threads.ui.fragments.ChatFragment;
/* loaded from: classes3.dex */
public class GoodsWidgetAppearanceAdapter implements IGoodsWidgetAppearance {
    public Context context;

    @Override // com.inappstory.sdk.stories.ui.views.goodswidget.IGoodsWidgetAppearance
    public int getBackgroundColor() {
        return -1;
    }

    @Override // com.inappstory.sdk.stories.ui.views.goodswidget.IGoodsWidgetAppearance
    public int getBackgroundHeight() {
        return Sizes.dpToPxExt(ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY, this.context);
    }

    @Override // com.inappstory.sdk.stories.ui.views.goodswidget.IGoodsWidgetAppearance
    public int getCloseButtonColor() {
        return Color.parseColor("#737373");
    }

    @Override // com.inappstory.sdk.stories.ui.views.goodswidget.IGoodsWidgetAppearance
    public Drawable getCloseButtonImage() {
        Context context = this.context;
        if (context != null) {
            return context.getResources().getDrawable(R.drawable.cs_swipe_down_arrow);
        }
        return null;
    }

    @Override // com.inappstory.sdk.stories.ui.views.goodswidget.IGoodsWidgetAppearance
    public int getDimColor() {
        return Color.parseColor("#50000000");
    }
}
