package im.threads.business.transport.threadsGate;

import im.threads.business.formatters.JsonFormatter;
import im.threads.business.serviceLocator.core.ServiceLocatorApiKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: ServiceLocatorApi.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;", "im/threads/business/serviceLocator/core/ServiceLocatorApiKt$inject$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThreadsGateTransport$special$$inlined$inject$6 extends ej5 implements Function0<JsonFormatter> {
    public static final ThreadsGateTransport$special$$inlined$inject$6 INSTANCE = new ThreadsGateTransport$special$$inlined$inject$6();

    public ThreadsGateTransport$special$$inlined$inject$6() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final JsonFormatter invoke() {
        Object serviceType = ServiceLocatorApiKt.getServiceLocator().resolveInstance(bc9.b(JsonFormatter.class)).getInstance();
        if (serviceType != null) {
            return (JsonFormatter) serviceType;
        }
        throw new NullPointerException("null cannot be cast to non-null type im.threads.business.formatters.JsonFormatter");
    }
}
