package com.dodopizza.order.feature.assistant.mood.presentation;

import android.widget.CompoundButton;
import android.widget.RadioButton;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.order.feature.assistant.mood.presentation.AssistantMoodViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: AssistantMoodViewHolder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/dodopizza/order/feature/assistant/mood/presentation/AssistantMoodViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", Action.NAME_ATTRIBUTE, "", "setName", "", "selected", "setSelected", "Lkotlin/Function0;", "onSelected", "setOnSelectedListener", "Landroid/widget/RadioButton;", "selector$delegate", "Lk79;", "getSelector", "()Landroid/widget/RadioButton;", "selector", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AssistantMoodViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(AssistantMoodViewHolder.class, "selector", "getSelector()Landroid/widget/RadioButton;", 0))};
    public static final int $stable = 8;
    private final k79 selector$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantMoodViewHolder(kzb kzbVar) {
        super(kzbVar, gz8.item_assistant_mood);
        z65.h(kzbVar, "viewInflater");
        this.selector$delegate = kb0.g(this, gy8.mood);
    }

    private final RadioButton getSelector() {
        return (RadioButton) this.selector$delegate.a(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnSelectedListener$lambda$0(Function0 function0, CompoundButton compoundButton, boolean z) {
        z65.h(function0, "$onSelected");
        if (z) {
            function0.invoke();
        }
    }

    public final void setName(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        getSelector().setText(str);
    }

    public final void setOnSelectedListener(final Function0<Unit> function0) {
        z65.h(function0, "onSelected");
        getSelector().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: zu
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AssistantMoodViewHolder.setOnSelectedListener$lambda$0(Function0.this, compoundButton, z);
            }
        });
    }

    public final void setSelected(boolean z) {
        getSelector().setChecked(z);
    }
}
