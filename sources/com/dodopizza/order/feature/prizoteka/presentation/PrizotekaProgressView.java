package com.dodopizza.order.feature.prizoteka.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PrizotekaProgressView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0004B\u001d\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0014\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006 "}, d2 = {"Lcom/dodopizza/order/feature/prizoteka/presentation/PrizotekaProgressView;", "Landroid/widget/LinearLayout;", "", "b", "a", "Landroid/view/View;", "child", "", "position", c.a, "", "Ljk8;", "levels", DateTokenConverter.CONVERTER_KEY, "", "value", e.a, "Ljava/util/List;", "F", "currentValue", "", "[F", "startCorners", "middleCorners", "endCorners", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "f", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PrizotekaProgressView extends LinearLayout {
    public static final a f = new a(null);
    public static final int g = 8;
    private List<jk8> a;
    private float b;
    private float[] c;
    private float[] d;
    private float[] e;

    /* compiled from: PrizotekaProgressView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/dodopizza/order/feature/prizoteka/presentation/PrizotekaProgressView$a;", "", "", "FIRST", "I", "MARGIN_4", "", "RADIUS_14", "F", "RADIUS_2", "RADIUS_4", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PrizotekaProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        List<jk8> l;
        l = kc1.l();
        this.a = l;
        this.c = new float[]{54.0f, 54.0f, 14.0f, 14.0f, 14.0f, 14.0f, 54.0f, 54.0f};
        this.d = new float[]{7.0f, 7.0f, 7.0f, 7.0f, 7.0f, 7.0f, 7.0f, 7.0f};
        this.e = new float[]{14.0f, 14.0f, 54.0f, 54.0f, 54.0f, 54.0f, 14.0f, 14.0f};
        setOrientation(0);
    }

    private final void a() {
        int n;
        removeAllViewsInLayout();
        setWeightSum(this.a.size() - 1);
        n = kc1.n(this.a);
        for (int i = 0; i < n; i++) {
            View view = new View(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            if (i > 0) {
                layoutParams.leftMargin = jx9.a.a(4);
            }
            c(view, i);
            view.setLayoutParams(layoutParams);
            addView(view);
        }
        requestLayout();
        invalidate();
    }

    private final void b() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            z65.g(childAt, "getChildAt(...)");
            c(childAt, i);
        }
        invalidate();
    }

    private final void c(View view, int i) {
        int n;
        Context context = getContext();
        z65.g(context, "getContext(...)");
        kk8 kk8Var = new kk8(context);
        kk8Var.t((float) this.a.get(i).b());
        kk8Var.s((float) this.a.get(i + 1).b());
        kk8Var.r(this.b);
        boolean z = false;
        if (i != 0) {
            n = kc1.n(this.a);
            if (i == n - 1) {
                kk8Var.p(iu1.c(getContext(), ew8.prizoteka_color3));
                kk8Var.o(iu1.c(getContext(), ew8.prizoteka_color4));
                kk8Var.n(this.e);
                kk8Var.q(this.d);
                if (this.b >= kk8Var.j()) {
                    z = true;
                }
                kk8Var.u(z);
            } else {
                kk8Var.p(iu1.c(getContext(), ew8.prizoteka_color2));
                kk8Var.o(iu1.c(getContext(), ew8.prizoteka_color3));
                kk8Var.n(this.d);
                kk8Var.q(this.d);
                if (this.b >= kk8Var.j() && this.b < this.a.get(i + 2).b()) {
                    z = true;
                }
                kk8Var.u(z);
            }
        } else {
            kk8Var.p(iu1.c(getContext(), ew8.prizoteka_color1));
            kk8Var.o(iu1.c(getContext(), ew8.prizoteka_color2));
            kk8Var.n(this.c);
            kk8Var.q(this.c);
            if (this.b >= kk8Var.j() && this.b < this.a.get(i + 2).b()) {
                z = true;
            }
            kk8Var.u(z);
        }
        view.setBackground(kk8Var);
    }

    public final void d(List<jk8> list) {
        z65.h(list, "levels");
        if (!z65.c(this.a, list)) {
            this.a = list;
            a();
        }
    }

    public final void e(float f2) {
        this.b = f2;
        b();
    }
}
