package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.t03;
import defpackage.yoa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DerivedState.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0015B%\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0017¢\u0006\u0004\b(\u0010)J:\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0011\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Ls03;", "T", "Lzua;", "Lt03;", "Ls03$a;", "readable", "Lyoa;", "snapshot", "", "forceDependencyReads", "Lkotlin/Function0;", "calculation", "n", "", "o", "Lbva;", Image.TYPE_MEDIUM, "value", "", "g", "toString", "a", "Lkotlin/jvm/functions/Function0;", "Lppa;", "b", "Lppa;", "()Lppa;", "policy", c.a, "Ls03$a;", "first", "i", "()Lbva;", "firstStateRecord", "getValue", "()Ljava/lang/Object;", "Lt03$a;", "l", "()Lt03$a;", "currentRecord", "<init>", "(Lkotlin/jvm/functions/Function0;Lppa;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: s03  reason: default package */
/* loaded from: classes.dex */
public final class s03<T> implements zua, t03<T> {
    private final Function0<T> a;
    private final ppa<T> b;
    private a<T> c;

    /* compiled from: DerivedState.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0007\u0018\u0000 6*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001.B\u0007¢\u0006\u0004\b4\u00105J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u001a\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0018\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R0\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0010\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014R\u0014\u0010/\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010&R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00067"}, d2 = {"Ls03$a;", "T", "Lbva;", "Lt03$a;", "value", "", c.a, DateTokenConverter.CONVERTER_KEY, "Lt03;", "derivedState", "Lyoa;", "snapshot", "", "l", "", Image.TYPE_MEDIUM, "I", "getValidSnapshotId", "()I", "p", "(I)V", "validSnapshotId", "getValidSnapshotWriteCount", "q", "validSnapshotWriteCount", "Lkt4;", "Lzua;", e.a, "Lkt4;", "k", "()Lkt4;", "r", "(Lkt4;)V", "_dependencies", "", "f", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "n", "(Ljava/lang/Object;)V", "result", "g", "getResultHash", "o", "resultHash", "a", "currentValue", "", "b", "()[Ljava/lang/Object;", "dependencies", "<init>", "()V", Image.TYPE_HIGH, "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: s03$a */
    /* loaded from: classes.dex */
    public static final class a<T> extends bva implements t03.a<T> {
        public static final C0643a h = new C0643a(null);
        public static final int i = 8;
        private static final Object j = new Object();
        private int c;
        private int d;
        private kt4<zua, Integer> e;
        private Object f = j;
        private int g;

        /* compiled from: DerivedState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Ls03$a$a;", "", "Unset", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: s03$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0643a {
            private C0643a() {
            }

            public /* synthetic */ C0643a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Object a() {
                return a.j;
            }
        }

        @Override // defpackage.t03.a
        public T a() {
            return (T) this.f;
        }

        @Override // defpackage.t03.a
        public Object[] b() {
            Object[] g;
            kt4<zua, Integer> kt4Var = this.e;
            if (kt4Var == null || (g = kt4Var.g()) == null) {
                return new Object[0];
            }
            return g;
        }

        @Override // defpackage.bva
        public void c(bva bvaVar) {
            z65.h(bvaVar, "value");
            a aVar = (a) bvaVar;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
        }

        @Override // defpackage.bva
        public bva d() {
            return new a();
        }

        public final Object j() {
            return this.f;
        }

        public final kt4<zua, Integer> k() {
            return this.e;
        }

        public final boolean l(t03<?> t03Var, yoa yoaVar) {
            boolean z;
            boolean z2;
            z65.h(t03Var, "derivedState");
            z65.h(yoaVar, "snapshot");
            synchronized (fpa.G()) {
                z = true;
                if (this.c == yoaVar.f()) {
                    if (this.d == yoaVar.j()) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            if (this.f == j || (z2 && this.g != m(t03Var, yoaVar))) {
                z = false;
            }
            if (z && z2) {
                synchronized (fpa.G()) {
                    this.c = yoaVar.f();
                    this.d = yoaVar.j();
                    Unit unit = Unit.a;
                }
            }
            return z;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:13:0x0030, B:15:0x0037, B:25:0x0076, B:18:0x0053, B:20:0x0057, B:24:0x0068, B:23:0x0060, B:26:0x0079), top: B:46:0x0030 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int m(defpackage.t03<?> r10, defpackage.yoa r11) {
            /*
                r9 = this;
                java.lang.String r0 = "derivedState"
                defpackage.z65.h(r10, r0)
                java.lang.String r0 = "snapshot"
                defpackage.z65.h(r11, r0)
                java.lang.Object r0 = defpackage.fpa.G()
                monitor-enter(r0)
                kt4<zua, java.lang.Integer> r1 = r9.e     // Catch: java.lang.Throwable -> La7
                monitor-exit(r0)
                r0 = 7
                if (r1 == 0) goto La6
                gr6 r2 = defpackage.qpa.a()
                int r3 = r2.s()
                r4 = 0
                r5 = 1
                if (r3 <= 0) goto L30
                java.lang.Object[] r6 = r2.r()
                r7 = 0
            L26:
                r8 = r6[r7]
                u03 r8 = (defpackage.u03) r8
                r8.a(r10)
                int r7 = r7 + r5
                if (r7 < r3) goto L26
            L30:
                int r3 = r1.h()     // Catch: java.lang.Throwable -> L5e
                r6 = 0
            L35:
                if (r6 >= r3) goto L79
                java.lang.Object[] r7 = r1.g()     // Catch: java.lang.Throwable -> L5e
                r7 = r7[r6]     // Catch: java.lang.Throwable -> L5e
                java.lang.String r8 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"
                defpackage.z65.f(r7, r8)     // Catch: java.lang.Throwable -> L5e
                java.lang.Object[] r8 = r1.i()     // Catch: java.lang.Throwable -> L5e
                r8 = r8[r6]     // Catch: java.lang.Throwable -> L5e
                java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L5e
                int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L5e
                zua r7 = (defpackage.zua) r7     // Catch: java.lang.Throwable -> L5e
                if (r8 == r5) goto L53
                goto L76
            L53:
                boolean r8 = r7 instanceof defpackage.s03     // Catch: java.lang.Throwable -> L5e
                if (r8 == 0) goto L60
                s03 r7 = (defpackage.s03) r7     // Catch: java.lang.Throwable -> L5e
                bva r7 = r7.m(r11)     // Catch: java.lang.Throwable -> L5e
                goto L68
            L5e:
                r11 = move-exception
                goto L90
            L60:
                bva r7 = r7.i()     // Catch: java.lang.Throwable -> L5e
                bva r7 = defpackage.fpa.E(r7, r11)     // Catch: java.lang.Throwable -> L5e
            L68:
                int r0 = r0 * 31
                int r8 = defpackage.f6.a(r7)     // Catch: java.lang.Throwable -> L5e
                int r0 = r0 + r8
                int r0 = r0 * 31
                int r7 = r7.f()     // Catch: java.lang.Throwable -> L5e
                int r0 = r0 + r7
            L76:
                int r6 = r6 + 1
                goto L35
            L79:
                kotlin.Unit r11 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L5e
                int r11 = r2.s()
                if (r11 <= 0) goto La6
                java.lang.Object[] r1 = r2.r()
            L85:
                r2 = r1[r4]
                u03 r2 = (defpackage.u03) r2
                r2.b(r10)
                int r4 = r4 + r5
                if (r4 < r11) goto L85
                goto La6
            L90:
                int r0 = r2.s()
                if (r0 <= 0) goto La5
                java.lang.Object[] r1 = r2.r()
            L9a:
                r2 = r1[r4]
                u03 r2 = (defpackage.u03) r2
                r2.b(r10)
                int r4 = r4 + r5
                if (r4 >= r0) goto La5
                goto L9a
            La5:
                throw r11
            La6:
                return r0
            La7:
                r10 = move-exception
                monitor-exit(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.s03.a.m(t03, yoa):int");
        }

        public final void n(Object obj) {
            this.f = obj;
        }

        public final void o(int i2) {
            this.g = i2;
        }

        public final void p(int i2) {
            this.c = i2;
        }

        public final void q(int i2) {
            this.d = i2;
        }

        public final void r(kt4<zua, Integer> kt4Var) {
            this.e = kt4Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DerivedState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: s03$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<Object, Unit> {
        final /* synthetic */ s03<T> a;
        final /* synthetic */ kt4<zua, Integer> b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s03<T> s03Var, kt4<zua, Integer> kt4Var, int i) {
            super(1);
            this.a = s03Var;
            this.b = kt4Var;
            this.c = i;
        }

        public final void a(Object obj) {
            xpa xpaVar;
            int i;
            z65.h(obj, "it");
            if (obj != this.a) {
                if (obj instanceof zua) {
                    xpaVar = rpa.a;
                    Object a = xpaVar.a();
                    z65.e(a);
                    int intValue = ((Number) a).intValue();
                    kt4<zua, Integer> kt4Var = this.b;
                    int i2 = intValue - this.c;
                    Integer f = kt4Var.f(obj);
                    if (f != null) {
                        i = f.intValue();
                    } else {
                        i = Integer.MAX_VALUE;
                    }
                    kt4Var.l(obj, Integer.valueOf(Math.min(i2, i)));
                    return;
                }
                return;
            }
            throw new IllegalStateException("A derived state calculation cannot read itself".toString());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a(obj);
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s03(Function0<? extends T> function0, ppa<T> ppaVar) {
        z65.h(function0, "calculation");
        this.a = function0;
        this.b = ppaVar;
        this.c = new a<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:10:0x0023, B:12:0x0033, B:17:0x003d, B:19:0x0044, B:21:0x006f, B:22:0x0072, B:23:0x0075), top: B:82:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:10:0x0023, B:12:0x0033, B:17:0x003d, B:19:0x0044, B:21:0x006f, B:22:0x0072, B:23:0x0075), top: B:82:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.s03.a<T> n(defpackage.s03.a<T> r10, defpackage.yoa r11, boolean r12, kotlin.jvm.functions.Function0<? extends T> r13) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s03.n(s03$a, yoa, boolean, kotlin.jvm.functions.Function0):s03$a");
    }

    private final String o() {
        a aVar = (a) fpa.D(this.c);
        if (aVar.l(this, yoa.e.b())) {
            return String.valueOf(aVar.j());
        }
        return "<Not calculated>";
    }

    @Override // defpackage.t03
    public ppa<T> a() {
        return this.b;
    }

    @Override // defpackage.zua
    public void g(bva bvaVar) {
        z65.h(bvaVar, "value");
        this.c = (a) bvaVar;
    }

    @Override // defpackage.cua
    public T getValue() {
        yoa.a aVar = yoa.e;
        Function1<Object, Unit> h = aVar.b().h();
        if (h != null) {
            h.invoke(this);
        }
        return (T) n((a) fpa.D(this.c), aVar.b(), true, this.a).j();
    }

    @Override // defpackage.zua
    public bva i() {
        return this.c;
    }

    @Override // defpackage.zua
    public /* synthetic */ bva j(bva bvaVar, bva bvaVar2, bva bvaVar3) {
        return yua.a(this, bvaVar, bvaVar2, bvaVar3);
    }

    @Override // defpackage.t03
    public t03.a<T> l() {
        return n((a) fpa.D(this.c), yoa.e.b(), false, this.a);
    }

    public final bva m(yoa yoaVar) {
        z65.h(yoaVar, "snapshot");
        return n((a) fpa.E(this.c, yoaVar), yoaVar, false, this.a);
    }

    public String toString() {
        a aVar = (a) fpa.D(this.c);
        return "DerivedState(value=" + o() + ")@" + hashCode();
    }
}
