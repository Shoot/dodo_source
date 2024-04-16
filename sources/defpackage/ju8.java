package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: QRData.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b!\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0016"}, d2 = {"Lju8;", "", "", DateTokenConverter.CONVERTER_KEY, "Lnb0;", "buffer", "", e.a, MessageAttributes.TYPE, c.a, "Lbu8;", "a", "Lbu8;", "b", "()Lbu8;", "dataType", "", "Ljava/lang/String;", "()Ljava/lang/String;", "data", "<init>", "(Lbu8;Ljava/lang/String;)V", "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: ju8  reason: default package */
/* loaded from: classes3.dex */
public abstract class ju8 {
    private final bu8 a;
    private final String b;

    /* compiled from: QRData.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ju8$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[bu8.values().length];
            try {
                iArr[bu8.NUMBERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bu8.UPPER_ALPHA_NUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bu8.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ju8(bu8 bu8Var, String str) {
        z65.h(bu8Var, "dataType");
        z65.h(str, "data");
        this.a = bu8Var;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final bu8 b() {
        return this.a;
    }

    public final int c(int i) {
        if (1 <= i && i < 10) {
            int i2 = a.$EnumSwitchMapping$0[this.a.ordinal()];
            if (i2 == 1) {
                return 10;
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    return 8;
                }
                throw new NoWhenBranchMatchedException();
            }
            return 9;
        } else if (1 <= i && i < 27) {
            int i3 = a.$EnumSwitchMapping$0[this.a.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        return 16;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return 11;
            }
            return 12;
        } else if (1 <= i && i < 41) {
            int i4 = a.$EnumSwitchMapping$0[this.a.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        return 16;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return 13;
            }
            return 14;
        } else {
            throw new IllegalArgumentException("'type' must be greater than 0 and cannot be greater than 40: " + i);
        }
    }

    public abstract int d();

    public abstract void e(nb0 nb0Var);
}
