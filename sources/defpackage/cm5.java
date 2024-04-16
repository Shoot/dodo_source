package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.sk9;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: Latch.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcm5;", "", "", DateTokenConverter.CONVERTER_KEY, "f", c.a, "(Lcv1;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "lock", "", "Lcv1;", "b", "Ljava/util/List;", "awaiters", "spareList", "", "Z", "_isOpen", e.a, "()Z", "isOpen", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: cm5  reason: default package */
/* loaded from: classes.dex */
public final class cm5 {
    private final Object a = new Object();
    private List<cv1<Unit>> b = new ArrayList();
    private List<cv1<Unit>> c = new ArrayList();
    private boolean d = true;

    /* compiled from: Latch.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: cm5$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<Throwable, Unit> {
        final /* synthetic */ fn0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(fn0<? super Unit> fn0Var) {
            super(1);
            this.b = fn0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            Object obj = cm5.this.a;
            cm5 cm5Var = cm5.this;
            fn0<Unit> fn0Var = this.b;
            synchronized (obj) {
                cm5Var.b.remove(fn0Var);
                Unit unit = Unit.a;
            }
        }
    }

    public final Object c(cv1<? super Unit> cv1Var) {
        cv1 c;
        Object d;
        Object d2;
        if (!e()) {
            c = b75.c(cv1Var);
            gn0 gn0Var = new gn0(c, 1);
            gn0Var.w();
            synchronized (this.a) {
                this.b.add(gn0Var);
            }
            gn0Var.u(new a(gn0Var));
            Object s = gn0Var.s();
            d = c75.d();
            if (s == d) {
                io2.c(cv1Var);
            }
            d2 = c75.d();
            if (s == d2) {
                return s;
            }
            return Unit.a;
        }
        return Unit.a;
    }

    public final void d() {
        synchronized (this.a) {
            this.d = false;
            Unit unit = Unit.a;
        }
    }

    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }

    public final void f() {
        synchronized (this.a) {
            try {
                if (e()) {
                    return;
                }
                List<cv1<Unit>> list = this.b;
                this.b = this.c;
                this.c = list;
                this.d = true;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    sk9.a aVar = sk9.b;
                    list.get(i).resumeWith(sk9.b(Unit.a));
                }
                list.clear();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
