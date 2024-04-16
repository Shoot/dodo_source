package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
/* renamed from: e20  reason: default package */
/* loaded from: classes2.dex */
final class e20 extends j12.e.d.a.c {
    private final String a;
    private final int b;
    private final int c;
    private final boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
    /* renamed from: e20$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.e.d.a.c.AbstractC0387a {
        private String a;
        private Integer b;
        private Integer c;
        private Boolean d;

        @Override // defpackage.j12.e.d.a.c.AbstractC0387a
        public j12.e.d.a.c a() {
            String str = "";
            if (this.a == null) {
                str = " processName";
            }
            if (this.b == null) {
                str = str + " pid";
            }
            if (this.c == null) {
                str = str + " importance";
            }
            if (this.d == null) {
                str = str + " defaultProcess";
            }
            if (str.isEmpty()) {
                return new e20(this.a, this.b.intValue(), this.c.intValue(), this.d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.e.d.a.c.AbstractC0387a
        public j12.e.d.a.c.AbstractC0387a b(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.j12.e.d.a.c.AbstractC0387a
        public j12.e.d.a.c.AbstractC0387a c(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.j12.e.d.a.c.AbstractC0387a
        public j12.e.d.a.c.AbstractC0387a d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.j12.e.d.a.c.AbstractC0387a
        public j12.e.d.a.c.AbstractC0387a e(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }
    }

    @Override // defpackage.j12.e.d.a.c
    public int b() {
        return this.c;
    }

    @Override // defpackage.j12.e.d.a.c
    public int c() {
        return this.b;
    }

    @Override // defpackage.j12.e.d.a.c
    @NonNull
    public String d() {
        return this.a;
    }

    @Override // defpackage.j12.e.d.a.c
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.e.d.a.c)) {
            return false;
        }
        j12.e.d.a.c cVar = (j12.e.d.a.c) obj;
        if (this.a.equals(cVar.d()) && this.b == cVar.c() && this.c == cVar.b() && this.d == cVar.e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", defaultProcess=" + this.d + "}";
    }

    private e20(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }
}
