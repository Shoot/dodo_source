package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\f\b\u0017\u0018\u0000 /2\u00020\u0001:\u0001`BE\b\u0000\u0012\u0006\u0010\"\u001a\u00020\u0018\u0012\u0006\u0010]\u001a\u00020\u001d\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b^\u0010_J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J8\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u001e\u0010\u000f\u001a\u00020\u00012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007H\u0016J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0017\u0010\u0015J5\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\u0015J\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0018H\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0018H\u0000¢\u0006\u0004\b%\u0010$J\u0017\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u001dH\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0010¢\u0006\u0004\b/\u00100R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\b5\u00104R\"\u0010:\u001a\u00020\u00188\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b6\u0010#\u001a\u0004\b7\u00108\"\u0004\b9\u0010$R:\u0010B\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010;2\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010;8\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b7\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR*\u0010I\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010O\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010,R\"\u0010T\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010)R\u0016\u0010*\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#R\"\u0010[\u001a\u00020U8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010X¨\u0006a"}, d2 = {"Ldr6;", "Lyoa;", "", "Q", "R", "A", "M", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "P", "Lzoa;", "C", DateTokenConverter.CONVERTER_KEY, "x", "snapshot", Image.TYPE_MEDIUM, "(Lyoa;)V", "n", "o", "()V", c.a, "r", "", "snapshotId", "", "Lbva;", "optimisticMerges", "Lbpa;", "invalidSnapshots", "H", "(ILjava/util/Map;Lbpa;)Lzoa;", "B", "id", "I", "(I)V", "K", "", "handles", "L", "([I)V", "snapshots", "J", "(Lbpa;)V", "Lzua;", "state", "p", "(Lzua;)V", "g", "Lkotlin/jvm/functions/Function1;", Image.TYPE_HIGH, "()Lkotlin/jvm/functions/Function1;", "k", "i", "j", "()I", "w", "writeCount", "Llt4;", "<set-?>", "Llt4;", "E", "()Llt4;", "O", "(Llt4;)V", "modified", "", "Ljava/util/List;", "getMerged$runtime_release", "()Ljava/util/List;", "setMerged$runtime_release", "(Ljava/util/List;)V", "merged", "l", "Lbpa;", "F", "()Lbpa;", "setPreviousIds$runtime_release", "previousIds", "[I", "G", "()[I", "setPreviousPinnedSnapshots$runtime_release", "previousPinnedSnapshots", "", "Z", "D", "()Z", "N", "(Z)V", "applied", "readOnly", "invalid", "<init>", "(ILbpa;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "a", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: dr6  reason: default package */
/* loaded from: classes.dex */
public class dr6 extends yoa {
    private static final a p = new a(null);
    public static final int q = 8;
    private static final int[] r = new int[0];
    private final Function1<Object, Unit> g;
    private final Function1<Object, Unit> h;
    private int i;
    private lt4<zua> j;
    private List<? extends zua> k;
    private bpa l;
    private int[] m;
    private int n;
    private boolean o;

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ldr6$a;", "", "", "EmptyIntArray", "[I", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: dr6$a */
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr6(int i, bpa bpaVar, Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        super(i, bpaVar, null);
        z65.h(bpaVar, "invalid");
        this.g = function1;
        this.h = function12;
        this.l = bpa.e.a();
        this.m = r;
        this.n = 1;
    }

    private final void A() {
        boolean Q;
        lt4<zua> E = E();
        if (E != null) {
            Q();
            O(null);
            int f = f();
            Object[] t = E.t();
            int size = E.size();
            for (int i = 0; i < size; i++) {
                Object obj = t[i];
                z65.f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                for (bva i2 = ((zua) obj).i(); i2 != null; i2 = i2.e()) {
                    if (i2.f() != f) {
                        Q = sc1.Q(this.l, Integer.valueOf(i2.f()));
                        if (!Q) {
                        }
                    }
                    i2.h(0);
                }
            }
        }
        b();
    }

    private final void M() {
        int length = this.m.length;
        for (int i = 0; i < length; i++) {
            fpa.W(this.m[i]);
        }
    }

    private final void Q() {
        if (!this.o) {
            return;
        }
        throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
    }

    private final void R() {
        int i;
        if (this.o) {
            i = ((yoa) this).d;
            if (i < 0) {
                throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
            }
        }
    }

    public final void B() {
        int i;
        I(f());
        Unit unit = Unit.a;
        if (!D() && !e()) {
            int f = f();
            synchronized (fpa.G()) {
                i = fpa.e;
                fpa.e = i + 1;
                u(i);
                fpa.d = fpa.d.A(f());
            }
            v(fpa.x(g(), f + 1, f()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2 A[LOOP:0: B:35:0x00e0->B:36:0x00e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe A[LOOP:1: B:42:0x00fc->B:43:0x00fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.zoa C() {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr6.C():zoa");
    }

    public final boolean D() {
        return this.o;
    }

    public lt4<zua> E() {
        return this.j;
    }

    public final bpa F() {
        return this.l;
    }

    public final int[] G() {
        return this.m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
        r15 = defpackage.fpa.U(r12, f(), r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.zoa H(int r18, java.util.Map<defpackage.bva, ? extends defpackage.bva> r19, defpackage.bpa r20) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr6.H(int, java.util.Map, bpa):zoa");
    }

    public final void I(int i) {
        synchronized (fpa.G()) {
            this.l = this.l.A(i);
            Unit unit = Unit.a;
        }
    }

    public final void J(bpa bpaVar) {
        z65.h(bpaVar, "snapshots");
        synchronized (fpa.G()) {
            this.l = this.l.z(bpaVar);
            Unit unit = Unit.a;
        }
    }

    public final void K(int i) {
        int[] u;
        if (i >= 0) {
            u = xr.u(this.m, i);
            this.m = u;
        }
    }

    public final void L(int[] iArr) {
        z65.h(iArr, "handles");
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.m;
        if (iArr2.length != 0) {
            iArr = xr.v(iArr2, iArr);
        }
        this.m = iArr;
    }

    public final void N(boolean z) {
        this.o = z;
    }

    public void O(lt4<zua> lt4Var) {
        this.j = lt4Var;
    }

    public dr6 P(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        int i;
        iv6 iv6Var;
        Function1 K;
        int i2;
        z();
        R();
        I(f());
        synchronized (fpa.G()) {
            i = fpa.e;
            fpa.e = i + 1;
            fpa.d = fpa.d.A(i);
            bpa g = g();
            v(g.A(i));
            bpa x = fpa.x(g, f() + 1, i);
            Function1 J = fpa.J(function1, h(), false, 4, null);
            K = fpa.K(function12, k());
            iv6Var = new iv6(i, x, J, K, this);
        }
        if (!D() && !e()) {
            int f = f();
            synchronized (fpa.G()) {
                i2 = fpa.e;
                fpa.e = i2 + 1;
                u(i2);
                fpa.d = fpa.d.A(f());
                Unit unit = Unit.a;
            }
            v(fpa.x(g(), f + 1, f()));
        }
        return iv6Var;
    }

    @Override // defpackage.yoa
    public void c() {
        fpa.d = fpa.d.u(f()).t(this.l);
    }

    @Override // defpackage.yoa
    public void d() {
        if (!e()) {
            super.d();
            n(this);
        }
    }

    @Override // defpackage.yoa
    public Function1<Object, Unit> h() {
        return this.g;
    }

    @Override // defpackage.yoa
    public boolean i() {
        return false;
    }

    @Override // defpackage.yoa
    public int j() {
        return this.i;
    }

    @Override // defpackage.yoa
    public Function1<Object, Unit> k() {
        return this.h;
    }

    @Override // defpackage.yoa
    public void m(yoa yoaVar) {
        z65.h(yoaVar, "snapshot");
        this.n++;
    }

    @Override // defpackage.yoa
    public void n(yoa yoaVar) {
        z65.h(yoaVar, "snapshot");
        int i = this.n;
        if (i > 0) {
            int i2 = i - 1;
            this.n = i2;
            if (i2 == 0 && !this.o) {
                A();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // defpackage.yoa
    public void o() {
        if (!this.o && !e()) {
            B();
        }
    }

    @Override // defpackage.yoa
    public void p(zua zuaVar) {
        z65.h(zuaVar, "state");
        lt4<zua> E = E();
        if (E == null) {
            E = new lt4<>();
            O(E);
        }
        E.add(zuaVar);
    }

    @Override // defpackage.yoa
    public void r() {
        M();
        super.r();
    }

    @Override // defpackage.yoa
    public void w(int i) {
        this.i = i;
    }

    @Override // defpackage.yoa
    public yoa x(Function1<Object, Unit> function1) {
        int i;
        jv6 jv6Var;
        int i2;
        z();
        R();
        int f = f();
        I(f());
        synchronized (fpa.G()) {
            i = fpa.e;
            fpa.e = i + 1;
            fpa.d = fpa.d.A(i);
            jv6Var = new jv6(i, fpa.x(g(), f + 1, i), function1, this);
        }
        if (!D() && !e()) {
            int f2 = f();
            synchronized (fpa.G()) {
                i2 = fpa.e;
                fpa.e = i2 + 1;
                u(i2);
                fpa.d = fpa.d.A(f());
                Unit unit = Unit.a;
            }
            v(fpa.x(g(), f2 + 1, f()));
        }
        return jv6Var;
    }
}
