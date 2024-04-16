package im.threads.business.serviceLocator.core;

import im.threads.business.logger.LoggerEdna;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: Locator.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0012\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rRB\u0010\u0011\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00010\u000fj\b\u0012\u0004\u0012\u00020\u0001`\u00100\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lim/threads/business/serviceLocator/core/Locator;", "", "", "Lim/threads/business/serviceLocator/core/LocatorModule;", "modules", "", "loadModules", "Lod5;", MessageAttributes.TYPE, "Lim/threads/business/serviceLocator/core/ServiceType;", "resolveInstance", "Lim/threads/business/serviceLocator/core/ServiceLocator;", "registry", "Lim/threads/business/serviceLocator/core/ServiceLocator;", "", "Lkotlin/Function0;", "Lim/threads/business/serviceLocator/core/Declaration;", "declarations", "Ljava/util/Map;", "getDeclarations", "()Ljava/util/Map;", "setDeclarations", "(Ljava/util/Map;)V", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Locator {
    public Map<od5<?>, ? extends Function0<? extends Object>> declarations;
    private final ServiceLocator registry = new ServiceLocator();

    public final Map<od5<?>, Function0<Object>> getDeclarations() {
        Map map = this.declarations;
        if (map != null) {
            return map;
        }
        z65.z("declarations");
        return null;
    }

    public final void loadModules(List<LocatorModule> list) {
        z65.h(list, "modules");
        setDeclarations(LocatorModuleKt.getDeclarationRegistry(list));
        int size = LocatorModuleKt.getDeclarationRegistry(list).size();
        LoggerEdna.info("Registry Size === " + size);
        this.registry.loadModules(list);
    }

    public final ServiceType resolveInstance(od5<?> od5Var) {
        z65.h(od5Var, MessageAttributes.TYPE);
        return this.registry.getService(od5Var);
    }

    public final void setDeclarations(Map<od5<?>, ? extends Function0<? extends Object>> map) {
        z65.h(map, "<set-?>");
        this.declarations = map;
    }
}
