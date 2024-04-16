package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: NativeChatData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015¨\u0006\u0019"}, d2 = {"Lgt6;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lyt6;", "a", "Lyt6;", c.a, "()Lyt6;", "topic", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "messageToSend", "Z", "()Z", "skipFirstInitialization", "<init>", "(Lyt6;Ljava/lang/String;Z)V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gt6  reason: default package */
/* loaded from: classes.dex */
public final class gt6 implements Serializable {
    private final yt6 a;
    private final String b;
    private final boolean c;

    public gt6() {
        this(null, null, false, 7, null);
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final yt6 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt6)) {
            return false;
        }
        gt6 gt6Var = (gt6) obj;
        if (this.a == gt6Var.a && z65.c(this.b, gt6Var.b) && this.c == gt6Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        yt6 yt6Var = this.a;
        int i = 0;
        if (yt6Var == null) {
            hashCode = 0;
        } else {
            hashCode = yt6Var.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return ((i2 + i) * 31) + a91.a(this.c);
    }

    public String toString() {
        yt6 yt6Var = this.a;
        String str = this.b;
        boolean z = this.c;
        return "NativeChatData(topic=" + yt6Var + ", messageToSend=" + str + ", skipFirstInitialization=" + z + ")";
    }

    public gt6(yt6 yt6Var, String str, boolean z) {
        this.a = yt6Var;
        this.b = str;
        this.c = z;
    }

    public /* synthetic */ gt6(yt6 yt6Var, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : yt6Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z);
    }
}
