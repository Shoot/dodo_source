package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: PaymentContextProvider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lxs7;", "", "Lws7;", "getContext", "()Lws7;", CoreConstants.CONTEXT_SCOPE_VALUE, "payment-core_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: xs7  reason: default package */
/* loaded from: classes2.dex */
public interface xs7 {

    /* compiled from: PaymentContextProvider.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: xs7$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static <T> oz3<T> a(xs7 xs7Var, Function0<? extends oz3<? extends T>> function0) {
            z65.h(function0, "flow");
            function0.invoke();
            xs7Var.getContext();
            throw null;
        }
    }

    ws7 getContext();
}
