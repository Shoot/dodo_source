package defpackage;

import com.huawei.hms.opendevice.c;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: InAppNotificationAnalytics.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u001b"}, d2 = {"Loy4;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lly4;", "Lly4;", "getSender", "()Lly4;", "sender", "b", "Ljava/lang/String;", "getTypeDescription", "()Ljava/lang/String;", "typeDescription", c.a, "getValue", "value", "<init>", "(Lly4;Ljava/lang/String;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: oy4  reason: default package */
/* loaded from: classes4.dex */
public final class oy4 implements dc {
    private final ly4 a;
    private final String b;
    private final String c;

    public oy4(ly4 ly4Var, String str, String str2) {
        z65.h(ly4Var, "sender");
        z65.h(str, "typeDescription");
        z65.h(str2, "value");
        this.a = ly4Var;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.dc
    public qc a() {
        return bc.e(bc.e(vc.z(new bc("notification_shown"), this.a), MessageAttributes.TYPE, this.b, false, 4, null), "value", this.c, false, 4, null).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy4)) {
            return false;
        }
        oy4 oy4Var = (oy4) obj;
        if (this.a == oy4Var.a && z65.c(this.b, oy4Var.b) && z65.c(this.c, oy4Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        ly4 ly4Var = this.a;
        String str = this.b;
        String str2 = this.c;
        return "NotificationShownAnalytics(sender=" + ly4Var + ", typeDescription=" + str + ", value=" + str2 + ")";
    }
}
