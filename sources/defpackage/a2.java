package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.Random;
import kotlin.Metadata;
/* compiled from: PlatformRandom.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"La2;", "Lb49;", "", "bitCount", "b", c.a, "until", DateTokenConverter.CONVERTER_KEY, "", "f", "Ljava/util/Random;", "i", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: a2  reason: default package */
/* loaded from: classes3.dex */
public abstract class a2 extends b49 {
    @Override // defpackage.b49
    public int b(int i) {
        return e49.e(i().nextInt(), i);
    }

    @Override // defpackage.b49
    public int c() {
        return i().nextInt();
    }

    @Override // defpackage.b49
    public int d(int i) {
        return i().nextInt(i);
    }

    @Override // defpackage.b49
    public long f() {
        return i().nextLong();
    }

    public abstract Random i();
}
