package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.rx3;
import defpackage.sk9;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
/* compiled from: FirebaseRemoteConfigImpl.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\rH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\rH\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lox3;", "Lzc9;", "", e.a, "", "cacheExpirationTime", "", DateTokenConverter.CONVERTER_KEY, "g", "", Action.KEY_ATTRIBUTE, "a", "b", "", "f", c.a, "Lmh0;", "Lmh0;", "buildInfo", "", "I", "defaultsConfigId", "Lcom/google/firebase/remoteconfig/a;", "Lrn5;", Image.TYPE_HIGH, "()Lcom/google/firebase/remoteconfig/a;", "config", "<init>", "(Lmh0;I)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ox3  reason: default package */
/* loaded from: classes4.dex */
public final class ox3 implements zc9 {
    private final mh0 a;
    private final int b;
    private final rn5 c;

    /* compiled from: FirebaseRemoteConfigImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/firebase/remoteconfig/a;", "a", "()Lcom/google/firebase/remoteconfig/a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ox3$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<com.google.firebase.remoteconfig.a> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final com.google.firebase.remoteconfig.a invoke() {
            com.google.firebase.remoteconfig.a o = com.google.firebase.remoteconfig.a.o();
            z65.g(o, "getInstance(...)");
            return o;
        }
    }

    public ox3(mh0 mh0Var, int i) {
        rn5 b;
        z65.h(mh0Var, "buildInfo");
        this.a = mh0Var;
        this.b = i;
        b = yn5.b(a.a);
        this.c = b;
    }

    private final com.google.firebase.remoteconfig.a h() {
        return (com.google.firebase.remoteconfig.a) this.c.getValue();
    }

    @Override // defpackage.zc9
    public String a(String str) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        String r = h().r(str);
        z65.g(r, "getString(...)");
        return r;
    }

    @Override // defpackage.zc9
    public boolean b(String str) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        return h().m(str);
    }

    @Override // defpackage.zc9
    public Map<String, String> c() {
        int w;
        Map<String, String> s;
        Object b;
        Map<String, sx3> l = h().l();
        z65.g(l, "getAll(...)");
        ArrayList arrayList = new ArrayList(l.size());
        for (Map.Entry<String, sx3> entry : l.entrySet()) {
            String key = entry.getKey();
            try {
                sk9.a aVar = sk9.b;
                b = sk9.b(entry.getValue().a());
            } catch (Throwable th) {
                sk9.a aVar2 = sk9.b;
                b = sk9.b(vk9.a(th));
            }
            arrayList.add(lnb.a(key, sk9.a(b)));
        }
        ArrayList<Pair> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!sk9.f(((sk9) ((Pair) obj).d()).k())) {
                arrayList2.add(obj);
            }
        }
        w = lc1.w(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(w);
        for (Pair pair : arrayList2) {
            Object c = pair.c();
            Object k = ((sk9) pair.d()).k();
            vk9.b(k);
            arrayList3.add(lnb.a(c, k));
        }
        s = g86.s(arrayList3);
        return s;
    }

    @Override // defpackage.zc9
    public void d(long j) {
        o7b.a(h().j(j));
    }

    @Override // defpackage.zc9
    public boolean e() {
        Object a2 = o7b.a(h().h());
        z65.g(a2, "await(...)");
        return ((Boolean) a2).booleanValue();
    }

    @Override // defpackage.zc9
    public Map<String, Boolean> f() {
        int w;
        Map<String, Boolean> s;
        Object b;
        Map<String, sx3> l = h().l();
        z65.g(l, "getAll(...)");
        ArrayList arrayList = new ArrayList(l.size());
        for (Map.Entry<String, sx3> entry : l.entrySet()) {
            String key = entry.getKey();
            try {
                sk9.a aVar = sk9.b;
                b = sk9.b(Boolean.valueOf(entry.getValue().e()));
            } catch (Throwable th) {
                sk9.a aVar2 = sk9.b;
                b = sk9.b(vk9.a(th));
            }
            arrayList.add(lnb.a(key, sk9.a(b)));
        }
        ArrayList<Pair> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!sk9.f(((sk9) ((Pair) obj).d()).k())) {
                arrayList2.add(obj);
            }
        }
        w = lc1.w(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(w);
        for (Pair pair : arrayList2) {
            Object c = pair.c();
            Object k = ((sk9) pair.d()).k();
            vk9.b(k);
            arrayList3.add(lnb.a(c, k));
        }
        s = g86.s(arrayList3);
        return s;
    }

    @Override // defpackage.zc9
    public void g() {
        if (this.a.i()) {
            rx3 c = new rx3.b().e(0L).c();
            z65.g(c, "build(...)");
            h().A(c);
        }
        o7b.a(h().C(this.b));
    }
}
