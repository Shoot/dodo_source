package ru.dodopizza.app.application.fcm;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.huawei.hms.opendevice.c;
import java.util.Map;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.di.modules.presentation.notification.NotificationFeatureDependencies;
/* compiled from: PushMessagingService.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016R\u001c\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lru/dodopizza/app/application/fcm/PushMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "Llm1;", "", "onCreate", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "onMessageReceived", "", "token", "onNewToken", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "Lorg/slf4j/Logger;", "logger", "Lkm1;", "b", "Lkm1;", "getComponentDependenciesRegistry", "()Lkm1;", "componentDependenciesRegistry", "Lss8;", c.a, "Lss8;", "()Lss8;", "setMessagingController", "(Lss8;)V", "messagingController", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PushMessagingService extends FirebaseMessagingService implements lm1 {
    private final Logger a = LoggerFactory.getLogger("MessagingService");
    private final km1 b = eu2.b(this);
    public ss8 c;

    public final ss8 c() {
        ss8 ss8Var = this.c;
        if (ss8Var != null) {
            return ss8Var;
        }
        z65.z("messagingController");
        return null;
    }

    @Override // defpackage.lm1
    public km1 getComponentDependenciesRegistry() {
        return this.b;
    }

    @Override // android.app.Service
    public void onCreate() {
        m27.a.a().a(this, v33.b(), (NotificationFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(NotificationFeatureDependencies.class))).a(this);
        super.onCreate();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        z65.h(remoteMessage, "remoteMessage");
        Logger logger = this.a;
        String k = remoteMessage.k();
        Map<String, String> h = remoteMessage.h();
        logger.info("push FROM " + k + ": " + h);
        ss8 c = c();
        Map<String, String> h2 = remoteMessage.h();
        z65.g(h2, "getData(...)");
        c.e(new u27(h2));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        z65.h(str, "token");
        super.onNewToken(str);
        c().d(str);
    }
}
