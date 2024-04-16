package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: Permission.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lry7;", "", "", "a", "Z", "i", "()Z", "canRequest", "<init>", "(Ljava/lang/String;IZ)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "permissions_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: ry7  reason: default package */
/* loaded from: classes2.dex */
public enum ry7 {
    GRANTED(false),
    NOT_ASKED(true),
    DENIED(true),
    DENIED_FOREVER(false);
    
    private final boolean a;

    ry7(boolean z) {
        this.a = z;
    }

    public final boolean i() {
        return this.a;
    }
}
