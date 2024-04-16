package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: Mutex.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Ljr6;", "", "owner", "", c.a, "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "b", "", "a", "()Z", "isLocked", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: jr6  reason: default package */
/* loaded from: classes3.dex */
public interface jr6 {

    /* compiled from: Mutex.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: jr6$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ Object a(jr6 jr6Var, Object obj, cv1 cv1Var, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return jr6Var.c(obj, cv1Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        public static /* synthetic */ void b(jr6 jr6Var, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                jr6Var.b(obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
    }

    boolean a();

    void b(Object obj);

    Object c(Object obj, cv1<? super Unit> cv1Var);
}
