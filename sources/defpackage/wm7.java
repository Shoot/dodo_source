package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: OwnerSnapshotObserver.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0004\b)\u0010*J/\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\nJ/\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\f\u0010\nJ%\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000eJC\u0010\u0014\u001a\u00020\u0007\"\b\b\u0000\u0010\u0010*\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00122\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001dR \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001dR \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001d¨\u0006+"}, d2 = {"Lwm7;", "", "Len5;", "node", "", "affectsLookahead", "Lkotlin/Function0;", "", "block", DateTokenConverter.CONVERTER_KEY, "(Len5;ZLkotlin/jvm/functions/Function0;)V", "b", "f", "i", "(Len5;Lkotlin/jvm/functions/Function0;)V", "Lvm7;", "T", "target", "Lkotlin/Function1;", "onChanged", Image.TYPE_HIGH, "(Lvm7;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "a", "()V", "j", "k", "Lwpa;", "Lwpa;", "observer", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLookaheadMeasure", com.huawei.hms.opendevice.c.a, "onCommitAffectingMeasure", "onCommitAffectingSemantics", com.huawei.hms.push.e.a, "onCommitAffectingLayout", "onCommitAffectingLayoutModifier", "g", "onCommitAffectingLayoutModifierInLookahead", "onCommitAffectingLookaheadLayout", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wm7  reason: default package */
/* loaded from: classes.dex */
public final class wm7 {
    private final wpa a;
    private final Function1<en5, Unit> b;
    private final Function1<en5, Unit> c;
    private final Function1<en5, Unit> d;
    private final Function1<en5, Unit> e;
    private final Function1<en5, Unit> f;
    private final Function1<en5, Unit> g;
    private final Function1<en5, Unit> h;

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wm7$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<Object, Boolean> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "it");
            return Boolean.valueOf(!((vm7) obj).b0());
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Len5;", "layoutNode", "", "a", "(Len5;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wm7$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<en5, Unit> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final void a(en5 en5Var) {
            z65.h(en5Var, "layoutNode");
            if (en5Var.b0()) {
                en5.c1(en5Var, false, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(en5 en5Var) {
            a(en5Var);
            return Unit.a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Len5;", "layoutNode", "", "a", "(Len5;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wm7$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<en5, Unit> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final void a(en5 en5Var) {
            z65.h(en5Var, "layoutNode");
            if (en5Var.b0()) {
                en5.c1(en5Var, false, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(en5 en5Var) {
            a(en5Var);
            return Unit.a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Len5;", "layoutNode", "", "a", "(Len5;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wm7$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<en5, Unit> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final void a(en5 en5Var) {
            z65.h(en5Var, "layoutNode");
            if (en5Var.b0()) {
                en5.Y0(en5Var, false, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(en5 en5Var) {
            a(en5Var);
            return Unit.a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Len5;", "layoutNode", "", "a", "(Len5;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wm7$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function1<en5, Unit> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final void a(en5 en5Var) {
            z65.h(en5Var, "layoutNode");
            if (en5Var.b0()) {
                en5.Y0(en5Var, false, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(en5 en5Var) {
            a(en5Var);
            return Unit.a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Len5;", "layoutNode", "", "a", "(Len5;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wm7$f */
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function1<en5, Unit> {
        public static final f a = new f();

        f() {
            super(1);
        }

        public final void a(en5 en5Var) {
            z65.h(en5Var, "layoutNode");
            if (en5Var.b0()) {
                en5.a1(en5Var, false, false, 3, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(en5 en5Var) {
            a(en5Var);
            return Unit.a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Len5;", "layoutNode", "", "a", "(Len5;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wm7$g */
    /* loaded from: classes.dex */
    static final class g extends ej5 implements Function1<en5, Unit> {
        public static final g a = new g();

        g() {
            super(1);
        }

        public final void a(en5 en5Var) {
            z65.h(en5Var, "layoutNode");
            if (en5Var.b0()) {
                en5.e1(en5Var, false, false, 3, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(en5 en5Var) {
            a(en5Var);
            return Unit.a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Len5;", "layoutNode", "", "a", "(Len5;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wm7$h */
    /* loaded from: classes.dex */
    static final class h extends ej5 implements Function1<en5, Unit> {
        public static final h a = new h();

        h() {
            super(1);
        }

        public final void a(en5 en5Var) {
            z65.h(en5Var, "layoutNode");
            if (en5Var.b0()) {
                en5Var.A0();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(en5 en5Var) {
            a(en5Var);
            return Unit.a;
        }
    }

    public wm7(Function1<? super Function0<Unit>, Unit> function1) {
        z65.h(function1, "onChangedExecutor");
        this.a = new wpa(function1);
        this.b = f.a;
        this.c = g.a;
        this.d = h.a;
        this.e = b.a;
        this.f = c.a;
        this.g = d.a;
        this.h = e.a;
    }

    public static /* synthetic */ void c(wm7 wm7Var, en5 en5Var, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        wm7Var.b(en5Var, z, function0);
    }

    public static /* synthetic */ void e(wm7 wm7Var, en5 en5Var, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        wm7Var.d(en5Var, z, function0);
    }

    public static /* synthetic */ void g(wm7 wm7Var, en5 en5Var, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        wm7Var.f(en5Var, z, function0);
    }

    public final void a() {
        this.a.k(a.a);
    }

    public final void b(en5 en5Var, boolean z, Function0<Unit> function0) {
        z65.h(en5Var, "node");
        z65.h(function0, "block");
        if (z && en5Var.U() != null) {
            h(en5Var, this.g, function0);
        } else {
            h(en5Var, this.f, function0);
        }
    }

    public final void d(en5 en5Var, boolean z, Function0<Unit> function0) {
        z65.h(en5Var, "node");
        z65.h(function0, "block");
        if (z && en5Var.U() != null) {
            h(en5Var, this.h, function0);
        } else {
            h(en5Var, this.e, function0);
        }
    }

    public final void f(en5 en5Var, boolean z, Function0<Unit> function0) {
        z65.h(en5Var, "node");
        z65.h(function0, "block");
        if (z && en5Var.U() != null) {
            h(en5Var, this.b, function0);
        } else {
            h(en5Var, this.c, function0);
        }
    }

    public final <T extends vm7> void h(T t, Function1<? super T, Unit> function1, Function0<Unit> function0) {
        z65.h(t, "target");
        z65.h(function1, "onChanged");
        z65.h(function0, "block");
        this.a.n(t, function1, function0);
    }

    public final void i(en5 en5Var, Function0<Unit> function0) {
        z65.h(en5Var, "node");
        z65.h(function0, "block");
        h(en5Var, this.d, function0);
    }

    public final void j() {
        this.a.r();
    }

    public final void k() {
        this.a.s();
        this.a.j();
    }
}
