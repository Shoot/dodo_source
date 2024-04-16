package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: GooglePayInitData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, d2 = {"Lwg4;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setEnvironment", "(Ljava/lang/String;)V", "environment", "b", "setReadyToPayRequest", "isReadyToPayRequest", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wg4  reason: default package */
/* loaded from: classes2.dex */
public final class wg4 implements Serializable {
    private String a;
    private String b;

    public wg4() {
        this(null, null, 3, null);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg4)) {
            return false;
        }
        wg4 wg4Var = (wg4) obj;
        if (z65.c(this.a, wg4Var.a) && z65.c(this.b, wg4Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        return "GooglePayInitData(environment=" + str + ", isReadyToPayRequest=" + str2 + ")";
    }

    public wg4(String str, String str2) {
        z65.h(str, "environment");
        z65.h(str2, "isReadyToPayRequest");
        this.a = str;
        this.b = str2;
    }

    public /* synthetic */ wg4(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "TEST" : str, (i & 2) != 0 ? "" : str2);
    }
}
