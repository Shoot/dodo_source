package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: QRData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lzt8;", "Lju8;", "", c.a, "", "f", "Lnb0;", "buffer", "", e.a, DateTokenConverter.CONVERTER_KEY, "", "data", "<init>", "(Ljava/lang/String;)V", "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: zt8  reason: default package */
/* loaded from: classes3.dex */
public final class zt8 extends ju8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt8(String str) {
        super(bu8.UPPER_ALPHA_NUM, str);
        z65.h(str, "data");
    }

    private final int f(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('A' <= c && c < '[') {
            return c - '7';
        }
        if (c == ' ') {
            return 36;
        }
        if (c == '$') {
            return 37;
        }
        if (c == '%') {
            return 38;
        }
        if (c == '*') {
            return 39;
        }
        if (c == '+') {
            return 40;
        }
        if (c == '-') {
            return 41;
        }
        if (c == '.') {
            return 42;
        }
        if (c == '/') {
            return 43;
        }
        if (c == ':') {
            return 44;
        }
        throw new IllegalArgumentException("Illegal character: " + c);
    }

    @Override // defpackage.ju8
    public int d() {
        return a().length();
    }

    @Override // defpackage.ju8
    public void e(nb0 nb0Var) {
        z65.h(nb0Var, "buffer");
        int length = a().length();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= length) {
                break;
            }
            nb0Var.d((f(a().charAt(i)) * 45) + f(a().charAt(i2)), 11);
            i += 2;
        }
        if (i < length) {
            nb0Var.d(f(a().charAt(i)), 6);
        }
    }
}
