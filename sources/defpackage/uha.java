package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: SharedFlow.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a%\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u0012\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"T", "", "replay", "extraBufferCapacity", "Lzg0;", "onBufferOverflow", "Lcr6;", "a", "", "", "", "index", "f", "([Ljava/lang/Object;J)Ljava/lang/Object;", "item", "", "g", "([Ljava/lang/Object;JLjava/lang/Object;)V", "Lsha;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "capacity", "Loz3;", e.a, "Lr3b;", "Lr3b;", "getNO_VALUE$annotations", "()V", "NO_VALUE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: uha */
/* loaded from: classes3.dex */
public final class uha {
    public static final r3b a = new r3b("NO_VALUE");

    public static final <T> cr6<T> a(int i, int i2, zg0 zg0Var) {
        if (i >= 0) {
            if (i2 >= 0) {
                if (i <= 0 && i2 <= 0 && zg0Var != zg0.SUSPEND) {
                    throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + zg0Var).toString());
                }
                int i3 = i2 + i;
                if (i3 < 0) {
                    i3 = Integer.MAX_VALUE;
                }
                return new tha(i, i3, zg0Var);
            }
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i2).toString());
        }
        throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
    }

    public static /* synthetic */ cr6 b(int i, int i2, zg0 zg0Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            zg0Var = zg0.SUSPEND;
        }
        return a(i, i2, zg0Var);
    }

    public static final <T> oz3<T> e(sha<? extends T> shaVar, CoroutineContext coroutineContext, int i, zg0 zg0Var) {
        if ((i == 0 || i == -3) && zg0Var == zg0.SUSPEND) {
            return shaVar;
        }
        return new yv0(shaVar, coroutineContext, i, zg0Var);
    }

    public static final Object f(Object[] objArr, long j) {
        return objArr[(objArr.length - 1) & ((int) j)];
    }

    public static final void g(Object[] objArr, long j, Object obj) {
        objArr[(objArr.length - 1) & ((int) j)] = obj;
    }
}
