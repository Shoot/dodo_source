package com.dodopizza.core.feature.debugtools.toggles.presentation.adapter;

import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
/* compiled from: ToggleTitleViewHolder.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\u0003\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/dodopizza/core/feature/debugtools/toggles/presentation/adapter/ToggleTitleViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "title", "", "setTitle", "Landroid/widget/TextView;", "title$delegate", "Lk79;", "getTitle", "()Landroid/widget/TextView;", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ToggleTitleViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(ToggleTitleViewHolder.class, "title", "getTitle()Landroid/widget/TextView;", 0))};
    private final k79 title$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleTitleViewHolder(kzb kzbVar) {
        super(kzbVar, bz8.toggle_title_item);
        z65.h(kzbVar, "viewInflater");
        this.title$delegate = kb0.g(this, by8.g);
    }

    private final TextView getTitle() {
        return (TextView) this.title$delegate.a(this, $$delegatedProperties[0]);
    }

    public final void setTitle(String str) {
        z65.h(str, "title");
        getTitle().setText(str);
    }
}
