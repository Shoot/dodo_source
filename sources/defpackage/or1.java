package defpackage;

import android.os.Build;
import androidx.annotation.NonNull;
/* compiled from: Constraints.java */
/* renamed from: or1  reason: default package */
/* loaded from: classes.dex */
public final class or1 {
    public static final or1 i = new a().a();
    private ow6 a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private long f;
    private long g;
    private du1 h;

    /* compiled from: Constraints.java */
    /* renamed from: or1$a */
    /* loaded from: classes.dex */
    public static final class a {
        boolean a = false;
        boolean b = false;
        ow6 c = ow6.NOT_REQUIRED;
        boolean d = false;
        boolean e = false;
        long f = -1;
        long g = -1;
        du1 h = new du1();

        @NonNull
        public or1 a() {
            return new or1(this);
        }

        @NonNull
        public a b(@NonNull ow6 ow6Var) {
            this.c = ow6Var;
            return this;
        }
    }

    public or1() {
        this.a = ow6.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new du1();
    }

    @NonNull
    public du1 a() {
        return this.h;
    }

    @NonNull
    public ow6 b() {
        return this.a;
    }

    public long c() {
        return this.f;
    }

    public long d() {
        return this.g;
    }

    public boolean e() {
        if (this.h.c() > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || or1.class != obj.getClass()) {
            return false;
        }
        or1 or1Var = (or1) obj;
        if (this.b != or1Var.b || this.c != or1Var.c || this.d != or1Var.d || this.e != or1Var.e || this.f != or1Var.f || this.g != or1Var.g || this.a != or1Var.a) {
            return false;
        }
        return this.h.equals(or1Var.h);
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.b;
    }

    public boolean h() {
        return this.c;
    }

    public int hashCode() {
        long j = this.f;
        long j2 = this.g;
        return (((((((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.h.hashCode();
    }

    public boolean i() {
        return this.e;
    }

    public void j(du1 du1Var) {
        this.h = du1Var;
    }

    public void k(@NonNull ow6 ow6Var) {
        this.a = ow6Var;
    }

    public void l(boolean z) {
        this.d = z;
    }

    public void m(boolean z) {
        this.b = z;
    }

    public void n(boolean z) {
        this.c = z;
    }

    public void o(boolean z) {
        this.e = z;
    }

    public void p(long j) {
        this.f = j;
    }

    public void q(long j) {
        this.g = j;
    }

    or1(a aVar) {
        this.a = ow6.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new du1();
        this.b = aVar.a;
        int i2 = Build.VERSION.SDK_INT;
        this.c = i2 >= 23 && aVar.b;
        this.a = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        if (i2 >= 24) {
            this.h = aVar.h;
            this.f = aVar.f;
            this.g = aVar.g;
        }
    }

    public or1(@NonNull or1 or1Var) {
        this.a = ow6.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new du1();
        this.b = or1Var.b;
        this.c = or1Var.c;
        this.a = or1Var.a;
        this.d = or1Var.d;
        this.e = or1Var.e;
        this.h = or1Var.h;
    }
}
