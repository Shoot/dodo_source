package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: LocationRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lwj8;", "", "", "a", "I", "()I", "code", "<init>", "(Ljava/lang/String;II)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, "location_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: wj8  reason: default package */
/* loaded from: classes2.dex */
public enum wj8 {
    PRIORITY_HIGH_ACCURACY(100),
    PRIORITY_BALANCED_POWER_ACCURACY(102),
    PRIORITY_LOW_POWER(104);
    
    private final int a;

    wj8(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }
}
