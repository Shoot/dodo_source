package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: ReverseGeocodedAddress.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0016"}, d2 = {"Ldm9;", "", "", "a", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "localityId", "b", "f", "pizzeriaId", "Lqw1;", c.a, "Lqw1;", "()Lqw1;", MessageAttributes.COORDINATES, DateTokenConverter.CONVERTER_KEY, "components", "formattedAddress", "addressLocation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lqw1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dm9  reason: default package */
/* loaded from: classes4.dex */
public final class dm9 {
    private final String a;
    private final String b;
    private final qw1 c;
    private final String d;
    private final String e;
    private final String f;

    public dm9(String str, String str2, qw1 qw1Var, String str3, String str4, String str5) {
        z65.h(qw1Var, MessageAttributes.COORDINATES);
        z65.h(str3, "components");
        z65.h(str4, "formattedAddress");
        z65.h(str5, "addressLocation");
        this.a = str;
        this.b = str2;
        this.c = qw1Var;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.d;
    }

    public final qw1 c() {
        return this.c;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.a;
    }

    public final String f() {
        return this.b;
    }
}
