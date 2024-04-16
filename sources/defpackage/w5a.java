package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\" \u0010\u0007\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\" \u0010\u000b\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0002\u0012\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004\"\u001a\u0010\u000e\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\f\u0010\u0002\u0012\u0004\b\r\u0010\u0006\"\u001a\u0010\u0010\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u0012\u0004\b\u000f\u0010\u0006\"\u001a\u0010\u0014\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u0012\u0004\b\u0013\u0010\u0006¨\u0006\u0015"}, d2 = {"", "a", "Ljava/lang/Object;", e.a, "()Ljava/lang/Object;", "getNOT_SELECTED$annotations", "()V", "NOT_SELECTED", "b", DateTokenConverter.CONVERTER_KEY, "getALREADY_SELECTED$annotations", "ALREADY_SELECTED", c.a, "getUNDECIDED$annotations", "UNDECIDED", "getRESUMED$annotations", "RESUMED", "Lvba;", "Lvba;", "getSelectOpSequenceNumber$annotations", "selectOpSequenceNumber", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: w5a  reason: default package */
/* loaded from: classes3.dex */
public final class w5a {
    private static final Object a = new r3b("NOT_SELECTED");
    private static final Object b = new r3b("ALREADY_SELECTED");
    private static final Object c = new r3b("UNDECIDED");
    private static final Object d = new r3b("RESUMED");
    private static final vba e = new vba();

    public static final Object d() {
        return b;
    }

    public static final Object e() {
        return a;
    }
}
