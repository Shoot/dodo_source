package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Measure.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lnb6;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: nb6  reason: default package */
/* loaded from: classes.dex */
public final class nb6 {
    public static final a a;
    public static final nb6 b = new nb6("PIECE", 0);
    public static final nb6 c = new nb6("LITER", 1);
    public static final nb6 d = new nb6("CENTIMETER", 2);
    public static final nb6 e = new nb6("GRAM", 3);
    public static final nb6 f = new nb6("KILOGRAM", 4);
    public static final nb6 g = new nb6("PORTIONS", 5);
    public static final nb6 h = new nb6(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6);
    private static final /* synthetic */ nb6[] i;
    private static final /* synthetic */ kj3 j;

    /* compiled from: Measure.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\u000f"}, d2 = {"Lnb6$a;", "", "", "measure", "Lnb6;", "a", "CENTIMETER_MEASURE", "I", "GRAM_MEASURE", "KILOGRAM_MEASURE", "LITER_MEASURE", "PIECE_MEASURE", "PORTIONS_MEASURE", "<init>", "()V", "common"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nb6$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nb6 a(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 12) {
                        if (i != 21) {
                            if (i != 32) {
                                if (i != 45) {
                                    return nb6.h;
                                }
                                return nb6.g;
                            }
                            return nb6.d;
                        }
                        return nb6.b;
                    }
                    return nb6.c;
                }
                return nb6.f;
            }
            return nb6.e;
        }
    }

    static {
        nb6[] a2 = a();
        i = a2;
        j = lj3.a(a2);
        a = new a(null);
    }

    private nb6(String str, int i2) {
    }

    private static final /* synthetic */ nb6[] a() {
        return new nb6[]{b, c, d, e, f, g, h};
    }

    public static nb6 valueOf(String str) {
        return (nb6) Enum.valueOf(nb6.class, str);
    }

    public static nb6[] values() {
        return (nb6[]) i.clone();
    }
}
