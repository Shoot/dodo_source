package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
import java.util.List;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* renamed from: c20  reason: default package */
/* loaded from: classes2.dex */
final class c20 extends j12.e.d.a.b.AbstractC0383e {
    private final String a;
    private final int b;
    private final List<j12.e.d.a.b.AbstractC0383e.AbstractC0385b> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
    /* renamed from: c20$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.e.d.a.b.AbstractC0383e.AbstractC0384a {
        private String a;
        private Integer b;
        private List<j12.e.d.a.b.AbstractC0383e.AbstractC0385b> c;

        @Override // defpackage.j12.e.d.a.b.AbstractC0383e.AbstractC0384a
        public j12.e.d.a.b.AbstractC0383e a() {
            String str = "";
            if (this.a == null) {
                str = " name";
            }
            if (this.b == null) {
                str = str + " importance";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new c20(this.a, this.b.intValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0383e.AbstractC0384a
        public j12.e.d.a.b.AbstractC0383e.AbstractC0384a b(List<j12.e.d.a.b.AbstractC0383e.AbstractC0385b> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0383e.AbstractC0384a
        public j12.e.d.a.b.AbstractC0383e.AbstractC0384a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0383e.AbstractC0384a
        public j12.e.d.a.b.AbstractC0383e.AbstractC0384a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // defpackage.j12.e.d.a.b.AbstractC0383e
    @NonNull
    public List<j12.e.d.a.b.AbstractC0383e.AbstractC0385b> b() {
        return this.c;
    }

    @Override // defpackage.j12.e.d.a.b.AbstractC0383e
    public int c() {
        return this.b;
    }

    @Override // defpackage.j12.e.d.a.b.AbstractC0383e
    @NonNull
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.e.d.a.b.AbstractC0383e)) {
            return false;
        }
        j12.e.d.a.b.AbstractC0383e abstractC0383e = (j12.e.d.a.b.AbstractC0383e) obj;
        if (this.a.equals(abstractC0383e.d()) && this.b == abstractC0383e.c() && this.c.equals(abstractC0383e.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }

    private c20(String str, int i, List<j12.e.d.a.b.AbstractC0383e.AbstractC0385b> list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }
}
