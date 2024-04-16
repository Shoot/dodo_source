package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: QRData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Llu8;", "Lju8;", "Lnb0;", "buffer", "", e.a, "", DateTokenConverter.CONVERTER_KEY, "", "data", "<init>", "(Ljava/lang/String;)V", "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: lu8  reason: default package */
/* loaded from: classes3.dex */
public final class lu8 extends ju8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu8(String str) {
        super(bu8.NUMBERS, str);
        z65.h(str, "data");
    }

    @Override // defpackage.ju8
    public int d() {
        return a().length();
    }

    @Override // defpackage.ju8
    public void e(nb0 nb0Var) {
        int i;
        z65.h(nb0Var, "buffer");
        int d = d();
        int i2 = 0;
        while (true) {
            i = i2 + 2;
            if (i >= d) {
                break;
            }
            int i3 = i2 + 3;
            String substring = a().substring(i2, i3);
            z65.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            nb0Var.d(Integer.parseInt(substring), 10);
            i2 = i3;
        }
        if (i2 < d) {
            int i4 = d - i2;
            if (i4 == 1) {
                String substring2 = a().substring(i2, i2 + 1);
                z65.g(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                nb0Var.d(Integer.parseInt(substring2), 4);
            } else if (i4 == 2) {
                String substring3 = a().substring(i2, i);
                z65.g(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                nb0Var.d(Integer.parseInt(substring3), 7);
            }
        }
    }
}
