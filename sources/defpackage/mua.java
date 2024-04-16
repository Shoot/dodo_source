package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: StateFlow.kt */
@Metadata(d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a6\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000\"\u001a\u0010\u0012\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0015\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u0012\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, d2 = {"T", "value", "Lfr6;", "a", "(Ljava/lang/Object;)Lfr6;", "Lkua;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lzg0;", "onBufferOverflow", "Loz3;", DateTokenConverter.CONVERTER_KEY, "Lr3b;", "Lr3b;", "getNONE$annotations", "()V", "NONE", "b", "getPENDING$annotations", "PENDING", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: mua  reason: default package */
/* loaded from: classes3.dex */
public final class mua {
    private static final r3b a = new r3b("NONE");
    private static final r3b b = new r3b("PENDING");

    public static final <T> fr6<T> a(T t) {
        if (t == null) {
            t = (T) t37.a;
        }
        return new lua(t);
    }

    public static final <T> oz3<T> d(kua<? extends T> kuaVar, CoroutineContext coroutineContext, int i, zg0 zg0Var) {
        if (((i >= 0 && i < 2) || i == -2) && zg0Var == zg0.DROP_OLDEST) {
            return kuaVar;
        }
        return uha.e(kuaVar, coroutineContext, i, zg0Var);
    }
}
