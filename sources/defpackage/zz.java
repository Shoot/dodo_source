package defpackage;

import defpackage.k65;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AuthorizationCheckInterceptor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0005B\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000f"}, d2 = {"Lzz;", "Lk65;", "Lik9;", "response", "", "a", "Lk65$a;", "chain", "intercept", "Lmqb;", "Lmqb;", "unexpectedLogoutInteractor", "<init>", "(Lmqb;)V", "b", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zz  reason: default package */
/* loaded from: classes.dex */
public final class zz implements k65 {
    public static final a b = new a(null);
    private final mqb a;

    /* compiled from: AuthorizationCheckInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lzz$a;", "", "", "HTTP_CODE_401", "I", "<init>", "()V", "core_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zz$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public zz(mqb mqbVar) {
        z65.h(mqbVar, "unexpectedLogoutInteractor");
        this.a = mqbVar;
    }

    private final boolean a(ik9 ik9Var) {
        if (ik9Var.j() == 401) {
            return true;
        }
        return false;
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) {
        z65.h(aVar, "chain");
        ik9 b2 = aVar.b(aVar.request());
        if (a(b2)) {
            this.a.c();
        }
        return b2;
    }
}
