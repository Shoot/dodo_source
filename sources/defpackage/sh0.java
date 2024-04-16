package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aL\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aX\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aR\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lqx1;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lux1;", "start", "Lkotlin/Function2;", "Lcv1;", "", "", "block", "Ll95;", c.a, "(Lqx1;Lkotlin/coroutines/CoroutineContext;Lux1;Lkotlin/jvm/functions/Function2;)Ll95;", "T", "Lhs2;", "a", "(Lqx1;Lkotlin/coroutines/CoroutineContext;Lux1;Lkotlin/jvm/functions/Function2;)Lhs2;", e.a, "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: sh0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh0 {
    public static final <T> hs2<T> a(qx1 qx1Var, CoroutineContext coroutineContext, ux1 ux1Var, Function2<? super qx1, ? super cv1<? super T>, ? extends Object> function2) {
        is2 is2Var;
        CoroutineContext d = jx1.d(qx1Var, coroutineContext);
        if (ux1Var.k()) {
            is2Var = new tn5(d, function2);
        } else {
            is2Var = new is2(d, true);
        }
        ((e1) is2Var).f1(ux1Var, is2Var, function2);
        return is2Var;
    }

    public static /* synthetic */ hs2 b(qx1 qx1Var, CoroutineContext coroutineContext, ux1 ux1Var, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.a;
        }
        if ((i & 2) != 0) {
            ux1Var = ux1.DEFAULT;
        }
        return qh0.a(qx1Var, coroutineContext, ux1Var, function2);
    }

    public static final l95 c(qx1 qx1Var, CoroutineContext coroutineContext, ux1 ux1Var, Function2<? super qx1, ? super cv1<? super Unit>, ? extends Object> function2) {
        e1 ktaVar;
        CoroutineContext d = jx1.d(qx1Var, coroutineContext);
        if (ux1Var.k()) {
            ktaVar = new bo5(d, function2);
        } else {
            ktaVar = new kta(d, true);
        }
        ktaVar.f1(ux1Var, ktaVar, function2);
        return ktaVar;
    }

    public static /* synthetic */ l95 d(qx1 qx1Var, CoroutineContext coroutineContext, ux1 ux1Var, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.a;
        }
        if ((i & 2) != 0) {
            ux1Var = ux1.DEFAULT;
        }
        return qh0.c(qx1Var, coroutineContext, ux1Var, function2);
    }

    public static final <T> Object e(CoroutineContext coroutineContext, Function2<? super qx1, ? super cv1<? super T>, ? extends Object> function2, cv1<? super T> cv1Var) {
        Object h1;
        Object d;
        CoroutineContext context = cv1Var.getContext();
        CoroutineContext e = jx1.e(context, coroutineContext);
        q95.k(e);
        if (e == context) {
            tw9 tw9Var = new tw9(e, cv1Var);
            h1 = kqb.d(tw9Var, tw9Var, function2);
        } else {
            d.b bVar = d.J4;
            if (z65.c(e.c(bVar), context.c(bVar))) {
                jqb jqbVar = new jqb(e, cv1Var);
                Object c = wdb.c(e, null);
                try {
                    Object d2 = kqb.d(jqbVar, jqbVar, function2);
                    wdb.a(e, c);
                    h1 = d2;
                } catch (Throwable th) {
                    wdb.a(e, c);
                    throw th;
                }
            } else {
                p33 p33Var = new p33(e, cv1Var);
                jn0.e(function2, p33Var, p33Var, null, 4, null);
                h1 = p33Var.h1();
            }
        }
        d = c75.d();
        if (h1 == d) {
            io2.c(cv1Var);
        }
        return h1;
    }
}
