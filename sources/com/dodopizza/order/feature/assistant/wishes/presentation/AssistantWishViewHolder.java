package com.dodopizza.order.feature.assistant.wishes.presentation;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.order.feature.assistant.wishes.presentation.AssistantWishViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: AssistantWishViewHolder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\"\u0010\f\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\tR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/dodopizza/order/feature/assistant/wishes/presentation/AssistantWishViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", Action.NAME_ATTRIBUTE, "", "setName", "", "selected", "setSelected", "Lkotlin/Function0;", "onSelected", "onUnselected", "setSelectListeners", "Landroidx/appcompat/widget/SwitchCompat;", "wish$delegate", "Lk79;", "getWish", "()Landroidx/appcompat/widget/SwitchCompat;", "wish", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AssistantWishViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(AssistantWishViewHolder.class, "wish", "getWish()Landroidx/appcompat/widget/SwitchCompat;", 0))};
    public static final int $stable = 8;
    private final k79 wish$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantWishViewHolder(kzb kzbVar) {
        super(kzbVar, gz8.item_assistant_wish);
        z65.h(kzbVar, "viewInflater");
        this.wish$delegate = kb0.g(this, gy8.wish);
    }

    private final SwitchCompat getWish() {
        return (SwitchCompat) this.wish$delegate.a(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSelectListeners$lambda$0(Function0 function0, Function0 function02, CompoundButton compoundButton, boolean z) {
        z65.h(function0, "$onSelected");
        z65.h(function02, "$onUnselected");
        if (z) {
            function0.invoke();
        } else {
            function02.invoke();
        }
    }

    public final void setName(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        getWish().setText(str);
    }

    public final void setSelectListeners(final Function0<Unit> function0, final Function0<Unit> function02) {
        z65.h(function0, "onSelected");
        z65.h(function02, "onUnselected");
        getWish().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cx
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AssistantWishViewHolder.setSelectListeners$lambda$0(Function0.this, function02, compoundButton, z);
            }
        });
    }

    public final void setSelected(boolean z) {
        getWish().setChecked(z);
    }
}
