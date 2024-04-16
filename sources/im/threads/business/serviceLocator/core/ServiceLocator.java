package im.threads.business.serviceLocator.core;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: ServiceLocator.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001e\u0010\f\u001a\u00020\u0002\"\b\b\u0000\u0010\t*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nJ\u0014\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rR$\u0010\u0011\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lim/threads/business/serviceLocator/core/ServiceLocator;", "", "Lim/threads/business/serviceLocator/core/ServiceType;", "serviceType", "", "addService", "Lim/threads/business/serviceLocator/core/LocatorModule;", "module", "registerModule", "T", "Lod5;", "clz", "getService", "", "modules", "loadModules", "", "serviceTypeMap", "Ljava/util/Map;", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ServiceLocator {
    private final Map<od5<?>, ServiceType> serviceTypeMap = new ConcurrentHashMap();

    private final void addService(ServiceType serviceType) {
        this.serviceTypeMap.put(serviceType.getType(), serviceType);
    }

    private final void registerModule(LocatorModule locatorModule) {
        for (Map.Entry<od5<?>, Function0<Object>> entry : locatorModule.getDeclarationRegistry().entrySet()) {
            addService(LocatorDeclarationKt.toService(entry.getValue()));
        }
    }

    public final <T> ServiceType getService(od5<T> od5Var) {
        List<ServiceType> F0;
        z65.h(od5Var, "clz");
        ServiceType serviceType = this.serviceTypeMap.get(od5Var);
        if (serviceType == null) {
            F0 = sc1.F0(this.serviceTypeMap.values());
            for (ServiceType serviceType2 : F0) {
                if (od5Var.a(serviceType2.getInstance())) {
                    addService(new DefaultLocatorServiceType(od5Var, serviceType2.getInstance()));
                    return serviceType2;
                }
            }
        }
        if (serviceType != null) {
            return serviceType;
        }
        throw new IllegalStateException(("Unable to find definition of " + od5Var).toString());
    }

    public final void loadModules(List<LocatorModule> list) {
        z65.h(list, "modules");
        for (LocatorModule locatorModule : list) {
            registerModule(locatorModule);
        }
    }
}
