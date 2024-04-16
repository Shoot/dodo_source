package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: EnterNameVO.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Loi3;", "", "", Action.NAME_ATTRIBUTE, "", "isSubscribedOnPersonalOffer", "a", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "b", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "<init>", "(Ljava/lang/String;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: oi3  reason: default package */
/* loaded from: classes4.dex */
public final class oi3 {
    private final String a;
    private final boolean b;

    public oi3(String str, boolean z) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        this.a = str;
        this.b = z;
    }

    public static /* synthetic */ oi3 b(oi3 oi3Var, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oi3Var.a;
        }
        if ((i & 2) != 0) {
            z = oi3Var.b;
        }
        return oi3Var.a(str, z);
    }

    public final oi3 a(String str, boolean z) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        return new oi3(str, z);
    }

    public final String c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi3)) {
            return false;
        }
        oi3 oi3Var = (oi3) obj;
        if (z65.c(this.a, oi3Var.a) && this.b == oi3Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + a91.a(this.b);
    }

    public String toString() {
        String str = this.a;
        boolean z = this.b;
        return "EnterNameVO(name=" + str + ", isSubscribedOnPersonalOffer=" + z + ")";
    }
}
