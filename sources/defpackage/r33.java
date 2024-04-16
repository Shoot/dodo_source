package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.sk9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
/* compiled from: DispatchedTask.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u001a \u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a.\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002\"\u0018\u0010\u000e\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0010\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"T", "Lq33;", "", "mode", "", "a", "Lcv1;", "delegate", "", "undispatched", DateTokenConverter.CONVERTER_KEY, e.a, "b", "(I)Z", "isCancellableMode", c.a, "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: r33  reason: default package */
/* loaded from: classes3.dex */
public final class r33 {
    public static final <T> void a(q33<? super T> q33Var, int i) {
        boolean z;
        cv1<? super T> c = q33Var.c();
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (c instanceof n33) && b(i) == b(q33Var.c)) {
            kx1 kx1Var = ((n33) c).d;
            CoroutineContext context = c.getContext();
            if (kx1Var.W(context)) {
                kx1Var.x(context, q33Var);
                return;
            } else {
                e(q33Var);
                return;
            }
        }
        d(q33Var, c, z);
    }

    public static final boolean b(int i) {
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public static final boolean c(int i) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public static final <T> void d(q33<? super T> q33Var, cv1<? super T> cv1Var, boolean z) {
        Object f;
        jqb<?> jqbVar;
        boolean h1;
        Object h = q33Var.h();
        Throwable d = q33Var.d(h);
        if (d != null) {
            sk9.a aVar = sk9.b;
            f = vk9.a(d);
        } else {
            sk9.a aVar2 = sk9.b;
            f = q33Var.f(h);
        }
        Object b = sk9.b(f);
        if (z) {
            n33 n33Var = (n33) cv1Var;
            cv1<T> cv1Var2 = n33Var.e;
            Object obj = n33Var.g;
            CoroutineContext context = cv1Var2.getContext();
            Object c = wdb.c(context, obj);
            if (c != wdb.a) {
                jqbVar = jx1.g(cv1Var2, context, c);
            } else {
                jqbVar = null;
            }
            try {
                n33Var.e.resumeWith(b);
                Unit unit = Unit.a;
                if (jqbVar != null) {
                    if (!h1) {
                        return;
                    }
                }
                return;
            } finally {
                if (jqbVar == null || jqbVar.h1()) {
                    wdb.a(context, c);
                }
            }
        }
        cv1Var.resumeWith(b);
    }

    private static final void e(q33<?> q33Var) {
        yk3 b = zdb.a.b();
        if (b.I0()) {
            b.x0(q33Var);
            return;
        }
        b.E0(true);
        try {
            d(q33Var, q33Var.c(), true);
            do {
            } while (b.N0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
