package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.dodopizza.persistence.entity.ServerDeltaTimeEntity;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* loaded from: classes2.dex */
public class b {
    private static int h;
    private static PendingIntent i;
    private static final Executor j = new Executor() { // from class: kcd
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };
    private static final Pattern k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private final Context b;
    private final cbd c;
    private final ScheduledExecutorService d;
    private Messenger f;
    private zze g;
    private final wka a = new wka();
    private final Messenger e = new Messenger(new d(this, Looper.getMainLooper()));

    public b(@NonNull Context context) {
        this.b = context;
        this.c = new cbd(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ y6b c(Bundle bundle) throws Exception {
        if (k(bundle)) {
            return o7b.e(null);
        }
        return o7b.e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void e(b bVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new xuc());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zze) {
                        bVar.g = (zze) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        bVar.f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!lbd.a(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                    }
                    if (stringExtra2.startsWith(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && lbd.a(split[1], ServerDeltaTimeEntity.ID_VALUE)) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            bVar.j(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                        return;
                    }
                    synchronized (bVar.a) {
                        for (int i2 = 0; i2 < bVar.a.size(); i2++) {
                            try {
                                bVar.j((String) bVar.a.k(i2), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                Matcher matcher = k.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    bVar.j(group, extras);
                    return;
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final y6b g(Bundle bundle) {
        final String h2 = h();
        final a7b a7bVar = new a7b();
        synchronized (this.a) {
            this.a.put(h2, a7bVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        i(this.b, intent);
        intent.putExtra("kid", "|ID|" + h2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.d.schedule(new Runnable() { // from class: vmc
                @Override // java.lang.Runnable
                public final void run() {
                    if (a7b.this.d(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            a7bVar.a().d(j, new n77() { // from class: com.google.android.gms.cloudmessaging.c
                @Override // defpackage.n77
                public final void a(y6b y6bVar) {
                    b.this.f(h2, schedule, y6bVar);
                }
            });
            return a7bVar.a();
        }
        if (this.c.b() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.d.schedule(new Runnable() { // from class: vmc
            @Override // java.lang.Runnable
            public final void run() {
                if (a7b.this.d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        a7bVar.a().d(j, new n77() { // from class: com.google.android.gms.cloudmessaging.c
            @Override // defpackage.n77
            public final void a(y6b y6bVar) {
                b.this.f(h2, schedule2, y6bVar);
            }
        });
        return a7bVar.a();
    }

    private static synchronized String h() {
        String num;
        synchronized (b.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }

    private static synchronized void i(Context context, Intent intent) {
        synchronized (b.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, klc.a);
                }
                intent.putExtra("app", i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void j(String str, Bundle bundle) {
        synchronized (this.a) {
            try {
                a7b a7bVar = (a7b) this.a.remove(str);
                if (a7bVar == null) {
                    Log.w("Rpc", "Missing callback for " + str);
                    return;
                }
                a7bVar.c(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean k(Bundle bundle) {
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return true;
        }
        return false;
    }

    @NonNull
    public y6b<Void> a(@NonNull CloudMessage cloudMessage) {
        if (this.c.a() >= 233700000) {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", cloudMessage.k());
            Integer p = cloudMessage.p();
            if (p != null) {
                bundle.putInt("google.product_id", p.intValue());
            }
            return r.b(this.b).c(3, bundle);
        }
        return o7b.d(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    @NonNull
    public y6b<Bundle> b(@NonNull final Bundle bundle) {
        if (this.c.a() < 12000000) {
            if (this.c.b() != 0) {
                return g(bundle).k(j, new dv1() { // from class: com.google.android.gms.cloudmessaging.t
                    @Override // defpackage.dv1
                    public final Object a(y6b y6bVar) {
                        return b.this.d(bundle, y6bVar);
                    }
                });
            }
            return o7b.d(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return r.b(this.b).d(1, bundle).j(j, new dv1() { // from class: nmc
            @Override // defpackage.dv1
            public final Object a(y6b y6bVar) {
                if (y6bVar.q()) {
                    return (Bundle) y6bVar.m();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(y6bVar.l())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", y6bVar.l());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ y6b d(Bundle bundle, y6b y6bVar) throws Exception {
        if (y6bVar.q() && k((Bundle) y6bVar.m())) {
            return g(bundle).s(j, new r1b() { // from class: com.google.android.gms.cloudmessaging.s
                @Override // defpackage.r1b
                public final y6b a(Object obj) {
                    return b.c((Bundle) obj);
                }
            });
        }
        return y6bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void f(String str, ScheduledFuture scheduledFuture, y6b y6bVar) {
        synchronized (this.a) {
            this.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
