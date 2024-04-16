package defpackage;

import defpackage.ms7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: InAppContentFetcherImpl.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lpx4;", "Lox4;", "", "inAppId", "Lms7;", "formVariant", "", "a", "(Ljava/lang/String;Lms7;Lcv1;)Ljava/lang/Object;", "", "b", "Lay4;", "Lay4;", "inAppImageLoader", "<init>", "(Lay4;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: px4  reason: default package */
/* loaded from: classes.dex */
public final class px4 implements ox4 {
    private final ay4 a;

    public px4(ay4 ay4Var) {
        z65.h(ay4Var, "inAppImageLoader");
        this.a = ay4Var;
    }

    @Override // defpackage.ox4
    public Object a(String str, ms7 ms7Var, cv1<? super Boolean> cv1Var) {
        if (ms7Var instanceof ms7.a) {
            return this.a.a(str, ((ms7.a) ms7Var).b(), cv1Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.ox4
    public void b(String str) {
        z65.h(str, "inAppId");
        this.a.b(str);
    }
}
