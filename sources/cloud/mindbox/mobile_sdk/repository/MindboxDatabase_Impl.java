package cloud.mindbox.mobile_sdk.repository;

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
public final class MindboxDatabase_Impl extends MindboxDatabase {
    private volatile fq1 s;
    private volatile ml3 t;

    @Override // cloud.mindbox.mobile_sdk.repository.MindboxDatabase
    public fq1 F() {
        fq1 fq1Var;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new gq1(this);
                }
                fq1Var = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fq1Var;
    }

    @Override // cloud.mindbox.mobile_sdk.repository.MindboxDatabase
    public ml3 G() {
        ml3 ml3Var;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            try {
                if (this.t == null) {
                    this.t = new nl3(this);
                }
                ml3Var = this.t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ml3Var;
    }

    @Override // defpackage.un9
    protected l75 g() {
        return new l75(this, new HashMap(0), new HashMap(0), "mindbox_configuration_table", "mindbox_events_table");
    }

    @Override // defpackage.un9
    protected z2b h(yl2 yl2Var) {
        return yl2Var.c.a(z2b.b.a(yl2Var.a).c(yl2Var.b).b(new wn9(yl2Var, new a(2), "00fd6e8c1e516a697ab698be896615e9", "a44db91caef4e28596f27e6278a09f28")).a());
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
        hashMap.put(fq1.class, gq1.d());
        hashMap.put(ml3.class, nl3.e());
        return hashMap;
    }

    /* loaded from: classes.dex */
    class a extends wn9.b {
        a(int i) {
            super(i);
        }

        @Override // defpackage.wn9.b
        public void a(y2b y2bVar) {
            y2bVar.C("CREATE TABLE IF NOT EXISTS `mindbox_configuration_table` (`configurationId` INTEGER NOT NULL, `previousInstallationId` TEXT NOT NULL, `previousDeviceUUID` TEXT NOT NULL, `endpointId` TEXT NOT NULL, `domain` TEXT NOT NULL, `packageName` TEXT NOT NULL, `versionName` TEXT NOT NULL, `versionCode` TEXT NOT NULL, `subscribeCustomerIfCreated` INTEGER NOT NULL, `shouldCreateCustomer` INTEGER NOT NULL, PRIMARY KEY(`configurationId`))");
            y2bVar.C("CREATE TABLE IF NOT EXISTS `mindbox_events_table` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `eventType` TEXT NOT NULL, `transactionId` TEXT NOT NULL, `enqueueTimestamp` INTEGER NOT NULL, `additionalFields` TEXT, `body` TEXT)");
            y2bVar.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            y2bVar.C("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '00fd6e8c1e516a697ab698be896615e9')");
        }

        @Override // defpackage.wn9.b
        public void b(y2b y2bVar) {
            y2bVar.C("DROP TABLE IF EXISTS `mindbox_configuration_table`");
            y2bVar.C("DROP TABLE IF EXISTS `mindbox_events_table`");
            if (((un9) MindboxDatabase_Impl.this).h != null) {
                int size = ((un9) MindboxDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((un9.b) ((un9) MindboxDatabase_Impl.this).h.get(i)).b(y2bVar);
                }
            }
        }

        @Override // defpackage.wn9.b
        public void c(y2b y2bVar) {
            if (((un9) MindboxDatabase_Impl.this).h != null) {
                int size = ((un9) MindboxDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((un9.b) ((un9) MindboxDatabase_Impl.this).h.get(i)).a(y2bVar);
                }
            }
        }

        @Override // defpackage.wn9.b
        public void d(y2b y2bVar) {
            ((un9) MindboxDatabase_Impl.this).a = y2bVar;
            MindboxDatabase_Impl.this.w(y2bVar);
            if (((un9) MindboxDatabase_Impl.this).h != null) {
                int size = ((un9) MindboxDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((un9.b) ((un9) MindboxDatabase_Impl.this).h.get(i)).c(y2bVar);
                }
            }
        }

        @Override // defpackage.wn9.b
        public void f(y2b y2bVar) {
            k62.b(y2bVar);
        }

        @Override // defpackage.wn9.b
        public wn9.c g(y2b y2bVar) {
            HashMap hashMap = new HashMap(10);
            hashMap.put("configurationId", new u5b.a("configurationId", "INTEGER", true, 1, null, 1));
            hashMap.put("previousInstallationId", new u5b.a("previousInstallationId", "TEXT", true, 0, null, 1));
            hashMap.put("previousDeviceUUID", new u5b.a("previousDeviceUUID", "TEXT", true, 0, null, 1));
            hashMap.put("endpointId", new u5b.a("endpointId", "TEXT", true, 0, null, 1));
            hashMap.put("domain", new u5b.a("domain", "TEXT", true, 0, null, 1));
            hashMap.put("packageName", new u5b.a("packageName", "TEXT", true, 0, null, 1));
            hashMap.put("versionName", new u5b.a("versionName", "TEXT", true, 0, null, 1));
            hashMap.put("versionCode", new u5b.a("versionCode", "TEXT", true, 0, null, 1));
            hashMap.put("subscribeCustomerIfCreated", new u5b.a("subscribeCustomerIfCreated", "INTEGER", true, 0, null, 1));
            hashMap.put("shouldCreateCustomer", new u5b.a("shouldCreateCustomer", "INTEGER", true, 0, null, 1));
            u5b u5bVar = new u5b("mindbox_configuration_table", hashMap, new HashSet(0), new HashSet(0));
            u5b a = u5b.a(y2bVar, "mindbox_configuration_table");
            if (!u5bVar.equals(a)) {
                return new wn9.c(false, "mindbox_configuration_table(cloud.mindbox.mobile_sdk.models.Configuration).\n Expected:\n" + u5bVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(6);
            hashMap2.put("uid", new u5b.a("uid", "INTEGER", true, 1, null, 1));
            hashMap2.put("eventType", new u5b.a("eventType", "TEXT", true, 0, null, 1));
            hashMap2.put("transactionId", new u5b.a("transactionId", "TEXT", true, 0, null, 1));
            hashMap2.put("enqueueTimestamp", new u5b.a("enqueueTimestamp", "INTEGER", true, 0, null, 1));
            hashMap2.put("additionalFields", new u5b.a("additionalFields", "TEXT", false, 0, null, 1));
            hashMap2.put("body", new u5b.a("body", "TEXT", false, 0, null, 1));
            u5b u5bVar2 = new u5b("mindbox_events_table", hashMap2, new HashSet(0), new HashSet(0));
            u5b a2 = u5b.a(y2bVar, "mindbox_events_table");
            if (!u5bVar2.equals(a2)) {
                return new wn9.c(false, "mindbox_events_table(cloud.mindbox.mobile_sdk.models.Event).\n Expected:\n" + u5bVar2 + "\n Found:\n" + a2);
            }
            return new wn9.c(true, null);
        }

        @Override // defpackage.wn9.b
        public void e(y2b y2bVar) {
        }
    }
}
