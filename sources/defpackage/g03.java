package defpackage;

import android.database.Cursor;
import androidx.work.impl.model.Dependency;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DependencyDao_Impl.java */
/* renamed from: g03  reason: default package */
/* loaded from: classes.dex */
public final class g03 implements f03 {
    private final un9 a;
    private final dj3<Dependency> b;

    /* compiled from: DependencyDao_Impl.java */
    /* renamed from: g03$a */
    /* loaded from: classes.dex */
    class a extends dj3<Dependency> {
        a(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // defpackage.dj3
        /* renamed from: k */
        public void i(c3b c3bVar, Dependency dependency) {
            String str = dependency.a;
            if (str == null) {
                c3bVar.z1(1);
            } else {
                c3bVar.L0(1, str);
            }
            String str2 = dependency.b;
            if (str2 == null) {
                c3bVar.z1(2);
            } else {
                c3bVar.L0(2, str2);
            }
        }
    }

    public g03(un9 un9Var) {
        this.a = un9Var;
        this.b = new a(un9Var);
    }

    @Override // defpackage.f03
    public void a(Dependency dependency) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(dependency);
            this.a.B();
        } finally {
            this.a.i();
        }
    }

    @Override // defpackage.f03
    public List<String> b(String str) {
        xn9 c = xn9.c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c.z1(1);
        } else {
            c.L0(1, str);
        }
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

    @Override // defpackage.f03
    public boolean c(String str) {
        boolean z = true;
        xn9 c = xn9.c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            c.z1(1);
        } else {
            c.L0(1, str);
        }
        this.a.d();
        boolean z2 = false;
        Cursor c2 = k62.c(this.a, c, false, null);
        try {
            if (c2.moveToFirst()) {
                if (c2.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            c2.close();
            c.j();
        }
    }

    @Override // defpackage.f03
    public boolean d(String str) {
        boolean z = true;
        xn9 c = xn9.c("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c.z1(1);
        } else {
            c.L0(1, str);
        }
        this.a.d();
        boolean z2 = false;
        Cursor c2 = k62.c(this.a, c, false, null);
        try {
            if (c2.moveToFirst()) {
                if (c2.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            c2.close();
            c.j();
        }
    }
}
