package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: UploadProgressState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0017"}, d2 = {"Lwrb;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "uploadId", "", "J", "()J", "progress", c.a, "getTotal", "total", "<init>", "(Ljava/lang/String;JJ)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wrb  reason: default package */
/* loaded from: classes4.dex */
public final class wrb {
    private final String a;
    private final long b;
    private final long c;

    public wrb(String str, long j, long j2) {
        z65.h(str, "uploadId");
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final long a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrb)) {
            return false;
        }
        wrb wrbVar = (wrb) obj;
        if (z65.c(this.a, wrbVar.a) && this.b == wrbVar.b && this.c == wrbVar.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + ax1.a(this.b)) * 31) + ax1.a(this.c);
    }

    public String toString() {
        String str = this.a;
        long j = this.b;
        long j2 = this.c;
        return "UploadProgressState(uploadId=" + str + ", progress=" + j + ", total=" + j2 + ")";
    }
}
