package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
/* compiled from: WorkDatabaseMigrations.java */
/* loaded from: classes.dex */
public class a {
    @NonNull
    public static bj6 a = new C0052a(1, 2);
    @NonNull
    public static bj6 b = new b(3, 4);
    @NonNull
    public static bj6 c = new c(4, 5);
    @NonNull
    public static bj6 d = new d(6, 7);
    @NonNull
    public static bj6 e = new e(7, 8);
    @NonNull
    public static bj6 f = new f(8, 9);
    @NonNull
    public static bj6 g = new g(11, 12);

    /* compiled from: WorkDatabaseMigrations.java */
    /* renamed from: androidx.work.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0052a extends bj6 {
        C0052a(int i, int i2) {
            super(i, i2);
        }

        @Override // defpackage.bj6
        public void a(@NonNull y2b y2bVar) {
            y2bVar.C("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            y2bVar.C("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            y2bVar.C("DROP TABLE IF EXISTS alarmInfo");
            y2bVar.C("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class b extends bj6 {
        b(int i, int i2) {
            super(i, i2);
        }

        @Override // defpackage.bj6
        public void a(@NonNull y2b y2bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                y2bVar.C("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class c extends bj6 {
        c(int i, int i2) {
            super(i, i2);
        }

        @Override // defpackage.bj6
        public void a(@NonNull y2b y2bVar) {
            y2bVar.C("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            y2bVar.C("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class d extends bj6 {
        d(int i, int i2) {
            super(i, i2);
        }

        @Override // defpackage.bj6
        public void a(@NonNull y2b y2bVar) {
            y2bVar.C("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class e extends bj6 {
        e(int i, int i2) {
            super(i, i2);
        }

        @Override // defpackage.bj6
        public void a(@NonNull y2b y2bVar) {
            y2bVar.C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class f extends bj6 {
        f(int i, int i2) {
            super(i, i2);
        }

        @Override // defpackage.bj6
        public void a(@NonNull y2b y2bVar) {
            y2bVar.C("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class g extends bj6 {
        g(int i, int i2) {
            super(i, i2);
        }

        @Override // defpackage.bj6
        public void a(@NonNull y2b y2bVar) {
            y2bVar.C("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public static class h extends bj6 {
        final Context c;

        public h(@NonNull Context context, int i, int i2) {
            super(i, i2);
            this.c = context;
        }

        @Override // defpackage.bj6
        public void a(@NonNull y2b y2bVar) {
            if (this.b >= 10) {
                y2bVar.Y("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public static class i extends bj6 {
        final Context c;

        public i(@NonNull Context context) {
            super(9, 10);
            this.c = context;
        }

        @Override // defpackage.bj6
        public void a(@NonNull y2b y2bVar) {
            y2bVar.C("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            ai8.b(this.c, y2bVar);
            ft4.a(this.c, y2bVar);
        }
    }
}
