package im.threads.business.serviceLocator.core;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DefaultLocatorServiceType.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lim/threads/business/serviceLocator/core/DefaultLocatorServiceType;", "Lim/threads/business/serviceLocator/core/ServiceType;", "Lod5;", MessageAttributes.TYPE, "Lod5;", "getType", "()Lod5;", "", "instance", "Ljava/lang/Object;", "getInstance", "()Ljava/lang/Object;", "<init>", "(Lod5;Ljava/lang/Object;)V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class DefaultLocatorServiceType implements ServiceType {
    public static final Companion Companion = new Companion(null);
    private final Object instance;
    private final od5<?> type;

    /* compiled from: DefaultLocatorServiceType.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001¨\u0006\u0006"}, d2 = {"Lim/threads/business/serviceLocator/core/DefaultLocatorServiceType$Companion;", "", "()V", "createService", "Lim/threads/business/serviceLocator/core/DefaultLocatorServiceType;", "instance", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DefaultLocatorServiceType createService(Object obj) {
            z65.h(obj, "instance");
            return new DefaultLocatorServiceType(bc9.b(obj.getClass()), obj);
        }
    }

    public DefaultLocatorServiceType(od5<?> od5Var, Object obj) {
        z65.h(od5Var, MessageAttributes.TYPE);
        z65.h(obj, "instance");
        this.type = od5Var;
        this.instance = obj;
    }

    @Override // im.threads.business.serviceLocator.core.ServiceType
    public Object getInstance() {
        return this.instance;
    }

    @Override // im.threads.business.serviceLocator.core.ServiceType
    public od5<?> getType() {
        return this.type;
    }
}
