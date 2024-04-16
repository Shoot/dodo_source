package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.sk9;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;
/* compiled from: Undispatched.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aT\u0010\u000b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aT\u0010\r\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\f\u001aV\u0010\u0010\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\n\u001a\u00028\u00012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aV\u0010\u0012\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\n\u001a\u00028\u00012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"T", "Lkotlin/Function1;", "Lcv1;", "", "completion", "", "b", "(Lkotlin/jvm/functions/Function1;Lcv1;)V", "R", "Lkotlin/Function2;", "receiver", c.a, "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lcv1;)V", "a", "Ltw9;", "block", DateTokenConverter.CONVERTER_KEY, "(Ltw9;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", e.a, "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: kqb  reason: default package */
/* loaded from: classes3.dex */
public final class kqb {
    public static final <R, T> void a(Function2<? super R, ? super cv1<? super T>, ? extends Object> function2, R r, cv1<? super T> cv1Var) {
        Object d;
        cv1 a = io2.a(cv1Var);
        try {
            CoroutineContext context = cv1Var.getContext();
            Object c = wdb.c(context, null);
            Object invoke = ((Function2) unb.e(function2, 2)).invoke(r, a);
            wdb.a(context, c);
            d = c75.d();
            if (invoke != d) {
                a.resumeWith(sk9.b(invoke));
            }
        } catch (Throwable th) {
            sk9.a aVar = sk9.b;
            a.resumeWith(sk9.b(vk9.a(th)));
        }
    }

    public static final <T> void b(Function1<? super cv1<? super T>, ? extends Object> function1, cv1<? super T> cv1Var) {
        Object d;
        cv1 a = io2.a(cv1Var);
        try {
            Object invoke = ((Function1) unb.e(function1, 1)).invoke(a);
            d = c75.d();
            if (invoke != d) {
                a.resumeWith(sk9.b(invoke));
            }
        } catch (Throwable th) {
            sk9.a aVar = sk9.b;
            a.resumeWith(sk9.b(vk9.a(th)));
        }
    }

    public static final <R, T> void c(Function2<? super R, ? super cv1<? super T>, ? extends Object> function2, R r, cv1<? super T> cv1Var) {
        Object d;
        cv1 a = io2.a(cv1Var);
        try {
            Object invoke = ((Function2) unb.e(function2, 2)).invoke(r, a);
            d = c75.d();
            if (invoke != d) {
                a.resumeWith(sk9.b(invoke));
            }
        } catch (Throwable th) {
            sk9.a aVar = sk9.b;
            a.resumeWith(sk9.b(vk9.a(th)));
        }
    }

    public static final <T, R> Object d(tw9<? super T> tw9Var, R r, Function2<? super R, ? super cv1<? super T>, ? extends Object> function2) {
        Object il1Var;
        Object d;
        Object d2;
        Object d3;
        try {
            il1Var = ((Function2) unb.e(function2, 2)).invoke(r, tw9Var);
        } catch (Throwable th) {
            il1Var = new il1(th, false, 2, null);
        }
        d = c75.d();
        if (il1Var == d) {
            d3 = c75.d();
            return d3;
        }
        Object D0 = tw9Var.D0(il1Var);
        if (D0 == w95.b) {
            d2 = c75.d();
            return d2;
        } else if (!(D0 instanceof il1)) {
            return w95.h(D0);
        } else {
            throw ((il1) D0).a;
        }
    }

    public static final <T, R> Object e(tw9<? super T> tw9Var, R r, Function2<? super R, ? super cv1<? super T>, ? extends Object> function2) {
        Object il1Var;
        Object d;
        Object d2;
        Object d3;
        try {
            il1Var = ((Function2) unb.e(function2, 2)).invoke(r, tw9Var);
        } catch (Throwable th) {
            il1Var = new il1(th, false, 2, null);
        }
        d = c75.d();
        if (il1Var == d) {
            d3 = c75.d();
            return d3;
        }
        Object D0 = tw9Var.D0(il1Var);
        if (D0 == w95.b) {
            d2 = c75.d();
            return d2;
        }
        if (D0 instanceof il1) {
            Throwable th2 = ((il1) D0).a;
            if ((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).a == tw9Var) {
                if (il1Var instanceof il1) {
                    throw ((il1) il1Var).a;
                }
            } else {
                throw th2;
            }
        } else {
            il1Var = w95.h(D0);
        }
        return il1Var;
    }
}
