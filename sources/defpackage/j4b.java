package defpackage;

import android.database.Cursor;
import androidx.work.impl.model.SystemIdInfo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SystemIdInfoDao_Impl.java */
/* renamed from: j4b  reason: default package */
/* loaded from: classes.dex */
public final class j4b implements i4b {
    private final un9 a;
    private final dj3<SystemIdInfo> b;
    private final aia c;

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* renamed from: j4b$a */
    /* loaded from: classes.dex */
    class a extends dj3<SystemIdInfo> {
        a(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // defpackage.dj3
        /* renamed from: k */
        public void i(c3b c3bVar, SystemIdInfo systemIdInfo) {
            String str = systemIdInfo.a;
            if (str == null) {
                c3bVar.z1(1);
            } else {
                c3bVar.L0(1, str);
            }
            c3bVar.c1(2, systemIdInfo.b);
        }
    }

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* renamed from: j4b$b */
    /* loaded from: classes.dex */
    class b extends aia {
        b(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public j4b(un9 un9Var) {
        this.a = un9Var;
        this.b = new a(un9Var);
        this.c = new b(un9Var);
    }

    @Override // defpackage.i4b
    public SystemIdInfo a(String str) {
        xn9 c = xn9.c("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            c.z1(1);
        } else {
            c.L0(1, str);
        }
        this.a.d();
        SystemIdInfo systemIdInfo = null;
        Cursor c2 = k62.c(this.a, c, false, null);
        try {
            int e = n32.e(c2, "work_spec_id");
            int e2 = n32.e(c2, "system_id");
            if (c2.moveToFirst()) {
                systemIdInfo = new SystemIdInfo(c2.getString(e), c2.getInt(e2));
            }
            return systemIdInfo;
        } finally {
            c2.close();
            c.j();
        }
    }

    @Override // defpackage.i4b
    public List<String> b() {
        xn9 c = xn9.c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.a.d();
        Cursor c2 = k62.c(this.a, c, false, null);
        try {
            ArrayList arrayList = new ArrayList(c2.getCount());
            while (c2.moveToNext()) {
                arrayList.add(c2.getString(0));
            }
            return arrayList;
        } finally {
            c2.close();
            c.j();
        }
    }

    @Override // defpackage.i4b
    public void c(SystemIdInfo systemIdInfo) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(systemIdInfo);
            this.a.B();
        } finally {
            this.a.i();
        }
    }

    @Override // defpackage.i4b
    public void d(String str) {
        this.a.d();
        c3b b2 = this.c.b();
        if (str == null) {
            b2.z1(1);
        } else {
            b2.L0(1, str);
        }
        this.a.e();
        try {
            b2.I();
            this.a.B();
        } finally {
            this.a.i();
            this.c.h(b2);
        }
    }
}
