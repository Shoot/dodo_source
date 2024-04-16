package com.inappstory.sdk.stories.ui.views.goodswidget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.R;
import com.inappstory.sdk.imageloader.ImageLoader;
import com.inappstory.sdk.imageloader.RoundedCornerLayout;
import com.inappstory.sdk.stories.utils.Sizes;
/* loaded from: classes3.dex */
public class SimpleCustomGoodsItem implements ICustomGoodsItem {
    private Integer goodsCellImageCornerRadius;
    private int goodsCellImageBackgroundColor = 0;
    private int goodsCellMainTextColor = -16777216;
    private int goodsCellOldPriceTextColor = Color.parseColor("#CCCCCC");
    private Integer goodsCellTitleSize = null;
    private Integer goodsCellDescriptionSize = null;
    private Integer goodsCellPriceSize = null;
    private Integer goodsCellOldPriceSize = null;

    private void setTextFieldParameters(int i, int i2, Integer num, int i3, View view) {
        float f;
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(i);
        appCompatTextView.setTextColor(i2);
        if (num != null) {
            f = num.intValue();
        } else {
            f = i3;
        }
        appCompatTextView.setTextSize(0, f);
    }

    private void setTypeface(AppCompatTextView appCompatTextView, boolean z, boolean z2, boolean z3) {
        int i;
        Typeface font = AppearanceManager.getCommonInstance().getFont(z3, z, z2);
        if (z2) {
            i = 2;
        } else {
            i = 0;
        }
        if (font == null) {
            font = appCompatTextView.getTypeface();
        }
        appCompatTextView.setTypeface(font, (z ? 1 : 0) + i);
    }

    @Override // com.inappstory.sdk.stories.ui.views.goodswidget.ICustomGoodsItem
    public void bindView(View view, GoodsItemData goodsItemData) {
        if (goodsItemData.description != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.description);
            appCompatTextView.setText(goodsItemData.description);
            setTypeface(appCompatTextView, false, false, false);
        }
        if (goodsItemData.title != null) {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.title);
            appCompatTextView2.setText(goodsItemData.title);
            setTypeface(appCompatTextView2, true, false, false);
        }
        if (goodsItemData.price != null) {
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) view.findViewById(R.id.price);
            appCompatTextView3.setText(goodsItemData.price);
            setTypeface(appCompatTextView3, true, false, false);
        }
        if (goodsItemData.oldPrice != null) {
            AppCompatTextView appCompatTextView4 = (AppCompatTextView) view.findViewById(R.id.oldPrice);
            appCompatTextView4.setText(goodsItemData.oldPrice);
            setTypeface(appCompatTextView4, true, false, false);
            appCompatTextView4.setPaintFlags(appCompatTextView4.getPaintFlags() | 16);
        }
        String str = goodsItemData.image;
        if (str != null && URLUtil.isNetworkUrl(str)) {
            if (InAppStoryService.getInstance() != null) {
                ImageLoader.getInstance().displayImage(goodsItemData.image, -1, (AppCompatImageView) view.findViewById(R.id.image), InAppStoryService.getInstance().getCommonCache());
                return;
            }
            return;
        }
        ((AppCompatImageView) view.findViewById(R.id.image)).setBackgroundColor(this.goodsCellImageBackgroundColor);
    }

    public SimpleCustomGoodsItem csGoodsCellDescriptionSize(int i) {
        this.goodsCellDescriptionSize = Integer.valueOf(i);
        return this;
    }

    public SimpleCustomGoodsItem csGoodsCellImageBackgroundColor(int i) {
        this.goodsCellImageBackgroundColor = i;
        return this;
    }

    public SimpleCustomGoodsItem csGoodsCellImageCornerRadius(int i) {
        this.goodsCellImageCornerRadius = Integer.valueOf(i);
        return this;
    }

    public SimpleCustomGoodsItem csGoodsCellMainTextColor(int i) {
        this.goodsCellMainTextColor = i;
        return this;
    }

    public SimpleCustomGoodsItem csGoodsCellOldPriceSize(int i) {
        this.goodsCellOldPriceSize = Integer.valueOf(i);
        return this;
    }

    public SimpleCustomGoodsItem csGoodsCellOldPriceTextColor(int i) {
        this.goodsCellOldPriceTextColor = i;
        return this;
    }

    public SimpleCustomGoodsItem csGoodsCellPriceSize(int i) {
        this.goodsCellPriceSize = Integer.valueOf(i);
        return this;
    }

    public SimpleCustomGoodsItem csGoodsCellTitleSize(int i) {
        this.goodsCellTitleSize = Integer.valueOf(i);
        return this;
    }

    @Override // com.inappstory.sdk.stories.ui.views.goodswidget.ICustomGoodsItem
    @NonNull
    public View getView(Context context) {
        int dpToPxExt;
        View inflate = LayoutInflater.from(context).inflate(R.layout.cs_goods_default_item, (ViewGroup) null, false);
        RoundedCornerLayout roundedCornerLayout = (RoundedCornerLayout) inflate.findViewById(R.id.item_cv);
        Integer num = this.goodsCellImageCornerRadius;
        if (num != null) {
            dpToPxExt = num.intValue();
        } else {
            dpToPxExt = Sizes.dpToPxExt(8, context);
        }
        roundedCornerLayout.setRadius(dpToPxExt);
        setTextFieldParameters(R.id.title, this.goodsCellMainTextColor, this.goodsCellTitleSize, Sizes.dpToPxExt(14, context), inflate);
        setTextFieldParameters(R.id.description, this.goodsCellMainTextColor, this.goodsCellDescriptionSize, Sizes.dpToPxExt(12, context), inflate);
        setTextFieldParameters(R.id.price, this.goodsCellMainTextColor, this.goodsCellPriceSize, Sizes.dpToPxExt(14, context), inflate);
        setTextFieldParameters(R.id.oldPrice, this.goodsCellOldPriceTextColor, this.goodsCellOldPriceSize, Sizes.dpToPxExt(14, context), inflate);
        return inflate;
    }
}
