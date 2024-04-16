package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
import java.util.List;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* renamed from: a20  reason: default package */
/* loaded from: classes2.dex */
final class a20 extends j12.e.d.a.b.c {
    private final String a;
    private final String b;
    private final List<j12.e.d.a.b.AbstractC0383e.AbstractC0385b> c;
    private final j12.e.d.a.b.c d;
    private final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
    /* renamed from: a20$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.e.d.a.b.c.AbstractC0380a {
        private String a;
        private String b;
        private List<j12.e.d.a.b.AbstractC0383e.AbstractC0385b> c;
        private j12.e.d.a.b.c d;
        private Integer e;

        @Override // defpackage.j12.e.d.a.b.c.AbstractC0380a
        public j12.e.d.a.b.c a() {
            String str = "";
            if (this.a == null) {
                str = " type";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (this.e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new a20(this.a, this.b, this.c, this.d, this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.e.d.a.b.c.AbstractC0380a
        public j12.e.d.a.b.c.AbstractC0380a b(j12.e.d.a.b.c cVar) {
            this.d = cVar;
            return this;
        }

        @Override // defpackage.j12.e.d.a.b.c.AbstractC0380a
        public j12.e.d.a.b.c.AbstractC0380a c(List<j12.e.d.a.b.AbstractC0383e.AbstractC0385b> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // defpackage.j12.e.d.a.b.c.AbstractC0380a
        public j12.e.d.a.b.c.AbstractC0380a d(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.j12.e.d.a.b.c.AbstractC0380a
        public j12.e.d.a.b.c.AbstractC0380a e(String str) {
            this.b = str;
            return this;
        }

        @Override // defpackage.j12.e.d.a.b.c.AbstractC0380a
        public j12.e.d.a.b.c.AbstractC0380a f(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    @Override // defpackage.j12.e.d.a.b.c
    public j12.e.d.a.b.c b() {
        return this.d;
    }

    @Override // defpackage.j12.e.d.a.b.c
    @NonNull
    public List<j12.e.d.a.b.AbstractC0383e.AbstractC0385b> c() {
        return this.c;
    }

    @Override // defpackage.j12.e.d.a.b.c
    public int d() {
        return this.e;
    }

    @Override // defpackage.j12.e.d.a.b.c
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        j12.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.e.d.a.b.c)) {
            return false;
        }
        j12.e.d.a.b.c cVar2 = (j12.e.d.a.b.c) obj;
        if (this.a.equals(cVar2.f()) && ((str = this.b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.c.equals(cVar2.c()) && ((cVar = this.d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.e == cVar2.d()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.j12.e.d.a.b.c
    @NonNull
    public String f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003;
        j12.e.d.a.b.c cVar = this.d;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.e;
    }

    public String toString() {
        return "Exception{type=" + this.a + ", reason=" + this.b + ", frames=" + this.c + ", causedBy=" + this.d + ", overflowCount=" + this.e + "}";
    }

    private a20(String str, String str2, List<j12.e.d.a.b.AbstractC0383e.AbstractC0385b> list, j12.e.d.a.b.c cVar, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = cVar;
        this.e = i;
    }
}
