package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.wg0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: BubbleShowCaseBuilder.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\u0018\u00002\u00020\u0001B\u0011\u0012\u0007\u0010\u0083\u0001\u001a\u00020\u001c¢\u0006\u0005\b\u0084\u0001\u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u001a\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013J\u001a\u0010\u0017\u001a\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013J\u001a\u0010\u0018\u001a\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013J\u001a\u0010\u0019\u001a\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013J\u0014\u0010\u001b\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u001aR\"\u0010\"\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u00101\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00108\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010;\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\"\u0010B\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010\t\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010\t\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\"\u0010I\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010\t\u001a\u0004\bC\u0010?\"\u0004\bH\u0010AR\"\u0010L\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010\t\u001a\u0004\bJ\u0010?\"\u0004\bK\u0010AR\"\u0010P\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010\t\u001a\u0004\bN\u0010?\"\u0004\bO\u0010AR\"\u0010T\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010\t\u001a\u0004\bR\u0010?\"\u0004\bS\u0010AR\"\u0010Y\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010U\u001a\u0004\bG\u0010V\"\u0004\bW\u0010XR\"\u0010^\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010Z\u001a\u0004\bM\u0010[\"\u0004\b\\\u0010]R\"\u0010`\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010Z\u001a\u0004\bQ\u0010[\"\u0004\b_\u0010]R*\u0010e\u001a\u0012\u0012\u0004\u0012\u00020\n0aj\b\u0012\u0004\u0012\u00020\n`b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010c\u001a\u0004\b=\u0010dR\"\u0010h\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010Z\u001a\u0004\bf\u0010[\"\u0004\bg\u0010]R\"\u0010k\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010Z\u001a\u0004\bi\u0010[\"\u0004\bj\u0010]R.\u0010q\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR.\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010l\u001a\u0004\br\u0010n\"\u0004\bs\u0010pR.\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010l\u001a\u0004\bu\u0010n\"\u0004\bv\u0010pR.\u0010z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bi\u0010l\u001a\u0004\bx\u0010n\"\u0004\by\u0010pR)\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bu\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u001b\u0010\u0081\u0001\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\br\u0010\t\u001a\u0004\b2\u0010?R\u001b\u0010\u0082\u0001\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010\t\u001a\u0004\b+\u0010?¨\u0006\u0085\u0001"}, d2 = {"Lxg0;", "", "Lwg0;", "H", "", "description", "b", "Landroid/view/View;", "targetView", "I", "Lwg0$a;", "arrowPosition", "a", "", "needShow", "B", "Lwg0$c;", "highlightMode", "A", "Lkotlin/Function1;", "", "listener", "G", "E", "C", "D", "Lkotlin/Function0;", "F", "Landroid/app/Activity;", "Landroid/app/Activity;", com.huawei.hms.push.e.a, "()Landroid/app/Activity;", "setMActivity$android_release", "(Landroid/app/Activity;)V", "mActivity", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "o", "()Ljava/lang/ref/WeakReference;", "setMTargetView$android_release", "(Ljava/lang/ref/WeakReference;)V", "mTargetView", "Landroid/graphics/drawable/Drawable;", com.huawei.hms.opendevice.c.a, "Landroid/graphics/drawable/Drawable;", "i", "()Landroid/graphics/drawable/Drawable;", "setMImage$android_release", "(Landroid/graphics/drawable/Drawable;)V", "mImage", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "q", "()Ljava/lang/String;", "setMTitle$android_release", "(Ljava/lang/String;)V", "mTitle", "l", "setMSubtitle$android_release", "mSubtitle", "", "f", "r", "()I", "setMTitleGravity$android_release", "(I)V", "mTitleGravity", "g", Image.TYPE_MEDIUM, "setMSubtitleGravity$android_release", "mSubtitleGravity", Image.TYPE_HIGH, "setMBackgroundColor$android_release", "mBackgroundColor", "p", "setMTextColor$android_release", "mTextColor", "j", Image.TYPE_SMALL, "setMTitleTextSize$android_release", "mTitleTextSize", "k", "n", "setMSubtitleTextSize$android_release", "mSubtitleTextSize", "Lwg0$c;", "()Lwg0$c;", "setMHighlightMode$android_release", "(Lwg0$c;)V", "mHighlightMode", "Z", "()Z", "setMIsFirstOfSequence$android_release", "(Z)V", "mIsFirstOfSequence", "setMIsLastOfSequence$android_release", "mIsLastOfSequence", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "mArrowPositionList", "t", "setNeedShowArrow$android_release", "needShowArrow", "u", "setNeedShowCloseButton$android_release", "needShowCloseButton", "Lkotlin/jvm/functions/Function1;", "z", "()Lkotlin/jvm/functions/Function1;", "setOnTargetViewClickListener$android_release", "(Lkotlin/jvm/functions/Function1;)V", "onTargetViewClickListener", "w", "setOnBubbleClickListener$android_release", "onBubbleClickListener", "v", "setOnBackgroundDimClickListener$android_release", "onBackgroundDimClickListener", "x", "setOnCloseActionImageClickListener$android_release", "onCloseActionImageClickListener", "Lkotlin/jvm/functions/Function0;", "y", "()Lkotlin/jvm/functions/Function0;", "setOnShowCaseDismissListener$android_release", "(Lkotlin/jvm/functions/Function0;)V", "onShowCaseDismissListener", "initialStatusBarColor", "initialNavigationBarColor", "activity", "<init>", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xg0  reason: default package */
/* loaded from: classes.dex */
public final class xg0 {
    private Activity a;
    private WeakReference<View> b;
    private Drawable c;
    private String d;
    private String e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private wg0.c l;
    private boolean m;
    private boolean n;
    private final ArrayList<wg0.a> o;
    private boolean p;
    private boolean q;
    private Function1<? super wg0, Unit> r;
    private Function1<? super wg0, Unit> s;
    private Function1<? super wg0, Unit> t;
    private Function1<? super wg0, Unit> u;
    private Function0<Unit> v;
    private final int w;
    private final int x;

    /* compiled from: BubbleShowCaseBuilder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwg0;", "it", "", "a", "(Lwg0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xg0$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<wg0, Unit> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final void a(wg0 wg0Var) {
            z65.h(wg0Var, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(wg0 wg0Var) {
            a(wg0Var);
            return Unit.a;
        }
    }

    /* compiled from: BubbleShowCaseBuilder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwg0;", "it", "", "a", "(Lwg0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xg0$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<wg0, Unit> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final void a(wg0 wg0Var) {
            z65.h(wg0Var, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(wg0 wg0Var) {
            a(wg0Var);
            return Unit.a;
        }
    }

    /* compiled from: BubbleShowCaseBuilder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwg0;", "it", "", "a", "(Lwg0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xg0$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<wg0, Unit> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final void a(wg0 wg0Var) {
            z65.h(wg0Var, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(wg0 wg0Var) {
            a(wg0Var);
            return Unit.a;
        }
    }

    /* compiled from: BubbleShowCaseBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xg0$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function0<Unit> {
        public static final d a = new d();

        d() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }
    }

    /* compiled from: BubbleShowCaseBuilder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwg0;", "it", "", "a", "(Lwg0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xg0$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function1<wg0, Unit> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final void a(wg0 wg0Var) {
            z65.h(wg0Var, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(wg0 wg0Var) {
            a(wg0Var);
            return Unit.a;
        }
    }

    /* compiled from: BubbleShowCaseBuilder.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"xg0$f", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xg0$f */
    /* loaded from: classes.dex */
    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ wg0 a;
        final /* synthetic */ View b;

        f(wg0 wg0Var, View view) {
            this.a = wg0Var;
            this.b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.a.C();
            this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public xg0(Activity activity) {
        z65.h(activity, "activity");
        this.a = activity;
        this.d = "";
        this.e = "";
        this.l = wg0.c.a;
        this.m = true;
        this.n = true;
        this.o = new ArrayList<>();
        this.r = e.a;
        this.s = b.a;
        this.t = a.a;
        this.u = c.a;
        this.v = d.a;
        this.w = activity.getWindow().getStatusBarColor();
        this.x = activity.getWindow().getNavigationBarColor();
    }

    public final xg0 A(wg0.c cVar) {
        z65.h(cVar, "highlightMode");
        this.l = cVar;
        return this;
    }

    public final xg0 B(boolean z) {
        this.p = z;
        return this;
    }

    public final xg0 C(Function1<? super wg0, Unit> function1) {
        z65.h(function1, "listener");
        this.t = function1;
        return this;
    }

    public final xg0 D(Function1<? super wg0, Unit> function1) {
        z65.h(function1, "listener");
        this.s = function1;
        return this;
    }

    public final xg0 E(Function1<? super wg0, Unit> function1) {
        z65.h(function1, "listener");
        this.u = function1;
        return this;
    }

    public final xg0 F(Function0<Unit> function0) {
        z65.h(function0, "listener");
        this.v = function0;
        return this;
    }

    public final xg0 G(Function1<? super wg0, Unit> function1) {
        z65.h(function1, "listener");
        this.r = function1;
        return this;
    }

    public final wg0 H() {
        View view;
        wg0 wg0Var = new wg0(this);
        WeakReference<View> weakReference = this.b;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (view != null && (view.getHeight() == 0 || view.getWidth() == 0)) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new f(wg0Var, view));
        } else {
            wg0Var.C();
        }
        return wg0Var;
    }

    public final xg0 I(View view) {
        z65.h(view, "targetView");
        this.b = new WeakReference<>(view);
        return this;
    }

    public final xg0 a(wg0.a aVar) {
        z65.h(aVar, "arrowPosition");
        this.o.clear();
        this.o.add(aVar);
        return this;
    }

    public final xg0 b(String str) {
        z65.h(str, "description");
        this.e = str;
        return this;
    }

    public final int c() {
        return this.x;
    }

    public final int d() {
        return this.w;
    }

    public final Activity e() {
        return this.a;
    }

    public final ArrayList<wg0.a> f() {
        return this.o;
    }

    public final int g() {
        return this.h;
    }

    public final wg0.c h() {
        return this.l;
    }

    public final Drawable i() {
        return this.c;
    }

    public final boolean j() {
        return this.m;
    }

    public final boolean k() {
        return this.n;
    }

    public final String l() {
        return this.e;
    }

    public final int m() {
        return this.g;
    }

    public final int n() {
        return this.k;
    }

    public final WeakReference<View> o() {
        return this.b;
    }

    public final int p() {
        return this.i;
    }

    public final String q() {
        return this.d;
    }

    public final int r() {
        return this.f;
    }

    public final int s() {
        return this.j;
    }

    public final boolean t() {
        return this.p;
    }

    public final boolean u() {
        return this.q;
    }

    public final Function1<wg0, Unit> v() {
        return this.t;
    }

    public final Function1<wg0, Unit> w() {
        return this.s;
    }

    public final Function1<wg0, Unit> x() {
        return this.u;
    }

    public final Function0<Unit> y() {
        return this.v;
    }

    public final Function1<wg0, Unit> z() {
        return this.r;
    }
}
