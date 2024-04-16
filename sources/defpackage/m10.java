package defpackage;

import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* renamed from: m10  reason: default package */
/* loaded from: classes2.dex */
public final class m10 extends a22 {
    private final j12 a;
    private final String b;
    private final File c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m10(j12 j12Var, String str, File file) {
        if (j12Var != null) {
            this.a = j12Var;
            if (str != null) {
                this.b = str;
                if (file != null) {
                    this.c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    @Override // defpackage.a22
    public j12 b() {
        return this.a;
    }

    @Override // defpackage.a22
    public File c() {
        return this.c;
    }

    @Override // defpackage.a22
    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a22)) {
            return false;
        }
        a22 a22Var = (a22) obj;
        if (this.a.equals(a22Var.b()) && this.b.equals(a22Var.d()) && this.c.equals(a22Var.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
