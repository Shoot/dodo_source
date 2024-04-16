package defpackage;

import android.database.Cursor;
import cloud.mindbox.mobile_sdk.monitoring.data.room.entities.MonitoringEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
/* compiled from: MonitoringDao_Impl.java */
/* renamed from: ao6  reason: default package */
/* loaded from: classes.dex */
public final class ao6 implements zn6 {
    private final un9 a;
    private final dj3<MonitoringEntity> b;
    private final zi3<MonitoringEntity> c;
    private final aia d;
    private final aia e;

    /* compiled from: MonitoringDao_Impl.java */
    /* renamed from: ao6$a */
    /* loaded from: classes.dex */
    class a implements Callable<MonitoringEntity> {
        final /* synthetic */ xn9 a;

        a(xn9 xn9Var) {
            this.a = xn9Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public MonitoringEntity call() throws Exception {
            String string;
            MonitoringEntity monitoringEntity = null;
            String string2 = null;
            Cursor c = k62.c(ao6.this.a, this.a, false, null);
            try {
                int e = n32.e(c, "id");
                int e2 = n32.e(c, "timestamp");
                int e3 = n32.e(c, "log");
                if (c.moveToFirst()) {
                    long j = c.getLong(e);
                    if (c.isNull(e2)) {
                        string = null;
                    } else {
                        string = c.getString(e2);
                    }
                    if (!c.isNull(e3)) {
                        string2 = c.getString(e3);
                    }
                    monitoringEntity = new MonitoringEntity(j, string, string2);
                }
                return monitoringEntity;
            } finally {
                c.close();
                this.a.j();
            }
        }
    }

    /* compiled from: MonitoringDao_Impl.java */
    /* renamed from: ao6$b */
    /* loaded from: classes.dex */
    class b implements Callable<MonitoringEntity> {
        final /* synthetic */ xn9 a;

        b(xn9 xn9Var) {
            this.a = xn9Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public MonitoringEntity call() throws Exception {
            String string;
            MonitoringEntity monitoringEntity = null;
            String string2 = null;
            Cursor c = k62.c(ao6.this.a, this.a, false, null);
            try {
                int e = n32.e(c, "id");
                int e2 = n32.e(c, "timestamp");
                int e3 = n32.e(c, "log");
                if (c.moveToFirst()) {
                    long j = c.getLong(e);
                    if (c.isNull(e2)) {
                        string = null;
                    } else {
                        string = c.getString(e2);
                    }
                    if (!c.isNull(e3)) {
                        string2 = c.getString(e3);
                    }
                    monitoringEntity = new MonitoringEntity(j, string, string2);
                }
                return monitoringEntity;
            } finally {
                c.close();
                this.a.j();
            }
        }
    }

    /* compiled from: MonitoringDao_Impl.java */
    /* renamed from: ao6$c */
    /* loaded from: classes.dex */
    class c extends dj3<MonitoringEntity> {
        c(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "INSERT OR REPLACE INTO `mb_monitoring` (`id`,`timestamp`,`log`) VALUES (nullif(?, 0),?,?)";
        }

        @Override // defpackage.dj3
        /* renamed from: k */
        public void i(c3b c3bVar, MonitoringEntity monitoringEntity) {
            c3bVar.c1(1, monitoringEntity.a());
            if (monitoringEntity.c() == null) {
                c3bVar.z1(2);
            } else {
                c3bVar.L0(2, monitoringEntity.c());
            }
            if (monitoringEntity.b() == null) {
                c3bVar.z1(3);
            } else {
                c3bVar.L0(3, monitoringEntity.b());
            }
        }
    }

    /* compiled from: MonitoringDao_Impl.java */
    /* renamed from: ao6$d */
    /* loaded from: classes.dex */
    class d extends zi3<MonitoringEntity> {
        d(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "DELETE FROM `mb_monitoring` WHERE `id` = ?";
        }

        @Override // defpackage.zi3
        /* renamed from: k */
        public void i(c3b c3bVar, MonitoringEntity monitoringEntity) {
            c3bVar.c1(1, monitoringEntity.a());
        }
    }

    /* compiled from: MonitoringDao_Impl.java */
    /* renamed from: ao6$e */
    /* loaded from: classes.dex */
    class e extends aia {
        e(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "DELETE FROM mb_monitoring WHERE id IN (SELECT id FROM mb_monitoring ORDER BY id ASC LIMIT (SELECT CNT/10 FROM (SELECT COUNT(id) as CNT FROM mb_monitoring)))";
        }
    }

