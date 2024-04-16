package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
/* compiled from: CompositionContext.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b4\u0010\u001aJ%\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H ¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH ¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010#\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!H ¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u0004\u0018\u00010!2\u0006\u0010\u001d\u001a\u00020\u001cH\u0010¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b'\u0010\nR\u0014\u0010+\u001a\u00020(8 X \u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8 X \u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Ldo1;", "", "Ljv1;", "composition", "Lkotlin/Function0;", "", RemoteMessageConst.Notification.CONTENT, "a", "(Ljv1;Lkotlin/jvm/functions/Function2;)V", "i", "(Ljv1;)V", "", "Lfo1;", "table", "l", "(Ljava/util/Set;)V", "Lqn1;", "composer", Image.TYPE_MEDIUM, "(Lqn1;)V", "p", "q", "Lbz7;", e.a, "()Lbz7;", "o", "()V", c.a, "Lhp6;", "reference", Image.TYPE_HIGH, "(Lhp6;)V", "b", "Lgp6;", "data", "j", "(Lhp6;Lgp6;)V", "k", "(Lhp6;)Lgp6;", "n", "", "f", "()I", "compoundHashKey", "", DateTokenConverter.CONVERTER_KEY, "()Z", "collectingParameterInformation", "Lkotlin/coroutines/CoroutineContext;", "g", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: do1  reason: default package */
/* loaded from: classes.dex */
public abstract class do1 {
    public abstract void a(jv1 jv1Var, Function2<? super qn1, ? super Integer, Unit> function2);

    public abstract void b(hp6 hp6Var);

    public abstract boolean d();

    public bz7 e() {
        return eo1.a();
    }

    public abstract int f();

    public abstract CoroutineContext g();

    public abstract void h(hp6 hp6Var);

    public abstract void i(jv1 jv1Var);

    public abstract void j(hp6 hp6Var, gp6 gp6Var);

    public gp6 k(hp6 hp6Var) {
        z65.h(hp6Var, "reference");
        return null;
    }

    public void l(Set<fo1> set) {
        z65.h(set, "table");
    }

    public void m(qn1 qn1Var) {
        z65.h(qn1Var, "composer");
    }

    public abstract void n(jv1 jv1Var);

    public void p(qn1 qn1Var) {
        z65.h(qn1Var, "composer");
    }

    public abstract void q(jv1 jv1Var);

    public void c() {
    }

    public void o() {
    }
}
