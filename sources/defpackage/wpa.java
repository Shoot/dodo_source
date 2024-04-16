package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.t03;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: SnapshotStateObserver.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB!\u0012\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0013\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b:\u0010;J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0002J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J&\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\f*\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\rH\u0002JA\u0010\u0015\u001a\u00020\u0004\"\b\b\u0000\u0010\f*\u00020\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\rJ\u0006\u0010\u0019\u001a\u00020\u0004J\u0006\u0010\u001a\u001a\u00020\u0004J\u0006\u0010\u001b\u001a\u00020\u0004R&\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0013\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010#\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001` 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R,\u0010+\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00040'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001dR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010%R\u0018\u00109\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00108¨\u0006<"}, d2 = {"Lwpa;", "", "", "l", "", "q", "", "set", "i", "o", "", "p", "T", "Lkotlin/Function1;", "onChanged", "Lwpa$a;", Image.TYPE_MEDIUM, Action.SCOPE_ATTRIBUTE, "onValueChangedForScope", "Lkotlin/Function0;", "block", "n", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "predicate", "k", "r", Image.TYPE_SMALL, "j", "a", "Lkotlin/jvm/functions/Function1;", "onChangedExecutor", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingChanges", com.huawei.hms.opendevice.c.a, "Z", "sendingNotifications", "Lkotlin/Function2;", "Lyoa;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function2;", "applyObserver", e.a, "readObserver", "Lgr6;", "f", "Lgr6;", "observedScopeMaps", "Lj67;", "g", "Lj67;", "applyUnsubscribe", Image.TYPE_HIGH, "isPaused", "Lwpa$a;", "currentMap", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wpa  reason: default package */
/* loaded from: classes.dex */
public final class wpa {
    private final Function1<Function0<Unit>, Unit> a;
    private final AtomicReference<Object> b;
    private boolean c;
    private final Function2<Set<? extends Object>, yoa, Unit> d;
    private final Function1<Object, Unit> e;
    private final gr6<a> f;
    private j67 g;
    private boolean h;
    private a i;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b?\u0010@J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001H\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001J0\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010J\u001a\u0010\u0015\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00130\u000eJ\u0006\u0010\u0016\u001a\u00020\bJ\u0014\u0010\u0019\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017J\u0012\u0010\u001c\u001a\u00020\b2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001aJ\u0006\u0010\u001d\u001a\u00020\bR#\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010)R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010/R\u001e\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00102R\u0017\u00108\u001a\u0002048\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010'R\u001e\u0010:\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R<\u0010>\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010;j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001`<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010=¨\u0006A"}, d2 = {"Lwpa$a;", "", "value", "", "currentToken", "currentScope", "Ljt4;", "recordedValues", "", "j", Action.SCOPE_ATTRIBUTE, DateTokenConverter.CONVERTER_KEY, "k", "i", "Lkotlin/Function1;", "readObserver", "Lkotlin/Function0;", "block", "g", "", "predicate", "l", com.huawei.hms.opendevice.c.a, "", "changes", Image.TYPE_HIGH, "Lt03;", "derivedState", Image.TYPE_MEDIUM, "f", "a", "Lkotlin/jvm/functions/Function1;", e.a, "()Lkotlin/jvm/functions/Function1;", "onChanged", "b", "Ljava/lang/Object;", "Ljt4;", "currentScopeReads", "I", "Lmt4;", "Lmt4;", "valueToScopes", "Lkt4;", "Lkt4;", "scopeToValues", "Llt4;", "Llt4;", "invalidated", "Lgr6;", "Lgr6;", "statesToReread", "Lu03;", "Lu03;", "getDerivedStateObserver", "()Lu03;", "derivedStateObserver", "deriveStateScopeCount", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "recordedDerivedStateValues", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: wpa$a */
    /* loaded from: classes.dex */
    public static final class a {
        private final Function1<Object, Unit> a;
        private Object b;
        private jt4 c;
        private int d;
        private final mt4<Object> e;
        private final kt4<Object, jt4> f;
        private final lt4<Object> g;
        private final gr6<t03<?>> h;
        private final u03 i;
        private int j;
        private final mt4<t03<?>> k;
        private final HashMap<t03<?>, Object> l;

        /* compiled from: SnapshotStateObserver.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u0014\u0010\u0006\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"wpa$a$a", "Lu03;", "Lt03;", "derivedState", "", "a", "b", "runtime_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: wpa$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0727a implements u03 {
            C0727a() {
            }

            @Override // defpackage.u03
            public void a(t03<?> t03Var) {
                z65.h(t03Var, "derivedState");
                a.this.j++;
            }

            @Override // defpackage.u03
            public void b(t03<?> t03Var) {
                z65.h(t03Var, "derivedState");
                a aVar = a.this;
                aVar.j--;
            }
        }

        public a(Function1<Object, Unit> function1) {
            z65.h(function1, "onChanged");
            this.a = function1;
            this.d = -1;
            this.e = new mt4<>();
            this.f = new kt4<>(0, 1, null);
            this.g = new lt4<>();
            this.h = new gr6<>(new t03[16], 0);
            this.i = new C0727a();
            this.k = new mt4<>();
            this.l = new HashMap<>();
        }

        private final void d(Object obj) {
            boolean z;
            int i = this.d;
            jt4 jt4Var = this.c;
            if (jt4Var != null) {
                Object[] e = jt4Var.e();
                int[] g = jt4Var.g();
                int f = jt4Var.f();
                int i2 = 0;
                for (int i3 = 0; i3 < f; i3++) {
                    Object obj2 = e[i3];
                    z65.f(obj2, "null cannot be cast to non-null type kotlin.Any");
                    int i4 = g[i3];
                    if (i4 != i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        k(obj, obj2);
                    }
                    if (!z) {
                        if (i2 != i3) {
                            e[i2] = obj2;
                            g[i2] = i4;
                        }
                        i2++;
                    }
                }
                for (int i5 = i2; i5 < f; i5++) {
                    e[i5] = null;
                }
                jt4Var.a = i2;
            }
        }

        private final void j(Object obj, int i, Object obj2, jt4 jt4Var) {
            if (this.j > 0) {
                return;
            }
            int b = jt4Var.b(obj, i);
            if ((obj instanceof t03) && b != i) {
                t03.a l = ((t03) obj).l();
                this.l.put(obj, l.a());
                Object[] b2 = l.b();
                mt4<t03<?>> mt4Var = this.k;
                mt4Var.n(obj);
                for (Object obj3 : b2) {
                    if (obj3 == null) {
                        break;
                    }
                    mt4Var.c(obj3, obj);
                }
            }
            if (b == -1) {
                this.e.c(obj, obj2);
            }
        }

        private final void k(Object obj, Object obj2) {
            this.e.m(obj2, obj);
            if ((obj2 instanceof t03) && !this.e.e(obj2)) {
                this.k.n(obj2);
                this.l.remove(obj2);
            }
        }

        public final void c() {
            this.e.d();
            this.f.b();
            this.k.d();
            this.l.clear();
        }

        public final Function1<Object, Unit> e() {
            return this.a;
        }

        public final void f() {
            lt4<Object> lt4Var = this.g;
            Function1<Object, Unit> function1 = this.a;
            Object[] t = lt4Var.t();
            int size = lt4Var.size();
            for (int i = 0; i < size; i++) {
                Object obj = t[i];
                z65.f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                function1.invoke(obj);
            }
            lt4Var.clear();
        }

        public final void g(Object obj, Function1<Object, Unit> function1, Function0<Unit> function0) {
            z65.h(obj, Action.SCOPE_ATTRIBUTE);
            z65.h(function1, "readObserver");
            z65.h(function0, "block");
            Object obj2 = this.b;
            jt4 jt4Var = this.c;
            int i = this.d;
            this.b = obj;
            this.c = this.f.f(obj);
            if (this.d == -1) {
                this.d = fpa.F().f();
            }
            u03 u03Var = this.i;
            gr6<u03> a = qpa.a();
            try {
                a.b(u03Var);
                yoa.e.d(function1, null, function0);
                a.z(a.s() - 1);
                Object obj3 = this.b;
                z65.e(obj3);
                d(obj3);
                this.b = obj2;
                this.c = jt4Var;
                this.d = i;
            } catch (Throwable th) {
                a.z(a.s() - 1);
                throw th;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
            r9 = r2.f(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
            r14 = r2.f(r13);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean h(java.util.Set<? extends java.lang.Object> r20) {
            /*
                Method dump skipped, instructions count: 422
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wpa.a.h(java.util.Set):boolean");
        }

        public final void i(Object obj) {
            z65.h(obj, "value");
            Object obj2 = this.b;
            z65.e(obj2);
            int i = this.d;
            jt4 jt4Var = this.c;
            if (jt4Var == null) {
                jt4Var = new jt4();
                this.c = jt4Var;
                this.f.l(obj2, jt4Var);
                Unit unit = Unit.a;
            }
            j(obj, i, obj2, jt4Var);
        }

        public final void l(Function1<Object, Boolean> function1) {
            z65.h(function1, "predicate");
            kt4<Object, jt4> kt4Var = this.f;
            int h = kt4Var.h();
            int i = 0;
            for (int i2 = 0; i2 < h; i2++) {
                Object obj = kt4Var.g()[i2];
                z65.f(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                jt4 jt4Var = (jt4) kt4Var.i()[i2];
                Boolean invoke = function1.invoke(obj);
                if (invoke.booleanValue()) {
                    Object[] e = jt4Var.e();
                    int[] g = jt4Var.g();
                    int f = jt4Var.f();
                    for (int i3 = 0; i3 < f; i3++) {
                        Object obj2 = e[i3];
                        z65.f(obj2, "null cannot be cast to non-null type kotlin.Any");
                        int i4 = g[i3];
                        k(obj, obj2);
                    }
                }
                if (!invoke.booleanValue()) {
                    if (i != i2) {
                        kt4Var.g()[i] = obj;
                        kt4Var.i()[i] = kt4Var.i()[i2];
                    }
                    i++;
                }
            }
            if (kt4Var.h() > i) {
                int h2 = kt4Var.h();
                for (int i5 = i; i5 < h2; i5++) {
                    kt4Var.g()[i5] = null;
                    kt4Var.i()[i5] = null;
                }
                ((kt4) kt4Var).c = i;
            }
        }

        public final void m(t03<?> t03Var) {
            int f;
            lt4 o;
            z65.h(t03Var, "derivedState");
            kt4<Object, jt4> kt4Var = this.f;
            int f2 = fpa.F().f();
            mt4<Object> mt4Var = this.e;
            f = mt4Var.f(t03Var);
            if (f >= 0) {
                o = mt4Var.o(f);
                Object[] t = o.t();
                int size = o.size();
                for (int i = 0; i < size; i++) {
                    Object obj = t[i];
                    z65.f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    jt4 f3 = kt4Var.f(obj);
                    if (f3 == null) {
                        f3 = new jt4();
                        kt4Var.l(obj, f3);
                        Unit unit = Unit.a;
                    }
                    j(t03Var, f2, obj, f3);
                }
            }
        }
    }

    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "applied", "Lyoa;", "<anonymous parameter 1>", "", "a", "(Ljava/util/Set;Lyoa;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wpa$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function2<Set<? extends Object>, yoa, Unit> {
        b() {
            super(2);
        }

        public final void a(Set<? extends Object> set, yoa yoaVar) {
            z65.h(set, "applied");
            z65.h(yoaVar, "<anonymous parameter 1>");
            wpa.this.i(set);
            if (wpa.this.l()) {
                wpa.this.q();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, yoa yoaVar) {
            a(set, yoaVar);
            return Unit.a;
        }
    }

    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wpa$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<Object, Unit> {
        c() {
            super(1);
        }

        public final void a(Object obj) {
            z65.h(obj, "state");
            if (!wpa.this.h) {
                gr6 gr6Var = wpa.this.f;
                wpa wpaVar = wpa.this;
                synchronized (gr6Var) {
                    a aVar = wpaVar.i;
                    z65.e(aVar);
                    aVar.i(obj);
                    Unit unit = Unit.a;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a(obj);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: wpa$d */
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            do {
                gr6 gr6Var = wpa.this.f;
                wpa wpaVar = wpa.this;
                synchronized (gr6Var) {
                    try {
                        if (!wpaVar.c) {
                            wpaVar.c = true;
                            gr6 gr6Var2 = wpaVar.f;
                            int s = gr6Var2.s();
                            if (s <= 0) {
                                wpaVar.c = false;
                            } else {
                                Object[] r = gr6Var2.r();
                                int i = 0;
                                do {
                                    ((a) r[i]).f();
                                    i++;
                                } while (i < s);
                                wpaVar.c = false;
                            }
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (wpa.this.l());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wpa(Function1<? super Function0<Unit>, Unit> function1) {
        z65.h(function1, "onChangedExecutor");
        this.a = function1;
        this.b = new AtomicReference<>(null);
        this.d = new b();
        this.e = new c();
        this.f = new gr6<>(new a[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i(Set<? extends Object> set) {
        Object obj;
        List e;
        List q0;
        List list;
        List o;
        do {
            obj = this.b.get();
            if (obj == null) {
                list = set;
            } else if (obj instanceof Set) {
                o = kc1.o(obj, set);
                list = o;
            } else if (obj instanceof List) {
                e = jc1.e(set);
                q0 = sc1.q0((Collection) obj, e);
                list = q0;
            } else {
                p();
                throw new KotlinNothingValueException();
            }
        } while (!ho1.a(this.b, obj, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l() {
        boolean z;
        synchronized (this.f) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<? extends Object> o = o();
            if (o == null) {
                return z2;
            }
            synchronized (this.f) {
                try {
                    gr6<a> gr6Var = this.f;
                    int s = gr6Var.s();
                    if (s > 0) {
                        a[] r = gr6Var.r();
                        int i = 0;
                        do {
                            if (!r[i].h(o) && !z2) {
                                z2 = false;
                                i++;
                            }
                            z2 = true;
                            i++;
                        } while (i < s);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final <T> a m(Function1<? super T, Unit> function1) {
        a aVar;
        gr6<a> gr6Var = this.f;
        int s = gr6Var.s();
        if (s > 0) {
            a[] r = gr6Var.r();
            int i = 0;
            do {
                aVar = r[i];
                if (aVar.e() == function1) {
                    break;
                }
                i++;
            } while (i < s);
            aVar = null;
        } else {
            aVar = null;
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            z65.f(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
            a aVar3 = new a((Function1) unb.e(function1, 1));
            this.f.b(aVar3);
            return aVar3;
        }
        return aVar2;
    }

    private final Set<Object> o() {
        Object obj;
        Object obj2;
        Set<Object> set;
        do {
            obj = this.b.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else if (obj instanceof List) {
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            } else {
                p();
                throw new KotlinNothingValueException();
            }
        } while (!ho1.a(this.b, obj, obj2));
        return set;
    }

    private final Void p() {
        tn1.w("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        this.a.invoke(new d());
    }

    public final void j() {
        synchronized (this.f) {
            try {
                gr6<a> gr6Var = this.f;
                int s = gr6Var.s();
                if (s > 0) {
                    a[] r = gr6Var.r();
                    int i = 0;
                    do {
                        r[i].c();
                        i++;
                    } while (i < s);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(Function1<Object, Boolean> function1) {
        z65.h(function1, "predicate");
        synchronized (this.f) {
            try {
                gr6<a> gr6Var = this.f;
                int s = gr6Var.s();
                if (s > 0) {
                    a[] r = gr6Var.r();
                    int i = 0;
                    do {
                        r[i].l(function1);
                        i++;
                    } while (i < s);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <T> void n(T t, Function1<? super T, Unit> function1, Function0<Unit> function0) {
        a m;
        z65.h(t, Action.SCOPE_ATTRIBUTE);
        z65.h(function1, "onValueChangedForScope");
        z65.h(function0, "block");
        synchronized (this.f) {
            m = m(function1);
        }
        boolean z = this.h;
        a aVar = this.i;
        try {
            this.h = false;
            this.i = m;
            m.g(t, this.e, function0);
        } finally {
            this.i = aVar;
            this.h = z;
        }
    }

    public final void r() {
        this.g = yoa.e.e(this.d);
    }

    public final void s() {
        j67 j67Var = this.g;
        if (j67Var != null) {
            j67Var.a();
        }
    }
}
