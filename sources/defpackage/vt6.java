package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: NativeChatState.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Lvt6;", "Ljava/io/Serializable;", "", "firstInitializationSkipped", "messageSent", "a", "", "toString", "", "hashCode", "", "other", "equals", "Z", c.a, "()Z", "b", DateTokenConverter.CONVERTER_KEY, "<init>", "(ZZ)V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vt6  reason: default package */
/* loaded from: classes.dex */
public final class vt6 implements Serializable {
    private final boolean a;
    private final boolean b;

    public vt6() {
        this(false, false, 3, null);
    }

    public static /* synthetic */ vt6 b(vt6 vt6Var, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = vt6Var.a;
        }
        if ((i & 2) != 0) {
            z2 = vt6Var.b;
        }
        return vt6Var.a(z, z2);
    }

    public final vt6 a(boolean z, boolean z2) {
        return new vt6(z, z2);
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt6)) {
            return false;
        }
        vt6 vt6Var = (vt6) obj;
        if (this.a == vt6Var.a && this.b == vt6Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (a91.a(this.a) * 31) + a91.a(this.b);
    }

    public String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        return "NativeChatState(firstInitializationSkipped=" + z + ", messageSent=" + z2 + ")";
    }

    public vt6(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ vt6(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
