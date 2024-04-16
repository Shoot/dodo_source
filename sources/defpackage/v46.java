package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
/* compiled from: MainDispatchers.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lv46;", "", "Lt46;", "a", "", "b", "Z", "FAST_SERVICE_LOADER_ENABLED", c.a, "Lt46;", "dispatcher", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: v46  reason: default package */
/* loaded from: classes3.dex */
public final class v46 {
    public static final v46 a;
    private static final boolean b = false;
    public static final t46 c;

    static {
        v46 v46Var = new v46();
        a = v46Var;
        c5b.e("kotlinx.coroutines.fast.service.loader", true);
        c = v46Var.a();
    }

    private v46() {
    }

    private final t46 a() {
        Sequence c2;
        List<u46> s;
        Object next;
        t46 e;
        try {
            if (!b) {
                c2 = bca.c(ServiceLoader.load(u46.class, u46.class.getClassLoader()).iterator());
                s = dca.s(c2);
            } else {
                s = dp3.a.c();
            }
            Iterator<T> it = s.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((u46) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((u46) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            }
            u46 u46Var = (u46) next;
            if (u46Var == null || (e = w46.e(u46Var, s)) == null) {
                return w46.b(null, null, 3, null);
            }
            return e;
        } catch (Throwable th) {
            return w46.b(th, null, 2, null);
        }
    }
}
