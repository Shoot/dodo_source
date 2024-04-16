package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.sk9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: Cancellable.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001al\u0010\r\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u0010\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00022\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001a\u001c\u0010\u0012\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u000bH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"T", "Lkotlin/Function1;", "Lcv1;", "", "completion", "", c.a, "(Lkotlin/jvm/functions/Function1;Lcv1;)V", "R", "Lkotlin/Function2;", "receiver", "", "onCancellation", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lcv1;Lkotlin/jvm/functions/Function1;)V", "fatalCompletion", "b", e.a, "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: jn0 */
/* loaded from: classes3.dex */
public final class jn0 {
    private static final void a(cv1<?> cv1Var, Throwable th) {
        sk9.a aVar = sk9.b;
        cv1Var.resumeWith(sk9.b(vk9.a(th)));
        throw th;
    }

    public static final void b(cv1<? super Unit> cv1Var, cv1<?> cv1Var2) {
        cv1 c;
        try {
            c = b75.c(cv1Var);
            sk9.a aVar = sk9.b;
            o33.c(c, sk9.b(Unit.a), null, 2, null);
        } catch (Throwable th) {
            a(cv1Var2, th);
        }
    }

    public static final <T> void c(Function1<? super cv1<? super T>, ? extends Object> function1, cv1<? super T> cv1Var) {
        cv1 a;
        cv1 c;
        try {
            a = b75.a(function1, cv1Var);
            c = b75.c(a);
            sk9.a aVar = sk9.b;
            o33.c(c, sk9.b(Unit.a), null, 2, null);
        } catch (Throwable th) {
            a(cv1Var, th);
        }
    }

    public static final <R, T> void d(Function2<? super R, ? super cv1<? super T>, ? extends Object> function2, R r, cv1<? super T> cv1Var, Function1<? super Throwable, Unit> function1) {
        cv1 b;
        cv1 c;
        try {
            b = b75.b(function2, r, cv1Var);
            c = b75.c(b);
            sk9.a aVar = sk9.b;
            o33.b(c, sk9.b(Unit.a), function1);
        } catch (Throwable th) {
            a(cv1Var, th);
        }
    }

    public static /* synthetic */ void e(Function2 function2, Object obj, cv1 cv1Var, Function1 function1, int i, Object obj2) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        d(function2, obj, cv1Var, function1);
    }
}
