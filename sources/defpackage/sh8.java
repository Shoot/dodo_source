package defpackage;

import android.database.Cursor;
import androidx.work.impl.model.Preference;
/* compiled from: PreferenceDao_Impl.java */
/* renamed from: sh8  reason: default package */
/* loaded from: classes.dex */
public final class sh8 implements rh8 {
    private final un9 a;
    private final dj3<Preference> b;

    /* compiled from: PreferenceDao_Impl.java */
    /* renamed from: sh8$a */
    /* loaded from: classes.dex */
    class a extends dj3<Preference> {
        a(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // defpackage.dj3
        /* renamed from: k */
        public void i(c3b c3bVar, Preference preference) {
            String str = preference.a;
            if (str == null) {
                c3bVar.z1(1);
            } else {
                c3bVar.L0(1, str);
            }
            Long l = preference.b;
            if (l == null) {
                c3bVar.z1(2);
            } else {
                c3bVar.c1(2, l.longValue());
            }
        }
    }

    public sh8(un9 un9Var) {
        this.a = un9Var;
        this.b = new a(un9Var);
    }

    @Override // defpackage.rh8
    public void a(Preference preference) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(preference);
            this.a.B();
        } finally {
            this.a.i();
        }
    }

    @Override // defpackage.rh8
    public Long b(String str) {
        xn9 c = xn9.c("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            c.z1(1);
        } else {
            c.L0(1, str);
        }
        this.a.d();
        Long l = null;
        Cursor c2 = k62.c(this.a, c, false, null);
        try {
            if (c2.moveToFirst() && !c2.isNull(0)) {
                l = Long.valueOf(c2.getLong(0));
            }
            return l;
        } finally {
            c2.close();
            c.j();
        }
    }
}
