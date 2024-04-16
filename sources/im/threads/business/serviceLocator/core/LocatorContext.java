package im.threads.business.serviceLocator.core;

import android.annotation.SuppressLint;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LocatorContext.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u001f\u0010\u0006\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0002\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lim/threads/business/serviceLocator/core/LocatorContext;", "", "()V", "locator", "Lim/threads/business/serviceLocator/core/Locator;", "getLocator", "modules", "", "", "Lim/threads/business/serviceLocator/core/LocatorModule;", "([Lim/threads/business/serviceLocator/core/LocatorModule;)V", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes3.dex */
public final class LocatorContext {
    public static final LocatorContext INSTANCE = new LocatorContext();
    private static final Locator locator = new Locator();

    private LocatorContext() {
    }

    public final Locator getLocator() {
        return locator;
    }

    public final void modules(LocatorModule... locatorModuleArr) {
        List<LocatorModule> U;
        z65.h(locatorModuleArr, "modules");
        Locator locator2 = locator;
        U = yr.U(locatorModuleArr);
        locator2.loadModules(U);
    }
}
