package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: performOn.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0005"}, d2 = {"T", "Lwx;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "a", "async"}, k = 2, mv = {1, 9, 0})
/* renamed from: ay7  reason: default package */
/* loaded from: classes.dex */
public final class ay7 {
    public static final <T> wx<T> a(wx<? extends T> wxVar, CoroutineContext coroutineContext) {
        z65.h(wxVar, "<this>");
        z65.h(coroutineContext, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (coroutineContext.c(l95.M) == null) {
            return new my(wxVar, coroutineContext);
        }
        throw new IllegalArgumentException(("Context cannot contain job in it. Had " + coroutineContext).toString());
    }
}
