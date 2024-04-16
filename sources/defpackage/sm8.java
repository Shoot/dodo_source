package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lsm8;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sm8  reason: default package */
/* loaded from: classes4.dex */
public final class sm8 {
    public static final a a;
    public static final sm8 b = new sm8("PRODUCT", 0);
    public static final sm8 c = new sm8("PIZZA", 1);
    public static final sm8 d = new sm8("COMBO", 2);
    public static final sm8 e = new sm8("HALVES", 3);
    public static final sm8 f = new sm8("COMBO_TEMPLATE", 4);
    public static final sm8 g = new sm8("VARIABLE", 5);
    private static final /* synthetic */ sm8[] h;
    private static final /* synthetic */ kj3 i;

    /* compiled from: ProductType.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lsm8$a;", "", "", "id", "Lsm8;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sm8$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final sm8 a(String str) {
            z65.h(str, "id");
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        return sm8.b;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        return sm8.c;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        return sm8.d;
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        return sm8.e;
                    }
                    break;
                case 53:
                    if (str.equals("5")) {
                        return sm8.f;
                    }
                    break;
                case 54:
                    if (str.equals("6")) {
                        return sm8.g;
                    }
                    break;
            }
            throw new UnknownError("Unknown product type: " + str);
        }
    }

    static {
        sm8[] a2 = a();
        h = a2;
        i = lj3.a(a2);
        a = new a(null);
    }

    private sm8(String str, int i2) {
    }

    private static final /* synthetic */ sm8[] a() {
        return new sm8[]{b, c, d, e, f, g};
    }

    public static sm8 valueOf(String str) {
        return (sm8) Enum.valueOf(sm8.class, str);
    }

    public static sm8[] values() {
        return (sm8[]) h.clone();
    }
}
