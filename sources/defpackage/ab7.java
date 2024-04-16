package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: InAppConfig.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lab7;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "operation", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ab7  reason: default package */
/* loaded from: classes.dex */
public enum ab7 {
    VIEW_PRODUCT("viewProduct"),
    VIEW_CATEGORY("viewCategory"),
    SET_CART("setCart");
    
    private final String a;

    ab7(String str) {
        this.a = str;
    }

    public final String i() {
        return this.a;
    }
}
