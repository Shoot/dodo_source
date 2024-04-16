package androidx.compose.foundation;

import androidx.compose.foundation.a;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B1\b\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0017\u0012\b\u0010&\u001a\u0004\u0018\u00010\u001f\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060'\u0012\u0006\u00104\u001a\u00020/¢\u0006\u0004\b;\u0010<J\u0017\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H¤@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0006H\u0016J%\u0010\u0015\u001a\u00020\u0006*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0084@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u00104\u001a\u00020/8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00170'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010)R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109\u0082\u0001\u0001=\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Landroidx/compose/foundation/b;", "Lfu2;", "Lan6;", "Lmo1;", "Lfe8;", "Lie8;", "", "o1", "(Lie8;Lcv1;)Ljava/lang/Object;", "Lkd8;", "pointerEvent", "Lmd8;", "pass", "Lw55;", "bounds", "v", "(Lkd8;Lmd8;J)V", "h0", "Ldj8;", "Ls67;", "offset", "n1", "(Ldj8;JLcv1;)Ljava/lang/Object;", "", "p", "Z", "k1", "()Z", "p1", "(Z)V", "enabled", "Loq6;", "q", "Loq6;", "getInteractionSource", "()Loq6;", "q1", "(Loq6;)V", "interactionSource", "Lkotlin/Function0;", "r", "Lkotlin/jvm/functions/Function0;", "m1", "()Lkotlin/jvm/functions/Function0;", "r1", "(Lkotlin/jvm/functions/Function0;)V", "onClick", "Landroidx/compose/foundation/a$a;", Image.TYPE_SMALL, "Landroidx/compose/foundation/a$a;", "l1", "()Landroidx/compose/foundation/a$a;", "interactionData", "t", "delayPressInteraction", "Lk3b;", "u", "Lk3b;", "pointerInputNode", "<init>", "(ZLoq6;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/a$a;)V", "Landroidx/compose/foundation/g;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class b extends fu2 implements an6, mo1, fe8 {
    private boolean p;
    private oq6 q;
    private Function0<Unit> r;
    private final a.C0013a s;
    private final Function0<Boolean> t;
    private final k3b u;

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Boolean> {
        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(((Boolean) b.this.E(sx9.a())).booleanValue() || c91.c(b.this));
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lie8;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.AbstractClickablePointerInputNode$pointerInputNode$1", f = "Clickable.kt", l = {846}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0014b extends f3b implements Function2<ie8, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;

        C0014b(cv1<? super C0014b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            C0014b c0014b = new C0014b(cv1Var);
            c0014b.b = obj;
            return c0014b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ie8 ie8Var, cv1<? super Unit> cv1Var) {
            return ((C0014b) create(ie8Var, cv1Var)).invokeSuspend(Unit.a);
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
                b bVar = b.this;
                this.a = 1;
                if (bVar.o1((ie8) this.b, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public /* synthetic */ b(boolean z, oq6 oq6Var, Function0 function0, a.C0013a c0013a, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, oq6Var, function0, c0013a);
    }

    @Override // defpackage.fe8
    public /* synthetic */ boolean B() {
        return ee8.a(this);
    }

    @Override // defpackage.an6
    public /* synthetic */ ym6 D() {
        return zm6.b(this);
    }

    @Override // defpackage.dn6
    public /* synthetic */ Object E(um6 um6Var) {
        return zm6.a(this, um6Var);
    }

    @Override // defpackage.fe8
    public void h0() {
        this.u.h0();
    }

    @Override // defpackage.fe8
    public /* synthetic */ void j0() {
        ee8.b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean k1() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final a.C0013a l1() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Function0<Unit> m1() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object n1(dj8 dj8Var, long j, cv1<? super Unit> cv1Var) {
        Object d;
        oq6 oq6Var = this.q;
        if (oq6Var != null) {
            Object a2 = e.a(dj8Var, j, oq6Var, this.s, this.t, cv1Var);
            d = c75.d();
            if (a2 == d) {
                return a2;
            }
        }
        return Unit.a;
    }

    protected abstract Object o1(ie8 ie8Var, cv1<? super Unit> cv1Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p1(boolean z) {
        this.p = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q1(oq6 oq6Var) {
        this.q = oq6Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r1(Function0<Unit> function0) {
        z65.h(function0, "<set-?>");
        this.r = function0;
    }

    @Override // defpackage.fe8
    public void v(kd8 kd8Var, md8 md8Var, long j) {
        z65.h(kd8Var, "pointerEvent");
        z65.h(md8Var, "pass");
        this.u.v(kd8Var, md8Var, j);
    }

    @Override // defpackage.fe8
    public /* synthetic */ boolean v0() {
        return ee8.d(this);
    }

    @Override // defpackage.fe8
    public /* synthetic */ void x0() {
        ee8.c(this);
    }

    private b(boolean z, oq6 oq6Var, Function0<Unit> function0, a.C0013a c0013a) {
        this.p = z;
        this.q = oq6Var;
        this.r = function0;
        this.s = c0013a;
        this.t = new a();
        this.u = (k3b) f1(j3b.a(new C0014b(null)));
    }
}
