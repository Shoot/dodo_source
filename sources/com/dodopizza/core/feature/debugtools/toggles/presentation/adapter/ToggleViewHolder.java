package com.dodopizza.core.feature.debugtools.toggles.presentation.adapter;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.core.feature.debugtools.toggles.presentation.adapter.ToggleViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: ToggleViewHolder.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\u000b\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\tJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/dodopizza/core/feature/debugtools/toggles/presentation/adapter/ToggleViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "isChecked", "", "setIsChecked", "", "title", "setTitle", "Lkotlin/Function1;", "listener", "setOnCheckedChangedListener", "isHighlighted", "setHighlighted", "Landroid/widget/TextView;", "nameView$delegate", "Lk79;", "getNameView", "()Landroid/widget/TextView;", "nameView", "Landroidx/appcompat/widget/SwitchCompat;", "toggleView$delegate", "getToggleView", "()Landroidx/appcompat/widget/SwitchCompat;", "toggleView", "Lkotlin/jvm/functions/Function1;", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ToggleViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(ToggleViewHolder.class, "nameView", "getNameView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ToggleViewHolder.class, "toggleView", "getToggleView()Landroidx/appcompat/widget/SwitchCompat;", 0))};
    private Function1<? super Boolean, Unit> listener;
    private final k79 nameView$delegate;
    private final k79 toggleView$delegate;

    /* compiled from: ToggleViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<Boolean, Unit> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final void invoke(boolean z) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleViewHolder(kzb kzbVar) {
        super(kzbVar, bz8.toggle_item);
        z65.h(kzbVar, "viewInflater");
        this.nameView$delegate = kb0.g(this, by8.c);
        this.toggleView$delegate = kb0.g(this, by8.toggle);
        this.listener = a.a;
    }

    private final TextView getNameView() {
        return (TextView) this.nameView$delegate.a(this, $$delegatedProperties[0]);
    }

    private final SwitchCompat getToggleView() {
        return (SwitchCompat) this.toggleView$delegate.a(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setIsChecked$lambda$0(ToggleViewHolder toggleViewHolder, CompoundButton compoundButton, boolean z) {
        z65.h(toggleViewHolder, "this$0");
        toggleViewHolder.listener.invoke(Boolean.valueOf(z));
    }

    public final void setHighlighted(boolean z) {
        int i;
        if (z) {
            i = mw8.b;
        } else {
            i = mw8.a;
        }
        View view = this.itemView;
        view.setBackgroundColor(iu1.c(view.getContext(), i));
    }

    public final void setIsChecked(boolean z) {
        getToggleView().setOnCheckedChangeListener(null);
        getToggleView().setChecked(z);
        getToggleView().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cib
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                ToggleViewHolder.setIsChecked$lambda$0(ToggleViewHolder.this, compoundButton, z2);
            }
        });
    }

    public final void setOnCheckedChangedListener(Function1<? super Boolean, Unit> function1) {
        z65.h(function1, "listener");
        this.listener = function1;
    }

    public final void setTitle(String str) {
        z65.h(str, "title");
        getNameView().setText(str);
    }
}
