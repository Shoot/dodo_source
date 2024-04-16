package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: classes.dex */
public class a implements u6c, bm3 {
    static final String k = nx5.f("SystemFgDispatcher");
    private Context a;
    private j7c b;
    private final d7b c;
    final Object d = new Object();
    String e;
    final Map<String, a54> f;
    final Map<String, WorkSpec> g;
    final Set<WorkSpec> h;
    final v6c i;
    private b j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemForegroundDispatcher.java */
    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0053a implements Runnable {
        final /* synthetic */ WorkDatabase a;
        final /* synthetic */ String b;

        RunnableC0053a(WorkDatabase workDatabase, String str) {
            this.a = workDatabase;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            WorkSpec g = this.a.M().g(this.b);
            if (g != null && g.b()) {
                synchronized (a.this.d) {
                    a.this.g.put(this.b, g);
                    a.this.h.add(g);
                    a aVar = a.this;
                    aVar.i.d(aVar.h);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemForegroundDispatcher.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(int i, @NonNull Notification notification);

        void c(int i, int i2, @NonNull Notification notification);

        void d(int i);

        void stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(@NonNull Context context) {
        this.a = context;
        j7c p = j7c.p(context);
        this.b = p;
        d7b u = p.u();
        this.c = u;
        this.e = null;
        this.f = new LinkedHashMap();
        this.h = new HashSet();
        this.g = new HashMap();
        this.i = new v6c(this.a, u, this);
        this.b.r().c(this);
    }

    @NonNull
    public static Intent a(@NonNull Context context, @NonNull String str, @NonNull a54 a54Var) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", a54Var.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", a54Var.a());
        intent.putExtra("KEY_NOTIFICATION", a54Var.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @NonNull
    public static Intent c(@NonNull Context context, @NonNull String str, @NonNull a54 a54Var) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", a54Var.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", a54Var.a());
        intent.putExtra("KEY_NOTIFICATION", a54Var.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @NonNull
    public static Intent d(@NonNull Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void g(@NonNull Intent intent) {
        nx5.c().d(k, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.b.k(UUID.fromString(stringExtra));
        }
    }

    private void h(@NonNull Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        nx5.c().a(k, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification != null && this.j != null) {
            this.f.put(stringExtra, new a54(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.e)) {
                this.e = stringExtra;
                this.j.c(intExtra, intExtra2, notification);
                return;
            }
            this.j.a(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry<String, a54> entry : this.f.entrySet()) {
                    i |= entry.getValue().a();
                }
                a54 a54Var = this.f.get(this.e);
                if (a54Var != null) {
                    this.j.c(a54Var.c(), i, a54Var.b());
                }
            }
        }
    }

    private void i(@NonNull Intent intent) {
        nx5.c().d(k, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.c.b(new RunnableC0053a(this.b.t(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // defpackage.u6c
    public void b(@NonNull List<String> list) {
        if (!list.isEmpty()) {
            for (String str : list) {
                nx5.c().a(k, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
                this.b.B(str);
            }
        }
    }

    @Override // defpackage.bm3
    public void e(@NonNull String str, boolean z) {
        Map.Entry<String, a54> entry;
        synchronized (this.d) {
            try {
                WorkSpec remove = this.g.remove(str);
                if (remove != null && this.h.remove(remove)) {
                    this.i.d(this.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a54 remove2 = this.f.remove(str);
        if (str.equals(this.e) && this.f.size() > 0) {
            Iterator<Map.Entry<String, a54>> it = this.f.entrySet().iterator();
            Map.Entry<String, a54> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.e = entry.getKey();
            if (this.j != null) {
                a54 value = entry.getValue();
                this.j.c(value.c(), value.a(), value.b());
                this.j.d(value.c());
            }
        }
        b bVar = this.j;
        if (remove2 != null && bVar != null) {
            nx5.c().a(k, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.c()), str, Integer.valueOf(remove2.a())), new Throwable[0]);
            bVar.d(remove2.c());
        }
    }

    void j(@NonNull Intent intent) {
        nx5.c().d(k, "Stopping foreground service", new Throwable[0]);
        b bVar = this.j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        this.j = null;
        synchronized (this.d) {
            this.i.e();
        }
        this.b.r().i(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(@NonNull Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
            h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            j(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(@NonNull b bVar) {
        if (this.j != null) {
            nx5.c().b(k, "A callback already exists.", new Throwable[0]);
        } else {
            this.j = bVar;
        }
    }

    @Override // defpackage.u6c
    public void f(@NonNull List<String> list) {
    }
}
