package defpackage;

import ch.qos.logback.core.CoreConstants;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
/* compiled from: InAppConfigResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001:\u0001!B3\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lk;", "", "", "component1", "Lyx9;", "component2", "component3", "", "Lk$a;", "component4", "id", "sdkVersion", "salt", "variants", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lyx9;", "getSdkVersion", "()Lyx9;", "getSalt", "Ljava/util/List;", "getVariants", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Lyx9;Ljava/lang/String;Ljava/util/List;)V", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: k  reason: default package */
/* loaded from: classes.dex */
public final class k {
    @uca("id")
    private final String id;
    @uca("salt")
    private final String salt;
    @uca("sdkVersion")
    private final yx9 sdkVersion;
    @uca("variants")
    private final List<a> variants;

    /* compiled from: InAppConfigResponse.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB)\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lk$a;", "", "", "component1", "Lk$a$a;", "component2", "", "Lk$a$b;", "component3", "id", "modulus", "objects", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lk$a$a;", "getModulus", "()Lk$a$a;", "Ljava/util/List;", "getObjects", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Lk$a$a;Ljava/util/List;)V", "a", "b", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: k$a */
    /* loaded from: classes.dex */
    public static final class a {
        @uca("id")
        private final String id;
        @uca("modulus")
        private final C0405a modulus;
        @uca("objects")
        private final List<b> objects;

        /* compiled from: InAppConfigResponse.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, d2 = {"Lk$a$a;", "", "", "component1", "()Ljava/lang/Integer;", "component2", "lower", "upper", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lk$a$a;", "", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getLower", "getUpper", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0405a {
            @uca("lower")
            private final Integer lower;
            @uca("upper")
            private final Integer upper;

            public C0405a(Integer num, Integer num2) {
                this.lower = num;
                this.upper = num2;
            }

            public static /* synthetic */ C0405a copy$default(C0405a c0405a, Integer num, Integer num2, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = c0405a.lower;
                }
                if ((i & 2) != 0) {
                    num2 = c0405a.upper;
                }
                return c0405a.copy(num, num2);
            }

            public final Integer component1() {
                return this.lower;
            }

            public final Integer component2() {
                return this.upper;
            }

