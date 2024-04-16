package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: Composition.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\bH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\bH&J\b\u0010\u0012\u001a\u00020\u000bH&J$\u0010\u0017\u001a\u00020\u00032\u001a\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u0013H'J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H'J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&J\b\u0010\u001e\u001a\u00020\u0003H&J5\u0010#\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00002\u0006\u0010\"\u001a\u00020!2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H&¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0001\u0001(ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006)À\u0006\u0001"}, d2 = {"Ljv1;", "Lco1;", "Lkotlin/Function0;", "", RemoteMessageConst.Notification.CONTENT, c.a, "(Lkotlin/jvm/functions/Function2;)V", "", "", "values", "n", "", "l", "block", Image.TYPE_MEDIUM, "value", "b", "q", "k", "", "Lkotlin/Pair;", "Lhp6;", "references", "g", "Lgp6;", "state", Image.TYPE_HIGH, "o", e.a, "r", "t", "R", RemoteMessageConst.TO, "", "groupIndex", "f", "(Ljv1;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "p", "()Z", "isComposing", "Lio1;", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jv1  reason: default package */
/* loaded from: classes.dex */
public interface jv1 extends co1 {
    void b(Object obj);

    void c(Function2<? super qn1, ? super Integer, Unit> function2);

    void e();

    <R> R f(jv1 jv1Var, int i, Function0<? extends R> function0);

    void g(List<Pair<hp6, hp6>> list);

    void h(gp6 gp6Var);

    boolean k();

    boolean l(Set<? extends Object> set);

    void m(Function0<Unit> function0);

    void n(Set<? extends Object> set);

    void o();

    boolean p();

    void q(Object obj);

    void r();

    void t();
}
