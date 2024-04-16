package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: UserDataVO.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u0013\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\t\u0010\u001e¨\u0006\""}, d2 = {"Lgub;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "isUserAuthorized", "Ln42;", "b", "Ln42;", "()Ln42;", "user", c.a, "Ljava/lang/String;", "getMessageOfTheDay", "()Ljava/lang/String;", "messageOfTheDay", "Lfub;", "Lfub;", "()Lfub;", "userBenefitsToggles", e.a, "I", "()I", "addressCount", "<init>", "(ZLn42;Ljava/lang/String;Lfub;I)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: gub  reason: default package */
/* loaded from: classes4.dex */
public final class gub {
    private final boolean a;
    private final n42 b;
    private final String c;
    private final fub d;
    private final int e;

    public gub(boolean z, n42 n42Var, String str, fub fubVar, int i) {
        z65.h(n42Var, "user");
        z65.h(str, "messageOfTheDay");
        z65.h(fubVar, "userBenefitsToggles");
        this.a = z;
        this.b = n42Var;
        this.c = str;
        this.d = fubVar;
        this.e = i;
    }

    public final int a() {
        return this.e;
    }

    public final n42 b() {
        return this.b;
    }

    public final fub c() {
        return this.d;
    }

    public final boolean d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gub)) {
            return false;
        }
        gub gubVar = (gub) obj;
        if (this.a == gubVar.a && z65.c(this.b, gubVar.b) && z65.c(this.c, gubVar.c) && z65.c(this.d, gubVar.d) && this.e == gubVar.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((a91.a(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e;
    }

    public String toString() {
        boolean z = this.a;
        n42 n42Var = this.b;
        String str = this.c;
        fub fubVar = this.d;
        int i = this.e;
        return "UserDataVO(isUserAuthorized=" + z + ", user=" + n42Var + ", messageOfTheDay=" + str + ", userBenefitsToggles=" + fubVar + ", addressCount=" + i + ")";
    }
}
