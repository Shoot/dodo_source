package defpackage;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: OperationNodeBase.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Ldb7;", "Lsmb;", "Ls6b;", "data", "", "b", "(Ls6b;Lcv1;)Ljava/lang/Object;", "", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", MessageAttributes.TYPE, "<init>", "(Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: db7  reason: default package */
/* loaded from: classes.dex */
public abstract class db7 extends smb {
    private final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db7(String str) {
        super(str, null);
        z65.h(str, MessageAttributes.TYPE);
        this.b = str;
    }

    static /* synthetic */ Object e(db7 db7Var, s6b s6bVar, cv1<? super Unit> cv1Var) {
        return Unit.a;
    }

    public Object b(s6b s6bVar, cv1<? super Unit> cv1Var) {
        return e(this, s6bVar, cv1Var);
    }
}
