package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: AnyValue.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0010\u0012\u0006\u0010$\u001a\u00020 ¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001c\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001f\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\t\u0010#¨\u0006'"}, d2 = {"Lwl;", "", "", "hashCode", "", "toString", "other", "", "equals", "a", "I", DateTokenConverter.CONVERTER_KEY, "()I", "setTagClass", "(I)V", "tagClass", "", "b", "J", c.a, "()J", "setTag", "(J)V", RemoteMessageConst.Notification.TAG, "Z", "()Z", "setConstructed", "(Z)V", "constructed", "getLength", "setLength", "length", "Llk0;", e.a, "Llk0;", "()Llk0;", "bytes", "<init>", "(IJZJLlk0;)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: wl  reason: default package */
/* loaded from: classes3.dex */
public final class wl {
    private int a;
    private long b;
    private boolean c;
    private long d;
    private final lk0 e;

    public wl(int i, long j, boolean z, long j2, lk0 lk0Var) {
        z65.h(lk0Var, "bytes");
        this.a = i;
        this.b = j;
        this.c = z;
        this.d = j2;
        this.e = lk0Var;
    }

    public final lk0 a() {
        return this.e;
    }

    public final boolean b() {
        return this.c;
    }

    public final long c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl)) {
            return false;
        }
        wl wlVar = (wl) obj;
        if (this.a == wlVar.a && this.b == wlVar.b && this.c == wlVar.c && this.d == wlVar.d && z65.c(this.e, wlVar.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a * 31) + ((int) this.b)) * 31) + (!this.c ? 1 : 0)) * 31) + ((int) this.d)) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "AnyValue(tagClass=" + this.a + ", tag=" + this.b + ", constructed=" + this.c + ", length=" + this.d + ", bytes=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
