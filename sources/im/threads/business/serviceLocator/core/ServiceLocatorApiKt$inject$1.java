package im.threads.business.serviceLocator.core;

import ch.qos.logback.core.net.SyslogConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: ServiceLocatorApi.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = SyslogConstants.LOG_LOCAL6)
/* loaded from: classes3.dex */
public final class ServiceLocatorApiKt$inject$1<T> extends ej5 implements Function0<T> {
    public static final ServiceLocatorApiKt$inject$1 INSTANCE = new ServiceLocatorApiKt$inject$1();

    public ServiceLocatorApiKt$inject$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        Locator serviceLocator = ServiceLocatorApiKt.getServiceLocator();
        z65.n(4, "T");
        T t = (T) serviceLocator.resolveInstance(bc9.b(Object.class)).getInstance();
        z65.n(1, "T");
        return t;
    }
}
