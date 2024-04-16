package androidx.work.impl.model;

import androidx.annotation.NonNull;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import defpackage.b7c;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public final class WorkSpec {
    private static final String s = nx5.f("WorkSpec");
    public static final h94<List<c>, List<b7c>> t = new a();
    @NonNull
    public String a;
    @NonNull
    public b7c.a b;
    @NonNull
    public String c;
    public String d;
    @NonNull
    public androidx.work.b e;
    @NonNull
    public androidx.work.b f;
    public long g;
    public long h;
    public long i;
    @NonNull
    public or1 j;
    public int k;
    @NonNull
    public f60 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    @NonNull
    public gm7 r;

    /* loaded from: classes.dex */
    class a implements h94<List<c>, List<b7c>> {
        a() {
        }

        @Override // defpackage.h94
        /* renamed from: a */
        public List<b7c> apply(List<c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (c cVar : list) {
                arrayList.add(cVar.a());
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public String a;
        public b7c.a b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.b != bVar.b) {
                return false;
            }
            return this.a.equals(bVar.a);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public String a;
        public b7c.a b;
        public androidx.work.b c;
        public int d;
        public List<String> e;
        public List<androidx.work.b> f;

        @NonNull
        public b7c a() {
            androidx.work.b bVar;
            List<androidx.work.b> list = this.f;
            if (list != null && !list.isEmpty()) {
                bVar = this.f.get(0);
            } else {
                bVar = androidx.work.b.c;
            }
            return new b7c(UUID.fromString(this.a), this.b, this.c, this.e, bVar, this.d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.d != cVar.d) {
                return false;
            }
            String str = this.a;
            if (str == null ? cVar.a != null : !str.equals(cVar.a)) {
                return false;
            }
            if (this.b != cVar.b) {
                return false;
            }
            androidx.work.b bVar = this.c;
            if (bVar == null ? cVar.c != null : !bVar.equals(cVar.c)) {
                return false;
            }
            List<String> list = this.e;
            if (list == null ? cVar.e != null : !list.equals(cVar.e)) {
                return false;
            }
            List<androidx.work.b> list2 = this.f;
            List<androidx.work.b> list3 = cVar.f;
            if (list2 != null) {
                return list2.equals(list3);
            }
            if (list3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            String str = this.a;
            int i5 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i6 = i * 31;
            b7c.a aVar = this.b;
            if (aVar != null) {
                i2 = aVar.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 31;
            androidx.work.b bVar = this.c;
            if (bVar != null) {
                i3 = bVar.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (((i7 + i3) * 31) + this.d) * 31;
            List<String> list = this.e;
            if (list != null) {
                i4 = list.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (i8 + i4) * 31;
            List<androidx.work.b> list2 = this.f;
            if (list2 != null) {
                i5 = list2.hashCode();
            }
            return i9 + i5;
        }
    }

    public WorkSpec(@NonNull String str, @NonNull String str2) {
        this.b = b7c.a.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.c;
        this.e = bVar;
        this.f = bVar;
        this.j = or1.i;
        this.l = f60.EXPONENTIAL;
        this.m = 30000L;
        this.p = -1L;
        this.r = gm7.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.a = str;
        this.c = str2;
    }

    public long a() {
        long j;
        long scalb;
        if (c()) {
            if (this.l == f60.LINEAR) {
                scalb = this.m * this.k;
            } else {
                scalb = Math.scalb((float) this.m, this.k - 1);
            }
            return this.n + Math.min(18000000L, scalb);
        }
        long j2 = 0;
        if (d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.n;
            if (j3 == 0) {
                j = currentTimeMillis + this.g;
            } else {
                j = j3;
            }
            long j4 = this.i;
            long j5 = this.h;
            if (j4 != j5) {
                if (j3 == 0) {
                    j2 = j4 * (-1);
                }
                return j + j5 + j2;
            }
            if (j3 != 0) {
                j2 = j5;
            }
            return j + j2;
        }
        long j6 = this.n;
        if (j6 == 0) {
            j6 = System.currentTimeMillis();
        }
        return j6 + this.g;
    }

    public boolean b() {
        return !or1.i.equals(this.j);
    }

    public boolean c() {
        if (this.b == b7c.a.ENQUEUED && this.k > 0) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (this.h != 0) {
            return true;
        }
        return false;
    }

    public void e(long j) {
        if (j > 18000000) {
            nx5.c().h(s, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            j = 18000000;
        }
        if (j < AbstractComponentTracker.LINGERING_TIMEOUT) {
            nx5.c().h(s, "Backoff delay duration less than minimum value", new Throwable[0]);
            j = 10000;
        }
        this.m = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkSpec.class != obj.getClass()) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        if (this.g != workSpec.g || this.h != workSpec.h || this.i != workSpec.i || this.k != workSpec.k || this.m != workSpec.m || this.n != workSpec.n || this.o != workSpec.o || this.p != workSpec.p || this.q != workSpec.q || !this.a.equals(workSpec.a) || this.b != workSpec.b || !this.c.equals(workSpec.c)) {
            return false;
        }
        String str = this.d;
        if (str == null ? workSpec.d != null : !str.equals(workSpec.d)) {
            return false;
        }
        if (this.e.equals(workSpec.e) && this.f.equals(workSpec.f) && this.j.equals(workSpec.j) && this.l == workSpec.l && this.r == workSpec.r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        long j = this.g;
        long j2 = this.h;
        long j3 = this.i;
        long j4 = this.m;
        long j5 = this.n;
        long j6 = this.o;
        long j7 = this.p;
        return ((((((((((((((((((((((((((((hashCode + i) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.j.hashCode()) * 31) + this.k) * 31) + this.l.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31) + this.r.hashCode();
    }

    @NonNull
    public String toString() {
        return "{WorkSpec: " + this.a + "}";
    }

    public WorkSpec(@NonNull WorkSpec workSpec) {
        this.b = b7c.a.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.c;
        this.e = bVar;
        this.f = bVar;
        this.j = or1.i;
        this.l = f60.EXPONENTIAL;
        this.m = 30000L;
        this.p = -1L;
        this.r = gm7.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.a = workSpec.a;
        this.c = workSpec.c;
        this.b = workSpec.b;
        this.d = workSpec.d;
        this.e = new androidx.work.b(workSpec.e);
        this.f = new androidx.work.b(workSpec.f);
        this.g = workSpec.g;
        this.h = workSpec.h;
        this.i = workSpec.i;
        this.j = new or1(workSpec.j);
        this.k = workSpec.k;
        this.l = workSpec.l;
        this.m = workSpec.m;
        this.n = workSpec.n;
        this.o = workSpec.o;
        this.p = workSpec.p;
        this.q = workSpec.q;
        this.r = workSpec.r;
    }
}
