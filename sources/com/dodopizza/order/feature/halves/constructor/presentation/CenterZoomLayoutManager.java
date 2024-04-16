package com.dodopizza.order.feature.halves.constructor.presentation;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CenterZoomLayoutManager.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B\u0019\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b#\u0010$J\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J(\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0018\u00010\bR\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\"\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006'"}, d2 = {"Lcom/dodopizza/order/feature/halves/constructor/presentation/CenterZoomLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "Landroid/view/View;", "child", "U2", "", "dy", "Landroidx/recyclerview/widget/RecyclerView$w;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "G1", "recyclerView", "position", "", "Q1", "Lfka;", "U4", "Lfka;", "sideHalf", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "V4", "Lorg/slf4j/Logger;", "logger", "Leq5;", "W4", "Leq5;", "getInterpolator", "()Leq5;", "interpolator", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Lfka;)V", "X4", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CenterZoomLayoutManager extends LinearLayoutManager {
    public static final a X4 = new a(null);
    public static final int Y4 = 8;
    private final fka U4;
    private final Logger V4;
    private final eq5 W4;

    /* compiled from: CenterZoomLayoutManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/dodopizza/order/feature/halves/constructor/presentation/CenterZoomLayoutManager$a;", "", "", "MILLISECONDS_PER_INCH", "F", "SHRINK_AMOUNT", "SHRINK_DISTANCE", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CenterZoomLayoutManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[fka.values().length];
            try {
                iArr[fka.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fka.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CenterZoomLayoutManager.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, d2 = {"com/dodopizza/order/feature/halves/constructor/presentation/CenterZoomLayoutManager$c", "Landroidx/recyclerview/widget/j;", "Landroid/util/DisplayMetrics;", "displayMetrics", "", "v", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class c extends j {
        c(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.j
        protected float v(DisplayMetrics displayMetrics) {
            z65.h(displayMetrics, "displayMetrics");
            return 25.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterZoomLayoutManager(Context context, fka fkaVar) {
        super(context);
        z65.h(fkaVar, "sideHalf");
        this.U4 = fkaVar;
        this.V4 = LoggerFactory.getLogger("CenterZoomLayoutManager");
        this.W4 = new eq5();
    }

    private final float U2(float f, View view) {
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            Logger logger = this.V4;
            StringBuilder sb = new StringBuilder();
            sb.append("Scale is not finite. ");
            int height = view.getHeight();
            sb.append("height=" + height + "; ");
            int Y = Y(view);
            sb.append("decoratedBottom=" + Y + "; ");
            int e0 = e0(view);
            sb.append("decoratedTop=" + e0 + "; ");
            boolean isAttachedToWindow = view.isAttachedToWindow();
            sb.append("View isAttached=" + isAttachedToWindow + "; ");
            boolean x0 = x0();
            sb.append("LayoutManager isAttached=" + x0);
            String sb2 = sb.toString();
            z65.g(sb2, "toString(...)");
            logger.warn(sb2);
        }
        return f;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int G1(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        float g;
        int i2;
        if (v2() != 1 || g0() == 0) {
            return 0;
        }
        int G1 = super.G1(i, wVar, a0Var);
        float g0 = g0() / 2.0f;
        float f = 0.8f * g0;
        int T = T();
        for (int i3 = 0; i3 < T; i3++) {
            View S = S(i3);
            if (S != null) {
                g = i.g(f, Math.abs(g0 - ((Y(S) + e0(S)) / 2.0f)));
                float floatValue = Float.valueOf(U2(this.W4.getInterpolation((((-0.8f) * g) / f) + 1.0f), S)).floatValue();
                float floatValue2 = ((Number) mh5.c((Float.isInfinite(floatValue) || Float.isNaN(floatValue)) ? null : null, Float.valueOf(1.0f))).floatValue();
                float f2 = 1 - floatValue2;
                float u0 = (u0() / 2) * f2;
                int i4 = b.$EnumSwitchMapping$0[this.U4.ordinal()];
                int i5 = -1;
                if (i4 != 1) {
                    if (i4 == 2) {
                        i2 = -1;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i2 = 1;
                }
                S.setTranslationX(u0 * i2);
                float height = S.getHeight() * 0.19999999f * f2;
                if (S.getBottom() - (S.getHeight() / 2) <= g0) {
                    i5 = 1;
                }
                S.setTranslationY(height * i5);
                S.setScaleX(floatValue2);
                S.setScaleY(floatValue2);
            }
        }
        return G1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void Q1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        z65.h(recyclerView, "recyclerView");
        c cVar = new c(recyclerView.getContext());
        cVar.p(i);
        R1(cVar);
    }
}
