package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a]\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\rH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Loz3;", "Luv0;", "b", "Lpz3;", "Lkotlin/coroutines/CoroutineContext;", "emitContext", e.a, "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lcv1;", "block", c.a, "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: wv0 */
/* loaded from: classes3.dex */
public final class wv0 {
    public static final /* synthetic */ pz3 a(pz3 pz3Var, CoroutineContext coroutineContext) {
        return e(pz3Var, coroutineContext);
    }

    public static final <T> uv0<T> b(oz3<? extends T> oz3Var) {
        uv0<T> uv0Var;
        if (oz3Var instanceof uv0) {
            uv0Var = (uv0) oz3Var;
        } else {
            uv0Var = null;
        }
        if (uv0Var == null) {
            return new yv0(oz3Var, null, 0, null, 14, null);
        }
        return uv0Var;
    }

    public static final <T, V> Object c(CoroutineContext coroutineContext, V v, Object obj, Function2<? super V, ? super cv1<? super T>, ? extends Object> function2, cv1<? super T> cv1Var) {
        Object d;
        Object c = wdb.c(coroutineContext, obj);
        try {
            Object invoke = ((Function2) unb.e(function2, 2)).invoke(v, new rsa(cv1Var, coroutineContext));
            wdb.a(coroutineContext, c);
            d = c75.d();
            if (invoke == d) {
                io2.c(cv1Var);
            }
            return invoke;
        } catch (Throwable th) {
            wdb.a(coroutineContext, c);
            throw th;
        }
    }

    public static /* synthetic */ Object d(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, cv1 cv1Var, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = wdb.b(coroutineContext);
        }
        return c(coroutineContext, obj, obj2, function2, cv1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> pz3<T> e(pz3<? super T> pz3Var, CoroutineContext coroutineContext) {
        if (!(pz3Var instanceof tba) && !(pz3Var instanceof g07)) {
            return new iqb(pz3Var, coroutineContext);
        }
        return pz3Var;
    }
}
