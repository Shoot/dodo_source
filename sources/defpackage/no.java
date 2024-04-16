package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: AppRestartApproveData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lno;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", "()I", "resultId", "<init>", "(I)V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: no  reason: default package */
/* loaded from: classes2.dex */
public final class no implements Serializable {
    private final int a;

    public no(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof no) && this.a == ((no) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        int i = this.a;
        return "AppRestartApproveData(resultId=" + i + ")";
    }
}
