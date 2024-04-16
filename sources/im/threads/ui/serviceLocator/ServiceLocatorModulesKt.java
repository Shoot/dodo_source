package im.threads.ui.serviceLocator;

import im.threads.business.serviceLocator.core.LocatorModule;
import im.threads.business.serviceLocator.core.ServiceLocatorApiKt;
import kotlin.Metadata;
/* compiled from: ServiceLocatorModules.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"uiSLModule", "Lim/threads/business/serviceLocator/core/LocatorModule;", "getUiSLModule", "()Lim/threads/business/serviceLocator/core/LocatorModule;", "threads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceLocatorModulesKt {
    private static final LocatorModule uiSLModule = ServiceLocatorApiKt.module(ServiceLocatorModulesKt$uiSLModule$1.INSTANCE);

    public static final LocatorModule getUiSLModule() {
        return uiSLModule;
    }
}
