package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\"\u001a\u0010\b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u0012\u0004\b\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0010\u0010\u0007\"\u001a\u0010\u0014\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u0012\u0004\b\u0013\u0010\u0007\"\u001a\u0010\u0019\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0007\"\u001a\u0010\u001b\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0017\u0012\u0004\b\u001a\u0010\u0007¨\u0006\u001c"}, d2 = {"", "g", Image.TYPE_HIGH, "Lr3b;", "a", "Lr3b;", "getCOMPLETING_ALREADY$annotations", "()V", "COMPLETING_ALREADY", "b", "getCOMPLETING_WAITING_CHILDREN$annotations", "COMPLETING_WAITING_CHILDREN", c.a, "getCOMPLETING_RETRY$annotations", "COMPLETING_RETRY", DateTokenConverter.CONVERTER_KEY, "getTOO_LATE_TO_CANCEL$annotations", "TOO_LATE_TO_CANCEL", e.a, "getSEALED$annotations", "SEALED", "Leg3;", "f", "Leg3;", "getEMPTY_NEW$annotations", "EMPTY_NEW", "getEMPTY_ACTIVE$annotations", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: w95  reason: default package */
/* loaded from: classes3.dex */
public final class w95 {
    private static final r3b a = new r3b("COMPLETING_ALREADY");
    public static final r3b b = new r3b("COMPLETING_WAITING_CHILDREN");
    private static final r3b c = new r3b("COMPLETING_RETRY");
    private static final r3b d = new r3b("TOO_LATE_TO_CANCEL");
    private static final r3b e = new r3b("SEALED");
    private static final eg3 f = new eg3(false);
    private static final eg3 g = new eg3(true);

    public static final Object g(Object obj) {
        if (obj instanceof c05) {
            return new d05((c05) obj);
        }
        return obj;
    }

    public static final Object h(Object obj) {
        d05 d05Var;
        c05 c05Var;
        if (obj instanceof d05) {
            d05Var = (d05) obj;
        } else {
            d05Var = null;
        }
        if (d05Var != null && (c05Var = d05Var.a) != null) {
            return c05Var;
        }
        return obj;
    }
}
