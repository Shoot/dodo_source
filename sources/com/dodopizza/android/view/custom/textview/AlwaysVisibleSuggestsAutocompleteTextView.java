package com.dodopizza.android.view.custom.textview;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.appcompat.widget.d;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
/* compiled from: AlwaysVisibleSuggestsAutocompleteTextView.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/android/view/custom/textview/AlwaysVisibleSuggestsAutocompleteTextView;", "Landroidx/appcompat/widget/d;", "", "enoughToFilter", "focused", "", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Landroid/graphics/Rect;", "previouslyFocusedRect", "", "onFocusChanged", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AlwaysVisibleSuggestsAutocompleteTextView extends d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlwaysVisibleSuggestsAutocompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    @Override // android.widget.AutoCompleteTextView
    public boolean enoughToFilter() {
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z && getAdapter() != null) {
            showDropDown();
        }
    }
}
