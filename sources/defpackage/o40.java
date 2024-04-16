package defpackage;

import com.huawei.hms.push.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Await.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\b\u0004B\u001d\u0012\u0014\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lo40;", "T", "", "", "b", "(Lcv1;)Ljava/lang/Object;", "", "Lhs2;", "a", "[Lhs2;", "deferreds", "<init>", "([Lhs2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: o40  reason: default package */
/* loaded from: classes3.dex */
public final class o40<T> {
    static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(o40.class, "notCompletedCount");
    private final hs2<T>[] a;
    volatile /* synthetic */ int notCompletedCount;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Await.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R<\u0010\u001b\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0016\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lo40$a;", "Lu95;", "", "cause", "", "R", "(Ljava/lang/Throwable;)V", "Lfn0;", "", e.a, "Lfn0;", "continuation", "Lf43;", "f", "Lf43;", "V", "()Lf43;", "Y", "(Lf43;)V", "handle", "Lo40$b;", "Lo40;", "value", "U", "()Lo40$b;", "X", "(Lo40$b;)V", "disposer", "<init>", "(Lo40;Lfn0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: o40$a */
    /* loaded from: classes3.dex */
    public final class a extends u95 {
        private volatile /* synthetic */ Object _disposer = null;
        private final fn0<List<? extends T>> e;
        public f43 f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(fn0<? super List<? extends T>> fn0Var) {
            this.e = fn0Var;
        }

        @Override // defpackage.wl1
        public void R(Throwable th) {
            if (th != null) {
                Object x = this.e.x(th);
                if (x != null) {
                    this.e.x0(x);
                    o40<T>.b U = U();
                    if (U != null) {
                        U.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (o40.b.decrementAndGet(o40.this) == 0) {
                fn0<List<? extends T>> fn0Var = this.e;
                hs2[] hs2VarArr = ((o40) o40.this).a;
                ArrayList arrayList = new ArrayList(hs2VarArr.length);
                for (hs2 hs2Var : hs2VarArr) {
                    arrayList.add(hs2Var.j());
                }
                fn0Var.resumeWith(sk9.b(arrayList));
            }
        }

        public final o40<T>.b U() {
            return (b) this._disposer;
        }

        public final f43 V() {
            f43 f43Var = this.f;
            if (f43Var != null) {
                return f43Var;
            }
            z65.z("handle");
            return null;
        }

        public final void X(o40<T>.b bVar) {
            this._disposer = bVar;
        }

        public final void Y(f43 f43Var) {
            this.f = f43Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            R(th);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Await.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\r\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\r\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lo40$b;", "Lym0;", "", "b", "", "cause", "a", "", "toString", "", "Lo40$a;", "Lo40;", "[Lo40$a;", "nodes", "<init>", "(Lo40;[Lo40$a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: o40$b */
    /* loaded from: classes3.dex */
    public final class b extends ym0 {
        private final o40<T>.a[] a;

        public b(o40<T>.a[] aVarArr) {
            this.a = aVarArr;
        }

        @Override // defpackage.zm0
        public void a(Throwable th) {
            b();
        }

        public final void b() {
            for (o40<T>.a aVar : this.a) {
                aVar.V().a();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            a(th);
            return Unit.a;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.a + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o40(hs2<? extends T>[] hs2VarArr) {
        this.a = hs2VarArr;
        this.notCompletedCount = hs2VarArr.length;
    }

    public final Object b(cv1<? super List<? extends T>> cv1Var) {
        cv1 c;
        Object d;
        c = b75.c(cv1Var);
        gn0 gn0Var = new gn0(c, 1);
        gn0Var.w();
        int length = this.a.length;
        a[] aVarArr = new a[length];
        for (int i = 0; i < length; i++) {
            hs2 hs2Var = this.a[i];
            hs2Var.start();
            a aVar = new a(gn0Var);
            aVar.Y(hs2Var.r(aVar));
            Unit unit = Unit.a;
            aVarArr[i] = aVar;
        }
        o40<T>.b bVar = new b(aVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            aVarArr[i2].X(bVar);
        }
        if (gn0Var.e()) {
            bVar.b();
        } else {
            gn0Var.u(bVar);
        }
        Object s = gn0Var.s();
        d = c75.d();
        if (s == d) {
            io2.c(cv1Var);
        }
        return s;
    }
}
