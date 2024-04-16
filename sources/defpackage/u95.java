package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import kotlin.Metadata;
/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0015¨\u0006\u0019"}, d2 = {"Lu95;", "Lwl1;", "Lf43;", "Lc05;", "", "a", "", "toString", "Lv95;", DateTokenConverter.CONVERTER_KEY, "Lv95;", "S", "()Lv95;", "T", "(Lv95;)V", "job", "", "b", "()Z", "isActive", "Lsz6;", "()Lsz6;", StatisticManager.LIST, "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: u95  reason: default package */
/* loaded from: classes3.dex */
public abstract class u95 extends wl1 implements f43, c05 {
    public v95 d;

    public final v95 S() {
        v95 v95Var = this.d;
        if (v95Var != null) {
            return v95Var;
        }
        z65.z("job");
        return null;
    }

    public final void T(v95 v95Var) {
        this.d = v95Var;
    }

    @Override // defpackage.f43
    public void a() {
        S().P0(this);
    }

    @Override // defpackage.c05
    public boolean b() {
        return true;
    }

    @Override // defpackage.c05
    public sz6 d() {
        return null;
    }

    @Override // defpackage.lw5
    public String toString() {
        return jo2.a(this) + '@' + jo2.b(this) + "[job@" + jo2.b(S()) + ']';
    }
}
