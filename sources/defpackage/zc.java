package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HalvesAnalyticsEvents.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lzc;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "analyticsName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zc  reason: default package */
/* loaded from: classes2.dex */
public final class zc {
    public static final zc b = new zc("RIGHT_HALF", 0, ElementGenerator.TEXT_ALIGN_RIGHT);
    public static final zc c = new zc("LEFT_HALF", 1, ElementGenerator.TEXT_ALIGN_LEFT);
    public static final zc d = new zc("COMMON", 2, "common");
    public static final zc e = new zc("INGREDIENTS", 3, "ingredients");
    private static final /* synthetic */ zc[] f;
    private static final /* synthetic */ kj3 g;
    private final String a;

    static {
        zc[] a = a();
        f = a;
        g = lj3.a(a);
    }

    private zc(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ zc[] a() {
        return new zc[]{b, c, d, e};
    }

    public static zc valueOf(String str) {
        return (zc) Enum.valueOf(zc.class, str);
    }

    public static zc[] values() {
        return (zc[]) f.clone();
    }

    public final String i() {
        return this.a;
    }
}
