package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: Secure3dResult.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0012"}, d2 = {"Lj3a;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "paymentId", "Lrs7;", "b", "Lrs7;", c.a, "()Lrs7;", "paymentAuthorization3DS", "paRes", "md", "<init>", "(Ljava/lang/String;Lrs7;Ljava/lang/String;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: j3a  reason: default package */
/* loaded from: classes4.dex */
public final class j3a implements Serializable {
    private final String a;
    private final rs7 b;
    private final String c;
    private final String d;

    public j3a(String str, rs7 rs7Var, String str2, String str3) {
        z65.h(str, "paymentId");
        z65.h(rs7Var, "paymentAuthorization3DS");
        z65.h(str2, "paRes");
        z65.h(str3, "md");
        this.a = str;
        this.b = rs7Var;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final rs7 c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }
}
