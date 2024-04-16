package defpackage;

import androidx.work.impl.model.WorkProgress;
/* compiled from: WorkProgressDao_Impl.java */
/* renamed from: o7c  reason: default package */
/* loaded from: classes.dex */
public final class o7c implements n7c {
    private final un9 a;
    private final dj3<WorkProgress> b;
    private final aia c;
    private final aia d;

    /* compiled from: WorkProgressDao_Impl.java */
    /* renamed from: o7c$a */
    /* loaded from: classes.dex */
    class a extends dj3<WorkProgress> {
        a(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // defpackage.dj3
        /* renamed from: k */
        public void i(c3b c3bVar, WorkProgress workProgress) {
            String str = workProgress.a;
            if (str == null) {
                c3bVar.z1(1);
            } else {
                c3bVar.L0(1, str);
            }
            byte[] o = androidx.work.b.o(workProgress.b);
            if (o == null) {
                c3bVar.z1(2);
            } else {
                c3bVar.h1(2, o);
            }
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* renamed from: o7c$b */
    /* loaded from: classes.dex */
    class b extends aia {
        b(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* renamed from: o7c$c */
    /* loaded from: classes.dex */
    class c extends aia {
        c(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o7c(un9 un9Var) {
        this.a = un9Var;
        this.b = new a(un9Var);
        this.c = new b(un9Var);
        this.d = new c(un9Var);
    }

    @Override // defpackage.n7c
    public void a(String str) {
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

    @Override // defpackage.n7c
    public void b() {
        this.a.d();
        c3b b2 = this.d.b();
        this.a.e();
        try {
            b2.I();
            this.a.B();
        } finally {
            this.a.i();
            this.d.h(b2);
        }
    }

    @Override // defpackage.n7c
    public void c(WorkProgress workProgress) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(workProgress);
            this.a.B();
        } finally {
            this.a.i();
        }
    }
}
