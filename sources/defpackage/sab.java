package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: TextForegroundStyle.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Luc1;", "", "alpha", "b", "(JF)J", "Lkotlin/Function0;", "block", c.a, "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: sab  reason: default package */
/* loaded from: classes.dex */
public final class sab {
    public static final long b(long j, float f) {
        if (!Float.isNaN(f) && f < 1.0f) {
            return uc1.j(j, uc1.m(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(float f, Function0<Float> function0) {
        if (Float.isNaN(f)) {
            return function0.invoke().floatValue();
        }
        return f;
    }
}
