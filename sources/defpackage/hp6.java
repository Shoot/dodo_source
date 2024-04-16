package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001Be\b\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012 \u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f0\u001d0\u001c\u0012\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b)\u0010*R\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\b\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0003\u0010\u001aR<\u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f0\u001d0\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b\u0012\u0010!\"\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b\u0018\u0010'¨\u0006+"}, d2 = {"Lhp6;", "", "Lfp6;", "a", "Lfp6;", c.a, "()Lfp6;", RemoteMessageConst.Notification.CONTENT, "b", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "parameter", "Ljv1;", "Ljv1;", "()Ljv1;", "composition", "Lwna;", DateTokenConverter.CONVERTER_KEY, "Lwna;", "g", "()Lwna;", "slotTable", "Lrd;", e.a, "Lrd;", "()Lrd;", "anchor", "", "Lkotlin/Pair;", "Le99;", "Llt4;", "Ljava/util/List;", "()Ljava/util/List;", Image.TYPE_HIGH, "(Ljava/util/List;)V", "invalidations", "Lbz7;", "Lbz7;", "()Lbz7;", "locals", "<init>", "(Lfp6;Ljava/lang/Object;Ljv1;Lwna;Lrd;Ljava/util/List;Lbz7;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: hp6  reason: default package */
/* loaded from: classes.dex */
public final class hp6 {
    private final fp6<Object> a;
    private final Object b;
    private final jv1 c;
    private final wna d;
    private final rd e;
    private List<Pair<e99, lt4<Object>>> f;
    private final bz7 g;

    public hp6(fp6<Object> fp6Var, Object obj, jv1 jv1Var, wna wnaVar, rd rdVar, List<Pair<e99, lt4<Object>>> list, bz7 bz7Var) {
        z65.h(fp6Var, RemoteMessageConst.Notification.CONTENT);
        z65.h(jv1Var, "composition");
        z65.h(wnaVar, "slotTable");
        z65.h(rdVar, "anchor");
        z65.h(list, "invalidations");
        z65.h(bz7Var, "locals");
        this.a = fp6Var;
        this.b = obj;
        this.c = jv1Var;
        this.d = wnaVar;
        this.e = rdVar;
        this.f = list;
        this.g = bz7Var;
    }

    public final rd a() {
        return this.e;
    }

    public final jv1 b() {
        return this.c;
    }

    public final fp6<Object> c() {
        return this.a;
    }

    public final List<Pair<e99, lt4<Object>>> d() {
        return this.f;
    }

    public final bz7 e() {
        return this.g;
    }

    public final Object f() {
        return this.b;
    }

    public final wna g() {
        return this.d;
    }

    public final void h(List<Pair<e99, lt4<Object>>> list) {
        z65.h(list, "<set-?>");
        this.f = list;
    }
}
