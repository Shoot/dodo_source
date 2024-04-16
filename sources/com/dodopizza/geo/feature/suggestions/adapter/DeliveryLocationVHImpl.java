package com.dodopizza.geo.feature.suggestions.adapter;

import android.view.View;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: DeliveryLocationVH.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0016\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\"\u0010 \u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"¨\u0006+"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/adapter/DeliveryLocationVHImpl;", "Loz2;", "Lve0;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "title", "", "setAddress", "subTitle", "setSubtitle", "text", "setDistanceToUser", "", "isShouldBeVisible", "setDistanceToUserVisibility", "hideSubtitle", "showSubtitle", "Lkotlin/Function0;", "listener", "setOnClickListener", "Landroid/widget/TextView;", "localityTitle$delegate", "Lk79;", "getLocalityTitle", "()Landroid/widget/TextView;", "localityTitle", "localitySubtitle$delegate", "getLocalitySubtitle", "localitySubtitle", "distanceToUser$delegate", "getDistanceToUser", "distanceToUser", "isLastTop", "Z", "()Z", "setLastTop", "(Z)V", "getHasBottomMargin", "hasBottomMargin", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DeliveryLocationVHImpl extends SelfInflatingViewHolder implements oz2, ve0 {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(DeliveryLocationVHImpl.class, "localityTitle", "getLocalityTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(DeliveryLocationVHImpl.class, "localitySubtitle", "getLocalitySubtitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(DeliveryLocationVHImpl.class, "distanceToUser", "getDistanceToUser()Landroid/widget/TextView;", 0))};
    private final k79 distanceToUser$delegate;
    private boolean isLastTop;
    private final k79 localitySubtitle$delegate;
    private final k79 localityTitle$delegate;

    /* compiled from: DeliveryLocationVH.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(1);
            this.a = function0;
        }

        public final void a(View view) {
            z65.h(view, "it");
            this.a.invoke();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryLocationVHImpl(kzb kzbVar) {
        super(kzbVar, dz8.item_address_list);
        z65.h(kzbVar, "viewInflater");
        this.localityTitle$delegate = kb0.g(this, dy8.delivery_location_title);
        this.localitySubtitle$delegate = kb0.g(this, dy8.delivery_location_subtitle);
        this.distanceToUser$delegate = kb0.g(this, dy8.distance_to_user);
    }

    private final TextView getDistanceToUser() {
        return (TextView) this.distanceToUser$delegate.a(this, $$delegatedProperties[2]);
    }

    private final TextView getLocalitySubtitle() {
        return (TextView) this.localitySubtitle$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getLocalityTitle() {
        return (TextView) this.localityTitle$delegate.a(this, $$delegatedProperties[0]);
    }

    @Override // defpackage.ve0
    public boolean getHasBottomMargin() {
        return isLastTop();
    }

    @Override // defpackage.oz2
    public void hideSubtitle() {
        un3.e(getLocalitySubtitle());
    }

    public boolean isLastTop() {
        return this.isLastTop;
    }

    @Override // defpackage.oz2
    public void setAddress(String str) {
        z65.h(str, "title");
        getLocalityTitle().setText(str);
    }

    @Override // defpackage.oz2
    public void setDistanceToUser(String str) {
        z65.h(str, "text");
        getDistanceToUser().setText(str);
    }

    @Override // defpackage.oz2
    public void setDistanceToUserVisibility(boolean z) {
        un3.o(getDistanceToUser(), z);
    }

    public void setLastTop(boolean z) {
        this.isLastTop = z;
    }

    @Override // defpackage.oz2
    public void setOnClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new a(function0));
    }

    @Override // defpackage.oz2
    public void setSubtitle(String str) {
        z65.h(str, "subTitle");
        getLocalitySubtitle().setText(str);
    }

    @Override // defpackage.oz2
    public void showSubtitle() {
        un3.k(getLocalitySubtitle());
    }
}
