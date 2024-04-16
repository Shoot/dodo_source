package defpackage;

import com.huawei.hms.opendevice.c;
import java.lang.reflect.Method;
import kotlin.Metadata;
/* compiled from: PlatformImplementations.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcc8;", "", "", "cause", "exception", "", "a", "Lb49;", "b", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: cc8  reason: default package */
/* loaded from: classes3.dex */
public class cc8 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlatformImplementations.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Lcc8$a;", "", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "addSuppressed", c.a, "getSuppressed", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cc8$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final a a = new a();
        public static final Method b;
        public static final Method c;

        static {
            Method method;
            Method method2;
            Object R;
            Method[] methods = Throwable.class.getMethods();
            z65.e(methods);
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 < length) {
                    method2 = methods[i2];
                    if (z65.c(method2.getName(), "addSuppressed")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        z65.g(parameterTypes, "getParameterTypes(...)");
                        R = yr.R(parameterTypes);
                        if (z65.c(R, Throwable.class)) {
                            break;
                        }
                    }
                    i2++;
                } else {
                    method2 = null;
                    break;
                }
            }
            b = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (z65.c(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            c = method;
        }

        private a() {
        }
    }

    public void a(Throwable th, Throwable th2) {
        z65.h(th, "cause");
        z65.h(th2, "exception");
        Method method = a.b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public b49 b() {
        return new wo3();
    }
}
