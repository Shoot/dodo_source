package defpackage;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.tmb;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: AndroidViewHolder.android.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0014J\u0006\u0010\u000f\u001a\u00020\u0007J0\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0014J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0014J\b\u0010\u001c\u001a\u00020\u0007H\u0014J\u001e\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0018\u0010%\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0016J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u000bH\u0014J\u0012\u0010*\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010(H\u0016J\b\u0010+\u001a\u00020\u0010H\u0016J(\u0010.\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000bH\u0016J\b\u0010/\u001a\u00020\u000bH\u0016J(\u00100\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000bH\u0016J\u0018\u00101\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u000bH\u0016J@\u00107\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u001dH\u0016J8\u00107\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000bH\u0016J0\u0010:\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u000bH\u0016J(\u0010>\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0006\u00106\u001a\u00020\u0010H\u0016J \u0010?\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;H\u0016J\b\u0010@\u001a\u00020\u0010H\u0016R\u0017\u0010D\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010CR6\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00070E2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070E8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0016\u0010O\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR6\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00070E2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00070E8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010G\u001a\u0004\bQ\u0010I\"\u0004\bR\u0010KR6\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00070E2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00070E8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010G\u001a\u0004\bT\u0010I\"\u0004\bU\u0010KR*\u0010^\u001a\u00020W2\u0006\u0010F\u001a\u00020W8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R0\u0010f\u001a\u0010\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u0007\u0018\u00010_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR*\u0010n\u001a\u00020g2\u0006\u0010F\u001a\u00020g8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR0\u0010q\u001a\u0010\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u0007\u0018\u00010_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010a\u001a\u0004\bo\u0010c\"\u0004\bp\u0010eR.\u0010y\u001a\u0004\u0018\u00010r2\b\u0010F\u001a\u0004\u0018\u00010r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR0\u0010\u0081\u0001\u001a\u0004\u0018\u00010z2\b\u0010F\u001a\u0004\u0018\u00010z8\u0006@FX\u0086\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0084\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010\u0083\u0001R\u001c\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070E8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010GR4\u0010\u008a\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010_8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010a\u001a\u0005\b\u0088\u0001\u0010c\"\u0005\b\u0089\u0001\u0010eR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008e\u0001R\u0017\u0010\u0094\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u0093\u0001R\u001d\u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0006¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001¨\u0006\u009b\u0001"}, d2 = {"Ljj;", "Landroid/view/ViewGroup;", "Lov6;", "Lkn1;", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "", e.a, DateTokenConverter.CONVERTER_KEY, "i", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "a", "", "changed", "l", "t", "r", "b", "onLayout", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "disallowIntercept", "requestDisallowInterceptTouchEvent", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "child", "target", "onDescendantInvalidated", RemoteMessageConst.Notification.VISIBILITY, "onWindowVisibilityChanged", "Landroid/graphics/Region;", tmb.f.REGION_JSON_NAME, "gatherTransparentRegion", "shouldDelayChildPressedState", "axes", MessageAttributes.TYPE, "onStartNestedScroll", "getNestedScrollAxes", "onNestedScrollAccepted", "onStopNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "onNestedScroll", "dx", "dy", "onNestedPreScroll", "", "velocityX", "velocityY", "onNestedFling", "onNestedPreFling", "isNestedScrollingEnabled", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lkotlin/Function0;", "value", "Lkotlin/jvm/functions/Function0;", "getUpdate", "()Lkotlin/jvm/functions/Function0;", "setUpdate", "(Lkotlin/jvm/functions/Function0;)V", "update", c.a, "Z", "hasUpdateBlock", "<set-?>", "getReset", "setReset", "reset", "getRelease", "setRelease", "release", "Lsm6;", "f", "Lsm6;", "getModifier", "()Lsm6;", "setModifier", "(Lsm6;)V", "modifier", "Lkotlin/Function1;", "g", "Lkotlin/jvm/functions/Function1;", "getOnModifierChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnModifierChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "La03;", Image.TYPE_HIGH, "La03;", "getDensity", "()La03;", "setDensity", "(La03;)V", "density", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Lop5;", "j", "Lop5;", "getLifecycleOwner", "()Lop5;", "setLifecycleOwner", "(Lop5;)V", "lifecycleOwner", "Lnt9;", "k", "Lnt9;", "getSavedStateRegistryOwner", "()Lnt9;", "setSavedStateRegistryOwner", "(Lnt9;)V", "savedStateRegistryOwner", "Lwpa;", "Lwpa;", "snapshotObserver", Image.TYPE_MEDIUM, "runUpdate", "n", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "o", "[I", "p", "I", "lastWidthMeasureSpec", "q", "lastHeightMeasureSpec", "Lpv6;", "Lpv6;", "nestedScrollingParentHelper", "Len5;", Image.TYPE_SMALL, "Len5;", "getLayoutNode", "()Len5;", "layoutNode", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jj  reason: default package */
/* loaded from: classes.dex */
public class jj extends ViewGroup implements ov6, kn1 {
    private final View a;
    private Function0<Unit> b;
    private boolean c;
    private Function0<Unit> d;
    private Function0<Unit> e;
    private sm6 f;
    private Function1<? super sm6, Unit> g;
    private a03 h;
    private Function1<? super a03, Unit> i;
    private op5 j;
    private nt9 k;
    private final wpa l;
    private final Function0<Unit> m;
    private Function1<? super Boolean, Unit> n;
    private final int[] o;
    private int p;
    private int q;
    private final pv6 r;
    private final en5 s;

    public final void a() {
        int i;
        int i2 = this.p;
        if (i2 != Integer.MIN_VALUE && (i = this.q) != Integer.MIN_VALUE) {
            measure(i2, i);
        }
    }

    @Override // defpackage.kn1
    public void d() {
        this.d.invoke();
        removeAllViewsInLayout();
    }

    @Override // defpackage.kn1
    public void e() {
        if (this.a.getParent() != this) {
            addView(this.a);
        } else {
            this.d.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.o);
        int[] iArr = this.o;
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), this.o[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    public final a03 getDensity() {
        return this.h;
    }

    public final View getInteropView() {
        return this.a;
    }

    public final en5 getLayoutNode() {
        return this.s;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    public final op5 getLifecycleOwner() {
        return this.j;
    }

    public final sm6 getModifier() {
        return this.f;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.r.a();
    }

    public final Function1<a03, Unit> getOnDensityChanged$ui_release() {
        return this.i;
    }

    public final Function1<sm6, Unit> getOnModifierChanged$ui_release() {
        return this.g;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.n;
    }

    public final Function0<Unit> getRelease() {
        return this.e;
    }

    public final Function0<Unit> getReset() {
        return this.d;
    }

    public final nt9 getSavedStateRegistryOwner() {
        return this.k;
    }

    public final Function0<Unit> getUpdate() {
        return this.b;
    }

    public final View getView() {
        return this.a;
    }

    @Override // defpackage.kn1
    public void i() {
        this.e.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.s.w0();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.a.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l.r();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        z65.h(view, "child");
        z65.h(view2, "target");
        super.onDescendantInvalidated(view, view2);
        this.s.w0();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l.s();
        this.l.j();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.a.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        this.a.measure(i, i2);
        setMeasuredDimension(this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
        this.p = i;
        this.q = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        float e;
        float e2;
        z65.h(view, "target");
        if (isNestedScrollingEnabled()) {
            e = kj.e(f);
            e2 = kj.e(f2);
            wxb.a(e, e2);
            throw null;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        float e;
        float e2;
        z65.h(view, "target");
        if (isNestedScrollingEnabled()) {
            e = kj.e(f);
            e2 = kj.e(f2);
            wxb.a(e, e2);
            throw null;
        }
        return false;
    }

    @Override // defpackage.nv6
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        float d;
        float d2;
        z65.h(view, "target");
        z65.h(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            d = kj.d(i);
            d2 = kj.d(i2);
            x67.a(d, d2);
            kj.f(i3);
            throw null;
        }
    }

    @Override // defpackage.ov6
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        float d;
        float d2;
        float d3;
        float d4;
        z65.h(view, "target");
        z65.h(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            d = kj.d(i);
            d2 = kj.d(i2);
            x67.a(d, d2);
            d3 = kj.d(i3);
            d4 = kj.d(i4);
            x67.a(d3, d4);
            kj.f(i5);
            throw null;
        }
    }

    @Override // defpackage.nv6
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        z65.h(view, "child");
        z65.h(view2, "target");
        this.r.c(view, view2, i, i2);
    }

    @Override // defpackage.nv6
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        z65.h(view, "child");
        z65.h(view2, "target");
        if ((i & 2) != 0 || (i & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nv6
    public void onStopNestedScroll(View view, int i) {
        z65.h(view, "target");
        this.r.e(view, i);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (Build.VERSION.SDK_INT < 23 && i == 0) {
            this.s.w0();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        Function1<? super Boolean, Unit> function1 = this.n;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(a03 a03Var) {
        z65.h(a03Var, "value");
        if (a03Var != this.h) {
            this.h = a03Var;
            Function1<? super a03, Unit> function1 = this.i;
            if (function1 != null) {
                function1.invoke(a03Var);
            }
        }
    }

    public final void setLifecycleOwner(op5 op5Var) {
        if (op5Var != this.j) {
            this.j = op5Var;
            v0c.b(this, op5Var);
        }
    }

    public final void setModifier(sm6 sm6Var) {
        z65.h(sm6Var, "value");
        if (sm6Var != this.f) {
            this.f = sm6Var;
            Function1<? super sm6, Unit> function1 = this.g;
            if (function1 != null) {
                function1.invoke(sm6Var);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1<? super a03, Unit> function1) {
        this.i = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1<? super sm6, Unit> function1) {
        this.g = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1<? super Boolean, Unit> function1) {
        this.n = function1;
    }

    protected final void setRelease(Function0<Unit> function0) {
        z65.h(function0, "<set-?>");
        this.e = function0;
    }

    protected final void setReset(Function0<Unit> function0) {
        z65.h(function0, "<set-?>");
        this.d = function0;
    }

    public final void setSavedStateRegistryOwner(nt9 nt9Var) {
        if (nt9Var != this.k) {
            this.k = nt9Var;
            x0c.b(this, nt9Var);
        }
    }

    protected final void setUpdate(Function0<Unit> function0) {
        z65.h(function0, "value");
        this.b = function0;
        this.c = true;
        this.m.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.nv6
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        float d;
        float d2;
        float d3;
        float d4;
        z65.h(view, "target");
        if (isNestedScrollingEnabled()) {
            d = kj.d(i);
            d2 = kj.d(i2);
            x67.a(d, d2);
            d3 = kj.d(i3);
            d4 = kj.d(i4);
            x67.a(d3, d4);
            kj.f(i5);
            throw null;
        }
    }
}
