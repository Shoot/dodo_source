package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 +2\u00020\u0001:\u0001\u001cB\u0019\b\u0004\u0012\u0006\u0010(\u001a\u00020\u0018\u0012\u0006\u0010\"\u001a\u00020\u001b¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0006\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0011J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0011J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0000H ¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0000H ¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH ¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H ¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010(\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00188\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010'R\"\u0010/\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u00101\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0003\u0010$\u0012\u0004\b0\u0010\u0012R$\u00105\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00188P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010'R\u0014\u00107\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010,R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048 X \u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\"\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048 X \u0004¢\u0006\u0006\u001a\u0004\b:\u00109\u0082\u0001\u0004>?@A¨\u0006B"}, d2 = {"Lyoa;", "", "", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Function1;", "readObserver", "x", "l", "snapshot", Image.TYPE_SMALL, Image.TYPE_MEDIUM, "(Lyoa;)V", "n", "Lzua;", "state", "p", "(Lzua;)V", "o", "()V", "b", c.a, "r", "z", "q", "", "y", "()I", "Lbpa;", "a", "Lbpa;", "g", "()Lbpa;", "v", "(Lbpa;)V", "invalid", "<set-?>", "I", "f", "u", "(I)V", "id", "", "Z", e.a, "()Z", "t", "(Z)V", "disposed", "getPinningTrackingHandle$annotations", "pinningTrackingHandle", "value", "j", "w", "writeCount", "i", "readOnly", Image.TYPE_HIGH, "()Lkotlin/jvm/functions/Function1;", "k", "writeObserver", "<init>", "(ILbpa;)V", "Ldr6;", "Ljv6;", "Lo79;", "Lqlb;", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: yoa  reason: default package */
/* loaded from: classes.dex */
public abstract class yoa {
    public static final a e = new a(null);
    public static final int f = 8;
    private bpa a;
    private int b;
    private boolean c;
    private int d;

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002JQ\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0001J&\u0010\u0013\u001a\u00020\u00122\u001e\u0010\u0011\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u000fJ\u001a\u0010\u0014\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0015\u001a\u00020\u0003J\u0006\u0010\u0016\u001a\u00020\u0003R\u0011\u0010\u0019\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lyoa$a;", "", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "Ldr6;", Image.TYPE_HIGH, "T", "Lkotlin/Function0;", "block", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lyoa;", "a", "Lkotlin/Function2;", "", "observer", "Lj67;", e.a, "f", c.a, "g", "b", "()Lyoa;", "current", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: yoa$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* compiled from: Snapshot.kt */
        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: yoa$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0753a implements j67 {
            final /* synthetic */ Function2<Set<? extends Object>, yoa, Unit> a;

            /* JADX WARN: Multi-variable type inference failed */
            C0753a(Function2<? super Set<? extends Object>, ? super yoa, Unit> function2) {
                this.a = function2;
            }

            @Override // defpackage.j67
            public final void a() {
                List list;
                Function2<Set<? extends Object>, yoa, Unit> function2 = this.a;
                synchronized (fpa.G()) {
                    list = fpa.h;
                    list.remove(function2);
                    Unit unit = Unit.a;
                }
            }
        }

        /* compiled from: Snapshot.kt */
        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: yoa$a$b */
        /* loaded from: classes.dex */
        static final class b implements j67 {
            final /* synthetic */ Function1<Object, Unit> a;

            b(Function1<Object, Unit> function1) {
                this.a = function1;
            }

            @Override // defpackage.j67
            public final void a() {
                List list;
                Function1<Object, Unit> function1 = this.a;
                synchronized (fpa.G()) {
                    list = fpa.i;
                    list.remove(function1);
                }
                fpa.z();
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final yoa a() {
            xpa xpaVar;
            xpaVar = fpa.b;
            return fpa.C((yoa) xpaVar.a(), null, false, 6, null);
        }

        public final yoa b() {
            return fpa.F();
        }

        public final void c() {
            fpa.F().o();
        }

        public final <T> T d(Function1<Object, Unit> function1, Function1<Object, Unit> function12, Function0<? extends T> function0) {
            xpa xpaVar;
            dr6 dr6Var;
            yoa plbVar;
            z65.h(function0, "block");
            if (function1 != null || function12 != null) {
                xpaVar = fpa.b;
                yoa yoaVar = (yoa) xpaVar.a();
                if (yoaVar != null && !(yoaVar instanceof dr6)) {
                    if (function1 == null) {
                        return function0.invoke();
                    }
                    plbVar = yoaVar.x(function1);
                } else {
                    if (yoaVar instanceof dr6) {
                        dr6Var = (dr6) yoaVar;
                    } else {
                        dr6Var = null;
                    }
                    plbVar = new plb(dr6Var, function1, function12, true, false);
                }
                try {
                    yoa l = plbVar.l();
                    T invoke = function0.invoke();
                    plbVar.s(l);
                    return invoke;
                } finally {
                    plbVar.d();
                }
            }
            return function0.invoke();
        }

        public final j67 e(Function2<? super Set<? extends Object>, ? super yoa, Unit> function2) {
            Function1 function1;
            List list;
            z65.h(function2, "observer");
            function1 = fpa.a;
            fpa.y(function1);
            synchronized (fpa.G()) {
                list = fpa.h;
                list.add(function2);
            }
            return new C0753a(function2);
        }

        public final j67 f(Function1<Object, Unit> function1) {
            List list;
            z65.h(function1, "observer");
            synchronized (fpa.G()) {
                list = fpa.i;
                list.add(function1);
            }
            fpa.z();
            return new b(function1);
        }

        public final void g() {
            AtomicReference atomicReference;
            boolean z;
            synchronized (fpa.G()) {
                atomicReference = fpa.j;
                lt4<zua> E = ((androidx.compose.runtime.snapshots.a) atomicReference.get()).E();
                z = false;
                if (E != null) {
                    if (E.u()) {
                        z = true;
                    }
                }
            }
            if (z) {
                fpa.z();
            }
        }

        public final dr6 h(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            dr6 dr6Var;
            dr6 P;
            yoa F = fpa.F();
            if (F instanceof dr6) {
                dr6Var = (dr6) F;
            } else {
                dr6Var = null;
            }
            if (dr6Var != null && (P = dr6Var.P(function1, function12)) != null) {
                return P;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
    }

    public /* synthetic */ yoa(int i, bpa bpaVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bpaVar);
    }

    public final void b() {
        synchronized (fpa.G()) {
            c();
            r();
            Unit unit = Unit.a;
        }
    }

    public void c() {
        fpa.d = fpa.d.u(f());
    }

    public void d() {
        this.c = true;
        synchronized (fpa.G()) {
            q();
            Unit unit = Unit.a;
        }
    }

    public final boolean e() {
        return this.c;
    }

    public int f() {
        return this.b;
    }

    public bpa g() {
        return this.a;
    }

    public abstract Function1<Object, Unit> h();

    public abstract boolean i();

    public int j() {
        return 0;
    }

    public abstract Function1<Object, Unit> k();

    public yoa l() {
        xpa xpaVar;
        xpa xpaVar2;
        xpaVar = fpa.b;
        yoa yoaVar = (yoa) xpaVar.a();
        xpaVar2 = fpa.b;
        xpaVar2.b(this);
        return yoaVar;
    }

    public abstract void m(yoa yoaVar);

    public abstract void n(yoa yoaVar);

    public abstract void o();

    public abstract void p(zua zuaVar);

    public final void q() {
        int i = this.d;
        if (i >= 0) {
            fpa.W(i);
            this.d = -1;
        }
    }

    public void r() {
        q();
    }

    public void s(yoa yoaVar) {
        xpa xpaVar;
        xpaVar = fpa.b;
        xpaVar.b(yoaVar);
    }

    public final void t(boolean z) {
        this.c = z;
    }

    public void u(int i) {
        this.b = i;
    }

    public void v(bpa bpaVar) {
        z65.h(bpaVar, "<set-?>");
        this.a = bpaVar;
    }

    public void w(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    public abstract yoa x(Function1<Object, Unit> function1);

    public final int y() {
        int i = this.d;
        this.d = -1;
        return i;
    }

    public final void z() {
        if (!this.c) {
            return;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }

    private yoa(int i, bpa bpaVar) {
        this.a = bpaVar;
        this.b = i;
        this.d = i != 0 ? fpa.a0(i, g()) : -1;
    }
}
