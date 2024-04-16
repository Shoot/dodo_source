package androidx.work.impl.model;

import android.database.Cursor;
import androidx.work.impl.model.WorkSpec;
import ch.qos.logback.classic.spi.CallerData;
import defpackage.b7c;
import java.util.ArrayList;
import java.util.List;
/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class b implements androidx.work.impl.model.a {
    private final un9 a;
    private final dj3<WorkSpec> b;
    private final aia c;
    private final aia d;
    private final aia e;
    private final aia f;
    private final aia g;
    private final aia h;
    private final aia i;
    private final aia j;

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends dj3<WorkSpec> {
        a(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // defpackage.dj3
        /* renamed from: k */
        public void i(c3b c3bVar, WorkSpec workSpec) {
            String str = workSpec.a;
            if (str == null) {
                c3bVar.z1(1);
            } else {
                c3bVar.L0(1, str);
            }
            c3bVar.c1(2, y7c.j(workSpec.b));
            String str2 = workSpec.c;
            if (str2 == null) {
                c3bVar.z1(3);
            } else {
                c3bVar.L0(3, str2);
            }
            String str3 = workSpec.d;
            if (str3 == null) {
                c3bVar.z1(4);
            } else {
                c3bVar.L0(4, str3);
            }
            byte[] o = androidx.work.b.o(workSpec.e);
            if (o == null) {
                c3bVar.z1(5);
            } else {
                c3bVar.h1(5, o);
            }
            byte[] o2 = androidx.work.b.o(workSpec.f);
            if (o2 == null) {
                c3bVar.z1(6);
            } else {
                c3bVar.h1(6, o2);
            }
            c3bVar.c1(7, workSpec.g);
            c3bVar.c1(8, workSpec.h);
            c3bVar.c1(9, workSpec.i);
            c3bVar.c1(10, workSpec.k);
            c3bVar.c1(11, y7c.a(workSpec.l));
            c3bVar.c1(12, workSpec.m);
            c3bVar.c1(13, workSpec.n);
            c3bVar.c1(14, workSpec.o);
            c3bVar.c1(15, workSpec.p);
            c3bVar.c1(16, workSpec.q ? 1L : 0L);
            c3bVar.c1(17, y7c.i(workSpec.r));
            or1 or1Var = workSpec.j;
            if (or1Var != null) {
                c3bVar.c1(18, y7c.h(or1Var.b()));
                c3bVar.c1(19, or1Var.g() ? 1L : 0L);
                c3bVar.c1(20, or1Var.h() ? 1L : 0L);
                c3bVar.c1(21, or1Var.f() ? 1L : 0L);
                c3bVar.c1(22, or1Var.i() ? 1L : 0L);
                c3bVar.c1(23, or1Var.c());
                c3bVar.c1(24, or1Var.d());
                byte[] c = y7c.c(or1Var.a());
                if (c == null) {
                    c3bVar.z1(25);
                    return;
                } else {
                    c3bVar.h1(25, c);
                    return;
                }
            }
            c3bVar.z1(18);
            c3bVar.z1(19);
            c3bVar.z1(20);
            c3bVar.z1(21);
            c3bVar.z1(22);
            c3bVar.z1(23);
            c3bVar.z1(24);
            c3bVar.z1(25);
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.model.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0054b extends aia {
        C0054b(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class c extends aia {
        c(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class d extends aia {
        d(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class e extends aia {
        e(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class f extends aia {
        f(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class g extends aia {
        g(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class h extends aia {
        h(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class i extends aia {
        i(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public b(un9 un9Var) {
        this.a = un9Var;
        this.b = new a(un9Var);
        this.c = new C0054b(un9Var);
        this.d = new c(un9Var);
        this.e = new d(un9Var);
        this.f = new e(un9Var);
        this.g = new f(un9Var);
        this.h = new g(un9Var);
        this.i = new h(un9Var);
        this.j = new i(un9Var);
    }

    @Override // androidx.work.impl.model.a
    public void a(String str) {
        this.a.d();
        c3b b = this.c.b();
        if (str == null) {
            b.z1(1);
        } else {
            b.L0(1, str);
        }
        this.a.e();
        try {
            b.I();
            this.a.B();
        } finally {
            this.a.i();
            this.c.h(b);
        }
    }

    @Override // androidx.work.impl.model.a
    public List<WorkSpec> b(long j) {
        xn9 xn9Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        xn9 c2 = xn9.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        c2.c1(1, j);
        this.a.d();
        Cursor c3 = k62.c(this.a, c2, false, null);
        try {
            int e2 = n32.e(c3, "required_network_type");
            int e3 = n32.e(c3, "requires_charging");
            int e4 = n32.e(c3, "requires_device_idle");
            int e5 = n32.e(c3, "requires_battery_not_low");
            int e6 = n32.e(c3, "requires_storage_not_low");
            int e7 = n32.e(c3, "trigger_content_update_delay");
            int e8 = n32.e(c3, "trigger_max_content_delay");
            int e9 = n32.e(c3, "content_uri_triggers");
            int e10 = n32.e(c3, "id");
            int e11 = n32.e(c3, "state");
            int e12 = n32.e(c3, "worker_class_name");
            int e13 = n32.e(c3, "input_merger_class_name");
            int e14 = n32.e(c3, "input");
            int e15 = n32.e(c3, "output");
            xn9Var = c2;
            try {
                int e16 = n32.e(c3, "initial_delay");
                int e17 = n32.e(c3, "interval_duration");
                int e18 = n32.e(c3, "flex_duration");
                int e19 = n32.e(c3, "run_attempt_count");
                int e20 = n32.e(c3, "backoff_policy");
                int e21 = n32.e(c3, "backoff_delay_duration");
                int e22 = n32.e(c3, "period_start_time");
                int e23 = n32.e(c3, "minimum_retention_duration");
                int e24 = n32.e(c3, "schedule_requested_at");
                int e25 = n32.e(c3, "run_in_foreground");
                int e26 = n32.e(c3, "out_of_quota_policy");
                int i2 = e15;
                ArrayList arrayList = new ArrayList(c3.getCount());
                while (c3.moveToNext()) {
                    String string = c3.getString(e10);
                    int i3 = e10;
                    String string2 = c3.getString(e12);
                    int i4 = e12;
                    or1 or1Var = new or1();
                    int i5 = e2;
                    or1Var.k(y7c.e(c3.getInt(e2)));
                    if (c3.getInt(e3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    or1Var.m(z);
                    if (c3.getInt(e4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    or1Var.n(z2);
                    if (c3.getInt(e5) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    or1Var.l(z3);
                    if (c3.getInt(e6) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    or1Var.o(z4);
                    int i6 = e3;
                    int i7 = e4;
                    or1Var.p(c3.getLong(e7));
                    or1Var.q(c3.getLong(e8));
                    or1Var.j(y7c.b(c3.getBlob(e9)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.b = y7c.g(c3.getInt(e11));
                    workSpec.d = c3.getString(e13);
                    workSpec.e = androidx.work.b.h(c3.getBlob(e14));
                    int i8 = i2;
                    workSpec.f = androidx.work.b.h(c3.getBlob(i8));
                    int i9 = e16;
                    i2 = i8;
                    workSpec.g = c3.getLong(i9);
                    int i10 = e13;
                    int i11 = e17;
                    workSpec.h = c3.getLong(i11);
                    int i12 = e5;
                    int i13 = e18;
                    workSpec.i = c3.getLong(i13);
                    int i14 = e19;
                    workSpec.k = c3.getInt(i14);
                    int i15 = e20;
                    workSpec.l = y7c.d(c3.getInt(i15));
                    e18 = i13;
                    int i16 = e21;
                    workSpec.m = c3.getLong(i16);
                    int i17 = e22;
                    workSpec.n = c3.getLong(i17);
                    e22 = i17;
                    int i18 = e23;
                    workSpec.o = c3.getLong(i18);
                    int i19 = e24;
                    workSpec.p = c3.getLong(i19);
                    int i20 = e25;
                    if (c3.getInt(i20) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    workSpec.q = z5;
                    int i21 = e26;
                    workSpec.r = y7c.f(c3.getInt(i21));
                    workSpec.j = or1Var;
                    arrayList.add(workSpec);
                    e3 = i6;
                    e26 = i21;
                    e13 = i10;
                    e16 = i9;
                    e17 = i11;
                    e19 = i14;
                    e24 = i19;
                    e10 = i3;
                    e12 = i4;
                    e2 = i5;
                    e25 = i20;
                    e23 = i18;
                    e4 = i7;
                    e21 = i16;
                    e5 = i12;
                    e20 = i15;
                }
                c3.close();
                xn9Var.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c3.close();
                xn9Var.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xn9Var = c2;
        }
    }

    @Override // androidx.work.impl.model.a
    public void c(WorkSpec workSpec) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(workSpec);
            this.a.B();
        } finally {
            this.a.i();
        }
    }

    @Override // androidx.work.impl.model.a
    public List<WorkSpec> d() {
        xn9 xn9Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        xn9 c2 = xn9.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.d();
        Cursor c3 = k62.c(this.a, c2, false, null);
        try {
            int e2 = n32.e(c3, "required_network_type");
            int e3 = n32.e(c3, "requires_charging");
            int e4 = n32.e(c3, "requires_device_idle");
            int e5 = n32.e(c3, "requires_battery_not_low");
            int e6 = n32.e(c3, "requires_storage_not_low");
            int e7 = n32.e(c3, "trigger_content_update_delay");
            int e8 = n32.e(c3, "trigger_max_content_delay");
            int e9 = n32.e(c3, "content_uri_triggers");
            int e10 = n32.e(c3, "id");
            int e11 = n32.e(c3, "state");
            int e12 = n32.e(c3, "worker_class_name");
            int e13 = n32.e(c3, "input_merger_class_name");
            int e14 = n32.e(c3, "input");
            int e15 = n32.e(c3, "output");
            xn9Var = c2;
            try {
                int e16 = n32.e(c3, "initial_delay");
                int e17 = n32.e(c3, "interval_duration");
                int e18 = n32.e(c3, "flex_duration");
                int e19 = n32.e(c3, "run_attempt_count");
                int e20 = n32.e(c3, "backoff_policy");
                int e21 = n32.e(c3, "backoff_delay_duration");
                int e22 = n32.e(c3, "period_start_time");
                int e23 = n32.e(c3, "minimum_retention_duration");
                int e24 = n32.e(c3, "schedule_requested_at");
                int e25 = n32.e(c3, "run_in_foreground");
                int e26 = n32.e(c3, "out_of_quota_policy");
                int i2 = e15;
                ArrayList arrayList = new ArrayList(c3.getCount());
                while (c3.moveToNext()) {
                    String string = c3.getString(e10);
                    int i3 = e10;
                    String string2 = c3.getString(e12);
                    int i4 = e12;
                    or1 or1Var = new or1();
                    int i5 = e2;
                    or1Var.k(y7c.e(c3.getInt(e2)));
                    if (c3.getInt(e3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    or1Var.m(z);
                    if (c3.getInt(e4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    or1Var.n(z2);
                    if (c3.getInt(e5) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    or1Var.l(z3);
                    if (c3.getInt(e6) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    or1Var.o(z4);
                    int i6 = e3;
                    int i7 = e4;
                    or1Var.p(c3.getLong(e7));
                    or1Var.q(c3.getLong(e8));
                    or1Var.j(y7c.b(c3.getBlob(e9)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.b = y7c.g(c3.getInt(e11));
                    workSpec.d = c3.getString(e13);
                    workSpec.e = androidx.work.b.h(c3.getBlob(e14));
                    int i8 = i2;
                    workSpec.f = androidx.work.b.h(c3.getBlob(i8));
                    i2 = i8;
                    int i9 = e16;
                    workSpec.g = c3.getLong(i9);
                    int i10 = e14;
                    int i11 = e17;
                    workSpec.h = c3.getLong(i11);
                    int i12 = e5;
                    int i13 = e18;
                    workSpec.i = c3.getLong(i13);
                    int i14 = e19;
                    workSpec.k = c3.getInt(i14);
                    int i15 = e20;
                    workSpec.l = y7c.d(c3.getInt(i15));
                    e18 = i13;
                    int i16 = e21;
                    workSpec.m = c3.getLong(i16);
                    int i17 = e22;
                    workSpec.n = c3.getLong(i17);
                    e22 = i17;
                    int i18 = e23;
                    workSpec.o = c3.getLong(i18);
                    int i19 = e24;
                    workSpec.p = c3.getLong(i19);
                    int i20 = e25;
                    if (c3.getInt(i20) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    workSpec.q = z5;
                    int i21 = e26;
                    workSpec.r = y7c.f(c3.getInt(i21));
                    workSpec.j = or1Var;
                    arrayList.add(workSpec);
                    e26 = i21;
                    e3 = i6;
                    e14 = i10;
                    e16 = i9;
                    e17 = i11;
                    e19 = i14;
                    e24 = i19;
                    e10 = i3;
                    e12 = i4;
                    e2 = i5;
                    e25 = i20;
                    e23 = i18;
                    e4 = i7;
                    e21 = i16;
                    e5 = i12;
                    e20 = i15;
                }
                c3.close();
                xn9Var.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c3.close();
                xn9Var.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xn9Var = c2;
        }
    }

    @Override // androidx.work.impl.model.a
    public List<String> e(String str) {
        xn9 c2 = xn9.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c2.z1(1);
        } else {
            c2.L0(1, str);
        }
        this.a.d();
        Cursor c3 = k62.c(this.a, c2, false, null);
        try {
            ArrayList arrayList = new ArrayList(c3.getCount());
            while (c3.moveToNext()) {
                arrayList.add(c3.getString(0));
            }
            return arrayList;
        } finally {
            c3.close();
            c2.j();
        }
    }

    @Override // androidx.work.impl.model.a
    public b7c.a f(String str) {
        xn9 c2 = xn9.c("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            c2.z1(1);
        } else {
            c2.L0(1, str);
        }
        this.a.d();
        b7c.a aVar = null;
        Cursor c3 = k62.c(this.a, c2, false, null);
        try {
            if (c3.moveToFirst()) {
                aVar = y7c.g(c3.getInt(0));
            }
            return aVar;
        } finally {
            c3.close();
            c2.j();
        }
    }

    @Override // androidx.work.impl.model.a
    public WorkSpec g(String str) {
        xn9 xn9Var;
        int e2;
        int e3;
        int e4;
        int e5;
        int e6;
        int e7;
        int e8;
        int e9;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        WorkSpec workSpec;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        xn9 c2 = xn9.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            c2.z1(1);
        } else {
            c2.L0(1, str);
        }
        this.a.d();
        Cursor c3 = k62.c(this.a, c2, false, null);
        try {
            e2 = n32.e(c3, "required_network_type");
            e3 = n32.e(c3, "requires_charging");
            e4 = n32.e(c3, "requires_device_idle");
            e5 = n32.e(c3, "requires_battery_not_low");
            e6 = n32.e(c3, "requires_storage_not_low");
            e7 = n32.e(c3, "trigger_content_update_delay");
            e8 = n32.e(c3, "trigger_max_content_delay");
            e9 = n32.e(c3, "content_uri_triggers");
            e10 = n32.e(c3, "id");
            e11 = n32.e(c3, "state");
            e12 = n32.e(c3, "worker_class_name");
            e13 = n32.e(c3, "input_merger_class_name");
            e14 = n32.e(c3, "input");
            e15 = n32.e(c3, "output");
            xn9Var = c2;
        } catch (Throwable th) {
            th = th;
            xn9Var = c2;
        }
        try {
            int e16 = n32.e(c3, "initial_delay");
            int e17 = n32.e(c3, "interval_duration");
            int e18 = n32.e(c3, "flex_duration");
            int e19 = n32.e(c3, "run_attempt_count");
            int e20 = n32.e(c3, "backoff_policy");
            int e21 = n32.e(c3, "backoff_delay_duration");
            int e22 = n32.e(c3, "period_start_time");
            int e23 = n32.e(c3, "minimum_retention_duration");
            int e24 = n32.e(c3, "schedule_requested_at");
            int e25 = n32.e(c3, "run_in_foreground");
            int e26 = n32.e(c3, "out_of_quota_policy");
            if (c3.moveToFirst()) {
                String string = c3.getString(e10);
                String string2 = c3.getString(e12);
                or1 or1Var = new or1();
                or1Var.k(y7c.e(c3.getInt(e2)));
                if (c3.getInt(e3) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                or1Var.m(z);
                if (c3.getInt(e4) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                or1Var.n(z2);
                if (c3.getInt(e5) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                or1Var.l(z3);
                if (c3.getInt(e6) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                or1Var.o(z4);
                or1Var.p(c3.getLong(e7));
                or1Var.q(c3.getLong(e8));
                or1Var.j(y7c.b(c3.getBlob(e9)));
                WorkSpec workSpec2 = new WorkSpec(string, string2);
                workSpec2.b = y7c.g(c3.getInt(e11));
                workSpec2.d = c3.getString(e13);
                workSpec2.e = androidx.work.b.h(c3.getBlob(e14));
                workSpec2.f = androidx.work.b.h(c3.getBlob(e15));
                workSpec2.g = c3.getLong(e16);
                workSpec2.h = c3.getLong(e17);
                workSpec2.i = c3.getLong(e18);
                workSpec2.k = c3.getInt(e19);
                workSpec2.l = y7c.d(c3.getInt(e20));
                workSpec2.m = c3.getLong(e21);
                workSpec2.n = c3.getLong(e22);
                workSpec2.o = c3.getLong(e23);
                workSpec2.p = c3.getLong(e24);
                if (c3.getInt(e25) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                workSpec2.q = z5;
                workSpec2.r = y7c.f(c3.getInt(e26));
                workSpec2.j = or1Var;
                workSpec = workSpec2;
            } else {
                workSpec = null;
            }
            c3.close();
            xn9Var.j();
            return workSpec;
        } catch (Throwable th2) {
            th = th2;
            c3.close();
            xn9Var.j();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.a
    public List<String> h(String str) {
        xn9 c2 = xn9.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            c2.z1(1);
        } else {
            c2.L0(1, str);
        }
        this.a.d();
        Cursor c3 = k62.c(this.a, c2, false, null);
        try {
            ArrayList arrayList = new ArrayList(c3.getCount());
            while (c3.moveToNext()) {
                arrayList.add(c3.getString(0));
            }
            return arrayList;
        } finally {
            c3.close();
            c2.j();
        }
    }

    @Override // androidx.work.impl.model.a
    public List<androidx.work.b> i(String str) {
        xn9 c2 = xn9.c("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            c2.z1(1);
        } else {
            c2.L0(1, str);
        }
        this.a.d();
        Cursor c3 = k62.c(this.a, c2, false, null);
        try {
            ArrayList arrayList = new ArrayList(c3.getCount());
            while (c3.moveToNext()) {
                arrayList.add(androidx.work.b.h(c3.getBlob(0)));
            }
            return arrayList;
        } finally {
            c3.close();
            c2.j();
        }
    }

    @Override // androidx.work.impl.model.a
    public List<WorkSpec> j(int i2) {
        xn9 xn9Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        xn9 c2 = xn9.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        c2.c1(1, i2);
        this.a.d();
        Cursor c3 = k62.c(this.a, c2, false, null);
        try {
            int e2 = n32.e(c3, "required_network_type");
            int e3 = n32.e(c3, "requires_charging");
            int e4 = n32.e(c3, "requires_device_idle");
            int e5 = n32.e(c3, "requires_battery_not_low");
            int e6 = n32.e(c3, "requires_storage_not_low");
            int e7 = n32.e(c3, "trigger_content_update_delay");
            int e8 = n32.e(c3, "trigger_max_content_delay");
            int e9 = n32.e(c3, "content_uri_triggers");
            int e10 = n32.e(c3, "id");
            int e11 = n32.e(c3, "state");
            int e12 = n32.e(c3, "worker_class_name");
            int e13 = n32.e(c3, "input_merger_class_name");
            int e14 = n32.e(c3, "input");
            int e15 = n32.e(c3, "output");
            xn9Var = c2;
            try {
                int e16 = n32.e(c3, "initial_delay");
                int e17 = n32.e(c3, "interval_duration");
                int e18 = n32.e(c3, "flex_duration");
                int e19 = n32.e(c3, "run_attempt_count");
                int e20 = n32.e(c3, "backoff_policy");
                int e21 = n32.e(c3, "backoff_delay_duration");
                int e22 = n32.e(c3, "period_start_time");
                int e23 = n32.e(c3, "minimum_retention_duration");
                int e24 = n32.e(c3, "schedule_requested_at");
                int e25 = n32.e(c3, "run_in_foreground");
                int e26 = n32.e(c3, "out_of_quota_policy");
                int i3 = e15;
                ArrayList arrayList = new ArrayList(c3.getCount());
                while (c3.moveToNext()) {
                    String string = c3.getString(e10);
                    int i4 = e10;
                    String string2 = c3.getString(e12);
                    int i5 = e12;
                    or1 or1Var = new or1();
                    int i6 = e2;
                    or1Var.k(y7c.e(c3.getInt(e2)));
                    if (c3.getInt(e3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    or1Var.m(z);
                    if (c3.getInt(e4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    or1Var.n(z2);
                    if (c3.getInt(e5) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    or1Var.l(z3);
                    if (c3.getInt(e6) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    or1Var.o(z4);
                    int i7 = e3;
                    int i8 = e4;
                    or1Var.p(c3.getLong(e7));
                    or1Var.q(c3.getLong(e8));
                    or1Var.j(y7c.b(c3.getBlob(e9)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.b = y7c.g(c3.getInt(e11));
                    workSpec.d = c3.getString(e13);
                    workSpec.e = androidx.work.b.h(c3.getBlob(e14));
                    int i9 = i3;
                    workSpec.f = androidx.work.b.h(c3.getBlob(i9));
                    i3 = i9;
                    int i10 = e16;
                    workSpec.g = c3.getLong(i10);
                    int i11 = e13;
                    int i12 = e17;
                    workSpec.h = c3.getLong(i12);
                    int i13 = e5;
                    int i14 = e18;
                    workSpec.i = c3.getLong(i14);
                    int i15 = e19;
                    workSpec.k = c3.getInt(i15);
                    int i16 = e20;
                    workSpec.l = y7c.d(c3.getInt(i16));
                    e18 = i14;
                    int i17 = e21;
                    workSpec.m = c3.getLong(i17);
                    int i18 = e22;
                    workSpec.n = c3.getLong(i18);
                    e22 = i18;
                    int i19 = e23;
                    workSpec.o = c3.getLong(i19);
                    int i20 = e24;
                    workSpec.p = c3.getLong(i20);
                    int i21 = e25;
                    if (c3.getInt(i21) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    workSpec.q = z5;
                    int i22 = e26;
                    workSpec.r = y7c.f(c3.getInt(i22));
                    workSpec.j = or1Var;
                    arrayList.add(workSpec);
                    e26 = i22;
                    e3 = i7;
                    e13 = i11;
                    e16 = i10;
                    e17 = i12;
                    e19 = i15;
                    e24 = i20;
                    e10 = i4;
                    e12 = i5;
                    e2 = i6;
                    e25 = i21;
                    e23 = i19;
                    e4 = i8;
                    e21 = i17;
                    e5 = i13;
                    e20 = i16;
                }
                c3.close();
                xn9Var.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c3.close();
                xn9Var.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xn9Var = c2;
        }
    }

    @Override // androidx.work.impl.model.a
    public int k() {
        this.a.d();
        c3b b = this.i.b();
        this.a.e();
        try {
            int I = b.I();
            this.a.B();
            return I;
        } finally {
            this.a.i();
            this.i.h(b);
        }
    }

    @Override // androidx.work.impl.model.a
    public int l(String str, long j) {
        this.a.d();
        c3b b = this.h.b();
        b.c1(1, j);
        if (str == null) {
            b.z1(2);
        } else {
            b.L0(2, str);
        }
        this.a.e();
        try {
            int I = b.I();
            this.a.B();
            return I;
        } finally {
            this.a.i();
            this.h.h(b);
        }
    }

    @Override // androidx.work.impl.model.a
    public List<WorkSpec.b> m(String str) {
        xn9 c2 = xn9.c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c2.z1(1);
        } else {
            c2.L0(1, str);
        }
        this.a.d();
        Cursor c3 = k62.c(this.a, c2, false, null);
        try {
            int e2 = n32.e(c3, "id");
            int e3 = n32.e(c3, "state");
            ArrayList arrayList = new ArrayList(c3.getCount());
            while (c3.moveToNext()) {
                WorkSpec.b bVar = new WorkSpec.b();
                bVar.a = c3.getString(e2);
                bVar.b = y7c.g(c3.getInt(e3));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            c3.close();
            c2.j();
        }
    }

    @Override // androidx.work.impl.model.a
    public List<WorkSpec> n(int i2) {
        xn9 xn9Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        xn9 c2 = xn9.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        c2.c1(1, i2);
        this.a.d();
        Cursor c3 = k62.c(this.a, c2, false, null);
        try {
            int e2 = n32.e(c3, "required_network_type");
            int e3 = n32.e(c3, "requires_charging");
            int e4 = n32.e(c3, "requires_device_idle");
            int e5 = n32.e(c3, "requires_battery_not_low");
            int e6 = n32.e(c3, "requires_storage_not_low");
            int e7 = n32.e(c3, "trigger_content_update_delay");
            int e8 = n32.e(c3, "trigger_max_content_delay");
            int e9 = n32.e(c3, "content_uri_triggers");
            int e10 = n32.e(c3, "id");
            int e11 = n32.e(c3, "state");
            int e12 = n32.e(c3, "worker_class_name");
            int e13 = n32.e(c3, "input_merger_class_name");
            int e14 = n32.e(c3, "input");
            int e15 = n32.e(c3, "output");
            xn9Var = c2;
            try {
                int e16 = n32.e(c3, "initial_delay");
                int e17 = n32.e(c3, "interval_duration");
                int e18 = n32.e(c3, "flex_duration");
                int e19 = n32.e(c3, "run_attempt_count");
                int e20 = n32.e(c3, "backoff_policy");
                int e21 = n32.e(c3, "backoff_delay_duration");
                int e22 = n32.e(c3, "period_start_time");
                int e23 = n32.e(c3, "minimum_retention_duration");
                int e24 = n32.e(c3, "schedule_requested_at");
                int e25 = n32.e(c3, "run_in_foreground");
                int e26 = n32.e(c3, "out_of_quota_policy");
                int i3 = e15;
                ArrayList arrayList = new ArrayList(c3.getCount());
                while (c3.moveToNext()) {
                    String string = c3.getString(e10);
                    int i4 = e10;
                    String string2 = c3.getString(e12);
                    int i5 = e12;
                    or1 or1Var = new or1();
                    int i6 = e2;
                    or1Var.k(y7c.e(c3.getInt(e2)));
                    if (c3.getInt(e3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    or1Var.m(z);
                    if (c3.getInt(e4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    or1Var.n(z2);
                    if (c3.getInt(e5) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    or1Var.l(z3);
                    if (c3.getInt(e6) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    or1Var.o(z4);
                    int i7 = e3;
                    int i8 = e4;
                    or1Var.p(c3.getLong(e7));
                    or1Var.q(c3.getLong(e8));
                    or1Var.j(y7c.b(c3.getBlob(e9)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.b = y7c.g(c3.getInt(e11));
                    workSpec.d = c3.getString(e13);
                    workSpec.e = androidx.work.b.h(c3.getBlob(e14));
                    int i9 = i3;
                    workSpec.f = androidx.work.b.h(c3.getBlob(i9));
                    i3 = i9;
                    int i10 = e16;
                    workSpec.g = c3.getLong(i10);
                    int i11 = e13;
                    int i12 = e17;
                    workSpec.h = c3.getLong(i12);
                    int i13 = e5;
                    int i14 = e18;
                    workSpec.i = c3.getLong(i14);
                    int i15 = e19;
                    workSpec.k = c3.getInt(i15);
                    int i16 = e20;
                    workSpec.l = y7c.d(c3.getInt(i16));
                    e18 = i14;
                    int i17 = e21;
                    workSpec.m = c3.getLong(i17);
                    int i18 = e22;
                    workSpec.n = c3.getLong(i18);
                    e22 = i18;
                    int i19 = e23;
                    workSpec.o = c3.getLong(i19);
                    int i20 = e24;
                    workSpec.p = c3.getLong(i20);
                    int i21 = e25;
                    if (c3.getInt(i21) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    workSpec.q = z5;
                    int i22 = e26;
                    workSpec.r = y7c.f(c3.getInt(i22));
                    workSpec.j = or1Var;
                    arrayList.add(workSpec);
                    e26 = i22;
                    e3 = i7;
                    e13 = i11;
                    e16 = i10;
                    e17 = i12;
                    e19 = i15;
                    e24 = i20;
                    e10 = i4;
                    e12 = i5;
                    e2 = i6;
                    e25 = i21;
                    e23 = i19;
                    e4 = i8;
                    e21 = i17;
                    e5 = i13;
                    e20 = i16;
                }
                c3.close();
                xn9Var.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c3.close();
                xn9Var.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xn9Var = c2;
        }
    }

    @Override // androidx.work.impl.model.a
    public void o(String str, androidx.work.b bVar) {
        this.a.d();
        c3b b = this.d.b();
        byte[] o = androidx.work.b.o(bVar);
        if (o == null) {
            b.z1(1);
        } else {
            b.h1(1, o);
        }
        if (str == null) {
            b.z1(2);
        } else {
            b.L0(2, str);
        }
        this.a.e();
        try {
            b.I();
            this.a.B();
        } finally {
            this.a.i();
            this.d.h(b);
        }
    }

    @Override // androidx.work.impl.model.a
    public List<WorkSpec> p() {
        xn9 xn9Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        xn9 c2 = xn9.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.a.d();
        Cursor c3 = k62.c(this.a, c2, false, null);
        try {
            int e2 = n32.e(c3, "required_network_type");
            int e3 = n32.e(c3, "requires_charging");
            int e4 = n32.e(c3, "requires_device_idle");
            int e5 = n32.e(c3, "requires_battery_not_low");
            int e6 = n32.e(c3, "requires_storage_not_low");
            int e7 = n32.e(c3, "trigger_content_update_delay");
            int e8 = n32.e(c3, "trigger_max_content_delay");
            int e9 = n32.e(c3, "content_uri_triggers");
            int e10 = n32.e(c3, "id");
            int e11 = n32.e(c3, "state");
            int e12 = n32.e(c3, "worker_class_name");
            int e13 = n32.e(c3, "input_merger_class_name");
            int e14 = n32.e(c3, "input");
            int e15 = n32.e(c3, "output");
            xn9Var = c2;
            try {
                int e16 = n32.e(c3, "initial_delay");
                int e17 = n32.e(c3, "interval_duration");
                int e18 = n32.e(c3, "flex_duration");
                int e19 = n32.e(c3, "run_attempt_count");
                int e20 = n32.e(c3, "backoff_policy");
                int e21 = n32.e(c3, "backoff_delay_duration");
                int e22 = n32.e(c3, "period_start_time");
                int e23 = n32.e(c3, "minimum_retention_duration");
                int e24 = n32.e(c3, "schedule_requested_at");
                int e25 = n32.e(c3, "run_in_foreground");
                int e26 = n32.e(c3, "out_of_quota_policy");
                int i2 = e15;
                ArrayList arrayList = new ArrayList(c3.getCount());
                while (c3.moveToNext()) {
                    String string = c3.getString(e10);
                    int i3 = e10;
                    String string2 = c3.getString(e12);
                    int i4 = e12;
                    or1 or1Var = new or1();
                    int i5 = e2;
                    or1Var.k(y7c.e(c3.getInt(e2)));
                    if (c3.getInt(e3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    or1Var.m(z);
                    if (c3.getInt(e4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    or1Var.n(z2);
                    if (c3.getInt(e5) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    or1Var.l(z3);
                    if (c3.getInt(e6) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    or1Var.o(z4);
                    int i6 = e3;
                    int i7 = e4;
                    or1Var.p(c3.getLong(e7));
                    or1Var.q(c3.getLong(e8));
                    or1Var.j(y7c.b(c3.getBlob(e9)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.b = y7c.g(c3.getInt(e11));
                    workSpec.d = c3.getString(e13);
                    workSpec.e = androidx.work.b.h(c3.getBlob(e14));
                    int i8 = i2;
                    workSpec.f = androidx.work.b.h(c3.getBlob(i8));
                    i2 = i8;
                    int i9 = e16;
                    workSpec.g = c3.getLong(i9);
                    int i10 = e14;
                    int i11 = e17;
                    workSpec.h = c3.getLong(i11);
                    int i12 = e5;
                    int i13 = e18;
                    workSpec.i = c3.getLong(i13);
                    int i14 = e19;
                    workSpec.k = c3.getInt(i14);
                    int i15 = e20;
                    workSpec.l = y7c.d(c3.getInt(i15));
                    e18 = i13;
                    int i16 = e21;
                    workSpec.m = c3.getLong(i16);
                    int i17 = e22;
                    workSpec.n = c3.getLong(i17);
                    e22 = i17;
                    int i18 = e23;
                    workSpec.o = c3.getLong(i18);
                    int i19 = e24;
                    workSpec.p = c3.getLong(i19);
                    int i20 = e25;
                    if (c3.getInt(i20) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    workSpec.q = z5;
                    int i21 = e26;
                    workSpec.r = y7c.f(c3.getInt(i21));
                    workSpec.j = or1Var;
                    arrayList.add(workSpec);
                    e26 = i21;
                    e3 = i6;
                    e14 = i10;
                    e16 = i9;
                    e17 = i11;
                    e19 = i14;
                    e24 = i19;
                    e10 = i3;
                    e12 = i4;
                    e2 = i5;
                    e25 = i20;
                    e23 = i18;
                    e4 = i7;
                    e21 = i16;
                    e5 = i12;
                    e20 = i15;
                }
                c3.close();
                xn9Var.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c3.close();
                xn9Var.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xn9Var = c2;
        }
    }

    @Override // androidx.work.impl.model.a
    public boolean q() {
        boolean z = false;
        xn9 c2 = xn9.c("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.a.d();
        Cursor c3 = k62.c(this.a, c2, false, null);
        try {
            if (c3.moveToFirst()) {
                if (c3.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            c3.close();
            c2.j();
        }
    }

    @Override // androidx.work.impl.model.a
    public int r(String str) {
        this.a.d();
        c3b b = this.g.b();
        if (str == null) {
            b.z1(1);
        } else {
            b.L0(1, str);
        }
        this.a.e();
        try {
            int I = b.I();
            this.a.B();
            return I;
        } finally {
            this.a.i();
            this.g.h(b);
        }
    }

    @Override // androidx.work.impl.model.a
    public int s(String str) {
        this.a.d();
        c3b b = this.f.b();
        if (str == null) {
            b.z1(1);
        } else {
            b.L0(1, str);
        }
        this.a.e();
        try {
            int I = b.I();
            this.a.B();
            return I;
        } finally {
            this.a.i();
            this.f.h(b);
        }
    }

    @Override // androidx.work.impl.model.a
    public void t(String str, long j) {
        this.a.d();
        c3b b = this.e.b();
        b.c1(1, j);
        if (str == null) {
            b.z1(2);
        } else {
            b.L0(2, str);
        }
        this.a.e();
        try {
            b.I();
            this.a.B();
        } finally {
            this.a.i();
            this.e.h(b);
        }
    }

    @Override // androidx.work.impl.model.a
    public int u(b7c.a aVar, String... strArr) {
        this.a.d();
        StringBuilder b = xza.b();
        b.append("UPDATE workspec SET state=");
        b.append(CallerData.NA);
        b.append(" WHERE id IN (");
        xza.a(b, strArr.length);
        b.append(")");
        c3b f2 = this.a.f(b.toString());
        f2.c1(1, y7c.j(aVar));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                f2.z1(i2);
            } else {
                f2.L0(i2, str);
            }
            i2++;
        }
        this.a.e();
        try {
            int I = f2.I();
            this.a.B();
            return I;
        } finally {
            this.a.i();
        }
    }
}
