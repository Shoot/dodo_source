package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: lic  reason: default package */
/* loaded from: classes2.dex */
public final class lic implements t77 {
    final /* synthetic */ qs2 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lic(qs2 qs2Var) {
        this.a = qs2Var;
    }

    @Override // defpackage.t77
    public final void a(jp5 jp5Var) {
        LinkedList linkedList;
        LinkedList linkedList2;
        jp5 jp5Var2;
        this.a.a = jp5Var;
        linkedList = this.a.c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            jp5Var2 = this.a.a;
            ((pkc) it.next()).b(jp5Var2);
        }
        linkedList2 = this.a.c;
        linkedList2.clear();
        this.a.b = null;
    }
}
