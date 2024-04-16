package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: WebViewCardPaymentFragmentData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Le4c;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lj4c;", "a", "Lj4c;", "()Lj4c;", "scenario", "<init>", "(Lj4c;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: e4c  reason: default package */
/* loaded from: classes4.dex */
public final class e4c implements Serializable {
    private final j4c a;

    public e4c(j4c j4cVar) {
        z65.h(j4cVar, "scenario");
        this.a = j4cVar;
    }

    public final j4c a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e4c) && z65.c(this.a, ((e4c) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        j4c j4cVar = this.a;
        return "WebViewCardPaymentFragmentData(scenario=" + j4cVar + ")";
    }
}
