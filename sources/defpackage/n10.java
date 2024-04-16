package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
import java.util.List;
/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
/* renamed from: n10  reason: default package */
/* loaded from: classes2.dex */
final class n10 extends j12.a {
    private final int a;
    private final String b;
    private final int c;
    private final int d;
    private final long e;
    private final long f;
    private final long g;
    private final String h;
    private final List<j12.a.AbstractC0373a> i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    /* renamed from: n10$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.a.b {
        private Integer a;
        private String b;
        private Integer c;
        private Integer d;
        private Long e;
        private Long f;
        private Long g;
        private String h;
        private List<j12.a.AbstractC0373a> i;

        @Override // defpackage.j12.a.b
        public j12.a a() {
            String str = "";
            if (this.a == null) {
                str = " pid";
            }
            if (this.b == null) {
                str = str + " processName";
            }
            if (this.c == null) {
                str = str + " reasonCode";
            }
            if (this.d == null) {
                str = str + " importance";
            }
            if (this.e == null) {
                str = str + " pss";
            }
            if (this.f == null) {
                str = str + " rss";
            }
            if (this.g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new n10(this.a.intValue(), this.b, this.c.intValue(), this.d.intValue(), this.e.longValue(), this.f.longValue(), this.g.longValue(), this.h, this.i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.a.b
        public j12.a.b b(List<j12.a.AbstractC0373a> list) {
            this.i = list;
            return this;
        }

        @Override // defpackage.j12.a.b
        public j12.a.b c(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.j12.a.b
        public j12.a.b d(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.j12.a.b
        public j12.a.b e(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        @Override // defpackage.j12.a.b
        public j12.a.b f(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.j12.a.b
        public j12.a.b g(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.j12.a.b
        public j12.a.b h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.j12.a.b
        public j12.a.b i(long j) {
            this.g = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.j12.a.b
        public j12.a.b j(String str) {
            this.h = str;
            return this;
        }
    }

    @Override // defpackage.j12.a
    public List<j12.a.AbstractC0373a> b() {
        return this.i;
    }

    @Override // defpackage.j12.a
    @NonNull
    public int c() {
        return this.d;
    }

    @Override // defpackage.j12.a
    @NonNull
    public int d() {
        return this.a;
    }

    @Override // defpackage.j12.a
    @NonNull
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.a)) {
            return false;
        }
        j12.a aVar = (j12.a) obj;
        if (this.a == aVar.d() && this.b.equals(aVar.e()) && this.c == aVar.g() && this.d == aVar.c() && this.e == aVar.f() && this.f == aVar.h() && this.g == aVar.i() && ((str = this.h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            List<j12.a.AbstractC0373a> list = this.i;
            if (list == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (list.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.j12.a
    @NonNull
    public long f() {
        return this.e;
    }

    @Override // defpackage.j12.a
    @NonNull
    public int g() {
        return this.c;
    }

    @Override // defpackage.j12.a
    @NonNull
    public long h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode;
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        int hashCode2 = (((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.h;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        List<j12.a.AbstractC0373a> list = this.i;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 ^ i;
    }

    @Override // defpackage.j12.a
    @NonNull
    public long i() {
        return this.g;
    }

    @Override // defpackage.j12.a
    public String j() {
        return this.h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.b + ", reasonCode=" + this.c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f + ", timestamp=" + this.g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.i + "}";
    }

    private n10(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List<j12.a.AbstractC0373a> list) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str2;
        this.i = list;
    }
}
