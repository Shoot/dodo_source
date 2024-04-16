package defpackage;
/* compiled from: DiskCacheStrategy.java */
/* renamed from: d33  reason: default package */
/* loaded from: classes.dex */
public abstract class d33 {
    public static final d33 a = new a();
    public static final d33 b = new b();
    public static final d33 c = new c();
    public static final d33 d = new d();
    public static final d33 e = new e();

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: d33$a */
    /* loaded from: classes.dex */
    class a extends d33 {
        a() {
        }

        @Override // defpackage.d33
        public boolean a() {
            return true;
        }

        @Override // defpackage.d33
        public boolean b() {
            return true;
        }

        @Override // defpackage.d33
        public boolean c(dl2 dl2Var) {
            if (dl2Var == dl2.REMOTE) {
                return true;
            }
            return false;
        }

        @Override // defpackage.d33
        public boolean d(boolean z, dl2 dl2Var, xg3 xg3Var) {
            if (dl2Var != dl2.RESOURCE_DISK_CACHE && dl2Var != dl2.MEMORY_CACHE) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: d33$b */
    /* loaded from: classes.dex */
    class b extends d33 {
        b() {
        }

        @Override // defpackage.d33
        public boolean a() {
            return false;
        }

        @Override // defpackage.d33
        public boolean b() {
            return false;
        }

        @Override // defpackage.d33
        public boolean c(dl2 dl2Var) {
            return false;
        }

        @Override // defpackage.d33
        public boolean d(boolean z, dl2 dl2Var, xg3 xg3Var) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: d33$c */
    /* loaded from: classes.dex */
    class c extends d33 {
        c() {
        }

        @Override // defpackage.d33
        public boolean a() {
            return true;
        }

        @Override // defpackage.d33
        public boolean b() {
            return false;
        }

        @Override // defpackage.d33
        public boolean c(dl2 dl2Var) {
            if (dl2Var != dl2.DATA_DISK_CACHE && dl2Var != dl2.MEMORY_CACHE) {
                return true;
            }
            return false;
        }

        @Override // defpackage.d33
        public boolean d(boolean z, dl2 dl2Var, xg3 xg3Var) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: d33$d */
    /* loaded from: classes.dex */
    class d extends d33 {
        d() {
        }

        @Override // defpackage.d33
        public boolean a() {
            return false;
        }

        @Override // defpackage.d33
        public boolean b() {
            return true;
        }

        @Override // defpackage.d33
        public boolean c(dl2 dl2Var) {
            return false;
        }

        @Override // defpackage.d33
        public boolean d(boolean z, dl2 dl2Var, xg3 xg3Var) {
            if (dl2Var != dl2.RESOURCE_DISK_CACHE && dl2Var != dl2.MEMORY_CACHE) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: d33$e */
    /* loaded from: classes.dex */
    class e extends d33 {
        e() {
        }

        @Override // defpackage.d33
        public boolean a() {
            return true;
        }

        @Override // defpackage.d33
        public boolean b() {
            return true;
        }

        @Override // defpackage.d33
        public boolean c(dl2 dl2Var) {
            if (dl2Var == dl2.REMOTE) {
                return true;
            }
            return false;
        }

        @Override // defpackage.d33
        public boolean d(boolean z, dl2 dl2Var, xg3 xg3Var) {
            if (((z && dl2Var == dl2.DATA_DISK_CACHE) || dl2Var == dl2.LOCAL) && xg3Var == xg3.TRANSFORMED) {
                return true;
            }
            return false;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(dl2 dl2Var);

    public abstract boolean d(boolean z, dl2 dl2Var, xg3 xg3Var);
}
