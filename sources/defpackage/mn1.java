package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: ComposeUiNode.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\ba\u0018\u0000 .2\u00020\u0001:\u0001\u000bR\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010%\u001a\u00020 8&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8&@&X§\u000e¢\u0006\u0012\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006/À\u0006\u0001"}, d2 = {"Lmn1;", "", "Lqb6;", "getMeasurePolicy", "()Lqb6;", Image.TYPE_HIGH, "(Lqb6;)V", "measurePolicy", "Lqm5;", "getLayoutDirection", "()Lqm5;", "a", "(Lqm5;)V", "layoutDirection", "La03;", "getDensity", "()La03;", "f", "(La03;)V", "density", "Lsm6;", "getModifier", "()Lsm6;", "l", "(Lsm6;)V", "modifier", "Lxyb;", "getViewConfiguration", "()Lxyb;", Image.TYPE_MEDIUM, "(Lxyb;)V", "viewConfiguration", "Lpo1;", "getCompositionLocalMap", "()Lpo1;", "k", "(Lpo1;)V", "compositionLocalMap", "", "getCompositeKeyHash", "()I", c.a, "(I)V", "getCompositeKeyHash$annotations", "()V", "compositeKeyHash", "G", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: mn1  reason: default package */
/* loaded from: classes.dex */
public interface mn1 {
    public static final a G = a.a;

    /* compiled from: ComposeUiNode.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R)\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R)\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0011R)\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0014\u0010\u0011R)\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\t\u0010\u0011R)\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010\u0011R)\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b\"\u0010\u0010\u001a\u0004\b#\u0010\u0011R2\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e0\f8GX\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u0010\u0012\u0004\b'\u0010(\u001a\u0004\b\u0004\u0010\u0011¨\u0006+"}, d2 = {"Lmn1$a;", "", "Lkotlin/Function0;", "Lmn1;", "b", "Lkotlin/jvm/functions/Function0;", "a", "()Lkotlin/jvm/functions/Function0;", "Constructor", com.huawei.hms.opendevice.c.a, "getVirtualConstructor", "VirtualConstructor", "Lkotlin/Function2;", "Lsm6;", "", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "SetModifier", "La03;", com.huawei.hms.push.e.a, "getSetDensity", "SetDensity", "Lpo1;", "f", "SetResolvedCompositionLocals", "Lqb6;", "g", "SetMeasurePolicy", "Lqm5;", Image.TYPE_HIGH, "getSetLayoutDirection", "SetLayoutDirection", "Lxyb;", "i", "getSetViewConfiguration", "SetViewConfiguration", "", "j", "getSetCompositeKeyHash$annotations", "()V", "SetCompositeKeyHash", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: mn1$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final Function0<mn1> b = en5.V4.a();
        private static final Function0<mn1> c = h.a;
        private static final Function2<mn1, sm6, Unit> d = e.a;
        private static final Function2<mn1, a03, Unit> e = b.a;
        private static final Function2<mn1, po1, Unit> f = f.a;
        private static final Function2<mn1, qb6, Unit> g = d.a;
        private static final Function2<mn1, qm5, Unit> h = c.a;
        private static final Function2<mn1, xyb, Unit> i = g.a;
        private static final Function2<mn1, Integer, Unit> j = C0441a.a;

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmn1;", "", "it", "", "a", "(Lmn1;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: mn1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0441a extends ej5 implements Function2<mn1, Integer, Unit> {
            public static final C0441a a = new C0441a();

            C0441a() {
                super(2);
            }

            public final void a(mn1 mn1Var, int i) {
                z65.h(mn1Var, "$this$null");
                mn1Var.c(i);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(mn1 mn1Var, Integer num) {
                a(mn1Var, num.intValue());
                return Unit.a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmn1;", "La03;", "it", "", "a", "(Lmn1;La03;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: mn1$a$b */
        /* loaded from: classes.dex */
        static final class b extends ej5 implements Function2<mn1, a03, Unit> {
            public static final b a = new b();

            b() {
                super(2);
            }

