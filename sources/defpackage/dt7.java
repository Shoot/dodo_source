package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentIntegrationType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Ldt7;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dt7  reason: default package */
/* loaded from: classes2.dex */
public final class dt7 {
    public static final a a;
    public static final dt7 b = new dt7("UNDEFINED", 0);
    public static final dt7 c = new dt7("DIRECT", 1);
    public static final dt7 d = new dt7("REDIRECT", 2);
    private static final /* synthetic */ dt7[] e;
    private static final /* synthetic */ kj3 f;

    /* compiled from: PaymentIntegrationType.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Ldt7$a;", "", "", "value", "Ldt7;", "b", MessageAttributes.TYPE, "a", "DIRECT_TWO_STEP", "Ljava/lang/String;", "REDIRECT_ONE_STEP", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dt7$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: PaymentIntegrationType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: dt7$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0292a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[dt7.values().length];
                try {
                    iArr[dt7.d.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[dt7.c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(dt7 dt7Var) {
            z65.h(dt7Var, MessageAttributes.TYPE);
            int i = C0292a.$EnumSwitchMapping$0[dt7Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return "DirectTwoStep";
            }
            return "RedirectOneStep";
        }

        public final dt7 b(String str) {
            if (z65.c(str, "RedirectOneStep")) {
                return dt7.d;
            }
            if (z65.c(str, "DirectTwoStep")) {
                return dt7.c;
            }
            return dt7.b;
        }
    }

    static {
        dt7[] a2 = a();
        e = a2;
        f = lj3.a(a2);
        a = new a(null);
    }

    private dt7(String str, int i) {
    }

    private static final /* synthetic */ dt7[] a() {
        return new dt7[]{b, c, d};
    }

    public static dt7 valueOf(String str) {
        return (dt7) Enum.valueOf(dt7.class, str);
    }

    public static dt7[] values() {
        return (dt7[]) e.clone();
    }
}
