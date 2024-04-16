package com.inappstory.sdk.ugc.list;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.R;
import com.inappstory.sdk.imageloader.RoundedCornerLayout;
import com.inappstory.sdk.stories.ui.list.BaseStoryListItem;
import com.inappstory.sdk.stories.ui.list.ClickCallback;
import com.inappstory.sdk.stories.ui.list.UGCListItemSimpleAppearance;
import com.inappstory.sdk.stories.utils.Sizes;
/* loaded from: classes3.dex */
public class UGCListItem extends BaseStoryListItem {
    public UGCListItem(@NonNull View view, AppearanceManager appearanceManager) {
        super(view, appearanceManager, false, true);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.baseLayout);
        viewGroup.removeAllViews();
        viewGroup.addView(getDefaultUGCCell());
    }

    private int getNonNullValue(Integer num, int i) {
        if (num != null) {
            return num.intValue();
        }
        return i;
    }

    protected View getDefaultUGCCell() {
        IStoriesListUGCItem iStoriesListUGCItem = this.getUGCListItem;
        if (iStoriesListUGCItem != null && iStoriesListUGCItem.getView() != null) {
            return this.getUGCListItem.getView();
        }
        View inflate = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.cs_story_list_inner_ugc, (ViewGroup) null, false);
        RoundedCornerLayout roundedCornerLayout = (RoundedCornerLayout) inflate.findViewById(R.id.inner_cv);
        roundedCornerLayout.setRadius(Math.max(this.manager.csListItemRadius(this.itemView.getContext()) - Sizes.dpToPxExt(4, this.itemView.getContext()), 0));
        roundedCornerLayout.setBackgroundColor(0);
        View findViewById = inflate.findViewById(R.id.outerLayout);
        if (this.manager.getRealHeight(this.itemView.getContext()) != null) {
            findViewById.getLayoutParams().height = this.manager.getRealHeight(this.itemView.getContext()).intValue();
        }
        if (this.manager.getRealWidth(this.itemView.getContext()) != null) {
            findViewById.getLayoutParams().width = this.manager.getRealWidth(this.itemView.getContext()).intValue();
        }
        UGCListItemSimpleAppearance csUGCListItemSimpleAppearance = this.manager.csUGCListItemSimpleAppearance();
        if (csUGCListItemSimpleAppearance != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.image);
            View findViewById2 = inflate.findViewById(R.id.background);
            int nonNullValue = getNonNullValue(csUGCListItemSimpleAppearance.csBackgroundColor(), Color.parseColor("#0C62F3"));
            int nonNullValue2 = getNonNullValue(csUGCListItemSimpleAppearance.csIconId(), R.drawable.ic_new_ugc);
            int nonNullValue3 = getNonNullValue(csUGCListItemSimpleAppearance.csIconMargin(), Sizes.dpToPxExt(16, this.itemView.getContext()));
            appCompatImageView.setImageDrawable(this.itemView.getContext().getResources().getDrawable(nonNullValue2));
            ((RelativeLayout.LayoutParams) appCompatImageView.getLayoutParams()).setMargins(nonNullValue3, nonNullValue3, nonNullValue3, nonNullValue3);
            findViewById2.setBackgroundColor(nonNullValue);
            if (csUGCListItemSimpleAppearance.csIconColor() != null) {
                appCompatImageView.setColorFilter(csUGCListItemSimpleAppearance.csIconColor().intValue());
            }
            appCompatImageView.requestLayout();
        }
        return inflate;
    }

    @Override // com.inappstory.sdk.stories.ui.list.BaseStoryListItem
    public void bindFavorite() {
    }

    @Override // com.inappstory.sdk.stories.ui.list.BaseStoryListItem
    public void bindUGC() {
    }

    @Override // com.inappstory.sdk.stories.ui.list.BaseStoryListItem
    public void bind(Integer num, String str, Integer num2, String str2, String str3, Integer num3, boolean z, boolean z2, String str4, ClickCallback clickCallback) {
    }
}
