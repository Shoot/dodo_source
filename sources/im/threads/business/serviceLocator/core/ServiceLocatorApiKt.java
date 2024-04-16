package im.threads.business.serviceLocator.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: ServiceLocatorApi.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001c\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0002H\u0086\b\u001a\u001a\u0010\f\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¨\u0006\r"}, d2 = {"Lim/threads/business/serviceLocator/core/Locator;", "getServiceLocator", "", "T", "get", "()Ljava/lang/Object;", "Lrn5;", "inject", "Lkotlin/Function1;", "Lim/threads/business/serviceLocator/core/LocatorModule;", "", "block", "module", "threads_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ServiceLocatorApiKt {
    public static final /* synthetic */ <T> T get() {
        Locator serviceLocator = getServiceLocator();
        z65.n(4, "T");
        T t = (T) serviceLocator.resolveInstance(bc9.b(Object.class)).getInstance();
        z65.n(1, "T");
        return t;
    }

    public static final Locator getServiceLocator() {
        return LocatorContext.INSTANCE.getLocator();
    }

    public static final /* synthetic */ <T> rn5<T> inject() {
        rn5<T> b;
        z65.m();
        b = yn5.b(ServiceLocatorApiKt$inject$1.INSTANCE);
        return b;
    }

    public static final LocatorModule module(Function1<? super LocatorModule, Unit> function1) {
        z65.h(function1, "block");
        LocatorModule locatorModule = new LocatorModule();
        function1.invoke(locatorModule);
        return locatorModule;
    }
}
