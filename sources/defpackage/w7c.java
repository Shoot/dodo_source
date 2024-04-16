package defpackage;

import android.database.Cursor;
import androidx.work.impl.model.WorkTag;
import java.util.ArrayList;
import java.util.List;
/* compiled from: WorkTagDao_Impl.java */
/* renamed from: w7c  reason: default package */
/* loaded from: classes.dex */
public final class w7c implements v7c {
    private final un9 a;
    private final dj3<WorkTag> b;

    /* compiled from: WorkTagDao_Impl.java */
    /* renamed from: w7c$a */
    /* loaded from: classes.dex */
    class a extends dj3<WorkTag> {
        a(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // defpackage.dj3
        /* renamed from: k */
        public void i(c3b c3bVar, WorkTag workTag) {
            String str = workTag.a;
            if (str == null) {
                c3bVar.z1(1);
            } else {
                c3bVar.L0(1, str);
            }
            String str2 = workTag.b;
            if (str2 == null) {
                c3bVar.z1(2);
            } else {
                c3bVar.L0(2, str2);
            }
        }
    }

    public w7c(un9 un9Var) {
        this.a = un9Var;
        this.b = new a(un9Var);
    }

    @Override // defpackage.v7c
    public List<String> a(String str) {
        xn9 c = xn9.c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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

    @Override // defpackage.v7c
    public void b(WorkTag workTag) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(workTag);
            this.a.B();
        } finally {
            this.a.i();
        }
    }
}
