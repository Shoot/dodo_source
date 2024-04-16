package defpackage;

import kotlin.Metadata;
/* compiled from: JsonValidator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lxc5;", "", "", "item", "", "a", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xc5  reason: default package */
/* loaded from: classes.dex */
public final class xc5 {
    public boolean a(String str) {
        boolean y;
        CharSequence R0;
        if (str != null) {
            y = l0b.y(str);
            if (!y) {
                R0 = m0b.R0(str);
                return new ec9("^\\s*(\\{.*\\}|\\[.*])\\s*$").f(R0.toString());
            }
            return false;
        }
        return false;
    }
}
