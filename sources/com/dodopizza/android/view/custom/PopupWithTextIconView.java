package com.dodopizza.android.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PopupWithTextIconView.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/dodopizza/android/view/custom/PopupWithTextIconView;", "Lcn3;", "", "text", "", "setText", "Landroid/widget/TextView;", c.a, "Landroid/widget/TextView;", "textView", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PopupWithTextIconView extends cn3 {
    private final TextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupWithTextIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        View inflate = LayoutInflater.from(getContext()).inflate(sz8.popup_text_content, (ViewGroup) null);
        z65.e(inflate);
        d(inflate);
        View findViewById = inflate.findViewById(vx8.p);
        z65.g(findViewById, "findViewById(...)");
        this.c = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(vx8.i);
        z65.g(findViewById2, "findViewById(...)");
        oma.a(findViewById2, new b(this));
    }

    public final void setText(String str) {
        z65.h(str, "text");
        this.c.setText(str);
        l(true);
    }
}
