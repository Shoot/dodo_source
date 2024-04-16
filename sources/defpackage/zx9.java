package defpackage;

import kotlin.Metadata;
/* compiled from: SdkVersionValidator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lzx9;", "", "Lyx9;", "item", "", "a", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zx9  reason: default package */
/* loaded from: classes.dex */
public final class zx9 {
    public boolean a(yx9 yx9Var) {
        boolean z;
        boolean z2;
        if (yx9Var == null) {
            return false;
        }
        Integer minVersion = yx9Var.getMinVersion();
        if (minVersion != null && minVersion.intValue() > 7) {
            z = false;
        } else {
            z = true;
        }
        Integer maxVersion = yx9Var.getMaxVersion();
        if (maxVersion != null && maxVersion.intValue() < 7) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
