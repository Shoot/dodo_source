package com.dodopizza.android.chip;

import android.view.View;
import android.widget.CompoundButton;
import com.dodopizza.android.chip.CheckableChipViewHolder;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.google.android.material.chip.Chip;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: CheckableChipViewHolder.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\u000b\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/android/chip/CheckableChipViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "title", "", "setTitle", "", "isChecked", "setChecked", "Lkotlin/Function1;", "listener", "setCheckedListener", "Lcom/google/android/material/chip/Chip;", "chip", "Lcom/google/android/material/chip/Chip;", "Lkzb;", "viewInflater", "", "viewLayoutId", "<init>", "(Lkzb;I)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class CheckableChipViewHolder extends SelfInflatingViewHolder {
    private final Chip chip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckableChipViewHolder(kzb kzbVar, int i) {
        super(kzbVar, i);
        z65.h(kzbVar, "viewInflater");
        View view = this.itemView;
        z65.f(view, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
        this.chip = (Chip) view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCheckedListener$lambda$0(Function1 function1, CompoundButton compoundButton, boolean z) {
        Boolean bool;
        z65.h(function1, "$listener");
        Object tag = compoundButton.getTag();
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        if (!((Boolean) mh5.c(bool, Boolean.FALSE)).booleanValue()) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    public final void setChecked(boolean z) {
        this.chip.setTag(Boolean.TRUE);
        this.chip.setChecked(z);
        this.chip.setTag(Boolean.FALSE);
    }

    public final void setCheckedListener(final Function1<? super Boolean, Unit> function1) {
        z65.h(function1, "listener");
        this.chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: q31
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CheckableChipViewHolder.setCheckedListener$lambda$0(Function1.this, compoundButton, z);
            }
        });
    }

    public final void setTitle(String str) {
        z65.h(str, "title");
        this.chip.setText(str);
    }
}
