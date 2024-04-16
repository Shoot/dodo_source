package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PointerInputEventProcessor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0088\u0001\t\u0092\u0001\u00020\bø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lvk8;", "", "", c.a, "(I)Z", "dispatchedToAPointerInputModifier", "b", "anyMovementConsumed", "", "value", "a", "(I)I", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vk8  reason: default package */
/* loaded from: classes.dex */
public final class vk8 {
    public static final boolean b(int i) {
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean c(int i) {
        if ((i & 1) != 0) {
            return true;
        }
        return false;
    }

    public static int a(int i) {
        return i;
    }
}
