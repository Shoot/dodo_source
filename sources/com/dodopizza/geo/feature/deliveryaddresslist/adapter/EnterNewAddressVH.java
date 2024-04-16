package com.dodopizza.geo.feature.deliveryaddresslist.adapter;

import android.view.View;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.geo.feature.deliveryaddresslist.adapter.EnterNewAddressVH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: EnterNewAddressVH.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\n"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/adapter/EnterNewAddressVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Lkotlin/Function0;", "", "listener", "setListener", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EnterNewAddressVH extends SelfInflatingViewHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterNewAddressVH(kzb kzbVar) {
        super(kzbVar, dz8.enter_address_item);
        z65.h(kzbVar, "viewInflater");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(Function0 function0, View view) {
        z65.h(function0, "$listener");
        function0.invoke();
    }

    public final void setListener(final Function0<Unit> function0) {
        z65.h(function0, "listener");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: ui3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterNewAddressVH.setListener$lambda$0(Function0.this, view);
            }
        });
    }
}
