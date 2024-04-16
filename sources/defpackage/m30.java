package defpackage;

import androidx.annotation.NonNull;
import defpackage.rib;
/* compiled from: AutoValue_TokenResult.java */
/* renamed from: m30  reason: default package */
/* loaded from: classes2.dex */
final class m30 extends rib {
    private final String a;
    private final long b;
    private final rib.b c;

    /* compiled from: AutoValue_TokenResult.java */
    /* renamed from: m30$b */
    /* loaded from: classes2.dex */
    static final class b extends rib.a {
        private String a;
        private Long b;
        private rib.b c;

        @Override // defpackage.rib.a
        public rib a() {
            String str = "";
            if (this.b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new m30(this.a, this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.rib.a
        public rib.a b(rib.b bVar) {
            this.c = bVar;
            return this;
        }

        @Override // defpackage.rib.a
        public rib.a c(String str) {
            this.a = str;
            return this;
        }

        @Override // defpackage.rib.a
        public rib.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // defpackage.rib
    public rib.b b() {
        return this.c;
    }

    @Override // defpackage.rib
    public String c() {
        return this.a;
    }

    @Override // defpackage.rib
    @NonNull
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rib)) {
            return false;
        }
        rib ribVar = (rib) obj;
        String str = this.a;
        if (str != null ? str.equals(ribVar.c()) : ribVar.c() == null) {
            if (this.b == ribVar.d()) {
                rib.b bVar = this.c;
                if (bVar == null) {
                    if (ribVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(ribVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        rib.b bVar = this.c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }

    private m30(String str, long j, rib.b bVar) {
        this.a = str;
        this.b = j;
        this.c = bVar;
    }
}
