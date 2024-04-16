package defpackage;

import android.database.Cursor;
import cloud.mindbox.mobile_sdk.models.Configuration;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: ConfigurationsDao_Impl.java */
/* renamed from: gq1  reason: default package */
/* loaded from: classes.dex */
public final class gq1 implements fq1 {
    private final un9 a;
    private final dj3<Configuration> b;

    /* compiled from: ConfigurationsDao_Impl.java */
    /* renamed from: gq1$a */
    /* loaded from: classes.dex */
    class a extends dj3<Configuration> {
        a(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "INSERT OR REPLACE INTO `mindbox_configuration_table` (`configurationId`,`previousInstallationId`,`previousDeviceUUID`,`endpointId`,`domain`,`packageName`,`versionName`,`versionCode`,`subscribeCustomerIfCreated`,`shouldCreateCustomer`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // defpackage.dj3
        /* renamed from: k */
        public void i(c3b c3bVar, Configuration configuration) {
            c3bVar.c1(1, configuration.getConfigurationId());
            if (configuration.getPreviousInstallationId() == null) {
                c3bVar.z1(2);
            } else {
                c3bVar.L0(2, configuration.getPreviousInstallationId());
            }
            if (configuration.getPreviousDeviceUUID() == null) {
                c3bVar.z1(3);
            } else {
                c3bVar.L0(3, configuration.getPreviousDeviceUUID());
            }
            if (configuration.getEndpointId() == null) {
                c3bVar.z1(4);
            } else {
                c3bVar.L0(4, configuration.getEndpointId());
            }
            if (configuration.getDomain() == null) {
                c3bVar.z1(5);
            } else {
                c3bVar.L0(5, configuration.getDomain());
            }
            if (configuration.getPackageName() == null) {
                c3bVar.z1(6);
            } else {
                c3bVar.L0(6, configuration.getPackageName());
            }
            if (configuration.getVersionName() == null) {
                c3bVar.z1(7);
            } else {
                c3bVar.L0(7, configuration.getVersionName());
            }
            if (configuration.getVersionCode() == null) {
                c3bVar.z1(8);
            } else {
                c3bVar.L0(8, configuration.getVersionCode());
            }
            c3bVar.c1(9, configuration.getSubscribeCustomerIfCreated() ? 1L : 0L);
            c3bVar.c1(10, configuration.getShouldCreateCustomer() ? 1L : 0L);
        }
    }

    /* compiled from: ConfigurationsDao_Impl.java */
    /* renamed from: gq1$b */
    /* loaded from: classes.dex */
    class b implements Callable<Configuration> {
        final /* synthetic */ xn9 a;

        b(xn9 xn9Var) {
            this.a = xn9Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Configuration call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            boolean z;
            boolean z2;
            Configuration configuration = null;
            String string7 = null;
            Cursor c = k62.c(gq1.this.a, this.a, false, null);
            try {
                int e = n32.e(c, "configurationId");
                int e2 = n32.e(c, "previousInstallationId");
                int e3 = n32.e(c, "previousDeviceUUID");
                int e4 = n32.e(c, "endpointId");
                int e5 = n32.e(c, "domain");
                int e6 = n32.e(c, "packageName");
                int e7 = n32.e(c, "versionName");
                int e8 = n32.e(c, "versionCode");
                int e9 = n32.e(c, "subscribeCustomerIfCreated");
                int e10 = n32.e(c, "shouldCreateCustomer");
                if (c.moveToFirst()) {
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
                    if (c.isNull(e4)) {
                        string3 = null;
                    } else {
                        string3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        string4 = null;
                    } else {
                        string4 = c.getString(e5);
                    }
                    if (c.isNull(e6)) {
                        string5 = null;
                    } else {
                        string5 = c.getString(e6);
                    }
                    if (c.isNull(e7)) {
                        string6 = null;
                    } else {
                        string6 = c.getString(e7);
                    }
                    if (!c.isNull(e8)) {
                        string7 = c.getString(e8);
                    }
                    String str = string7;
                    if (c.getInt(e9) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c.getInt(e10) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    configuration = new Configuration(j, string, string2, string3, string4, string5, string6, str, z, z2);
                }
                return configuration;
            } finally {
                c.close();
            }
        }

        protected void finalize() {
            this.a.j();
        }
    }

    public gq1(un9 un9Var) {
        this.a = un9Var;
        this.b = new a(un9Var);
    }

    public static List<Class<?>> d() {
        return Collections.emptyList();
    }

    @Override // defpackage.fq1
    public void a(Configuration configuration) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(configuration);
            this.a.B();
        } finally {
            this.a.i();
        }
    }

    @Override // defpackage.fq1
    public oz3<Configuration> b() {
        return wx1.a(this.a, false, new String[]{"mindbox_configuration_table"}, new b(xn9.c("SELECT * FROM mindbox_configuration_table ORDER BY configurationId DESC LIMIT 1", 0)));
    }

    @Override // defpackage.fq1
    public Configuration get() {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        boolean z;
        boolean z2;
        xn9 c = xn9.c("SELECT * FROM mindbox_configuration_table ORDER BY configurationId DESC LIMIT 1", 0);
        this.a.d();
        Configuration configuration = null;
        String string7 = null;
        Cursor c2 = k62.c(this.a, c, false, null);
        try {
            int e = n32.e(c2, "configurationId");
            int e2 = n32.e(c2, "previousInstallationId");
            int e3 = n32.e(c2, "previousDeviceUUID");
            int e4 = n32.e(c2, "endpointId");
            int e5 = n32.e(c2, "domain");
            int e6 = n32.e(c2, "packageName");
            int e7 = n32.e(c2, "versionName");
            int e8 = n32.e(c2, "versionCode");
            int e9 = n32.e(c2, "subscribeCustomerIfCreated");
            int e10 = n32.e(c2, "shouldCreateCustomer");
            if (c2.moveToFirst()) {
                long j = c2.getLong(e);
                if (c2.isNull(e2)) {
                    string = null;
                } else {
                    string = c2.getString(e2);
                }
                if (c2.isNull(e3)) {
                    string2 = null;
                } else {
                    string2 = c2.getString(e3);
                }
                if (c2.isNull(e4)) {
                    string3 = null;
                } else {
                    string3 = c2.getString(e4);
                }
                if (c2.isNull(e5)) {
                    string4 = null;
                } else {
                    string4 = c2.getString(e5);
                }
                if (c2.isNull(e6)) {
                    string5 = null;
                } else {
                    string5 = c2.getString(e6);
                }
                if (c2.isNull(e7)) {
                    string6 = null;
                } else {
                    string6 = c2.getString(e7);
                }
                if (!c2.isNull(e8)) {
                    string7 = c2.getString(e8);
                }
                String str = string7;
                if (c2.getInt(e9) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (c2.getInt(e10) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                configuration = new Configuration(j, string, string2, string3, string4, string5, string6, str, z, z2);
            }
            return configuration;
        } finally {
            c2.close();
            c.j();
        }
    }
}