            public final void a(mn1 mn1Var, a03 a03Var) {
                z65.h(mn1Var, "$this$null");
                z65.h(a03Var, "it");
                mn1Var.f(a03Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(mn1 mn1Var, a03 a03Var) {
                a(mn1Var, a03Var);
                return Unit.a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmn1;", "Lqm5;", "it", "", "a", "(Lmn1;Lqm5;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: mn1$a$c */
        /* loaded from: classes.dex */
        static final class c extends ej5 implements Function2<mn1, qm5, Unit> {
            public static final c a = new c();

            c() {
                super(2);
            }

            public final void a(mn1 mn1Var, qm5 qm5Var) {
                z65.h(mn1Var, "$this$null");
                z65.h(qm5Var, "it");
                mn1Var.a(qm5Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(mn1 mn1Var, qm5 qm5Var) {
                a(mn1Var, qm5Var);
                return Unit.a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmn1;", "Lqb6;", "it", "", "a", "(Lmn1;Lqb6;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: mn1$a$d */
        /* loaded from: classes.dex */
        static final class d extends ej5 implements Function2<mn1, qb6, Unit> {
            public static final d a = new d();

            d() {
                super(2);
            }

            public final void a(mn1 mn1Var, qb6 qb6Var) {
                z65.h(mn1Var, "$this$null");
                z65.h(qb6Var, "it");
                mn1Var.h(qb6Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(mn1 mn1Var, qb6 qb6Var) {
                a(mn1Var, qb6Var);
                return Unit.a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmn1;", "Lsm6;", "it", "", "a", "(Lmn1;Lsm6;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: mn1$a$e */
        /* loaded from: classes.dex */
        static final class e extends ej5 implements Function2<mn1, sm6, Unit> {
            public static final e a = new e();

            e() {
                super(2);
            }

            public final void a(mn1 mn1Var, sm6 sm6Var) {
                z65.h(mn1Var, "$this$null");
                z65.h(sm6Var, "it");
                mn1Var.l(sm6Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(mn1 mn1Var, sm6 sm6Var) {
                a(mn1Var, sm6Var);
                return Unit.a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmn1;", "Lpo1;", "it", "", "a", "(Lmn1;Lpo1;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: mn1$a$f */
        /* loaded from: classes.dex */
        static final class f extends ej5 implements Function2<mn1, po1, Unit> {
            public static final f a = new f();

            f() {
                super(2);
            }

            public final void a(mn1 mn1Var, po1 po1Var) {
                z65.h(mn1Var, "$this$null");
                z65.h(po1Var, "it");
                mn1Var.k(po1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(mn1 mn1Var, po1 po1Var) {
                a(mn1Var, po1Var);
                return Unit.a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmn1;", "Lxyb;", "it", "", "a", "(Lmn1;Lxyb;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: mn1$a$g */
        /* loaded from: classes.dex */
        static final class g extends ej5 implements Function2<mn1, xyb, Unit> {
            public static final g a = new g();

            g() {
                super(2);
            }

            public final void a(mn1 mn1Var, xyb xybVar) {
                z65.h(mn1Var, "$this$null");
                z65.h(xybVar, "it");
                mn1Var.m(xybVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(mn1 mn1Var, xyb xybVar) {
                a(mn1Var, xybVar);
                return Unit.a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Len5;", "a", "()Len5;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: mn1$a$h */
        /* loaded from: classes.dex */
        static final class h extends ej5 implements Function0<en5> {
            public static final h a = new h();

            h() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final en5 invoke() {
                return new en5(true, 0, 2, null);
            }
        }

        private a() {
        }

        public final Function0<mn1> a() {
            return b;
        }

        public final Function2<mn1, Integer, Unit> b() {
            return j;
        }

        public final Function2<mn1, qb6, Unit> c() {
            return g;
        }

        public final Function2<mn1, sm6, Unit> d() {
            return d;
        }

        public final Function2<mn1, po1, Unit> e() {
            return f;
        }
    }

    void a(qm5 qm5Var);

    void c(int i);

    void f(a03 a03Var);

    void h(qb6 qb6Var);

    void k(po1 po1Var);

    void l(sm6 sm6Var);

    void m(xyb xybVar);
}
