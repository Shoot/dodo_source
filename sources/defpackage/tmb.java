package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TreeTargetingDto.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00042\u00020\u0001:\r\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Ltmb;", "", "<init>", "()V", "Companion", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "k", "l", Image.TYPE_MEDIUM, "Ltmb$a;", "Ltmb$c;", "Ltmb$d;", "Ltmb$e;", "Ltmb$f;", "Ltmb$g;", "Ltmb$h;", "Ltmb$i;", "Ltmb$j;", "Ltmb$k;", "Ltmb$l;", "Ltmb$m;", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: tmb  reason: default package */
/* loaded from: classes.dex */
public abstract class tmb {
    public static final b Companion = new b(null);
    public static final String TYPE_JSON_NAME = "$type";

    /* compiled from: TreeTargetingDto.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB+\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003J3\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Ltmb$a;", "Ltmb;", "", "component1", "component2", "", "component3", MessageAttributes.TYPE, "kind", "ids", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getKind", "Ljava/util/List;", "getIds", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: tmb$a */
    /* loaded from: classes.dex */
    public static final class a extends tmb {
        public static final String CITY_JSON_NAME = "city";
        public static final C0678a Companion = new C0678a(null);
        @uca("ids")
        private final List<String> ids;
        @uca("kind")
        private final String kind;
        @uca(tmb.TYPE_JSON_NAME)
        private final String type;

        /* compiled from: TreeTargetingDto.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ltmb$a$a;", "", "", "CITY_JSON_NAME", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: tmb$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0678a {
            private C0678a() {
            }

            public /* synthetic */ C0678a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a(String str, String str2, List<String> list) {
            super(null);
            this.type = str;
            this.kind = str2;
            this.ids = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a copy$default(a aVar, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.type;
            }
            if ((i & 2) != 0) {
                str2 = aVar.kind;
            }
            if ((i & 4) != 0) {
                list = aVar.ids;
            }
            return aVar.copy(str, str2, list);
        }

        public final String component1() {
            return this.type;
        }

        public final String component2() {
            return this.kind;
        }

        public final List<String> component3() {
            return this.ids;
        }

        public final a copy(String str, String str2, List<String> list) {
            return new a(str, str2, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.type, aVar.type) && z65.c(this.kind, aVar.kind) && z65.c(this.ids, aVar.ids)) {
                return true;
            }
            return false;
        }

        public final List<String> getIds() {
            return this.ids;
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
            List<String> list = this.ids;
            if (list != null) {
                i = list.hashCode();
            }
            return i3 + i;
        }

