package im.threads.business.extensions;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: MutableLazy.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\u0005"}, d2 = {"mutableLazy", "Lim/threads/business/extensions/MutableLazy;", "T", "value", "Lkotlin/Function0;", "threads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MutableLazyKt {
    public static final <T> MutableLazy<T> mutableLazy(Function0<? extends T> function0) {
        z65.h(function0, "value");
        return new MutableLazy<>(function0);
    }
}
