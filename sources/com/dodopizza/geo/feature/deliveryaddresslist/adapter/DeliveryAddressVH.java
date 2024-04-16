package com.dodopizza.geo.feature.deliveryaddresslist.adapter;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.geo.feature.deliveryaddresslist.adapter.DeliveryAddressVH;
import defpackage.sf8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: DeliveryAddressVH.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007J\u0014\u0010\n\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0004R\u001b\u0010\u0003\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\u001b\u0010\u001e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/adapter/DeliveryAddressVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "addressName", "", "showAddressName", "hideAddressName", "Lkotlin/Function0;", "listener", "setOnRemovePressedListener", "setOnEditPressedListener", "text", "setAddressText", "showCommentText", "hideCommentText", "Landroid/widget/TextView;", "addressName$delegate", "Lk79;", "getAddressName", "()Landroid/widget/TextView;", "Landroid/widget/RelativeLayout;", "addressNameContainer$delegate", "getAddressNameContainer", "()Landroid/widget/RelativeLayout;", "addressNameContainer", "addressText$delegate", "getAddressText", "addressText", "commentText$delegate", "getCommentText", "commentText", "Landroid/widget/ImageButton;", "editButton$delegate", "getEditButton", "()Landroid/widget/ImageButton;", "editButton", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DeliveryAddressVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(DeliveryAddressVH.class, "addressName", "getAddressName()Landroid/widget/TextView;", 0)), bc9.f(new ar8(DeliveryAddressVH.class, "addressNameContainer", "getAddressNameContainer()Landroid/widget/RelativeLayout;", 0)), bc9.f(new ar8(DeliveryAddressVH.class, "addressText", "getAddressText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(DeliveryAddressVH.class, "commentText", "getCommentText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(DeliveryAddressVH.class, "editButton", "getEditButton()Landroid/widget/ImageButton;", 0))};
    private final k79 addressName$delegate;
    private final k79 addressNameContainer$delegate;
    private final k79 addressText$delegate;
    private final k79 commentText$delegate;
    private final k79 editButton$delegate;

    /* compiled from: DeliveryAddressVH.kt */
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

    /* compiled from: DeliveryAddressVH.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "b", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Unit> function0) {
            super(1);
            this.b = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c(Function0 function0, MenuItem menuItem) {
            z65.h(function0, "$listener");
            z65.h(menuItem, "item");
            if (menuItem.getItemId() == dy8.remove) {
                function0.invoke();
                return false;
            }
            return false;
        }

        public final void b(View view) {
            z65.h(view, "it");
            sf8 sf8Var = new sf8(DeliveryAddressVH.this.itemView.getContext(), DeliveryAddressVH.this.getEditButton());
            sf8Var.b(yz8.address_delivery_menu);
            final Function0<Unit> function0 = this.b;
            sf8Var.c(new sf8.c() { // from class: com.dodopizza.geo.feature.deliveryaddresslist.adapter.a
                @Override // defpackage.sf8.c
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean c;
                    c = DeliveryAddressVH.b.c(Function0.this, menuItem);
                    return c;
                }
            });
            sf8Var.d();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            b(view);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryAddressVH(kzb kzbVar) {
        super(kzbVar, dz8.address_delivery_item);
        z65.h(kzbVar, "viewInflater");
        this.addressName$delegate = kb0.g(this, dy8.address_delivery_place_label);
        this.addressNameContainer$delegate = kb0.g(this, dy8.address_delivery_place_label_container);
        this.addressText$delegate = kb0.g(this, dy8.address_delivery_address_text);
        this.commentText$delegate = kb0.g(this, dy8.address_delivery_comment_label);
        this.editButton$delegate = kb0.g(this, dy8.address_delivery_edit_button);
    }

    private final TextView getAddressName() {
        return (TextView) this.addressName$delegate.a(this, $$delegatedProperties[0]);
    }

    private final RelativeLayout getAddressNameContainer() {
        return (RelativeLayout) this.addressNameContainer$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getAddressText() {
        return (TextView) this.addressText$delegate.a(this, $$delegatedProperties[2]);
    }

    private final TextView getCommentText() {
        return (TextView) this.commentText$delegate.a(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageButton getEditButton() {
        return (ImageButton) this.editButton$delegate.a(this, $$delegatedProperties[4]);
    }

    public final void hideAddressName() {
        un3.e(getAddressNameContainer());
    }

    public final void hideCommentText() {
        un3.e(getCommentText());
    }

    public final void setAddressText(String str) {
        z65.h(str, "text");
        getAddressText().setText(str);
    }

    public final void setOnEditPressedListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new a(function0));
    }

    public final void setOnRemovePressedListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        oma.a(getEditButton(), new b(function0));
    }

    public final void showAddressName(String str) {
        z65.h(str, "addressName");
        getAddressName().setText(str);
        un3.k(getAddressNameContainer());
    }

    public final void showCommentText(String str) {
        z65.h(str, "text");
        getCommentText().setText(str);
        un3.k(getCommentText());
    }
}
