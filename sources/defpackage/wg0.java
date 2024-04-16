package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.ui.fragments.ChatFragment;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BubbleShowCase.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 62\u00020\u0001:\u0003167B\u000f\u0012\u0006\u00103\u001a\u000200¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\n\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 H\u0002J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0014H\u0002J\b\u0010(\u001a\u00020\u001cH\u0002J\b\u0010)\u001a\u00020\u0010H\u0002J\b\u0010*\u001a\u00020\u0010H\u0002J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\rH\u0002J\u0006\u0010-\u001a\u00020\u0010J\u0006\u0010.\u001a\u00020\u0010J\u0010\u0010/\u001a\u00020\u001c2\b\u0010+\u001a\u0004\u0018\u00010\rR\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00068"}, d2 = {"Lwg0;", "", "Landroid/app/Activity;", "activity", "Landroid/view/ViewGroup;", "u", "Landroid/widget/RelativeLayout;", "i", "n", "Landroid/graphics/RectF;", "targetViewLocationOnScreen", "Lsg0;", "j", "Landroid/view/View;", "targetView", "backgroundDimLayout", "", "g", com.huawei.hms.push.e.a, "f", "", "l", "Lwg0$c;", "highlightMode", "Landroid/graphics/Bitmap;", "F", "G", "H", "", "z", "v", "w", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "q", "t", Image.TYPE_SMALL, "r", "availableSpace", "p", "x", "A", "B", "view", "o", "C", Image.TYPE_MEDIUM, "y", "Lxg0;", "a", "Lxg0;", "builder", "<init>", "(Lxg0;)V", "b", com.huawei.hms.opendevice.c.a, "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wg0  reason: default package */
/* loaded from: classes.dex */
public final class wg0 {
    public static final b b = new b(null);
    private final xg0 a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BubbleShowCase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lwg0$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wg0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static final a a = new a("TOP", 0);
        public static final a b = new a("BOTTOM", 1);
        public static final a c = new a("LEFT", 2);
        public static final a d = new a("RIGHT", 3);
        private static final /* synthetic */ a[] e;
        private static final /* synthetic */ kj3 f;

        static {
            a[] a2 = a();
            e = a2;
            f = lj3.a(a2);
        }

        private a(String str, int i) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    /* compiled from: BubbleShowCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lwg0$b;", "", "", "DURATION_BACKGROUND_ANIMATION", "I", "DURATION_SHOW_CASE_ANIMATION", "FOREGROUND_LAYOUT_ID", "MAX_WIDTH_MESSAGE_VIEW_TABLET", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wg0$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BubbleShowCase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lwg0$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wg0$c */
    /* loaded from: classes.dex */
    public static final class c {
        public static final c a = new c("VIEW_LAYOUT", 0);
        public static final c b = new c("VIEW_SURFACE", 1);
        private static final /* synthetic */ c[] c;
        private static final /* synthetic */ kj3 d;

        static {
            c[] a2 = a();
            c = a2;
            d = lj3.a(a2);
        }