            public final C0405a copy(Integer num, Integer num2) {
                return new C0405a(num, num2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0405a)) {
                    return false;
                }
                C0405a c0405a = (C0405a) obj;
                if (z65.c(this.lower, c0405a.lower) && z65.c(this.upper, c0405a.upper)) {
                    return true;
                }
                return false;
            }

            public final Integer getLower() {
                return this.lower;
            }

            public final Integer getUpper() {
                return this.upper;
            }

            public int hashCode() {
                int hashCode;
                Integer num = this.lower;
                int i = 0;
                if (num == null) {
                    hashCode = 0;
                } else {
                    hashCode = num.hashCode();
                }
                int i2 = hashCode * 31;
                Integer num2 = this.upper;
                if (num2 != null) {
                    i = num2.hashCode();
                }
                return i2 + i;
            }

            public String toString() {
                return "ModulusDto(lower=" + this.lower + ", upper=" + this.upper + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* compiled from: InAppConfigResponse.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003J3\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lk$a$b;", "", "", "component1", "component2", "", "component3", MessageAttributes.TYPE, "kind", "inapps", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getKind", "Ljava/util/List;", "getInapps", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: k$a$b */
        /* loaded from: classes.dex */
        public static final class b {
            @uca("inapps")
            private final List<String> inapps;
            @uca("kind")
            private final String kind;
            @uca(tmb.TYPE_JSON_NAME)
            private final String type;

            public b(String str, String str2, List<String> list) {
                this.type = str;
                this.kind = str2;
                this.inapps = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ b copy$default(b bVar, String str, String str2, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.type;
                }
                if ((i & 2) != 0) {
                    str2 = bVar.kind;
                }
                if ((i & 4) != 0) {
                    list = bVar.inapps;
                }
                return bVar.copy(str, str2, list);
            }

            public final String component1() {
                return this.type;
            }

            public final String component2() {
                return this.kind;
            }

            public final List<String> component3() {
                return this.inapps;
            }

            public final b copy(String str, String str2, List<String> list) {
                return new b(str, str2, list);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (z65.c(this.type, bVar.type) && z65.c(this.kind, bVar.kind) && z65.c(this.inapps, bVar.inapps)) {
                    return true;
                }
                return false;
            }

            public final List<String> getInapps() {
                return this.inapps;
            }

            public final String getKind() {
                return this.kind;
            }

            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                String str = this.type;
                int i = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i2 = hashCode * 31;
                String str2 = this.kind;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int i3 = (i2 + hashCode2) * 31;
                List<String> list = this.inapps;
                if (list != null) {
                    i = list.hashCode();
                }
                return i3 + i;
            }

            public String toString() {
                return "ObjectsDto(type=" + this.type + ", kind=" + this.kind + ", inapps=" + this.inapps + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        public a(String str, C0405a c0405a, List<b> list) {
            z65.h(str, "id");
            this.id = str;
            this.modulus = c0405a;
            this.objects = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a copy$default(a aVar, String str, C0405a c0405a, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.id;
            }
            if ((i & 2) != 0) {
                c0405a = aVar.modulus;
            }
            if ((i & 4) != 0) {
                list = aVar.objects;
            }
            return aVar.copy(str, c0405a, list);
        }

        public final String component1() {
            return this.id;
        }

        public final C0405a component2() {
            return this.modulus;
        }

        public final List<b> component3() {
            return this.objects;
        }

        public final a copy(String str, C0405a c0405a, List<b> list) {
            z65.h(str, "id");
            return new a(str, c0405a, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.id, aVar.id) && z65.c(this.modulus, aVar.modulus) && z65.c(this.objects, aVar.objects)) {
                return true;
            }
            return false;
        }

        public final String getId() {
            return this.id;
        }

        public final C0405a getModulus() {
            return this.modulus;
        }

        public final List<b> getObjects() {
            return this.objects;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.id.hashCode() * 31;
            C0405a c0405a = this.modulus;
            int i = 0;
            if (c0405a == null) {
                hashCode = 0;
            } else {
                hashCode = c0405a.hashCode();
            }
            int i2 = (hashCode2 + hashCode) * 31;
            List<b> list = this.objects;
            if (list != null) {
                i = list.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            return "VariantDto(id=" + this.id + ", modulus=" + this.modulus + ", objects=" + this.objects + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public k(String str, yx9 yx9Var, String str2, List<a> list) {
        z65.h(str, "id");
        this.id = str;
        this.sdkVersion = yx9Var;
        this.salt = str2;
        this.variants = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k copy$default(k kVar, String str, yx9 yx9Var, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kVar.id;
        }
        if ((i & 2) != 0) {
            yx9Var = kVar.sdkVersion;
        }
        if ((i & 4) != 0) {
            str2 = kVar.salt;
        }
        if ((i & 8) != 0) {
            list = kVar.variants;
        }
        return kVar.copy(str, yx9Var, str2, list);
    }

    public final String component1() {
        return this.id;
    }

    public final yx9 component2() {
        return this.sdkVersion;
    }

    public final String component3() {
        return this.salt;
    }

    public final List<a> component4() {
        return this.variants;
    }

    public final k copy(String str, yx9 yx9Var, String str2, List<a> list) {
        z65.h(str, "id");
        return new k(str, yx9Var, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (z65.c(this.id, kVar.id) && z65.c(this.sdkVersion, kVar.sdkVersion) && z65.c(this.salt, kVar.salt) && z65.c(this.variants, kVar.variants)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSalt() {
        return this.salt;
    }

    public final yx9 getSdkVersion() {
        return this.sdkVersion;
    }

    public final List<a> getVariants() {
        return this.variants;
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
        String str = this.salt;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<a> list = this.variants;
        if (list != null) {
            i = list.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return "ABTestDto(id=" + this.id + ", sdkVersion=" + this.sdkVersion + ", salt=" + this.salt + ", variants=" + this.variants + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
