package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.fs4;
import defpackage.gs4;
import defpackage.l75;
import defpackage.np6;
import im.threads.business.transport.MessageAttributes;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
/* compiled from: MultiInstanceInvalidationClient.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010C\u001a\u00020\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\bF\u0010GR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b(\u0010.\u001a\u0004\b/\u00100R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010<\u001a\u0002088\u0006¢\u0006\f\n\u0004\b5\u00109\u001a\u0004\b:\u0010;R\u0017\u0010A\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b3\u0010@R\u0017\u0010B\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b\"\u0010?\u001a\u0004\b&\u0010@¨\u0006H"}, d2 = {"Lnp6;", "", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Ll75;", "b", "Ll75;", e.a, "()Ll75;", "invalidationTracker", "Ljava/util/concurrent/Executor;", com.huawei.hms.opendevice.c.a, "Ljava/util/concurrent/Executor;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/concurrent/Executor;", "executor", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "appContext", "", "I", "()I", "setClientId", "(I)V", MessageAttributes.CLIENT_ID, "Ll75$c;", "f", "Ll75$c;", "()Ll75$c;", "l", "(Ll75$c;)V", "observer", "Lgs4;", "g", "Lgs4;", Image.TYPE_HIGH, "()Lgs4;", Image.TYPE_MEDIUM, "(Lgs4;)V", "service", "Lfs4;", "Lfs4;", "getCallback", "()Lfs4;", "callback", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "j", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "getServiceConnection", "()Landroid/content/ServiceConnection;", "serviceConnection", "Ljava/lang/Runnable;", "k", "Ljava/lang/Runnable;", "()Ljava/lang/Runnable;", "setUpRunnable", "removeObserverRunnable", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "serviceIntent", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Ll75;Ljava/util/concurrent/Executor;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: np6  reason: default package */
/* loaded from: classes.dex */
public final class np6 {
    private final String a;
    private final l75 b;
    private final Executor c;
    private final Context d;
    private int e;
    public l75.c f;
    private gs4 g;
    private final fs4 h;
    private final AtomicBoolean i;
    private final ServiceConnection j;
    private final Runnable k;
    private final Runnable l;

    /* compiled from: MultiInstanceInvalidationClient.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"np6$a", "Ll75$c;", "", "", "tables", "", com.huawei.hms.opendevice.c.a, "", "b", "()Z", "isRemote", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: np6$a */
    /* loaded from: classes.dex */
    public static final class a extends l75.c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // defpackage.l75.c
        public boolean b() {
            return true;
        }

        @Override // defpackage.l75.c
        public void c(Set<String> set) {
            z65.h(set, "tables");
            if (np6.this.j().get()) {
                return;
            }
            try {
                gs4 h = np6.this.h();
                if (h != null) {
                    int c = np6.this.c();
                    Object[] array = set.toArray(new String[0]);
                    z65.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    h.E0(c, (String[]) array);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot broadcast invalidation", e);
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"np6$b", "Lfs4$a;", "", "", "tables", "", "N", "([Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: np6$b */
    /* loaded from: classes.dex */
    public static final class b extends fs4.a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void T1(np6 np6Var, String[] strArr) {
            z65.h(np6Var, "this$0");
            z65.h(strArr, "$tables");
            np6Var.e().k((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @Override // defpackage.fs4
        public void N(final String[] strArr) {
            z65.h(strArr, "tables");
            Executor d = np6.this.d();
            final np6 np6Var = np6.this;
            d.execute(new Runnable() { // from class: op6
                @Override // java.lang.Runnable
                public final void run() {
                    np6.b.T1(np6.this, strArr);
                }
            });
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"np6$c", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", Action.NAME_ATTRIBUTE, "Landroid/os/IBinder;", "service", "", "onServiceConnected", "onServiceDisconnected", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: np6$c */
    /* loaded from: classes.dex */
    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            z65.h(componentName, Action.NAME_ATTRIBUTE);
            z65.h(iBinder, "service");
            np6.this.m(gs4.a.x(iBinder));
            np6.this.d().execute(np6.this.i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            z65.h(componentName, Action.NAME_ATTRIBUTE);
            np6.this.d().execute(np6.this.g());
            np6.this.m(null);
        }
    }

    public np6(Context context, String str, Intent intent, l75 l75Var, Executor executor) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(intent, "serviceIntent");
        z65.h(l75Var, "invalidationTracker");
        z65.h(executor, "executor");
        this.a = str;
        this.b = l75Var;
        this.c = executor;
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.h = new b();
        this.i = new AtomicBoolean(false);
        c cVar = new c();
        this.j = cVar;
        this.k = new Runnable() { // from class: lp6
            @Override // java.lang.Runnable
            public final void run() {
                np6.n(np6.this);
            }
        };
        this.l = new Runnable() { // from class: mp6
            @Override // java.lang.Runnable
            public final void run() {
                np6.k(np6.this);
            }
        };
        Object[] array = l75Var.i().keySet().toArray(new String[0]);
        z65.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        l(new a((String[]) array));
        applicationContext.bindService(intent, cVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(np6 np6Var) {
        z65.h(np6Var, "this$0");
        np6Var.b.n(np6Var.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(np6 np6Var) {
        z65.h(np6Var, "this$0");
        try {
            gs4 gs4Var = np6Var.g;
            if (gs4Var != null) {
                np6Var.e = gs4Var.U(np6Var.h, np6Var.a);
                np6Var.b.c(np6Var.f());
            }
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
        }
    }

    public final int c() {
        return this.e;
    }

    public final Executor d() {
        return this.c;
    }

    public final l75 e() {
        return this.b;
    }

    public final l75.c f() {
        l75.c cVar = this.f;
        if (cVar != null) {
            return cVar;
        }
        z65.z("observer");
        return null;
    }

    public final Runnable g() {
        return this.l;
    }

    public final gs4 h() {
        return this.g;
    }

    public final Runnable i() {
        return this.k;
    }

    public final AtomicBoolean j() {
        return this.i;
    }

    public final void l(l75.c cVar) {
        z65.h(cVar, "<set-?>");
        this.f = cVar;
    }

    public final void m(gs4 gs4Var) {
        this.g = gs4Var;
    }
}