        private c(String str, int i) {
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{a, b};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) c.clone();
        }
    }

    /* compiled from: BubbleShowCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wg0$d */
    /* loaded from: classes.dex */
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BubbleShowCase.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wg0$e */
    /* loaded from: classes.dex */
    public static final class e extends ej5 implements Function0<Unit> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            wg0.this.a.w().invoke(wg0.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BubbleShowCase.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wg0$f */
    /* loaded from: classes.dex */
    public static final class f extends ej5 implements Function0<Unit> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            wg0.this.a.x().invoke(wg0.this);
        }
    }

    public wg0(xg0 xg0Var) {
        z65.h(xg0Var, "builder");
        this.a = xg0Var;
    }

    private final void A() {
        g6c g6cVar = g6c.a;
        Window window = this.a.e().getWindow();
        z65.g(window, "getWindow(...)");
        g6cVar.e(window, 17170445);
        Window window2 = this.a.e().getWindow();
        z65.g(window2, "getWindow(...)");
        g6cVar.b(window2, 17170445);
    }

    private final void B() {
        g6c g6cVar = g6c.a;
        Window window = this.a.e().getWindow();
        z65.g(window, "getWindow(...)");
        g6cVar.d(window, this.a.d());
        Window window2 = this.a.e().getWindow();
        z65.g(window2, "getWindow(...)");
        g6cVar.a(window2, this.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(wg0 wg0Var, View view) {
        z65.h(wg0Var, "this$0");
        wg0Var.a.v().invoke(wg0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(wg0 wg0Var, RelativeLayout relativeLayout) {
        z65.h(wg0Var, "this$0");
        z65.h(relativeLayout, "$backgroundDimLayout");
        WeakReference<View> o = wg0Var.a.o();
        z65.e(o);
        View view = o.get();
        z65.e(view);
        View view2 = view;
        if (wg0Var.a.f().isEmpty()) {
            if (jx9.a.h(wg0Var.a.e(), view2)) {
                wg0Var.a.f().add(a.a);
            } else {
                wg0Var.a.f().add(a.b);
            }
        }
        if (wg0Var.z(view2)) {
            wg0Var.g(view2, relativeLayout);
            wg0Var.e(view2, relativeLayout);
            return;
        }
        wg0Var.m();
    }

    private final Bitmap F(View view, c cVar) {
        if (cVar == c.a) {
            return G(view);
        }
        return H(view);
    }

    private final Bitmap G(View view) {
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            View childAt = u(this.a.e()).getChildAt(0);
            childAt.buildDrawingCache();
            Bitmap createBitmap = Bitmap.createBitmap(childAt.getDrawingCache(), v(view), w(view), view.getWidth(), view.getHeight());
            z65.g(createBitmap, "createBitmap(...)");
            childAt.setDrawingCacheEnabled(false);
            childAt.destroyDrawingCache();
            return createBitmap;
        }
        return null;
    }

    private final Bitmap H(View view) {
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            view.setDrawingCacheEnabled(true);
            Bitmap o = o(view);
            view.setDrawingCacheEnabled(false);
            return o;
        }
        return null;
    }

    private final void e(View view, RelativeLayout relativeLayout) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int i11 = d.$EnumSwitchMapping$0[this.a.f().get(0).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        layoutParams.addRule(12);
                        if (jx9.a.g(this.a.e(), view)) {
                            if (x()) {
                                i9 = v(view);
                            } else {
                                i9 = 0;
                            }
                            if (x()) {
                                i10 = (t(this.a.e()) - v(view)) - p(t(this.a.e()) - v(view));
                            } else {
                                i10 = 0;
                            }
                            layoutParams.setMargins(i9, 0, i10, q(this.a.e()) - w(view));
                        } else {
                            if (x()) {
                                i7 = (v(view) + view.getWidth()) - p(v(view));
                            } else {
                                i7 = 0;
                            }
                            if (x()) {
                                i8 = (t(this.a.e()) - v(view)) - view.getWidth();
                            } else {
                                i8 = 0;
                            }
                            layoutParams.setMargins(i7, 0, i8, q(this.a.e()) - w(view));
                        }
                    }
                } else {
                    layoutParams.addRule(10);
                    if (jx9.a.g(this.a.e(), view)) {
                        if (x()) {
                            i5 = v(view);
                        } else {
                            i5 = 0;
                        }
                        int w = w(view) + view.getHeight();
                        if (x()) {
                            i6 = (t(this.a.e()) - v(view)) - p(t(this.a.e()) - v(view));
                        } else {
                            i6 = 0;
                        }
                        layoutParams.setMargins(i5, w, i6, 0);
                    } else {
                        if (x()) {
                            i3 = (v(view) + view.getWidth()) - p(v(view));
                        } else {
                            i3 = 0;
                        }
                        int w2 = w(view) + view.getHeight();
                        if (x()) {
                            i4 = (t(this.a.e()) - v(view)) - view.getWidth();
                        } else {
                            i4 = 0;
                        }
                        layoutParams.setMargins(i3, w2, i4, 0);
                    }
                }
            } else {
                if (x()) {
                    i2 = v(view) - p(v(view));
                } else {
                    i2 = 0;
                }
                int t = t(this.a.e()) - v(view);
                int q = (q(this.a.e()) - w(view)) - view.getHeight();
                layoutParams.addRule(11);
                if (jx9.a.h(this.a.e(), view)) {
                    layoutParams.setMargins(i2, w(view), t, 0);
                    layoutParams.addRule(10);
                } else {
                    layoutParams.setMargins(i2, 0, t, q);
                    layoutParams.addRule(12);
                }
            }
        } else {
            int v = v(view) + view.getWidth();
            if (x()) {
                i = (t(this.a.e()) - v) - p(t(this.a.e()) - v);
            } else {
                i = 0;
            }
            int q2 = (q(this.a.e()) - w(view)) - view.getHeight();
            layoutParams.addRule(9);
            if (jx9.a.h(this.a.e(), view)) {
                layoutParams.setMargins(v, w(view), i, 0);
                layoutParams.addRule(10);
            } else {
                layoutParams.setMargins(v, 0, i, q2);
                layoutParams.addRule(12);
            }
        }
        sg0 j = j(new RectF(v(view), w(view), v(view) + view.getWidth(), w(view) + view.getHeight()));
        j.setId(l());
        tk tkVar = tk.a;
        relativeLayout.addView(tkVar.d(j, tkVar.a(0, ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY)), layoutParams);
    }

    private final void f(RelativeLayout relativeLayout) {
        int i;
        int i2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        sg0 k = k(this, null, 1, null);
        k.setId(l());
        if (x()) {
            if (x()) {
                i = (t(this.a.e()) / 2) - (jx9.a.a(420) / 2);
            } else {
                i = 0;
            }
            if (x()) {
                i2 = (t(this.a.e()) / 2) - (jx9.a.a(420) / 2);
            } else {
                i2 = 0;
            }
            layoutParams.setMargins(i, 0, i2, 0);
        }
        tk tkVar = tk.a;
        relativeLayout.addView(tkVar.d(k, tkVar.c(0, ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY)), layoutParams);
    }

    private final void g(View view, RelativeLayout relativeLayout) {
        Bitmap F = F(view, this.a.h());
        AppCompatImageView appCompatImageView = new AppCompatImageView(this.a.e());
        appCompatImageView.setImageBitmap(F);
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: vg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                wg0.h(wg0.this, view2);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(v(view), w(view), t(this.a.e()) - (v(view) + view.getWidth()), 0);
        relativeLayout.addView(appCompatImageView, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(wg0 wg0Var, View view) {
        z65.h(wg0Var, "this$0");
        wg0Var.a.z().invoke(wg0Var);
    }

    private final RelativeLayout i() {
        RelativeLayout relativeLayout = new RelativeLayout(this.a.e());
        relativeLayout.setId(731);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(iu1.c(this.a.e(), jw8.c));
        relativeLayout.setClickable(true);
        return relativeLayout;
    }

    private final sg0 j(RectF rectF) {
        sg0 sg0Var = new sg0(this.a.e());
        sg0Var.setArrowPosition(this.a.f());
        sg0Var.j(this.a.t());
        if (this.a.g() != 0) {
            sg0Var.setBackgroundColour(this.a.g());
        }
        if (this.a.p() != 0) {
            sg0Var.setTextColor(this.a.p());
        }
        if (this.a.s() != 0) {
            sg0Var.setTitleTextSize(this.a.s());
        }
        if (this.a.n() != 0) {
            sg0Var.setSubtitleTextSize(this.a.n());
        }
        if (this.a.q().length() > 0) {
            sg0Var.setTitle(this.a.q());
        }
        if (this.a.l().length() > 0) {
            sg0Var.setSubtitle(this.a.l());
        }
        if (this.a.r() != 0) {
            sg0Var.setTitleGravity(this.a.r());
        }
        if (this.a.m() != 0) {
            sg0Var.setSubtitleGravity(this.a.m());
        }
        if (this.a.i() != null) {
            Drawable i = this.a.i();
            z65.e(i);
            sg0Var.setImageDrawable(i);
        }
        sg0Var.setOnBubbleClick(new e());
        if (this.a.u()) {
            sg0Var.setCloseActionImageVisibility(this.a.u());
            sg0Var.setOnCloseActionImageClick(new f());
        }
        if (!rectF.isEmpty()) {
            sg0Var.setTargetViewScreenLocation(rectF);
        }
        return sg0Var;
    }

    static /* synthetic */ sg0 k(wg0 wg0Var, RectF rectF, int i, Object obj) {
        if ((i & 1) != 0) {
            rectF = new RectF();
        }
        return wg0Var.j(rectF);
    }

    private final int l() {
        return View.generateViewId();
    }

    private final RelativeLayout n() {
        return (RelativeLayout) this.a.e().findViewById(731);
    }

    private final Bitmap o(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        z65.g(createBitmap, "createBitmap(...)");
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private final int p(int i) {
        jx9 jx9Var = jx9.a;
        if (i > jx9Var.a(420)) {
            return jx9Var.a(420);
        }
        return i;
    }

    private final int q(Context context) {
        return jx9.a.d(context) - s();
    }

    private final int r() {
        RelativeLayout n = n();
        if (n != null) {
            return jx9.a.b(n);
        }
        return 0;
    }

    private final int s() {
        RelativeLayout n = n();
        if (n != null) {
            return jx9.a.c(n);
        }
        return 0;
    }

    private final int t(Context context) {
        return jx9.a.e(context) - r();
    }

    private final ViewGroup u(Activity activity) {
        ViewParent parent = ((ViewGroup) activity.findViewById(16908290)).getParent().getParent();
        z65.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) parent;
    }

    private final int v(View view) {
        return jx9.a.b(view) - r();
    }

    private final int w(View view) {
        return jx9.a.c(view) - s();
    }

    private final boolean x() {
        return this.a.e().getResources().getBoolean(cw8.a);
    }

    private final boolean z(View view) {
        if (v(view) < 0 || w(view) < 0 || !y(view)) {
            return false;
        }
        if (v(view) == 0 && w(view) == 0) {
            return false;
        }
        return true;
    }

    public final void C() {
        View view;
        View view2;
        ViewGroup u = u(this.a.e());
        final RelativeLayout n = n();
        if (n == null) {
            n = i();
        }
        n.setOnClickListener(new View.OnClickListener() { // from class: tg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                wg0.D(wg0.this, view3);
            }
        });
        WeakReference<View> o = this.a.o();
        ViewGroup viewGroup = null;
        if (o != null) {
            view = o.get();
        } else {
            view = null;
        }
        if (view != null && this.a.f().size() <= 1) {
            WeakReference<View> o2 = this.a.o();
            if (o2 != null) {
                view2 = o2.get();
            } else {
                view2 = null;
            }
            if (!y(view2)) {
                return;
            }
            new Handler().postDelayed(new Runnable() { // from class: ug0
                @Override // java.lang.Runnable
                public final void run() {
                    wg0.E(wg0.this, n);
                }
            }, 400L);
        } else {
            f(n);
        }
        if (this.a.j()) {
            tk tkVar = tk.a;
            View d2 = tkVar.d(n, tkVar.b(0, 400));
            try {
                A();
                u.addView(d2);
            } catch (IllegalStateException unused) {
                ViewParent parent = d2.getParent();
                if (parent != null) {
                    if (parent instanceof ViewGroup) {
                        viewGroup = (ViewGroup) parent;
                    }
                    if (viewGroup != null) {
                        viewGroup.removeView(d2);
                        viewGroup.removeView(n);
                    }
                }
                B();
            }
        }
    }

    public final void m() {
        RelativeLayout n = n();
        if (n != null && this.a.k()) {
            u(this.a.e()).removeView(n);
            B();
        } else if (n != null) {
            n.removeAllViews();
        }
        this.a.y().invoke();
    }

    public final boolean y(View view) {
        if (view == null || !view.isShown()) {
            return false;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect.intersect(new Rect(0, 0, t(this.a.e()), q(this.a.e())));
    }
}
