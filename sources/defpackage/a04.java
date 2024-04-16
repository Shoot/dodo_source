package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.q94;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: Context.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a$\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\t\u001a\u00020\b\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "Loz3;", "", "capacity", "Lzg0;", "onBufferOverflow", "a", DateTokenConverter.CONVERTER_KEY, "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, e.a, "", c.a, "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: a04 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a04 {
    public static final <T> oz3<T> a(oz3<? extends T> oz3Var, int i, zg0 zg0Var) {
        int i2;
        zg0 zg0Var2;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
        } else if (i == -1 && zg0Var != zg0.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else {
            if (i == -1) {
                zg0Var2 = zg0.DROP_OLDEST;
                i2 = 0;
            } else {
                i2 = i;
                zg0Var2 = zg0Var;
            }
            if (oz3Var instanceof q94) {
                return q94.a.a((q94) oz3Var, null, i2, zg0Var2, 1, null);
            }
            return new yv0(oz3Var, null, i2, zg0Var2, 2, null);
        }
    }

    public static /* synthetic */ oz3 b(oz3 oz3Var, int i, zg0 zg0Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            zg0Var = zg0.SUSPEND;
        }
        return wz3.e(oz3Var, i, zg0Var);
    }

    private static final void c(CoroutineContext coroutineContext) {
        if (coroutineContext.c(l95.M) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    public static final <T> oz3<T> d(oz3<? extends T> oz3Var) {
        oz3<T> b;
        b = b(oz3Var, -1, null, 2, null);
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> oz3<T> e(oz3<? extends T> oz3Var, CoroutineContext coroutineContext) {
        c(coroutineContext);
        if (!z65.c(coroutineContext, kotlin.coroutines.e.a)) {
            if (oz3Var instanceof q94) {
                return q94.a.a((q94) oz3Var, coroutineContext, 0, null, 6, null);
            }
            return new yv0(oz3Var, coroutineContext, 0, null, 12, null);
        }
        return oz3Var;
    }
}
