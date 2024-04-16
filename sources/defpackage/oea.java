package defpackage;

import android.content.ServiceConnection;
import android.os.Messenger;
import kotlin.Metadata;
/* compiled from: SessionLifecycleServiceBinder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Loea;", "", "Landroid/os/Messenger;", "callback", "Landroid/content/ServiceConnection;", "serviceConnection", "", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: oea  reason: default package */
/* loaded from: classes2.dex */
public interface oea {
    public static final a a = a.a;

    /* compiled from: SessionLifecycleServiceBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Loea$a;", "", "Loea;", "a", "()Loea;", "instance", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: oea$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final oea a() {
            Object j = hw3.a(kv3.a).j(oea.class);
            z65.g(j, "Firebase.app[SessionLife…erviceBinder::class.java]");
            return (oea) j;
        }
    }

    void a(Messenger messenger, ServiceConnection serviceConnection);
}
