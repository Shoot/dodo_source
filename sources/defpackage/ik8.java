package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PrizotekaCurrentLevelInfo.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0015"}, d2 = {"Lik8;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "progressDescription", "b", "giftDescription", "I", "()I", "levelIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ik8  reason: default package */
/* loaded from: classes2.dex */
public final class ik8 {
    private final String a;
    private final String b;
    private final int c;

    public ik8(String str, String str2, int i) {
        z65.h(str, "progressDescription");
        z65.h(str2, "giftDescription");
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik8)) {
            return false;
        }
        ik8 ik8Var = (ik8) obj;
        if (z65.c(this.a, ik8Var.a) && z65.c(this.b, ik8Var.b) && this.c == ik8Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        return "PrizotekaCurrentLevelInfo(progressDescription=" + str + ", giftDescription=" + str2 + ", levelIndex=" + i + ")";
    }
}
