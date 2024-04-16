package androidx.work.impl;

import androidx.work.impl.model.b;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.u5b;
import defpackage.un9;
import defpackage.wn9;
import defpackage.z2b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile androidx.work.impl.model.a q;
    private volatile f03 r;
    private volatile v7c s;
    private volatile i4b t;
    private volatile l7c u;
    private volatile n7c v;
    private volatile rh8 w;

    @Override // androidx.work.impl.WorkDatabase
    public f03 E() {
        f03 f03Var;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new g03(this);
                }
                f03Var = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f03Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public rh8 I() {
        rh8 rh8Var;
        if (this.w != null) {
            return this.w;
        }
        synchronized (this) {
            try {
                if (this.w == null) {
                    this.w = new sh8(this);
                }
                rh8Var = this.w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rh8Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public i4b J() {
        i4b i4bVar;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            try {
                if (this.t == null) {
                    this.t = new j4b(this);
                }
                i4bVar = this.t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i4bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public l7c K() {
        l7c l7cVar;
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            try {
                if (this.u == null) {
                    this.u = new m7c(this);
                }
                l7cVar = this.u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l7cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public n7c L() {
        n7c n7cVar;
        if (this.v != null) {
            return this.v;
        }
        synchronized (this) {
            try {
                if (this.v == null) {
                    this.v = new o7c(this);
                }
                n7cVar = this.v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n7cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.a M() {
        androidx.work.impl.model.a aVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new b(this);
                }
                aVar = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public v7c N() {
        v7c v7cVar;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new w7c(this);
                }
                v7cVar = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return v7cVar;
    }

    @Override // defpackage.un9
    protected l75 g() {
        return new l75(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.un9
    protected z2b h(yl2 yl2Var) {
        return yl2Var.c.a(z2b.b.a(yl2Var.a).c(yl2Var.b).b(new wn9(yl2Var, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }

    /* loaded from: classes.dex */
    class a extends wn9.b {
        a(int i) {
            super(i);
        }

        @Override // defpackage.wn9.b
        public void a(y2b y2bVar) {
            y2bVar.C("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            y2bVar.C("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            y2bVar.C("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            y2bVar.C("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            y2bVar.C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            y2bVar.C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            y2bVar.C("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            y2bVar.C("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            y2bVar.C("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            y2bVar.C("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            y2bVar.C("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            y2bVar.C("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            y2bVar.C("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            y2bVar.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            y2bVar.C("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // defpackage.wn9.b
        public void b(y2b y2bVar) {
            y2bVar.C("DROP TABLE IF EXISTS `Dependency`");
            y2bVar.C("DROP TABLE IF EXISTS `WorkSpec`");
            y2bVar.C("DROP TABLE IF EXISTS `WorkTag`");
            y2bVar.C("DROP TABLE IF EXISTS `SystemIdInfo`");
            y2bVar.C("DROP TABLE IF EXISTS `WorkName`");
            y2bVar.C("DROP TABLE IF EXISTS `WorkProgress`");
            y2bVar.C("DROP TABLE IF EXISTS `Preference`");
            if (((un9) WorkDatabase_Impl.this).h != null) {
                int size = ((un9) WorkDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((un9.b) ((un9) WorkDatabase_Impl.this).h.get(i)).b(y2bVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.wn9.b
        public void c(y2b y2bVar) {
            if (((un9) WorkDatabase_Impl.this).h != null) {
                int size = ((un9) WorkDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((un9.b) ((un9) WorkDatabase_Impl.this).h.get(i)).a(y2bVar);
                }
            }
        }

        @Override // defpackage.wn9.b
        public void d(y2b y2bVar) {
            ((un9) WorkDatabase_Impl.this).a = y2bVar;
            y2bVar.C("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.w(y2bVar);
            if (((un9) WorkDatabase_Impl.this).h != null) {
                int size = ((un9) WorkDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((un9.b) ((un9) WorkDatabase_Impl.this).h.get(i)).c(y2bVar);
                }
            }
        }

        @Override // defpackage.wn9.b
        public void f(y2b y2bVar) {
            k62.b(y2bVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.wn9.b
        public wn9.c g(y2b y2bVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new u5b.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new u5b.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new u5b.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new u5b.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new u5b.e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new u5b.e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            u5b u5bVar = new u5b("Dependency", hashMap, hashSet, hashSet2);
            u5b a = u5b.a(y2bVar, "Dependency");
            if (!u5bVar.equals(a)) {
                return new wn9.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + u5bVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new u5b.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new u5b.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new u5b.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new u5b.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new u5b.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new u5b.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new u5b.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new u5b.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new u5b.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new u5b.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new u5b.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new u5b.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new u5b.a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new u5b.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new u5b.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new u5b.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new u5b.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new u5b.a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new u5b.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new u5b.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new u5b.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new u5b.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new u5b.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new u5b.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new u5b.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new u5b.e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new u5b.e("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            u5b u5bVar2 = new u5b("WorkSpec", hashMap2, hashSet3, hashSet4);
            u5b a2 = u5b.a(y2bVar, "WorkSpec");
            if (!u5bVar2.equals(a2)) {
                return new wn9.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + u5bVar2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put(RemoteMessageConst.Notification.TAG, new u5b.a(RemoteMessageConst.Notification.TAG, "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new u5b.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new u5b.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new u5b.e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            u5b u5bVar3 = new u5b("WorkTag", hashMap3, hashSet5, hashSet6);
            u5b a3 = u5b.a(y2bVar, "WorkTag");
            if (!u5bVar3.equals(a3)) {
                return new wn9.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + u5bVar3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new u5b.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("system_id", new u5b.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new u5b.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            u5b u5bVar4 = new u5b("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            u5b a4 = u5b.a(y2bVar, "SystemIdInfo");
            if (!u5bVar4.equals(a4)) {
                return new wn9.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + u5bVar4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put(Action.NAME_ATTRIBUTE, new u5b.a(Action.NAME_ATTRIBUTE, "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new u5b.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new u5b.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new u5b.e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            u5b u5bVar5 = new u5b("WorkName", hashMap5, hashSet8, hashSet9);
            u5b a5 = u5b.a(y2bVar, "WorkName");
            if (!u5bVar5.equals(a5)) {
                return new wn9.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + u5bVar5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new u5b.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new u5b.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new u5b.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            u5b u5bVar6 = new u5b("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            u5b a6 = u5b.a(y2bVar, "WorkProgress");
            if (!u5bVar6.equals(a6)) {
                return new wn9.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + u5bVar6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put(Action.KEY_ATTRIBUTE, new u5b.a(Action.KEY_ATTRIBUTE, "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new u5b.a("long_value", "INTEGER", false, 0, null, 1));
            u5b u5bVar7 = new u5b("Preference", hashMap7, new HashSet(0), new HashSet(0));
            u5b a7 = u5b.a(y2bVar, "Preference");
            if (!u5bVar7.equals(a7)) {
                return new wn9.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + u5bVar7 + "\n Found:\n" + a7);
            }
            return new wn9.c(true, null);
        }

        @Override // defpackage.wn9.b
        public void e(y2b y2bVar) {
        }
    }
}
