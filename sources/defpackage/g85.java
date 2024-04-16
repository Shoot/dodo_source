package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: JDK7PlatformImplementations.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Lg85;", "Lcc8;", "", "version", "", c.a, "", "cause", "exception", "", "a", "<init>", "()V", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0})
/* renamed from: g85  reason: default package */
/* loaded from: classes3.dex */
public class g85 extends cc8 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JDK7PlatformImplementations.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lg85$a;", "", "", "b", "Ljava/lang/Integer;", "sdkVersion", "<init>", "()V", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0})
    /* renamed from: g85$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final a a = new a();
        public static final Integer b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            b = num2;
        }

        private a() {
        }
    }

    private final boolean c(int i) {
        Integer num = a.b;
        if (num != null && num.intValue() < i) {
            return false;
        }
        return true;
    }

    @Override // defpackage.cc8
    public void a(Throwable th, Throwable th2) {
        z65.h(th, "cause");
        z65.h(th2, "exception");
        if (c(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
