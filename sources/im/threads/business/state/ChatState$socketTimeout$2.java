package im.threads.business.state;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import im.threads.business.config.BaseConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: ChatState.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ChatState$socketTimeout$2 extends ej5 implements Function0<Long> {
    public static final ChatState$socketTimeout$2 INSTANCE = new ChatState$socketTimeout$2();

    ChatState$socketTimeout$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        long j;
        try {
            j = BaseConfig.Companion.getInstance().getRequestConfig().getSocketClientSettings().getConnectTimeoutMillis();
        } catch (Exception unused) {
            j = AbstractComponentTracker.LINGERING_TIMEOUT;
        }
        return Long.valueOf(j);
    }
}
