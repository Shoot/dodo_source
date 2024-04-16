package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SessionLifecycleServiceBinder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lpea;", "Loea;", "Landroid/os/Messenger;", "callback", "Landroid/content/ServiceConnection;", "serviceConnection", "", "a", "Lqv3;", "b", "Lqv3;", "firebaseApp", "<init>", "(Lqv3;)V", c.a, "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: pea  reason: default package */
/* loaded from: classes2.dex */
public final class pea implements oea {
    public static final a c = new a(null);
    private final qv3 b;

    /* compiled from: SessionLifecycleServiceBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lpea$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: pea$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public pea(qv3 qv3Var) {
        z65.h(qv3Var, "firebaseApp");
        this.b = qv3Var;
    }

    @Override // defpackage.oea
    public void a(Messenger messenger, ServiceConnection serviceConnection) {
        z65.h(messenger, "callback");
        z65.h(serviceConnection, "serviceConnection");
        Context applicationContext = this.b.k().getApplicationContext();
        Intent intent = new Intent(applicationContext, SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        applicationContext.bindService(intent, serviceConnection, 65);
    }
}
