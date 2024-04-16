package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: AssistantGeneratorSettings.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lgu;", "Ljava/io/Serializable;", "Lss;", "C", "()Lss;", "environment", "a", "b", "Lgu$a;", "Lgu$b;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gu  reason: default package */
/* loaded from: classes2.dex */
public interface gu extends Serializable {

    /* compiled from: AssistantGeneratorSettings.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lgu$a;", "Lgu;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lss;", "a", "Lss;", "C", "()Lss;", "environment", "<init>", "(Lss;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gu$a */
    /* loaded from: classes2.dex */
    public static final class a implements gu {
        private final ss a;

        public a(ss ssVar) {
            z65.h(ssVar, "environment");
            this.a = ssVar;
        }

        @Override // defpackage.gu
        public ss C() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && z65.c(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            ss ssVar = this.a;
            return "Random(environment=" + ssVar + ")";
        }
    }

    /* compiled from: AssistantGeneratorSettings.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00158\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006 "}, d2 = {"Lgu$b;", "Lgu;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lss;", "a", "Lss;", "C", "()Lss;", "environment", "Lju;", "b", "Lju;", "()Lju;", "mood", "", "Lav;", c.a, "Ljava/util/Set;", "()Ljava/util/Set;", "preferences", "Lzw;", DateTokenConverter.CONVERTER_KEY, "wishes", "<init>", "(Lss;Lju;Ljava/util/Set;Ljava/util/Set;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gu$b */
    /* loaded from: classes2.dex */
    public static final class b implements gu {
        private final ss a;
        private final ju b;
        private final Set<av> c;
        private final Set<zw> d;

        public b(ss ssVar, ju juVar, Set<av> set, Set<zw> set2) {
            z65.h(ssVar, "environment");
            z65.h(juVar, "mood");
            z65.h(set, "preferences");
            z65.h(set2, "wishes");
            this.a = ssVar;
            this.b = juVar;
            this.c = set;
            this.d = set2;
        }

        @Override // defpackage.gu
        public ss C() {
            return this.a;
        }

        public final ju a() {
            return this.b;
        }

        public final Set<av> b() {
            return this.c;
        }

        public final Set<zw> c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b) && z65.c(this.c, bVar.c) && z65.c(this.d, bVar.d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            ss ssVar = this.a;
            ju juVar = this.b;
            Set<av> set = this.c;
            Set<zw> set2 = this.d;
            return "UserDefined(environment=" + ssVar + ", mood=" + juVar + ", preferences=" + set + ", wishes=" + set2 + ")";
        }
    }

    ss C();
}
