package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: BringIntoViewRequester.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0002H\u0016J\u001d\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Ldg0;", "Lwf0;", "", "j1", "P0", "Lag0;", "requester", "k1", "Q0", "Lk99;", "rect", "i1", "(Lk99;Lcv1;)Ljava/lang/Object;", "p", "Lag0;", "<init>", "(Lag0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: dg0  reason: default package */
/* loaded from: classes.dex */
public final class dg0 extends wf0 {
    private ag0 p;

    /* compiled from: BringIntoViewRequester.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lk99;", "a", "()Lk99;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: dg0$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<k99> {
        final /* synthetic */ k99 a;
        final /* synthetic */ dg0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k99 k99Var, dg0 dg0Var) {
            super(0);
            this.a = k99Var;
            this.b = dg0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final k99 invoke() {
            k99 k99Var = this.a;
            if (k99Var == null) {
                om5 f1 = this.b.f1();
                if (f1 != null) {
                    return ina.c(x55.c(f1.a()));
                }
                return null;
            }
            return k99Var;
        }
    }

    public dg0(ag0 ag0Var) {
        z65.h(ag0Var, "requester");
        this.p = ag0Var;
    }

    private final void j1() {
        ag0 ag0Var = this.p;
        if (ag0Var instanceof bg0) {
            z65.f(ag0Var, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((bg0) ag0Var).b().x(this);
        }
    }

    @Override // defpackage.sm6.c
    public void P0() {
        k1(this.p);
    }

    @Override // defpackage.sm6.c
    public void Q0() {
        j1();
    }

    public final Object i1(k99 k99Var, cv1<? super Unit> cv1Var) {
        Object d;
        yf0 h1 = h1();
        om5 f1 = f1();
        if (f1 == null) {
            return Unit.a;
        }
        Object a2 = h1.a(f1, new a(k99Var, this), cv1Var);
        d = c75.d();
        if (a2 == d) {
            return a2;
        }
        return Unit.a;
    }

    public final void k1(ag0 ag0Var) {
        z65.h(ag0Var, "requester");
        j1();
        if (ag0Var instanceof bg0) {
            ((bg0) ag0Var).b().b(this);
        }
        this.p = ag0Var;
    }
}
