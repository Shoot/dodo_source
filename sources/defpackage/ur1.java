package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PointerEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0004\u0012\u0004\b\r\u0010\n\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u0011"}, d2 = {"Lur1;", "", "", "a", "Z", "b", "()Z", DateTokenConverter.CONVERTER_KEY, "(Z)V", "getPositionChange$annotations", "()V", "positionChange", c.a, "getDownChange$annotations", "downChange", "<init>", "(ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ur1  reason: default package */
/* loaded from: classes.dex */
public final class ur1 {
    private boolean a;
    private boolean b;

    public ur1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final void c(boolean z) {
        this.b = z;
    }

    public final void d(boolean z) {
        this.a = z;
    }
}
