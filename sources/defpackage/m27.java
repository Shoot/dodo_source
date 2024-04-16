package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import ru.dodopizza.app.application.fcm.PushMessagingService;
import ru.dodopizza.app.di.modules.presentation.notification.NotificationFeatureDependencies;
/* compiled from: NotificationComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lm27;", "", "Lru/dodopizza/app/application/fcm/PushMessagingService;", "service", "", "a", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: m27  reason: default package */
/* loaded from: classes3.dex */
public interface m27 {
    public static final a a = a.a;

    /* compiled from: NotificationComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lm27$a;", "", "Lm27$b;", "a", "()Lm27$b;", "factory", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: m27$a */
    /* loaded from: classes3.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final b a() {
            b a2 = fg2.a();
            z65.g(a2, "factory(...)");
            return a2;
        }
    }

    /* compiled from: NotificationComponent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lm27$b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkx1;", "ioDispatcher", "Lru/dodopizza/app/di/modules/presentation/notification/NotificationFeatureDependencies;", "dependencies", "Lm27;", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: m27$b */
    /* loaded from: classes3.dex */
    public interface b {
        m27 a(Context context, kx1 kx1Var, NotificationFeatureDependencies notificationFeatureDependencies);
    }

    void a(PushMessagingService pushMessagingService);
}
