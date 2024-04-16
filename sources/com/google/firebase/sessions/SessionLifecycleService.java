package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.kea;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SessionLifecycleService.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0002\u0005\u0011B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0014\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016R\u001a\u0010\u000f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/os/Messenger;", "a", "", "onCreate", "Landroid/os/IBinder;", "onBind", "onDestroy", "Landroid/os/HandlerThread;", "Landroid/os/HandlerThread;", "getHandlerThread$com_google_firebase_firebase_sessions", "()Landroid/os/HandlerThread;", "handlerThread", "Lcom/google/firebase/sessions/SessionLifecycleService$b;", "b", "Lcom/google/firebase/sessions/SessionLifecycleService$b;", "messageHandler", c.a, "Landroid/os/Messenger;", "messenger", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SessionLifecycleService extends Service {
    public static final a d = new a(null);
    private final HandlerThread a = new HandlerThread("FirebaseSessions_HandlerThread");
    private b b;
    private Messenger c;

    /* compiled from: SessionLifecycleService.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService$a;", "", "", "BACKGROUNDED", "I", "CLIENT_BOUND", "", "CLIENT_CALLBACK_MESSENGER", "Ljava/lang/String;", "FOREGROUNDED", "SESSION_UPDATED", "SESSION_UPDATE_EXTRA", "TAG", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SessionLifecycleService.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0016\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0019j\b\u0012\u0004\u0012\u00020\n`\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006!"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService$b;", "Landroid/os/Handler;", "Landroid/os/Message;", RemoteMessageConst.MessageBody.MSG, "", DateTokenConverter.CONVERTER_KEY, "b", c.a, "g", "a", "Landroid/os/Messenger;", "client", "f", "", "sessionId", Image.TYPE_HIGH, "", "foregroundTimeMs", "", e.a, "handleMessage", "Z", "hasForegrounded", "J", "lastMsgTimeMs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "boundClients", "Landroid/os/Looper;", "looper", "<init>", "(Landroid/os/Looper;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public static final class b extends Handler {
        private boolean a;
        private long b;
        private final ArrayList<Messenger> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Looper looper) {
            super(looper);
            z65.h(looper, "looper");
            this.c = new ArrayList<>();
        }

        private final void a() {
            StringBuilder sb = new StringBuilder();
            sb.append("Broadcasting new session: ");
            kea.b bVar = kea.f;
            sb.append(bVar.a().c());
            Log.d("SessionLifecycleService", sb.toString());
            iea.a.a().a(bVar.a().c());
            for (Messenger messenger : new ArrayList(this.c)) {
                z65.g(messenger, "it");
                f(messenger);
            }
        }

        private final void b(Message message) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.b = message.getWhen();
        }

        private final void c(Message message) {
            this.c.add(message.replyTo);
            Messenger messenger = message.replyTo;
            z65.g(messenger, "msg.replyTo");
            f(messenger);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.c.size());
        }

        private final void d(Message message) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + CoreConstants.DOT);
            if (!this.a) {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.a = true;
                g();
            } else if (e(message.getWhen())) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                g();
            }
            this.b = message.getWhen();
        }

        private final boolean e(long j) {
            if (j - this.b > kotlin.time.a.u(gfa.c.c().c())) {
                return true;
            }
            return false;
        }

        private final void f(Messenger messenger) {
            if (this.a) {
                h(messenger, kea.f.a().c().b());
                return;
            }
            String a = dea.a.a().a();
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + a);
            if (a != null) {
                h(messenger, a);
            }
        }

        private final void g() {
            kea.b bVar = kea.f;
            bVar.a().a();
            Log.d("SessionLifecycleService", "Generated new session " + bVar.a().c().b());
            a();
            dea.a.a().b(bVar.a().c().b());
        }

        private final void h(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message obtain = Message.obtain(null, 3, 0, 0);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.c.remove(messenger);
            } catch (Exception e) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + CoreConstants.DOT, e);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            z65.h(message, RemoteMessageConst.MessageBody.MSG);
            if (this.b > message.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + message.getWhen() + " which is older than " + this.b + CoreConstants.DOT);
                return;
            }
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + message);
                        super.handleMessage(message);
                        return;
                    }
                    c(message);
                    return;
                }
                b(message);
                return;
            }
            d(message);
        }
    }

    private final Messenger a(Intent intent) {
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
            return (Messenger) parcelableExtra;
        }
        return (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger a2 = a(intent);
        if (a2 != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = a2;
            b bVar = this.b;
            if (bVar != null) {
                bVar.sendMessage(obtain);
            }
        }
        Messenger messenger = this.c;
        if (messenger == null) {
            return null;
        }
        return messenger.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a.start();
        Looper looper = this.a.getLooper();
        z65.g(looper, "handlerThread.looper");
        this.b = new b(looper);
        this.c = new Messenger(this.b);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.a.quit();
    }
}
