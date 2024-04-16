package androidx.compose.foundation;

import androidx.compose.foundation.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/g;", "Landroidx/compose/foundation/b;", "Lie8;", "", "o1", "(Lie8;Lcv1;)Ljava/lang/Object;", "", "enabled", "Loq6;", "interactionSource", "Lkotlin/Function0;", "onClick", "s1", "Landroidx/compose/foundation/a$a;", "interactionData", "<init>", "(ZLoq6;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/a$a;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class g extends androidx.compose.foundation.b {

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Ldj8;", "Ls67;", "offset", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.ClickablePointerInputNode$pointerInput$2", f = "Clickable.kt", l = {892}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends f3b implements y84<dj8, s67, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        /* synthetic */ long c;

        a(cv1<? super a> cv1Var) {
            super(3, cv1Var);
        }

        public final Object i(dj8 dj8Var, long j, cv1<? super Unit> cv1Var) {
            a aVar = new a(cv1Var);
            aVar.b = dj8Var;
            aVar.c = j;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Object invoke(dj8 dj8Var, s67 s67Var, cv1<? super Unit> cv1Var) {
            return i(dj8Var, s67Var.t(), cv1Var);
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
                dj8 dj8Var = (dj8) this.b;
                long j = this.c;
                if (g.this.k1()) {
                    g gVar = g.this;
                    this.a = 1;
                    if (gVar.n1(dj8Var, j, this) == d) {
                        return d;
                    }
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls67;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<s67, Unit> {
        b() {
            super(1);
        }

        public final void a(long j) {
            if (g.this.k1()) {
                g.this.m1().invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(s67 s67Var) {
            a(s67Var.t());
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z, oq6 oq6Var, Function0<Unit> function0, a.C0013a c0013a) {
        super(z, oq6Var, function0, c0013a, null);
        z65.h(oq6Var, "interactionSource");
        z65.h(function0, "onClick");
        z65.h(c0013a, "interactionData");
    }

    @Override // androidx.compose.foundation.b
    protected Object o1(ie8 ie8Var, cv1<? super Unit> cv1Var) {
        Object d;
        a.C0013a l1 = l1();
        long b2 = x55.b(ie8Var.a());
        l1.d(x67.a(s55.h(b2), s55.i(b2)));
        Object d2 = m6b.d(ie8Var, new a(null), new b(), cv1Var);
        d = c75.d();
        if (d2 == d) {
            return d2;
        }
        return Unit.a;
    }

    public final void s1(boolean z, oq6 oq6Var, Function0<Unit> function0) {
        z65.h(oq6Var, "interactionSource");
        z65.h(function0, "onClick");
        p1(z);
        r1(function0);
        q1(oq6Var);
    }
}
