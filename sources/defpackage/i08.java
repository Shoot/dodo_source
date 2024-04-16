package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersonalOfferRepository.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0013"}, d2 = {"Li08;", "Lh08;", "", "Lzz7;", "offers", "", "b", "", "id", DateTokenConverter.CONVERTER_KEY, c.a, "a", "Lml0;", "Lml0;", "cacheInspector", "Ljava/util/List;", "cache", "<init>", "(Lml0;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: i08  reason: default package */
/* loaded from: classes4.dex */
public final class i08 implements h08 {
    private static final a c = new a(null);
    private static final long d = TimeUnit.MINUTES.toMillis(1);
    private final ml0 a;
    private volatile List<zz7> b;

    /* compiled from: PersonalOfferRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Li08$a;", "", "", "PERSONAL_OFFERS_CACHE_KEY", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: i08$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public i08(ml0 ml0Var) {
        z65.h(ml0Var, "cacheInspector");
        this.a = ml0Var;
    }

    @Override // defpackage.h08
    public void a() {
        this.b = null;
    }

    @Override // defpackage.h08
    public void b(List<zz7> list) {
        z65.h(list, "offers");
        this.b = list;
        this.a.b("personal_offers_cache_key", d);
    }

    @Override // defpackage.h08
    public List<zz7> c() {
        if (this.a.a("personal_offers_cache_key")) {
            return this.b;
        }
        return null;
    }

    @Override // defpackage.h08
    public void d(String str) {
        ArrayList arrayList;
        int w;
        z65.h(str, "id");
        List<zz7> list = this.b;
        if (list != null) {
            List<zz7> list2 = list;
            w = lc1.w(list2, 10);
            arrayList = new ArrayList(w);
            for (zz7 zz7Var : list2) {
                if (z65.c(zz7Var.f(), str)) {
                    zz7Var = zz7.b(zz7Var, null, null, null, null, null, null, null, null, null, false, null, null, new n2a(true), 4095, null);
                }
                arrayList.add(zz7Var);
            }
        } else {
            arrayList = null;
        }
        this.b = arrayList;
    }
}
