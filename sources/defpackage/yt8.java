package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: QRData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lyt8;", "Lju8;", "Lnb0;", "buffer", "", e.a, "", DateTokenConverter.CONVERTER_KEY, "", c.a, "[B", "dataBytes", "", "data", "<init>", "(Ljava/lang/String;)V", "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: yt8  reason: default package */
/* loaded from: classes3.dex */
public final class yt8 extends ju8 {
    private final byte[] c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt8(String str) {
        super(bu8.DEFAULT, str);
        byte[] s;
        z65.h(str, "data");
        s = l0b.s(str);
        this.c = s;
    }

    @Override // defpackage.ju8
    public int d() {
        return this.c.length;
    }

    @Override // defpackage.ju8
    public void e(nb0 nb0Var) {
        z65.h(nb0Var, "buffer");
        int length = this.c.length;
        for (int i = 0; i < length; i++) {
            nb0Var.d(this.c[i], 8);
        }
    }
}
