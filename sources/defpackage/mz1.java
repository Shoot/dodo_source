package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: CourierTipsCardUiConfig.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lmz1;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", "b", "()I", "themeResId", "Z", "()Z", "keepClickedTipsSelected", "<init>", "(IZ)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mz1  reason: default package */
/* loaded from: classes.dex */
public final class mz1 implements Serializable {
    private final int a;
    private final boolean b;

    public mz1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz1)) {
            return false;
        }
        mz1 mz1Var = (mz1) obj;
        if (this.a == mz1Var.a && this.b == mz1Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a * 31) + a91.a(this.b);
    }

    public String toString() {
        int i = this.a;
        boolean z = this.b;
        return "CourierTipsCardUiConfig(themeResId=" + i + ", keepClickedTipsSelected=" + z + ")";
    }
}
