package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: InAppConfig.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lfb7;", "", "", e.a, "(Ljava/lang/String;)Ljava/lang/String;", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)I", "other", "", c.a, "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSystemName", "()Ljava/lang/String;", "systemName", "b", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: fb7  reason: default package */
/* loaded from: classes.dex */
public final class fb7 {
    private final String a;

    private /* synthetic */ fb7(String str) {
        this.a = str;
    }

    public static final /* synthetic */ fb7 a(String str) {
        return new fb7(str);
    }

    public static String b(String str) {
        z65.h(str, "systemName");
        return str;
    }

    public static boolean c(String str, Object obj) {
        if (!(obj instanceof fb7) || !z65.c(str, ((fb7) obj).f())) {
            return false;
        }
        return true;
    }

    public static int d(String str) {
        return str.hashCode();
    }

    public static String e(String str) {
        return "OperationSystemName(systemName=" + str + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ String f() {
        return this.a;
    }

    public int hashCode() {
        return d(this.a);
    }

    public String toString() {
        return e(this.a);
    }
}
