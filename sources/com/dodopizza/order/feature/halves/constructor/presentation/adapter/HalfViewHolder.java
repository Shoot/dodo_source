package com.dodopizza.order.feature.halves.constructor.presentation.adapter;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bumptech.glide.load.engine.GlideException;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.order.feature.halves.constructor.presentation.adapter.HalfViewHolder;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: HalfViewHolder.kt */
@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001 \b\u0007\u0018\u0000 '2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0014\u0010\u000f\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006)"}, d2 = {"Lcom/dodopizza/order/feature/halves/constructor/presentation/adapter/HalfViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "updateProgressVisibility", "", RemoteMessageConst.Notification.URL, "setImage", "", "stopped", "setStopped", "Lfka;", "gravity", "setGravity", "Lkotlin/Function0;", "listener", "setListener", "Landroid/widget/ImageView;", "imageView$delegate", "Lk79;", "getImageView", "()Landroid/widget/ImageView;", "imageView", "progress$delegate", "getProgress", "progress", "Landroid/widget/RelativeLayout;", "imageContainer$delegate", "getImageContainer", "()Landroid/widget/RelativeLayout;", "imageContainer", "glideCompleted", "Z", "com/dodopizza/order/feature/halves/constructor/presentation/adapter/HalfViewHolder$b", "glideListener", "Lcom/dodopizza/order/feature/halves/constructor/presentation/adapter/HalfViewHolder$b;", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "Companion", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class HalfViewHolder extends SelfInflatingViewHolder {
    public static final float NONE_TRANSPARENT = 1.0f;
    public static final float TRANSPARENT = 0.5f;
    private boolean glideCompleted;
    private final b glideListener;
    private final k79 imageContainer$delegate;
    private final k79 imageView$delegate;
    private final k79 progress$delegate;
    private boolean stopped;
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(HalfViewHolder.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(HalfViewHolder.class, "progress", "getProgress()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(HalfViewHolder.class, "imageContainer", "getImageContainer()Landroid/widget/RelativeLayout;", 0))};
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    /* compiled from: HalfViewHolder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/dodopizza/order/feature/halves/constructor/presentation/adapter/HalfViewHolder$a;", "", "", "NONE_TRANSPARENT", "F", "TRANSPARENT", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: HalfViewHolder.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J8\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J2\u0010\u000e\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"com/dodopizza/order/feature/halves/constructor/presentation/adapter/HalfViewHolder$b", "Lvi9;", "Landroid/graphics/drawable/Drawable;", "resource", "", "model", "Ln6b;", "target", "Ldl2;", "dataSource", "", "isFirstResource", "a", "Lcom/bumptech/glide/load/engine/GlideException;", e.a, "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b implements vi9<Drawable> {
        b() {
        }

        @Override // defpackage.vi9
        /* renamed from: a */
        public boolean f(Drawable drawable, Object obj, n6b<Drawable> n6bVar, dl2 dl2Var, boolean z) {
            z65.h(drawable, "resource");
            z65.h(obj, "model");
            z65.h(dl2Var, "dataSource");
            HalfViewHolder.this.glideCompleted = true;
            HalfViewHolder.this.updateProgressVisibility();
            return false;
        }

        @Override // defpackage.vi9
        public boolean e(GlideException glideException, Object obj, n6b<Drawable> n6bVar, boolean z) {
            z65.h(n6bVar, "target");
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HalfViewHolder(kzb kzbVar) {
        super(kzbVar, gz8.item_half_pizza);
        z65.h(kzbVar, "viewInflater");
        this.imageView$delegate = kb0.g(this, gy8.T0);
        this.progress$delegate = kb0.g(this, gy8.g3);
        this.imageContainer$delegate = kb0.g(this, gy8.image_container);
        this.glideListener = new b();
    }

    private final RelativeLayout getImageContainer() {
        return (RelativeLayout) this.imageContainer$delegate.a(this, $$delegatedProperties[2]);
    }

    private final ImageView getImageView() {
        return (ImageView) this.imageView$delegate.a(this, $$delegatedProperties[0]);
    }

    private final ImageView getProgress() {
        return (ImageView) this.progress$delegate.a(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(Function0 function0, View view) {
        z65.h(function0, "$listener");
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateProgressVisibility() {
        boolean z = this.glideCompleted;
        if (z && !this.stopped) {
            un3.e(getProgress());
            getImageView().setAlpha(1.0f);
            getProgress().setAlpha(1.0f);
        } else if (z && this.stopped) {
            un3.k(getProgress());
            getImageView().setAlpha(0.5f);
            getProgress().setAlpha(0.5f);
        }
    }

    public final void setGravity(fka fkaVar) {
        int i;
        z65.h(fkaVar, "gravity");
        int dimension = (int) this.itemView.getResources().getDimension(vw8.a);
        ViewGroup.LayoutParams layoutParams = getImageContainer().getLayoutParams();
        z65.f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        fka fkaVar2 = fka.b;
        if (fkaVar == fkaVar2) {
            layoutParams2.setMargins(-(dimension - (dimension / 16)), 0, 0, 0);
        } else {
            layoutParams2.setMargins(0, 0, -(dimension + (dimension / 16)), 0);
        }
        View view = this.itemView;
        z65.f(view, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) view;
        if (fkaVar == fkaVar2) {
            i = 8388611;
        } else {
            i = 8388613;
        }
        linearLayout.setGravity(i);
    }

    public final void setImage(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        Drawable e = iu1.e(this.itemView.getContext(), bx8.constructor_halves_placeholder);
        z65.f(e, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        AnimationDrawable animationDrawable = (AnimationDrawable) e;
        getProgress().setImageDrawable(animationDrawable);
        animationDrawable.start();
        com.bumptech.glide.b.t(this.itemView.getContext()).t(str).T0(o83.i()).J0(this.glideListener).G0(getImageView());
    }

    public final void setListener(final Function0<Unit> function0) {
        z65.h(function0, "listener");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: zj4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HalfViewHolder.setListener$lambda$1(Function0.this, view);
            }
        });
    }

    public final void setStopped(boolean z) {
        this.stopped = z;
        updateProgressVisibility();
    }
}
