package im.threads.ui.core;

import im.threads.business.serviceLocator.core.ServiceLocatorApiKt;
import im.threads.business.utils.ClientUseCase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: ServiceLocatorApi.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;", "im/threads/business/serviceLocator/core/ServiceLocatorApiKt$inject$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThreadsLib$special$$inlined$inject$1 extends ej5 implements Function0<ClientUseCase> {
    public static final ThreadsLib$special$$inlined$inject$1 INSTANCE = new ThreadsLib$special$$inlined$inject$1();

    public ThreadsLib$special$$inlined$inject$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ClientUseCase invoke() {
        Object serviceType = ServiceLocatorApiKt.getServiceLocator().resolveInstance(bc9.b(ClientUseCase.class)).getInstance();
        if (serviceType != null) {
            return (ClientUseCase) serviceType;
        }
        throw new NullPointerException("null cannot be cast to non-null type im.threads.business.utils.ClientUseCase");
    }
}
