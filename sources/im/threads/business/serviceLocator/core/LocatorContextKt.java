package im.threads.business.serviceLocator.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: LocatorContext.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/Function1;", "Lim/threads/business/serviceLocator/core/LocatorContext;", "", "block", "startEdnaLocator", "threads_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class LocatorContextKt {
    public static final void startEdnaLocator(Function1<? super LocatorContext, Unit> function1) {
        z65.h(function1, "block");
        function1.invoke(LocatorContext.INSTANCE);
    }
}
