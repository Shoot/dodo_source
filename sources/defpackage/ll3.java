package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: SessionEvent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lll3;", "", "Lb47;", "", "a", "I", e.a, "()I", "number", "<init>", "(Ljava/lang/String;II)V", "b", c.a, "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: ll3  reason: default package */
/* loaded from: classes2.dex */
public enum ll3 implements b47 {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);
    
    private final int a;

    ll3(int i) {
        this.a = i;
    }

    @Override // defpackage.b47
    public int e() {
        return this.a;
    }
}
