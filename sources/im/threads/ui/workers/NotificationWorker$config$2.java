package im.threads.ui.workers;

import im.threads.business.config.BaseConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: NotificationWorker.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/config/BaseConfig;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class NotificationWorker$config$2 extends ej5 implements Function0<BaseConfig> {
    public static final NotificationWorker$config$2 INSTANCE = new NotificationWorker$config$2();

    NotificationWorker$config$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final BaseConfig invoke() {
        return BaseConfig.Companion.getInstance();
    }
}
