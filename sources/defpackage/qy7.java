package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PermissionFlow.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0005\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lqy7;", "", "", "Ldy7;", "permissions", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "permissions_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: qy7  reason: default package */
/* loaded from: classes2.dex */
public final class qy7 {
    private final List<dy7> a;

    public qy7(List<dy7> list) {
        z65.h(list, "permissions");
        this.a = list;
    }

    public final qy7 a(List<dy7> list) {
        z65.h(list, "permissions");
        return new qy7(list);
    }

    public final List<dy7> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qy7) && z65.c(this.a, ((qy7) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "PermissionResult(permissions=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
