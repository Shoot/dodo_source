package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.sk9;
import kotlin.Metadata;
/* compiled from: DebugStrings.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lcv1;", "", c.a, "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "a", "classSimpleName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: jo2  reason: default package */
/* loaded from: classes3.dex */
public final class jo2 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(cv1<?> cv1Var) {
        String b;
        if (cv1Var instanceof n33) {
            return cv1Var.toString();
        }
        try {
            sk9.a aVar = sk9.b;
            b = sk9.b(cv1Var + '@' + b(cv1Var));
        } catch (Throwable th) {
            sk9.a aVar2 = sk9.b;
            b = sk9.b(vk9.a(th));
        }
        if (sk9.d(b) != null) {
            b = cv1Var.getClass().getName() + '@' + b(cv1Var);
        }
        return (String) b;
    }
}
