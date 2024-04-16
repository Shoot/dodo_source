package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Random;
import kotlin.Metadata;
/* compiled from: PlatformRandom.kt */
@Metadata(d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lwo3;", "La2;", "wo3$a", c.a, "Lwo3$a;", "implStorage", "Ljava/util/Random;", "i", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: wo3  reason: default package */
/* loaded from: classes3.dex */
public final class wo3 extends a2 {
    private final a c = new a();

    /* compiled from: PlatformRandom.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, d2 = {"wo3$a", "Ljava/lang/ThreadLocal;", "Ljava/util/Random;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wo3$a */
    /* loaded from: classes3.dex */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // defpackage.a2
    public Random i() {
        Random random = this.c.get();
        z65.g(random, "get(...)");
        return random;
    }
}
