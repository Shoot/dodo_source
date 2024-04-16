package com.dodopizza.loyalty.history.adapter.footer;

import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
/* compiled from: TextFooterViewHolder.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/dodopizza/loyalty/history/adapter/footer/TextFooterViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "text", "", "setFooterText", "Landroid/widget/TextView;", "footerText$delegate", "Lk79;", "getFooterText", "()Landroid/widget/TextView;", "footerText", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class TextFooterViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(TextFooterViewHolder.class, "footerText", "getFooterText()Landroid/widget/TextView;", 0))};
    private final k79 footerText$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFooterViewHolder(kzb kzbVar) {
        super(kzbVar, ez8.item_text_footer);
        z65.h(kzbVar, "viewInflater");
        this.footerText$delegate = kb0.g(this, ey8.text_footer_message);
    }

    private final TextView getFooterText() {
        return (TextView) this.footerText$delegate.a(this, $$delegatedProperties[0]);
    }

    public final void setFooterText(String str) {
        z65.h(str, "text");
        getFooterText().setText(str);
    }
}
