package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: GoogleSessionIdRepository.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\u000b\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lnh4;", "Lmh4;", "Lht4;", "a", "Lht4;", "identifierGenerator", "", "b", "Lrn5;", "getSessionId", "()Ljava/lang/String;", "sessionId", "<init>", "(Lht4;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nh4  reason: default package */
/* loaded from: classes2.dex */
public final class nh4 implements mh4 {
    private final ht4 a;
    private final rn5 b;

    /* compiled from: GoogleSessionIdRepository.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: nh4$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function0<String> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return nh4.this.a.a();
        }
    }

    public nh4(ht4 ht4Var) {
        rn5 b;
        z65.h(ht4Var, "identifierGenerator");
        this.a = ht4Var;
        b = yn5.b(new a());
        this.b = b;
    }

    @Override // defpackage.mh4
    public String getSessionId() {
        return (String) this.b.getValue();
    }
}
