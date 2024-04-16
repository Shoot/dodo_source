package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: LockFreeLinkedList.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0001\" \u0010\t\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0004\u0010\u0006\" \u0010\f\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006*\n\u0010\u000e\"\u00020\r2\u00020\r*\u001c\u0010\u0010\u001a\u0004\b\u0000\u0010\u000f\"\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0000*\f\b\u0002\u0010\u0011\"\u00020\u00012\u00020\u0001*\n\u0010\u0013\"\u00020\u00122\u00020\u0012*\u001c\u0010\u0015\u001a\u0004\b\u0000\u0010\u000f\"\b\u0012\u0004\u0012\u00028\u00000\u00142\b\u0012\u0004\u0012\u00028\u00000\u0014¨\u0006\u0016"}, d2 = {"", "Llw5;", "Lkotlinx/coroutines/internal/Node;", c.a, "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "getCONDITION_FALSE$annotations", "()V", "CONDITION_FALSE", "b", "getLIST_EMPTY$annotations", "LIST_EMPTY", "Llw5$a;", "AbstractAtomicDesc", "T", "AddLastDesc", "Node", "Llw5$c;", "PrepareOp", "Llw5$d;", "RemoveFirstDesc", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: kw5  reason: default package */
/* loaded from: classes3.dex */
public final class kw5 {
    private static final Object a = new r3b("CONDITION_FALSE");
    private static final Object b = new r3b("LIST_EMPTY");

    public static final Object a() {
        return a;
    }

    public static final Object b() {
        return b;
    }

    public static final lw5 c(Object obj) {
        ce9 ce9Var;
        lw5 lw5Var;
        if (obj instanceof ce9) {
            ce9Var = (ce9) obj;
        } else {
            ce9Var = null;
        }
        if (ce9Var == null || (lw5Var = ce9Var.a) == null) {
            return (lw5) obj;
        }
        return lw5Var;
    }
}
