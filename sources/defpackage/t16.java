package defpackage;

import java.util.List;
import kotlin.Metadata;
/* compiled from: LoyaltyMissionsInfo.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lt16;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "aboutMissionUrl", "", "Lx06;", "b", "Ljava/util/List;", "()Ljava/util/List;", "missions", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t16  reason: default package */
/* loaded from: classes4.dex */
public final class t16 {
    private final String a;
    private final List<x06> b;

    public t16(String str, List<x06> list) {
        z65.h(str, "aboutMissionUrl");
        z65.h(list, "missions");
        this.a = str;
        this.b = list;
    }

    public final String a() {
        return this.a;
    }

    public final List<x06> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t16)) {
            return false;
        }
        t16 t16Var = (t16) obj;
        if (z65.c(this.a, t16Var.a) && z65.c(this.b, t16Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        List<x06> list = this.b;
        return "LoyaltyMissionsInfo(aboutMissionUrl=" + str + ", missions=" + list + ")";
    }
}
