package defpackage;

import defpackage.zv9;
import java.util.Set;
/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* renamed from: f30  reason: default package */
/* loaded from: classes2.dex */
final class f30 extends zv9.b {
    private final long a;
    private final long b;
    private final Set<zv9.c> c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    /* renamed from: f30$b */
    /* loaded from: classes2.dex */
    static final class b extends zv9.b.a {
        private Long a;
        private Long b;
        private Set<zv9.c> c;

        @Override // defpackage.zv9.b.a
        public zv9.b a() {
            String str = "";
            if (this.a == null) {
                str = " delta";
            }
            if (this.b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new f30(this.a.longValue(), this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.zv9.b.a
        public zv9.b.a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.zv9.b.a
        public zv9.b.a c(Set<zv9.c> set) {
            if (set != null) {
                this.c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // defpackage.zv9.b.a
        public zv9.b.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // defpackage.zv9.b
    long b() {
        return this.a;
    }

    @Override // defpackage.zv9.b
    Set<zv9.c> c() {
        return this.c;
    }

    @Override // defpackage.zv9.b
    long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zv9.b)) {
            return false;
        }
        zv9.b bVar = (zv9.b) obj;
        if (this.a == bVar.b() && this.b == bVar.d() && this.c.equals(bVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }

    private f30(long j, long j2, Set<zv9.c> set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }
}
