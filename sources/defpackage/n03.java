package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DerHeader.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0013\b\u0080\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\tB'\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001c\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\t\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014\"\u0004\b\u001d\u0010\u0016R\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019¨\u0006#"}, d2 = {"Ln03;", "", "", "hashCode", "", "toString", "other", "", "equals", "a", "I", DateTokenConverter.CONVERTER_KEY, "()I", "setTagClass", "(I)V", "tagClass", "", "b", "J", c.a, "()J", "setTag", "(J)V", RemoteMessageConst.Notification.TAG, "Z", "()Z", "setConstructed", "(Z)V", "constructed", "setLength", "length", e.a, "isEndOfData", "<init>", "(IJZJ)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: n03  reason: default package */
/* loaded from: classes3.dex */
public final class n03 {
    public static final a e = new a(null);
    private int a;
    private long b;
    private boolean c;
    private long d;

    /* compiled from: DerHeader.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Ln03$a;", "", "", "TAG_CLASS_APPLICATION", "I", "TAG_CLASS_CONTEXT_SPECIFIC", "TAG_CLASS_PRIVATE", "TAG_CLASS_UNIVERSAL", "", "TAG_END_OF_CONTENTS", "J", "<init>", "()V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n03$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public n03(int i, long j, boolean z, long j2) {
        this.a = i;
        this.b = j;
        this.c = z;
        this.d = j2;
    }

    public final boolean a() {
        return this.c;
    }

    public final long b() {
        return this.d;
    }

    public final long c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public final boolean e() {
        if (this.a == 0 && this.b == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n03)) {
            return false;
        }
        n03 n03Var = (n03) obj;
        if (this.a == n03Var.a && this.b == n03Var.b && this.c == n03Var.c && this.d == n03Var.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a * 31) + ((int) this.b)) * 31) + (!this.c ? 1 : 0)) * 31) + ((int) this.d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('/');
        sb.append(this.b);
        return sb.toString();
    }
}
