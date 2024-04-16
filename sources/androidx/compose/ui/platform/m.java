package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.qn1;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: AndroidCompositionLocals.android.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\"\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\" \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015\"\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u00128\u0006¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b&\u0010\u0015¨\u0006(²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Lkotlin/Function0;", "", RemoteMessageConst.Notification.CONTENT, "a", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lqn1;I)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/res/Configuration;", "configuration", "Lzv4;", "k", "(Landroid/content/Context;Landroid/content/res/Configuration;Lqn1;I)Lzv4;", "", Action.NAME_ATTRIBUTE, "", "j", "Lxr8;", "Lxr8;", "f", "()Lxr8;", "LocalConfiguration", "b", "g", "LocalContext", com.huawei.hms.opendevice.c.a, Image.TYPE_HIGH, "LocalImageVectorCache", "Lop5;", DateTokenConverter.CONVERTER_KEY, "getLocalLifecycleOwner", "LocalLifecycleOwner", "Lnt9;", com.huawei.hms.push.e.a, "getLocalSavedStateRegistryOwner", "LocalSavedStateRegistryOwner", "Landroid/view/View;", "i", "LocalView", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class m {
    private static final xr8<Configuration> a = oo1.c(null, a.a, 1, null);
    private static final xr8<Context> b = oo1.d(b.a);
    private static final xr8<zv4> c = oo1.d(c.a);
    private static final xr8<op5> d = oo1.d(d.a);
    private static final xr8<nt9> e = oo1.d(e.a);
    private static final xr8<View> f = oo1.d(f.a);

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/res/Configuration;", "a", "()Landroid/content/res/Configuration;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Configuration> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Configuration invoke() {
            m.j("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Context> {
        public static final b a = new b();

        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Context invoke() {
            m.j("LocalContext");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzv4;", "a", "()Lzv4;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<zv4> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final zv4 invoke() {
            m.j("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lop5;", "a", "()Lop5;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function0<op5> {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final op5 invoke() {
            m.j("LocalLifecycleOwner");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnt9;", "a", "()Lnt9;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function0<nt9> {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final nt9 invoke() {
            m.j("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function0<View> {
        public static final f a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final View invoke() {
            m.j("LocalView");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Configuration;", "it", "", "a", "(Landroid/content/res/Configuration;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class g extends ej5 implements Function1<Configuration, Unit> {
        final /* synthetic */ er6<Configuration> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(er6<Configuration> er6Var) {
            super(1);
            this.a = er6Var;
        }

        public final void a(Configuration configuration) {
            z65.h(configuration, "it");
            m.c(this.a, new Configuration(configuration));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
            a(configuration);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ld43;", "Lc43;", "a", "(Ld43;)Lc43;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class h extends ej5 implements Function1<d43, c43> {
        final /* synthetic */ h43 a;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"androidx/compose/ui/platform/m$h$a", "Lc43;", "", "a", "runtime_release"}, k = 1, mv = {1, 8, 0})
        /* loaded from: classes.dex */
        public static final class a implements c43 {
            final /* synthetic */ h43 a;

            public a(h43 h43Var) {
                this.a = h43Var;
            }

            @Override // defpackage.c43
            public void a() {
                this.a.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(h43 h43Var) {
            super(1);
            this.a = h43Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final c43 invoke(d43 d43Var) {
            z65.h(d43Var, "$this$DisposableEffect");
            return new a(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Lqn1;I)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class i extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ AndroidComposeView a;
        final /* synthetic */ ej b;
        final /* synthetic */ Function2<qn1, Integer, Unit> c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(AndroidComposeView androidComposeView, ej ejVar, Function2<? super qn1, ? super Integer, Unit> function2, int i) {
            super(2);
            this.a = androidComposeView;
            this.b = ejVar;
            this.c = function2;
            this.d = i;
        }

        public final void a(qn1 qn1Var, int i) {
            if ((i & 11) == 2 && qn1Var.g()) {
                qn1Var.E();
                return;
            }
            if (tn1.K()) {
                tn1.V(1471621628, i, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:117)");
            }
            ro1.a(this.a, this.b, this.c, qn1Var, ((this.d << 3) & 896) | 72);
            if (tn1.K()) {
                tn1.U();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class j extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ AndroidComposeView a;
        final /* synthetic */ Function2<qn1, Integer, Unit> b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(AndroidComposeView androidComposeView, Function2<? super qn1, ? super Integer, Unit> function2, int i) {
            super(2);
            this.a = androidComposeView;
            this.b = function2;
            this.c = i;
        }

        public final void a(qn1 qn1Var, int i) {
            m.a(this.a, this.b, qn1Var, f99.a(this.c | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ld43;", "Lc43;", "a", "(Ld43;)Lc43;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class k extends ej5 implements Function1<d43, c43> {
        final /* synthetic */ Context a;
        final /* synthetic */ l b;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"androidx/compose/ui/platform/m$k$a", "Lc43;", "", "a", "runtime_release"}, k = 1, mv = {1, 8, 0})
        /* loaded from: classes.dex */
        public static final class a implements c43 {
            final /* synthetic */ Context a;
            final /* synthetic */ l b;

            public a(Context context, l lVar) {
                this.a = context;
                this.b = lVar;
            }

            @Override // defpackage.c43
            public void a() {
                this.a.getApplicationContext().unregisterComponentCallbacks(this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, l lVar) {
            super(1);
            this.a = context;
            this.b = lVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final c43 invoke(d43 d43Var) {
            z65.h(d43Var, "$this$DisposableEffect");
            this.a.getApplicationContext().registerComponentCallbacks(this.b);
            return new a(this.a, this.b);
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"androidx/compose/ui/platform/m$l", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "configuration", "", "onConfigurationChanged", "onLowMemory", "", "level", "onTrimMemory", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class l implements ComponentCallbacks2 {
        final /* synthetic */ Configuration a;
        final /* synthetic */ zv4 b;

        l(Configuration configuration, zv4 zv4Var) {
            this.a = configuration;
            this.b = zv4Var;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            z65.h(configuration, "configuration");
            this.b.c(this.a.updateFrom(configuration));
            this.a.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.b.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            this.b.a();
        }
    }

    public static final void a(AndroidComposeView androidComposeView, Function2<? super qn1, ? super Integer, Unit> function2, qn1 qn1Var, int i2) {
        z65.h(androidComposeView, "owner");
        z65.h(function2, RemoteMessageConst.Notification.CONTENT);
        qn1 f2 = qn1Var.f(1396852028);
        if (tn1.K()) {
            tn1.V(1396852028, i2, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:80)");
        }
        Context context = androidComposeView.getContext();
        f2.w(-492369756);
        Object x = f2.x();
        qn1.a aVar = qn1.a;
        if (x == aVar.a()) {
            x = tpa.c(new Configuration(context.getResources().getConfiguration()), null, 2, null);
            f2.p(x);
        }
        f2.J();
        er6 er6Var = (er6) x;
        f2.w(1157296644);
        boolean K = f2.K(er6Var);
        Object x2 = f2.x();
        if (K || x2 == aVar.a()) {
            x2 = new g(er6Var);
            f2.p(x2);
        }
        f2.J();
        androidComposeView.setConfigurationChangeObserver((Function1) x2);
        f2.w(-492369756);
        Object x3 = f2.x();
        if (x3 == aVar.a()) {
            z65.g(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            x3 = new ej(context);
            f2.p(x3);
        }
        f2.J();
        ej ejVar = (ej) x3;
        AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            f2.w(-492369756);
            Object x4 = f2.x();
            if (x4 == aVar.a()) {
                x4 = i43.a(androidComposeView, viewTreeOwners.b());
                f2.p(x4);
            }
            f2.J();
            h43 h43Var = (h43) x4;
            zd3.a(Unit.a, new h(h43Var), f2, 6);
            z65.g(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            oo1.a(new zr8[]{a.c(b(er6Var)), b.c(context), d.c(viewTreeOwners.a()), e.c(viewTreeOwners.b()), gt9.b().c(h43Var), f.c(androidComposeView.getView()), c.c(k(context, b(er6Var), f2, 72))}, gn1.b(f2, 1471621628, true, new i(androidComposeView, ejVar, function2, i2)), f2, 56);
            if (tn1.K()) {
                tn1.U();
            }
            xw9 i3 = f2.i();
            if (i3 != null) {
                i3.a(new j(androidComposeView, function2, i2));
                return;
            }
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    private static final Configuration b(er6<Configuration> er6Var) {
        return er6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(er6<Configuration> er6Var, Configuration configuration) {
        er6Var.setValue(configuration);
    }

    public static final xr8<Configuration> f() {
        return a;
    }

    public static final xr8<Context> g() {
        return b;
    }

    public static final xr8<zv4> h() {
        return c;
    }

    public static final xr8<View> i() {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void j(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    private static final zv4 k(Context context, Configuration configuration, qn1 qn1Var, int i2) {
        qn1Var.w(-485908294);
        if (tn1.K()) {
            tn1.V(-485908294, i2, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:128)");
        }
        qn1Var.w(-492369756);
        Object x = qn1Var.x();
        qn1.a aVar = qn1.a;
        if (x == aVar.a()) {
            x = new zv4();
            qn1Var.p(x);
        }
        qn1Var.J();
        zv4 zv4Var = (zv4) x;
        qn1Var.w(-492369756);
        Object x2 = qn1Var.x();
        Object obj = x2;
        if (x2 == aVar.a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            qn1Var.p(configuration2);
            obj = configuration2;
        }
        qn1Var.J();
        Configuration configuration3 = (Configuration) obj;
        qn1Var.w(-492369756);
        Object x3 = qn1Var.x();
        if (x3 == aVar.a()) {
            x3 = new l(configuration3, zv4Var);
            qn1Var.p(x3);
        }
        qn1Var.J();
        zd3.a(zv4Var, new k(context, (l) x3), qn1Var, 8);
        if (tn1.K()) {
            tn1.U();
        }
        qn1Var.J();
        return zv4Var;
    }
}