    /* compiled from: MonitoringDao_Impl.java */
    /* renamed from: ao6$f */
    /* loaded from: classes.dex */
    class f extends aia {
        f(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "DELETE FROM mb_monitoring WHERE id IN (SELECT id FROM mb_monitoring ORDER BY id ASC LIMIT 1)";
        }
    }

    /* compiled from: MonitoringDao_Impl.java */
    /* renamed from: ao6$g */
    /* loaded from: classes.dex */
    class g implements Callable<Unit> {
        final /* synthetic */ MonitoringEntity a;

        g(MonitoringEntity monitoringEntity) {
            this.a = monitoringEntity;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Unit call() throws Exception {
            ao6.this.a.e();
            try {
                ao6.this.b.j(this.a);
                ao6.this.a.B();
                return Unit.a;
            } finally {
                ao6.this.a.i();
            }
        }
    }

    /* compiled from: MonitoringDao_Impl.java */
    /* renamed from: ao6$h */
    /* loaded from: classes.dex */
    class h implements Callable<Unit> {
        h() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Unit call() throws Exception {
            c3b b = ao6.this.d.b();
            ao6.this.a.e();
            try {
                b.I();
                ao6.this.a.B();
                return Unit.a;
            } finally {
                ao6.this.a.i();
                ao6.this.d.h(b);
            }
        }
    }

    /* compiled from: MonitoringDao_Impl.java */
    /* renamed from: ao6$i */
    /* loaded from: classes.dex */
    class i implements Callable<List<MonitoringEntity>> {
        final /* synthetic */ xn9 a;

        i(xn9 xn9Var) {
            this.a = xn9Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<MonitoringEntity> call() throws Exception {
            String string;
            String string2;
            Cursor c = k62.c(ao6.this.a, this.a, false, null);
            try {
                int e = n32.e(c, "id");
                int e2 = n32.e(c, "timestamp");
                int e3 = n32.e(c, "log");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    long j = c.getLong(e);
                    if (c.isNull(e2)) {
                        string = null;
                    } else {
                        string = c.getString(e2);
                    }
                    if (c.isNull(e3)) {
                        string2 = null;
                    } else {
                        string2 = c.getString(e3);
                    }
                    arrayList.add(new MonitoringEntity(j, string, string2));
                }
                return arrayList;
            } finally {
                c.close();
                this.a.j();
            }
        }
    }

    public ao6(un9 un9Var) {
        this.a = un9Var;
        this.b = new c(un9Var);
        this.c = new d(un9Var);
        this.d = new e(un9Var);
        this.e = new f(un9Var);
    }

    public static List<Class<?>> i() {
        return Collections.emptyList();
    }

    @Override // defpackage.zn6
    public Object a(cv1<? super MonitoringEntity> cv1Var) {
        xn9 c2 = xn9.c("SELECT * FROM mb_monitoring ORDER BY id ASC LIMIT 1", 0);
        return wx1.b(this.a, false, k62.a(), new a(c2), cv1Var);
    }

    @Override // defpackage.zn6
    public Object b(cv1<? super MonitoringEntity> cv1Var) {
        xn9 c2 = xn9.c("SELECT * FROM mb_monitoring ORDER BY id DESC LIMIT 1", 0);
        return wx1.b(this.a, false, k62.a(), new b(c2), cv1Var);
    }

    @Override // defpackage.zn6
    public Object c(MonitoringEntity monitoringEntity, cv1<? super Unit> cv1Var) {
        return wx1.c(this.a, true, new g(monitoringEntity), cv1Var);
    }

    @Override // defpackage.zn6
    public Object d(String str, String str2, cv1<? super List<MonitoringEntity>> cv1Var) {
        xn9 c2 = xn9.c("SELECT * FROM mb_monitoring WHERE timestamp BETWEEN ? and ? ORDER BY timestamp ASC", 2);
        if (str == null) {
            c2.z1(1);
        } else {
            c2.L0(1, str);
        }
        if (str2 == null) {
            c2.z1(2);
        } else {
            c2.L0(2, str2);
        }
        return wx1.b(this.a, false, k62.a(), new i(c2), cv1Var);
    }

    @Override // defpackage.zn6
    public Object e(cv1<? super Unit> cv1Var) {
        return wx1.c(this.a, true, new h(), cv1Var);
    }
}
