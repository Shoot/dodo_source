package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShowLimiterParams.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Ldka;", "", "", "a", "Ljava/lang/String;", "k", "()Ljava/lang/String;", Action.KEY_ATTRIBUTE, "", "b", "J", "i", "()J", "duration", "<init>", "(Ljava/lang/String;ILjava/lang/String;J)V", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dka  reason: default package */
/* loaded from: classes4.dex */
public final class dka {
    public static final dka c = new dka("DISTANCE_TO_DELIVERY_ADDRESS_VALIDATION", 0, "DistanceToDeliveryAddressValidation", TimeUnit.HOURS.toMillis(1));
    private static final /* synthetic */ dka[] d;
    private static final /* synthetic */ kj3 e;
    private final String a;
    private final long b;

    static {
        dka[] a = a();
        d = a;
        e = lj3.a(a);
    }

    private dka(String str, int i, String str2, long j) {
        this.a = str2;
        this.b = j;
    }

    private static final /* synthetic */ dka[] a() {
        return new dka[]{c};
    }

    public static dka valueOf(String str) {
        return (dka) Enum.valueOf(dka.class, str);
    }

    public static dka[] values() {
        return (dka[]) d.clone();
    }

    public final long i() {
        return this.b;
    }

    public final String k() {
        return this.a;
    }
}
