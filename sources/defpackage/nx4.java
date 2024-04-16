package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
/* compiled from: InAppConfigResponse.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001:\u0001#B;\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u0011\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002HÆ\u0003JE\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b \u0010\u0019¨\u0006$"}, d2 = {"Lnx4;", "", "", "Lnx4$a;", "component1", "Lbo6;", "component2", "Lcga;", "component3", "Lk;", "component4", "inApps", "monitoring", "settings", "abtests", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getInApps", "()Ljava/util/List;", "Lbo6;", "getMonitoring", "()Lbo6;", "Lcga;", "getSettings", "()Lcga;", "getAbtests", "<init>", "(Ljava/util/List;Lbo6;Lcga;Ljava/util/List;)V", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: nx4  reason: default package */
/* loaded from: classes.dex */
public final class nx4 {
    @uca("abtests")
    private final List<k> abtests;
    @uca("inapps")
    private final List<a> inApps;
    @uca("monitoring")
    private final bo6 monitoring;
    @uca("settings")
    private final cga settings;

    /* compiled from: InAppConfigResponse.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J7\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006 "}, d2 = {"Lnx4$a;", "", "", "component1", "Lyx9;", "component2", "Lmb5;", "component3", "component4", "id", "sdkVersion", "targeting", "form", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lyx9;", "getSdkVersion", "()Lyx9;", "Lmb5;", "getTargeting", "()Lmb5;", "getForm", "<init>", "(Ljava/lang/String;Lyx9;Lmb5;Lmb5;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: nx4$a */
    /* loaded from: classes.dex */
    public static final class a {
        @uca("form")
        private final mb5 form;
        @uca("id")
        private final String id;
        @uca("sdkVersion")
        private final yx9 sdkVersion;
        @uca("targeting")
        private final mb5 targeting;

        public a(String str, yx9 yx9Var, mb5 mb5Var, mb5 mb5Var2) {
            z65.h(str, "id");
            this.id = str;
            this.sdkVersion = yx9Var;
            this.targeting = mb5Var;
            this.form = mb5Var2;
        }

        public static /* synthetic */ a copy$default(a aVar, String str, yx9 yx9Var, mb5 mb5Var, mb5 mb5Var2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.id;
            }
            if ((i & 2) != 0) {
                yx9Var = aVar.sdkVersion;
            }
            if ((i & 4) != 0) {
                mb5Var = aVar.targeting;
            }
            if ((i & 8) != 0) {
                mb5Var2 = aVar.form;
            }
            return aVar.copy(str, yx9Var, mb5Var, mb5Var2);
        }

        public final String component1() {
            return this.id;
        }

        public final yx9 component2() {
            return this.sdkVersion;
        }

        public final mb5 component3() {
            return this.targeting;
        }

        public final mb5 component4() {
            return this.form;
        }

        public final a copy(String str, yx9 yx9Var, mb5 mb5Var, mb5 mb5Var2) {
            z65.h(str, "id");
            return new a(str, yx9Var, mb5Var, mb5Var2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.id, aVar.id) && z65.c(this.sdkVersion, aVar.sdkVersion) && z65.c(this.targeting, aVar.targeting) && z65.c(this.form, aVar.form)) {
                return true;
            }
            return false;
        }

        public final mb5 getForm() {
            return this.form;
        }

        public final String getId() {
            return this.id;
        }

        public final yx9 getSdkVersion() {
            return this.sdkVersion;
        }

        public final mb5 getTargeting() {
            return this.targeting;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.id.hashCode() * 31;
            yx9 yx9Var = this.sdkVersion;
            int i = 0;
            if (yx9Var == null) {
                hashCode = 0;
            } else {
                hashCode = yx9Var.hashCode();
            }
            int i2 = (hashCode3 + hashCode) * 31;
            mb5 mb5Var = this.targeting;
            if (mb5Var == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = mb5Var.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            mb5 mb5Var2 = this.form;
            if (mb5Var2 != null) {
                i = mb5Var2.hashCode();
            }
            return i3 + i;
        }

        public String toString() {
            return "InAppDtoBlank(id=" + this.id + ", sdkVersion=" + this.sdkVersion + ", targeting=" + this.targeting + ", form=" + this.form + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public nx4(List<a> list, bo6 bo6Var, cga cgaVar, List<k> list2) {
        this.inApps = list;
        this.monitoring = bo6Var;
        this.settings = cgaVar;
        this.abtests = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ nx4 copy$default(nx4 nx4Var, List list, bo6 bo6Var, cga cgaVar, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = nx4Var.inApps;
        }
        if ((i & 2) != 0) {
            bo6Var = nx4Var.monitoring;
        }
        if ((i & 4) != 0) {
            cgaVar = nx4Var.settings;
        }
        if ((i & 8) != 0) {
            list2 = nx4Var.abtests;
        }
        return nx4Var.copy(list, bo6Var, cgaVar, list2);
    }

    public final List<a> component1() {
        return this.inApps;
    }

    public final bo6 component2() {
        return this.monitoring;
    }

    public final cga component3() {
        return this.settings;
    }

    public final List<k> component4() {
        return this.abtests;
    }

    public final nx4 copy(List<a> list, bo6 bo6Var, cga cgaVar, List<k> list2) {
        return new nx4(list, bo6Var, cgaVar, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx4)) {
            return false;
        }
        nx4 nx4Var = (nx4) obj;
        if (z65.c(this.inApps, nx4Var.inApps) && z65.c(this.monitoring, nx4Var.monitoring) && z65.c(this.settings, nx4Var.settings) && z65.c(this.abtests, nx4Var.abtests)) {
            return true;
        }
        return false;
    }

    public final List<k> getAbtests() {
        return this.abtests;
    }

    public final List<a> getInApps() {
        return this.inApps;
    }

    public final bo6 getMonitoring() {
        return this.monitoring;
    }

    public final cga getSettings() {
        return this.settings;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        List<a> list = this.inApps;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        bo6 bo6Var = this.monitoring;
        if (bo6Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bo6Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        cga cgaVar = this.settings;
        if (cgaVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = cgaVar.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        List<k> list2 = this.abtests;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        return "InAppConfigResponseBlank(inApps=" + this.inApps + ", monitoring=" + this.monitoring + ", settings=" + this.settings + ", abtests=" + this.abtests + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
