package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PermissionImpl.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0019\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lyi9;", "", "", "", "permissions", "Ldy7;", "b", "requestedPermissions", "a", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", c.a, "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "permissions_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: yi9  reason: default package */
/* loaded from: classes2.dex */
public final class yi9 {
    private final List<dy7> a;

    public yi9() {
        this(null, 1, null);
    }

    public final yi9 a(List<dy7> list) {
        z65.h(list, "requestedPermissions");
        return new yi9(list);
    }

    public final List<dy7> b(List<String> list) {
        z65.h(list, "permissions");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (list.contains(((dy7) obj).c())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<dy7> c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yi9) && z65.c(this.a, ((yi9) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "RequestPermissionState(requestedPermissions=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public yi9(List<dy7> list) {
        z65.h(list, "requestedPermissions");
        this.a = list;
    }

    public /* synthetic */ yi9(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kc1.l() : list);
    }
}
