package defpackage;

import ch.qos.logback.classic.spi.CallerData;
import kotlin.Metadata;
/* compiled from: StringUtil.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\"\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u0012\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ljava/lang/StringBuilder;", "b", "builder", "", "count", "", "a", "", "", "[Ljava/lang/String;", "getEMPTY_STRING_ARRAY$annotations", "()V", "EMPTY_STRING_ARRAY", "room-runtime_release"}, k = 2, mv = {1, 7, 1})
/* renamed from: xza  reason: default package */
/* loaded from: classes.dex */
public final class xza {
    public static final String[] a = new String[0];

    public static final void a(StringBuilder sb, int i) {
        z65.h(sb, "builder");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(CallerData.NA);
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static final StringBuilder b() {
        return new StringBuilder();
    }
}
