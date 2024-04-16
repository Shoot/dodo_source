package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;
/* compiled from: PlatformThreadLocalRandom.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lsc8;", "La2;", "", RemoteMessageConst.FROM, "until", e.a, "Ljava/util/Random;", "i", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0})
/* renamed from: sc8  reason: default package */
/* loaded from: classes3.dex */
public final class sc8 extends a2 {
    @Override // defpackage.b49
    public int e(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // defpackage.a2
    public Random i() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        z65.g(current, "current(...)");
        return current;
    }
}
