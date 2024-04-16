package cloud.mindbox.mobile_sdk.monitoring.data.room;

import androidx.annotation.NonNull;
import defpackage.u5b;
import defpackage.un9;
import defpackage.wn9;
import defpackage.z2b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class MonitoringDatabase_Impl extends MonitoringDatabase {
    private volatile zn6 r;

    @Override // cloud.mindbox.mobile_sdk.monitoring.data.room.MonitoringDatabase
    public zn6 E() {
        zn6 zn6Var;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new ao6(this);
                }
                zn6Var = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zn6Var;
    }

    @Override // defpackage.un9
    protected l75 g() {
        return new l75(this, new HashMap(0), new HashMap(0), "mb_monitoring");
    }

    @Override // defpackage.un9
    protected z2b h(yl2 yl2Var) {
        return yl2Var.c.a(z2b.b.a(yl2Var.a).c(yl2Var.b).b(new wn9(yl2Var, new a(2), "d8a714418753fef6b4f7ce8daaaf5331", "a4b63c1cca619b8f8c7a2617427805dd")).a());
    }

    @Override // defpackage.un9
    public List<bj6> j(@NonNull Map<Class<Object>, Object> map) {
        return Arrays.asList(new bj6[0]);
    }

    @Override // defpackage.un9
    public Set<Class<Object>> p() {
        return new HashSet();
    }

    @Override // defpackage.un9
    protected Map<Class<?>, List<Class<?>>> q() {
        HashMap hashMap = new HashMap();
        hashMap.put(zn6.class, ao6.i());
        return hashMap;
    }

    /* loaded from: classes.dex */
    class a extends wn9.b {
        a(int i) {
            super(i);
        }

        @Override // defpackage.wn9.b
        public void a(y2b y2bVar) {
            y2bVar.C("CREATE TABLE IF NOT EXISTS `mb_monitoring` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` TEXT NOT NULL, `log` TEXT NOT NULL)");
            y2bVar.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            y2bVar.C("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd8a714418753fef6b4f7ce8daaaf5331')");
        }

        @Override // defpackage.wn9.b
        public void b(y2b y2bVar) {
            y2bVar.C("DROP TABLE IF EXISTS `mb_monitoring`");
            if (((un9) MonitoringDatabase_Impl.this).h != null) {
                int size = ((un9) MonitoringDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((un9.b) ((un9) MonitoringDatabase_Impl.this).h.get(i)).b(y2bVar);
                }
            }
        }

        @Override // defpackage.wn9.b
        public void c(y2b y2bVar) {
            if (((un9) MonitoringDatabase_Impl.this).h != null) {
                int size = ((un9) MonitoringDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((un9.b) ((un9) MonitoringDatabase_Impl.this).h.get(i)).a(y2bVar);
                }
            }
        }

        @Override // defpackage.wn9.b
        public void d(y2b y2bVar) {
            ((un9) MonitoringDatabase_Impl.this).a = y2bVar;
            MonitoringDatabase_Impl.this.w(y2bVar);
            if (((un9) MonitoringDatabase_Impl.this).h != null) {
                int size = ((un9) MonitoringDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((un9.b) ((un9) MonitoringDatabase_Impl.this).h.get(i)).c(y2bVar);
                }
            }
        }

        @Override // defpackage.wn9.b
        public void f(y2b y2bVar) {
            k62.b(y2bVar);
        }

        @Override // defpackage.wn9.b
        public wn9.c g(y2b y2bVar) {
            HashMap hashMap = new HashMap(3);
            hashMap.put("id", new u5b.a("id", "INTEGER", true, 1, null, 1));
            hashMap.put("timestamp", new u5b.a("timestamp", "TEXT", true, 0, null, 1));
            hashMap.put("log", new u5b.a("log", "TEXT", true, 0, null, 1));
            u5b u5bVar = new u5b("mb_monitoring", hashMap, new HashSet(0), new HashSet(0));
            u5b a = u5b.a(y2bVar, "mb_monitoring");
            if (!u5bVar.equals(a)) {
                return new wn9.c(false, "mb_monitoring(cloud.mindbox.mobile_sdk.monitoring.data.room.entities.MonitoringEntity).\n Expected:\n" + u5bVar + "\n Found:\n" + a);
            }
            return new wn9.c(true, null);
        }

        @Override // defpackage.wn9.b
        public void e(y2b y2bVar) {
        }
    }
}
