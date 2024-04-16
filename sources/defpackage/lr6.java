package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: Mutex.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\"\u001a\u0010\b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u0012\u0004\b\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0010\u0010\u0007\"\u001a\u0010\u0016\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0007\"\u001a\u0010\u0019\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u0012\u0004\b\u0018\u0010\u0007¨\u0006\u001a"}, d2 = {"", "locked", "Ljr6;", "a", "Lr3b;", "Lr3b;", "getLOCK_FAIL$annotations", "()V", "LOCK_FAIL", "b", "getUNLOCK_FAIL$annotations", "UNLOCK_FAIL", c.a, "getLOCKED$annotations", "LOCKED", DateTokenConverter.CONVERTER_KEY, "getUNLOCKED$annotations", "UNLOCKED", "Ldg3;", e.a, "Ldg3;", "getEMPTY_LOCKED$annotations", "EMPTY_LOCKED", "f", "getEMPTY_UNLOCKED$annotations", "EMPTY_UNLOCKED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: lr6  reason: default package */
/* loaded from: classes3.dex */
public final class lr6 {
    private static final r3b a = new r3b("LOCK_FAIL");
    private static final r3b b = new r3b("UNLOCK_FAIL");
    private static final r3b c;
    private static final r3b d;
    private static final dg3 e;
    private static final dg3 f;

    static {
        r3b r3bVar = new r3b("LOCKED");
        c = r3bVar;
        r3b r3bVar2 = new r3b("UNLOCKED");
        d = r3bVar2;
        e = new dg3(r3bVar);
        f = new dg3(r3bVar2);
    }

    public static final jr6 a(boolean z) {
        return new kr6(z);
    }

    public static /* synthetic */ jr6 b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return a(z);
    }
}
