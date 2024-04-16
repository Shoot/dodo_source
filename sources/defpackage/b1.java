package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: AbstractChannel.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0003\u0010\u0004\"\u001a\u0010\b\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u0012\u0004\b\u0007\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u0012\u0004\b\n\u0010\u0004\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010\u0002\u0012\u0004\b\r\u0010\u0004\"\u001a\u0010\u0011\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u0012\u0004\b\u0010\u0010\u0004\"\u001a\u0010\u0014\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u0012\u0004\b\u0013\u0010\u0004*(\b\u0000\u0010\u0018\"\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\u0015¨\u0006\u0019"}, d2 = {"Lr3b;", "a", "Lr3b;", "getEMPTY$annotations", "()V", "EMPTY", "b", "getOFFER_SUCCESS$annotations", "OFFER_SUCCESS", c.a, "getOFFER_FAILED$annotations", "OFFER_FAILED", DateTokenConverter.CONVERTER_KEY, "getPOLL_FAILED$annotations", "POLL_FAILED", e.a, "getENQUEUE_FAILED$annotations", "ENQUEUE_FAILED", "f", "getHANDLER_INVOKED$annotations", "HANDLER_INVOKED", "Lkotlin/Function1;", "", "", "Handler", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: b1  reason: default package */
/* loaded from: classes3.dex */
public final class b1 {
    public static final r3b a = new r3b("EMPTY");
    public static final r3b b = new r3b("OFFER_SUCCESS");
    public static final r3b c = new r3b("OFFER_FAILED");
    public static final r3b d = new r3b("POLL_FAILED");
    public static final r3b e = new r3b("ENQUEUE_FAILED");
    public static final r3b f = new r3b("ON_CLOSE_HANDLER_INVOKED");
}
