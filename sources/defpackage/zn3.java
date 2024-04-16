package defpackage;

import java.util.UUID;
import kotlin.Metadata;
/* compiled from: Extentions.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"isUuid", "", "", "sdk_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: zn3  reason: default package */
/* loaded from: classes.dex */
public final class zn3 {
    public static final boolean isUuid(String str) {
        boolean y;
        z65.h(str, "<this>");
        y = l0b.y(str);
        boolean z = true;
        if (!(!y)) {
            return false;
        }
        try {
            UUID.fromString(str);
        } catch (Exception unused) {
            z = false;
        }
        return z;
    }
}
