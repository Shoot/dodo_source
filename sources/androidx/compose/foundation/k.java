package androidx.compose.foundation;

import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b,\u0010-J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\f\u0010\u0011\u001a\u00020\b*\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Landroidx/compose/foundation/k;", "Lfu2;", "Lu14;", "Lkm5;", "Lyaa;", "Ljg4;", "Lom5;", MessageAttributes.COORDINATES, "", Image.TYPE_MEDIUM, "Loq6;", "interactionSource", "l1", "Lk24;", "focusState", "r", "Ljba;", "U", com.huawei.hms.push.e.a, "p", "Lk24;", "Landroidx/compose/foundation/m;", "q", "Landroidx/compose/foundation/m;", "focusableSemanticsNode", "Landroidx/compose/foundation/j;", "Landroidx/compose/foundation/j;", "focusableInteractionNode", "Landroidx/compose/foundation/l;", Image.TYPE_SMALL, "Landroidx/compose/foundation/l;", "focusablePinnableContainer", "Lp24;", "t", "Lp24;", "focusedBoundsNode", "Lag0;", "u", "Lag0;", "bringIntoViewRequester", "Ldg0;", "v", "Ldg0;", "bringIntoViewRequesterNode", "<init>", "(Loq6;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class k extends fu2 implements u14, km5, yaa, jg4 {
    private k24 p;
    private final j r;
    private final ag0 u;
    private final dg0 v;
    private final m q = (m) f1(new m());
    private final l s = (l) f1(new l());
    private final p24 t = (p24) f1(new p24());

    /* compiled from: Focusable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.FocusableNode$onFocusEvent$1", f = "Focusable.kt", l = {237}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                ag0 ag0Var = k.this.u;
                this.a = 1;
                if (zf0.a(ag0Var, null, this, 1, null) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public k(oq6 oq6Var) {
        this.r = (j) f1(new j(oq6Var));
        ag0 a2 = cg0.a();
        this.u = a2;
        this.v = (dg0) f1(new dg0(a2));
    }

    @Override // defpackage.yaa
    public void U(jba jbaVar) {
        z65.h(jbaVar, "<this>");
        this.q.U(jbaVar);
    }

    @Override // defpackage.km5
    public /* synthetic */ void b(long j) {
        jm5.a(this, j);
    }

    @Override // defpackage.jg4
    public void e(om5 om5Var) {
        z65.h(om5Var, MessageAttributes.COORDINATES);
        this.t.e(om5Var);
    }

    public final void l1(oq6 oq6Var) {
        this.r.i1(oq6Var);
    }

    @Override // defpackage.km5
    public void m(om5 om5Var) {
        z65.h(om5Var, MessageAttributes.COORDINATES);
        this.v.m(om5Var);
    }

    @Override // defpackage.u14
    public void r(k24 k24Var) {
        z65.h(k24Var, "focusState");
        if (!z65.c(this.p, k24Var)) {
            boolean a2 = k24Var.a();
            if (a2) {
                sh0.d(F0(), null, null, new a(null), 3, null);
            }
            if (M0()) {
                zaa.b(this);
            }
            this.r.h1(a2);
            this.t.h1(a2);
            this.s.g1(a2);
            this.q.f1(a2);
            this.p = k24Var;
        }
    }

    @Override // defpackage.yaa
    public /* synthetic */ boolean x() {
        return xaa.a(this);
    }

    @Override // defpackage.yaa
    public /* synthetic */ boolean y0() {
        return xaa.b(this);
    }
}
