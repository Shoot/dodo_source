package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LanguageAwareCacheKeys.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\tB\u001d\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lsl5;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "currentLanguageKey", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "otherLanguagesKeys", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sl5  reason: default package */
/* loaded from: classes4.dex */
public final class sl5 {
    private final String a;
    private final List<String> b;

    /* compiled from: LanguageAwareCacheKeys.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u0011"}, d2 = {"Lsl5$a;", "", "", "prefix", "Ltl5;", "languageConfig", "a", "keyPrefix", LocalityEntity.FIELD_COUNTRY_CODE, "language", "Lsl5;", "b", "Lny1;", "Lny1;", "languageConfigService", "<init>", "(Lny1;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sl5$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private final ny1 a;

        public a(ny1 ny1Var) {
            z65.h(ny1Var, "languageConfigService");
            this.a = ny1Var;
        }

        private final String a(String str, tl5 tl5Var) {
            return str + tl5Var;
        }

        public final sl5 b(String str, String str2, tl5 tl5Var) {
            List p0;
            int w;
            z65.h(str, "keyPrefix");
            z65.h(str2, LocalityEntity.FIELD_COUNTRY_CODE);
            if (tl5Var == null) {
                tl5Var = this.a.c(str2);
            }
            p0 = sc1.p0(this.a.a(str2), tl5Var);
            String a = a(str, tl5Var);
            List<tl5> list = p0;
            w = lc1.w(list, 10);
            ArrayList arrayList = new ArrayList(w);
            for (tl5 tl5Var2 : list) {
                arrayList.add(a(str, tl5Var2));
            }
            return new sl5(a, arrayList);
        }
    }

    public sl5(String str, List<String> list) {
        z65.h(str, "currentLanguageKey");
        z65.h(list, "otherLanguagesKeys");
        this.a = str;
        this.b = list;
    }

    public final String a() {
        return this.a;
    }

    public final List<String> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl5)) {
            return false;
        }
        sl5 sl5Var = (sl5) obj;
        if (z65.c(this.a, sl5Var.a) && z65.c(this.b, sl5Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        List<String> list = this.b;
        return "LanguageAwareCacheKeys(currentLanguageKey=" + str + ", otherLanguagesKeys=" + list + ")";
    }
}
