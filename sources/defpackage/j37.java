package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: NotificationsStatus.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\t\u0010\u0012¨\u0006\u0017"}, d2 = {"Lj37;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", c.a, "()Z", "notificationsEnabled", "", "Lj17;", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "enabledChannels", "disabledChannels", "<init>", "(ZLjava/util/Set;Ljava/util/Set;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: j37  reason: default package */
/* loaded from: classes3.dex */
public final class j37 {
    private final boolean a;
    private final Set<j17> b;
    private final Set<j17> c;

    /* JADX WARN: Multi-variable type inference failed */
    public j37(boolean z, Set<? extends j17> set, Set<? extends j17> set2) {
        z65.h(set, "enabledChannels");
        z65.h(set2, "disabledChannels");
        this.a = z;
        this.b = set;
        this.c = set2;
    }

    public final Set<j17> a() {
        return this.c;
    }

    public final Set<j17> b() {
        return this.b;
    }

    public final boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j37)) {
            return false;
        }
        j37 j37Var = (j37) obj;
        if (this.a == j37Var.a && z65.c(this.b, j37Var.b) && z65.c(this.c, j37Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((a91.a(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        boolean z = this.a;
        Set<j17> set = this.b;
        Set<j17> set2 = this.c;
        return "NotificationsStatus(notificationsEnabled=" + z + ", enabledChannels=" + set + ", disabledChannels=" + set2 + ")";
    }
}