        public String toString() {
            return "CityNodeDto(type=" + this.type + ", kind=" + this.kind + ", ids=" + this.ids + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: TreeTargetingDto.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ltmb$b;", "", "", "TYPE_JSON_NAME", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: tmb$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: TreeTargetingDto.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB-\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0013\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005HÆ\u0003J5\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R$\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Ltmb$c;", "Ltmb;", "", "component1", "component2", "", "component3", MessageAttributes.TYPE, "kind", "ids", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getKind", "Ljava/util/List;", "getIds", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: tmb$c */
    /* loaded from: classes.dex */
    public static final class c extends tmb {
        public static final String COUNTRY_JSON_NAME = "country";
        public static final a Companion = new a(null);
        @uca("ids")
        private final List<String> ids;
        @uca("kind")
        private final String kind;
        @uca(tmb.TYPE_JSON_NAME)
        private final String type;

        /* compiled from: TreeTargetingDto.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ltmb$c$a;", "", "", "COUNTRY_JSON_NAME", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: tmb$c$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public c(String str, String str2, List<String> list) {
            super(null);
            this.type = str;
            this.kind = str2;
            this.ids = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c copy$default(c cVar, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.type;
            }
            if ((i & 2) != 0) {
                str2 = cVar.kind;
            }
            if ((i & 4) != 0) {
                list = cVar.ids;
            }
            return cVar.copy(str, str2, list);
        }

        public final String component1() {
            return this.type;
        }

        public final String component2() {
            return this.kind;
        }

        public final List<String> component3() {
            return this.ids;
        }

        public final c copy(String str, String str2, List<String> list) {
            return new c(str, str2, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (z65.c(this.type, cVar.type) && z65.c(this.kind, cVar.kind) && z65.c(this.ids, cVar.ids)) {
                return true;
            }
            return false;
        }

        public final List<String> getIds() {
            return this.ids;
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
            List<String> list = this.ids;
            if (list != null) {
                i = list.hashCode();
            }
            return i3 + i;
        }

        public String toString() {
            return "CountryNodeDto(type=" + this.type + ", kind=" + this.kind + ", ids=" + this.ids + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: TreeTargetingDto.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B#\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004HÆ\u0003J)\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Ltmb$d;", "Ltmb;", "", "component1", "", "component2", MessageAttributes.TYPE, "nodes", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Ljava/util/List;", "getNodes", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: tmb$d */
    /* loaded from: classes.dex */
    public static final class d extends tmb {
        public static final String AND_JSON_NAME = "and";
        public static final a Companion = new a(null);
        @uca("nodes")
        private final List<tmb> nodes;
        @uca(tmb.TYPE_JSON_NAME)
        private final String type;

        /* compiled from: TreeTargetingDto.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ltmb$d$a;", "", "", "AND_JSON_NAME", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: tmb$d$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, List<? extends tmb> list) {
            super(null);
            this.type = str;
            this.nodes = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ d copy$default(d dVar, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.type;
            }
            if ((i & 2) != 0) {
                list = dVar.nodes;
            }
            return dVar.copy(str, list);
        }

        public final String component1() {
            return this.type;
        }

        public final List<tmb> component2() {
            return this.nodes;
        }

        public final d copy(String str, List<? extends tmb> list) {
            return new d(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (z65.c(this.type, dVar.type) && z65.c(this.nodes, dVar.nodes)) {
                return true;
            }
            return false;
        }

        public final List<tmb> getNodes() {
            return this.nodes;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode;
            String str = this.type;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            List<tmb> list = this.nodes;
            if (list != null) {
                i = list.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            return "IntersectionNodeDto(type=" + this.type + ", nodes=" + this.nodes + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: TreeTargetingDto.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0017"}, d2 = {"Ltmb$e;", "Ltmb;", "", "component1", "component2", MessageAttributes.TYPE, "systemName", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getSystemName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: tmb$e */
    /* loaded from: classes.dex */
    public static final class e extends tmb {
        public static final String API_METHOD_CALL_JSON_NAME = "apiMethodCall";
        public static final a Companion = new a(null);
        @uca("systemName")
        private final String systemName;
        @uca(tmb.TYPE_JSON_NAME)
        private final String type;

        /* compiled from: TreeTargetingDto.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ltmb$e$a;", "", "", "API_METHOD_CALL_JSON_NAME", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: tmb$e$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public e(String str, String str2) {
            super(null);
            this.type = str;
            this.systemName = str2;
        }

        public static /* synthetic */ e copy$default(e eVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eVar.type;
            }
            if ((i & 2) != 0) {
                str2 = eVar.systemName;
            }
            return eVar.copy(str, str2);
        }

        public final String component1() {
            return this.type;
        }

        public final String component2() {
            return this.systemName;
        }

        public final e copy(String str, String str2) {
            return new e(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (z65.c(this.type, eVar.type) && z65.c(this.systemName, eVar.systemName)) {
                return true;
            }
            return false;
        }

        public final String getSystemName() {
            return this.systemName;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode;
            String str = this.type;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            String str2 = this.systemName;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            return "OperationNodeDto(type=" + this.type + ", systemName=" + this.systemName + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: TreeTargetingDto.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB-\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0013\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005HÆ\u0003J5\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R$\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Ltmb$f;", "Ltmb;", "", "component1", "component2", "", "component3", MessageAttributes.TYPE, "kind", "ids", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getKind", "Ljava/util/List;", "getIds", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: tmb$f */
    /* loaded from: classes.dex */
    public static final class f extends tmb {
        public static final a Companion = new a(null);
        public static final String REGION_JSON_NAME = "region";
        @uca("ids")
        private final List<String> ids;
        @uca("kind")
        private final String kind;
        @uca(tmb.TYPE_JSON_NAME)
        private final String type;

        /* compiled from: TreeTargetingDto.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ltmb$f$a;", "", "", "REGION_JSON_NAME", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: tmb$f$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public f(String str, String str2, List<String> list) {
            super(null);
            this.type = str;
            this.kind = str2;
            this.ids = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ f copy$default(f fVar, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fVar.type;
            }
            if ((i & 2) != 0) {
                str2 = fVar.kind;
            }
            if ((i & 4) != 0) {
                list = fVar.ids;
            }
            return fVar.copy(str, str2, list);
        }

        public final String component1() {
            return this.type;
        }

        public final String component2() {
            return this.kind;
        }

        public final List<String> component3() {
            return this.ids;
        }

        public final f copy(String str, String str2, List<String> list) {
            return new f(str, str2, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (z65.c(this.type, fVar.type) && z65.c(this.kind, fVar.kind) && z65.c(this.ids, fVar.ids)) {
                return true;
            }
            return false;
        }

        public final List<String> getIds() {
            return this.ids;
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
            List<String> list = this.ids;
            if (list != null) {
                i = list.hashCode();
            }
            return i3 + i;
        }

        public String toString() {
            return "RegionNodeDto(type=" + this.type + ", kind=" + this.kind + ", ids=" + this.ids + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: TreeTargetingDto.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB9\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003JE\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006 "}, d2 = {"Ltmb$g;", "Ltmb;", "", "component1", "component2", "component3", "component4", "component5", MessageAttributes.TYPE, "kind", "segmentationExternalId", "segmentationInternalId", "segmentExternalId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getKind", "getSegmentationExternalId", "getSegmentationInternalId", "getSegmentExternalId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: tmb$g */
    /* loaded from: classes.dex */
    public static final class g extends tmb {
        public static final a Companion = new a(null);
        public static final String SEGMENT_JSON_NAME = "segment";
        @uca("kind")
        private final String kind;
        @uca("segmentExternalId")
        private final String segmentExternalId;
        @uca("segmentationExternalId")
        private final String segmentationExternalId;
        @uca("segmentationInternalId")
        private final String segmentationInternalId;
        @uca(tmb.TYPE_JSON_NAME)
        private final String type;

        /* compiled from: TreeTargetingDto.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ltmb$g$a;", "", "", "SEGMENT_JSON_NAME", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: tmb$g$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public g(String str, String str2, String str3, String str4, String str5) {
            super(null);
            this.type = str;
            this.kind = str2;
            this.segmentationExternalId = str3;
            this.segmentationInternalId = str4;
            this.segmentExternalId = str5;
        }

        public static /* synthetic */ g copy$default(g gVar, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gVar.type;
            }
            if ((i & 2) != 0) {
                str2 = gVar.kind;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = gVar.segmentationExternalId;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = gVar.segmentationInternalId;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = gVar.segmentExternalId;
            }
            return gVar.copy(str, str6, str7, str8, str5);
        }

        public final String component1() {
            return this.type;
        }

        public final String component2() {
            return this.kind;
        }

        public final String component3() {
            return this.segmentationExternalId;
        }

        public final String component4() {
            return this.segmentationInternalId;
        }

        public final String component5() {
            return this.segmentExternalId;
        }

        public final g copy(String str, String str2, String str3, String str4, String str5) {
            return new g(str, str2, str3, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (z65.c(this.type, gVar.type) && z65.c(this.kind, gVar.kind) && z65.c(this.segmentationExternalId, gVar.segmentationExternalId) && z65.c(this.segmentationInternalId, gVar.segmentationInternalId) && z65.c(this.segmentExternalId, gVar.segmentExternalId)) {
                return true;
            }
            return false;
        }

        public final String getKind() {
            return this.kind;
        }

        public final String getSegmentExternalId() {
            return this.segmentExternalId;
        }

        public final String getSegmentationExternalId() {
            return this.segmentationExternalId;
        }

        public final String getSegmentationInternalId() {
            return this.segmentationInternalId;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
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
            String str3 = this.segmentationExternalId;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str4 = this.segmentationInternalId;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i5 = (i4 + hashCode4) * 31;
            String str5 = this.segmentExternalId;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return i5 + i;
        }

        public String toString() {
            return "SegmentNodeDto(type=" + this.type + ", kind=" + this.kind + ", segmentationExternalId=" + this.segmentationExternalId + ", segmentationInternalId=" + this.segmentationInternalId + ", segmentExternalId=" + this.segmentExternalId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: TreeTargetingDto.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Ltmb$h;", "Ltmb;", "", "component1", MessageAttributes.TYPE, "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: tmb$h */
    /* loaded from: classes.dex */
    public static final class h extends tmb {
        public static final a Companion = new a(null);
        public static final String TRUE_JSON_NAME = "true";
        @uca(tmb.TYPE_JSON_NAME)
        private final String type;

        /* compiled from: TreeTargetingDto.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ltmb$h$a;", "", "", "TRUE_JSON_NAME", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: tmb$h$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public h(String str) {
            super(null);
            this.type = str;
        }

        public static /* synthetic */ h copy$default(h hVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hVar.type;
            }
            return hVar.copy(str);
        }

        public final String component1() {
            return this.type;
        }

        public final h copy(String str) {
            return new h(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof h) && z65.c(this.type, ((h) obj).type)) {
                return true;
            }
            return false;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "TrueNodeDto(type=" + this.type + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: TreeTargetingDto.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B#\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004HÆ\u0003J)\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Ltmb$i;", "Ltmb;", "", "component1", "", "component2", MessageAttributes.TYPE, "nodes", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Ljava/util/List;", "getNodes", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: tmb$i */
    /* loaded from: classes.dex */
    public static final class i extends tmb {
        public static final a Companion = new a(null);
        public static final String OR_JSON_NAME = "or";
        @uca("nodes")
        private final List<tmb> nodes;
        @uca(tmb.TYPE_JSON_NAME)
        private final String type;

        /* compiled from: TreeTargetingDto.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ltmb$i$a;", "", "", "OR_JSON_NAME", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: tmb$i$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i(String str, List<? extends tmb> list) {
            super(null);
            this.type = str;
            this.nodes = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ i copy$default(i iVar, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = iVar.type;
            }
            if ((i & 2) != 0) {
                list = iVar.nodes;
            }
            return iVar.copy(str, list);
        }

        public final String component1() {
            return this.type;
        }

        public final List<tmb> component2() {
            return this.nodes;
        }

        public final i copy(String str, List<? extends tmb> list) {
            return new i(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (z65.c(this.type, iVar.type) && z65.c(this.nodes, iVar.nodes)) {
                return true;
            }
            return false;
        }

        public final List<tmb> getNodes() {
            return this.nodes;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode;
            String str = this.type;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            List<tmb> list = this.nodes;
            if (list != null) {
                i = list.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            return "UnionNodeDto(type=" + this.type + ", nodes=" + this.nodes + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: TreeTargetingDto.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001eB+\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J3\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Ltmb$j;", "Ltmb;", "", "component1", "component2", "", "Ltmb$j$b;", "component3", MessageAttributes.TYPE, "kind", "values", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getKind", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Companion", "a", "b", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: tmb$j */
    /* loaded from: classes.dex */
    public static final class j extends tmb {
        public static final a Companion = new a(null);
        public static final String VIEW_PRODUCT_CATEGORY_ID_IN_JSON_NAME = "viewProductCategoryIdIn";
        @uca("kind")
        private final String kind;
        @uca(tmb.TYPE_JSON_NAME)
        private final String type;
        @uca("values")
        private final List<b> values;

        /* compiled from: TreeTargetingDto.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ltmb$j$a;", "", "", "VIEW_PRODUCT_CATEGORY_ID_IN_JSON_NAME", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: tmb$j$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: TreeTargetingDto.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Ltmb$j$b;", "", "", "component1", "component2", "component3", "id", ShoppingInfoEntity.FIELD_EXTERNAL_ID, "externalSystemName", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getExternalId", "getExternalSystemName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: tmb$j$b */
        /* loaded from: classes.dex */
        public static final class b {
            @uca(ShoppingInfoEntity.FIELD_EXTERNAL_ID)
            private final String externalId;
            @uca("externalSystemName")
            private final String externalSystemName;
            @uca("id")
            private final String id;

            public b(String str, String str2, String str3) {
                this.id = str;
                this.externalId = str2;
                this.externalSystemName = str3;
            }

            public static /* synthetic */ b copy$default(b bVar, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.id;
                }
                if ((i & 2) != 0) {
                    str2 = bVar.externalId;
                }
                if ((i & 4) != 0) {
                    str3 = bVar.externalSystemName;
                }
                return bVar.copy(str, str2, str3);
            }

            public final String component1() {
                return this.id;
            }

            public final String component2() {
                return this.externalId;
            }

            public final String component3() {
                return this.externalSystemName;
            }

            public final b copy(String str, String str2, String str3) {
                return new b(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (z65.c(this.id, bVar.id) && z65.c(this.externalId, bVar.externalId) && z65.c(this.externalSystemName, bVar.externalSystemName)) {
                    return true;
                }
                return false;
            }

            public final String getExternalId() {
                return this.externalId;
            }

            public final String getExternalSystemName() {
                return this.externalSystemName;
            }

            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                String str = this.id;
                int i = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i2 = hashCode * 31;
                String str2 = this.externalId;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int i3 = (i2 + hashCode2) * 31;
                String str3 = this.externalSystemName;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return i3 + i;
            }

            public String toString() {
                return "ValueDto(id=" + this.id + ", externalId=" + this.externalId + ", externalSystemName=" + this.externalSystemName + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        public j(String str, String str2, List<b> list) {
            super(null);
            this.type = str;
            this.kind = str2;
            this.values = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ j copy$default(j jVar, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = jVar.type;
            }
            if ((i & 2) != 0) {
                str2 = jVar.kind;
            }
            if ((i & 4) != 0) {
                list = jVar.values;
            }
            return jVar.copy(str, str2, list);
        }

        public final String component1() {
            return this.type;
        }

        public final String component2() {
            return this.kind;
        }

        public final List<b> component3() {
            return this.values;
        }

        public final j copy(String str, String str2, List<b> list) {
            return new j(str, str2, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (z65.c(this.type, jVar.type) && z65.c(this.kind, jVar.kind) && z65.c(this.values, jVar.values)) {
                return true;
            }
            return false;
        }

        public final String getKind() {
            return this.kind;
        }

        public final String getType() {
            return this.type;
        }

        public final List<b> getValues() {
            return this.values;
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
            List<b> list = this.values;
            if (list != null) {
                i = list.hashCode();
            }
            return i3 + i;
        }

        public String toString() {
            return "ViewProductCategoryInNodeDto(type=" + this.type + ", kind=" + this.kind + ", values=" + this.values + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: TreeTargetingDto.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u001a"}, d2 = {"Ltmb$k;", "Ltmb;", "", "component1", "component2", "component3", MessageAttributes.TYPE, "kind", "value", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getKind", "getValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: tmb$k */
    /* loaded from: classes.dex */
    public static final class k extends tmb {
        public static final a Companion = new a(null);
        public static final String VIEW_PRODUCT_CATEGORY_ID_JSON_NAME = "viewProductCategoryId";
        @uca("kind")
        private final String kind;
        @uca(tmb.TYPE_JSON_NAME)
        private final String type;
        @uca("value")
        private final String value;

        /* compiled from: TreeTargetingDto.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ltmb$k$a;", "", "", "VIEW_PRODUCT_CATEGORY_ID_JSON_NAME", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: tmb$k$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public k(String str, String str2, String str3) {
            super(null);
            this.type = str;
            this.kind = str2;
            this.value = str3;
        }

        public static /* synthetic */ k copy$default(k kVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = kVar.type;
            }
            if ((i & 2) != 0) {
                str2 = kVar.kind;
            }
            if ((i & 4) != 0) {
                str3 = kVar.value;
            }
            return kVar.copy(str, str2, str3);
        }

        public final String component1() {
            return this.type;
        }

        public final String component2() {
            return this.kind;
        }

        public final String component3() {
            return this.value;
        }

        public final k copy(String str, String str2, String str3) {
            return new k(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (z65.c(this.type, kVar.type) && z65.c(this.kind, kVar.kind) && z65.c(this.value, kVar.value)) {
                return true;
            }
            return false;
        }

        public final String getKind() {
            return this.kind;
        }

        public final String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
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
            String str3 = this.value;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return i3 + i;
        }

        public String toString() {
            return "ViewProductCategoryNodeDto(type=" + this.type + ", kind=" + this.kind + ", value=" + this.value + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: TreeTargetingDto.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u001a"}, d2 = {"Ltmb$l;", "Ltmb;", "", "component1", "component2", "component3", MessageAttributes.TYPE, "kind", "value", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getKind", "getValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: tmb$l */
    /* loaded from: classes.dex */
    public static final class l extends tmb {
        public static final a Companion = new a(null);
        public static final String VIEW_PRODUCT_ID_JSON_NAME = "viewProductId";
        @uca("kind")
        private final String kind;
        @uca(tmb.TYPE_JSON_NAME)
        private final String type;
        @uca("value")
        private final String value;

        /* compiled from: TreeTargetingDto.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ltmb$l$a;", "", "", "VIEW_PRODUCT_ID_JSON_NAME", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: tmb$l$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public l(String str, String str2, String str3) {
            super(null);
            this.type = str;
            this.kind = str2;
            this.value = str3;
        }

        public static /* synthetic */ l copy$default(l lVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = lVar.type;
            }
            if ((i & 2) != 0) {
                str2 = lVar.kind;
            }
            if ((i & 4) != 0) {
                str3 = lVar.value;
            }
            return lVar.copy(str, str2, str3);
        }

        public final String component1() {
            return this.type;
        }

        public final String component2() {
            return this.kind;
        }

        public final String component3() {
            return this.value;
        }

        public final l copy(String str, String str2, String str3) {
            return new l(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (z65.c(this.type, lVar.type) && z65.c(this.kind, lVar.kind) && z65.c(this.value, lVar.value)) {
                return true;
            }
            return false;
        }

        public final String getKind() {
            return this.kind;
        }

        public final String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
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
            String str3 = this.value;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return i3 + i;
        }

        public String toString() {
            return "ViewProductNodeDto(type=" + this.type + ", kind=" + this.kind + ", value=" + this.value + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: TreeTargetingDto.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB9\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003JE\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006 "}, d2 = {"Ltmb$m;", "Ltmb;", "", "component1", "component2", "component3", "component4", "component5", MessageAttributes.TYPE, "kind", "segmentationExternalId", "segmentationInternalId", "segmentExternalId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getKind", "getSegmentationExternalId", "getSegmentationInternalId", "getSegmentExternalId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: tmb$m */
    /* loaded from: classes.dex */
    public static final class m extends tmb {
        public static final a Companion = new a(null);
        public static final String VIEW_PRODUCT_SEGMENT_JSON_NAME = "viewProductSegment";
        @uca("kind")
        private final String kind;
        @uca("segmentExternalId")
        private final String segmentExternalId;
        @uca("segmentationExternalId")
        private final String segmentationExternalId;
        @uca("segmentationInternalId")
        private final String segmentationInternalId;
        @uca(tmb.TYPE_JSON_NAME)
        private final String type;

        /* compiled from: TreeTargetingDto.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ltmb$m$a;", "", "", "VIEW_PRODUCT_SEGMENT_JSON_NAME", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: tmb$m$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public m(String str, String str2, String str3, String str4, String str5) {
            super(null);
            this.type = str;
            this.kind = str2;
            this.segmentationExternalId = str3;
            this.segmentationInternalId = str4;
            this.segmentExternalId = str5;
        }

        public static /* synthetic */ m copy$default(m mVar, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mVar.type;
            }
            if ((i & 2) != 0) {
                str2 = mVar.kind;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = mVar.segmentationExternalId;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = mVar.segmentationInternalId;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = mVar.segmentExternalId;
            }
            return mVar.copy(str, str6, str7, str8, str5);
        }

        public final String component1() {
            return this.type;
        }

        public final String component2() {
            return this.kind;
        }

        public final String component3() {
            return this.segmentationExternalId;
        }

        public final String component4() {
            return this.segmentationInternalId;
        }

        public final String component5() {
            return this.segmentExternalId;
        }

        public final m copy(String str, String str2, String str3, String str4, String str5) {
            return new m(str, str2, str3, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            if (z65.c(this.type, mVar.type) && z65.c(this.kind, mVar.kind) && z65.c(this.segmentationExternalId, mVar.segmentationExternalId) && z65.c(this.segmentationInternalId, mVar.segmentationInternalId) && z65.c(this.segmentExternalId, mVar.segmentExternalId)) {
                return true;
            }
            return false;
        }

        public final String getKind() {
            return this.kind;
        }

        public final String getSegmentExternalId() {
            return this.segmentExternalId;
        }

        public final String getSegmentationExternalId() {
            return this.segmentationExternalId;
        }

        public final String getSegmentationInternalId() {
            return this.segmentationInternalId;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
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
            String str3 = this.segmentationExternalId;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str4 = this.segmentationInternalId;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i5 = (i4 + hashCode4) * 31;
            String str5 = this.segmentExternalId;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return i5 + i;
        }

        public String toString() {
            return "ViewProductSegmentNodeDto(type=" + this.type + ", kind=" + this.kind + ", segmentationExternalId=" + this.segmentationExternalId + ", segmentationInternalId=" + this.segmentationInternalId + ", segmentExternalId=" + this.segmentExternalId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    private tmb() {
    }

    public /* synthetic */ tmb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
