package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.sk9;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
/* compiled from: DispatchedContinuation.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aH\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0012\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00060\nH\u0000\"\u001a\u0010\u0012\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0014\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u0012\u0004\b\u0013\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"T", "Lcv1;", "Lsk9;", "result", "Lkotlin/Function1;", "", "", "onCancellation", "b", "(Lcv1;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Ln33;", "", DateTokenConverter.CONVERTER_KEY, "Lr3b;", "a", "Lr3b;", "getUNDEFINED$annotations", "()V", "UNDEFINED", "getREUSABLE_CLAIMED$annotations", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: o33 */
/* loaded from: classes3.dex */
public final class o33 {
    private static final r3b a = new r3b("UNDEFINED");
    public static final r3b b = new r3b("REUSABLE_CLAIMED");

    public static final /* synthetic */ r3b a() {
        return a;
    }

    public static final <T> void b(cv1<? super T> cv1Var, Object obj, Function1<? super Throwable, Unit> function1) {
        jqb<?> jqbVar;
        if (cv1Var instanceof n33) {
            n33 n33Var = (n33) cv1Var;
            Object c = xl1.c(obj, function1);
            if (n33Var.d.W(n33Var.getContext())) {
                n33Var.f = c;
                n33Var.c = 1;
                n33Var.d.x(n33Var.getContext(), n33Var);
                return;
            }
            yk3 b2 = zdb.a.b();
            if (b2.I0()) {
                n33Var.f = c;
                n33Var.c = 1;
                b2.x0(n33Var);
                return;
            }
            b2.E0(true);
            try {
                l95 l95Var = (l95) n33Var.getContext().c(l95.M);
                if (l95Var != null && !l95Var.b()) {
                    CancellationException q = l95Var.q();
                    n33Var.a(c, q);
                    sk9.a aVar = sk9.b;
                    n33Var.resumeWith(sk9.b(vk9.a(q)));
                } else {
                    cv1<T> cv1Var2 = n33Var.e;
                    Object obj2 = n33Var.g;
                    CoroutineContext context = cv1Var2.getContext();
                    Object c2 = wdb.c(context, obj2);
                    if (c2 != wdb.a) {
                        jqbVar = jx1.g(cv1Var2, context, c2);
                    } else {
                        jqbVar = null;
                    }
                    n33Var.e.resumeWith(obj);
                    Unit unit = Unit.a;
                    if (jqbVar == null || jqbVar.h1()) {
                        wdb.a(context, c2);
                    }
                }
                do {
                } while (b2.N0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        cv1Var.resumeWith(obj);
    }

    public static /* synthetic */ void c(cv1 cv1Var, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        b(cv1Var, obj, function1);
    }

    public static final boolean d(n33<? super Unit> n33Var) {
        Unit unit = Unit.a;
        yk3 b2 = zdb.a.b();
        if (b2.K0()) {
            return false;
        }
        if (b2.I0()) {
            n33Var.f = unit;
            n33Var.c = 1;
            b2.x0(n33Var);
            return true;
        }
        b2.E0(true);
        try {
            n33Var.run();
            do {
            } while (b2.N0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
