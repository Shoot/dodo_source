package defpackage;

import android.annotation.SuppressLint;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TableInfo.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0005\t\u000e\u0013\u0017\u001bBC\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u001c"}, d2 = {"Lu5b;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", Action.NAME_ATTRIBUTE, "", "Lu5b$a;", "b", "Ljava/util/Map;", "columns", "", "Lu5b$c;", com.huawei.hms.opendevice.c.a, "Ljava/util/Set;", "foreignKeys", "Lu5b$e;", DateTokenConverter.CONVERTER_KEY, "indices", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V", com.huawei.hms.push.e.a, "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: u5b  reason: default package */
/* loaded from: classes.dex */
public final class u5b {
    public static final b e = new b(null);
    public final String a;
    public final Map<String, a> b;
    public final Set<c> c;
    public final Set<e> d;

    /* compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0005B9\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u0012\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lu5b$a;", "", "", MessageAttributes.TYPE, "", "a", "other", "", "equals", "hashCode", "toString", "Ljava/lang/String;", Action.NAME_ATTRIBUTE, "b", com.huawei.hms.opendevice.c.a, "Z", "notNull", DateTokenConverter.CONVERTER_KEY, "I", "primaryKeyPosition", com.huawei.hms.push.e.a, "defaultValue", "f", "createdFrom", "g", "getAffinity$annotations", "()V", "affinity", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V", Image.TYPE_HIGH, "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: u5b$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static final C0682a h = new C0682a(null);
        public final String a;
        public final String b;
        public final boolean c;
        public final int d;
        public final String e;
        public final int f;
        public final int g;

        /* compiled from: TableInfo.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\n"}, d2 = {"Lu5b$a$a;", "", "", "current", "", "a", "other", "b", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: u5b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0682a {
            private C0682a() {
            }

            public /* synthetic */ C0682a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        return false;
                    }
                    i++;
                    i3 = i4;
                }
                if (i2 != 0) {
                    return false;
                }
                return true;
            }

            @SuppressLint({"SyntheticAccessor"})
            public final boolean b(String str, String str2) {
                CharSequence R0;
                z65.h(str, "current");
                if (z65.c(str, str2)) {
                    return true;
                }
                if (a(str)) {
                    String substring = str.substring(1, str.length() - 1);
                    z65.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    R0 = m0b.R0(substring);
                    return z65.c(R0.toString(), str2);
                }
                return false;
            }
        }

        public a(String str, String str2, boolean z, int i, String str3, int i2) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(str2, MessageAttributes.TYPE);
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = i;
            this.e = str3;
            this.f = i2;
            this.g = a(str2);
        }

        private final int a(String str) {
            boolean O;
            boolean O2;
            boolean O3;
            boolean O4;
            boolean O5;
            boolean O6;
            boolean O7;
            boolean O8;
            if (str == null) {
                return 5;
            }
            Locale locale = Locale.US;
            z65.g(locale, "US");
            String upperCase = str.toUpperCase(locale);
            z65.g(upperCase, "this as java.lang.String).toUpperCase(locale)");
            O = m0b.O(upperCase, "INT", false, 2, null);
            if (!O) {
                O2 = m0b.O(upperCase, "CHAR", false, 2, null);
                if (!O2) {
                    O3 = m0b.O(upperCase, "CLOB", false, 2, null);
                    if (!O3) {
                        O4 = m0b.O(upperCase, "TEXT", false, 2, null);
                        if (!O4) {
                            O5 = m0b.O(upperCase, "BLOB", false, 2, null);
                            if (O5) {
                                return 5;
                            }
                            O6 = m0b.O(upperCase, "REAL", false, 2, null);
                            if (!O6) {
                                O7 = m0b.O(upperCase, "FLOA", false, 2, null);
                                if (!O7) {
                                    O8 = m0b.O(upperCase, "DOUB", false, 2, null);
                                    if (!O8) {
                                        return 1;
                                    }
                                    return 4;
                                }
                                return 4;
                            }
                            return 4;
                        }
                    }
                }
                return 2;
            }
            return 3;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.d != ((a) obj).d) {
                return false;
            }
            a aVar = (a) obj;
            if (!z65.c(this.a, aVar.a) || this.c != aVar.c) {
                return false;
            }
            if (this.f == 1 && aVar.f == 2 && (str3 = this.e) != null && !h.b(str3, aVar.e)) {
                return false;
            }
            if (this.f == 2 && aVar.f == 1 && (str2 = aVar.e) != null && !h.b(str2, this.e)) {
                return false;
            }
            int i = this.f;
            if ((i == 0 || i != aVar.f || ((str = this.e) == null ? aVar.e == null : h.b(str, aVar.e))) && this.g == aVar.g) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = ((this.a.hashCode() * 31) + this.g) * 31;
            if (this.c) {
                i = 1231;
            } else {
                i = 1237;
            }
            return ((hashCode + i) * 31) + this.d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.a);
            sb.append("', type='");
            sb.append(this.b);
            sb.append("', affinity='");
            sb.append(this.g);
            sb.append("', notNull=");
            sb.append(this.c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.d);
            sb.append(", defaultValue='");
            String str = this.e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }
    }

    /* compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lu5b$b;", "", "Ly2b;", "database", "", "tableName", "Lu5b;", "a", "", "CREATED_FROM_DATABASE", "I", "CREATED_FROM_ENTITY", "CREATED_FROM_UNKNOWN", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: u5b$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u5b a(y2b y2bVar, String str) {
            z65.h(y2bVar, "database");
            z65.h(str, "tableName");
            return v5b.f(y2bVar, str);
        }
    }

    /* compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Lu5b$c;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "referenceTable", "b", "onDelete", com.huawei.hms.opendevice.c.a, "onUpdate", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "columnNames", com.huawei.hms.push.e.a, "referenceColumnNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: u5b$c */
    /* loaded from: classes.dex */
    public static final class c {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public c(String str, String str2, String str3, List<String> list, List<String> list2) {
            z65.h(str, "referenceTable");
            z65.h(str2, "onDelete");
            z65.h(str3, "onUpdate");
            z65.h(list, "columnNames");
            z65.h(list2, "referenceColumnNames");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = list;
            this.e = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!z65.c(this.a, cVar.a) || !z65.c(this.b, cVar.b) || !z65.c(this.c, cVar.c) || !z65.c(this.d, cVar.d)) {
                return false;
            }
            return z65.c(this.e, cVar.e);
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + " +', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + CoreConstants.CURLY_RIGHT;
        }
    }

    /* compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0017"}, d2 = {"Lu5b$d;", "", "other", "", "a", "I", Image.TYPE_HIGH, "()I", "id", "b", "getSequence", "sequence", "", com.huawei.hms.opendevice.c.a, "Ljava/lang/String;", "g", "()Ljava/lang/String;", RemoteMessageConst.FROM, DateTokenConverter.CONVERTER_KEY, "i", RemoteMessageConst.TO, "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: u5b$d */
    /* loaded from: classes.dex */
    public static final class d implements Comparable<d> {
        private final int a;
        private final int b;
        private final String c;
        private final String d;

        public d(int i, int i2, String str, String str2) {
            z65.h(str, RemoteMessageConst.FROM);
            z65.h(str2, RemoteMessageConst.TO);
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            z65.h(dVar, "other");
            int i = this.a - dVar.a;
            if (i == 0) {
                return this.b - dVar.b;
            }
            return i;
        }

        public final String g() {
            return this.c;
        }

        public final int h() {
            return this.a;
        }

        public final String i() {
            return this.d;
        }
    }

    public u5b(String str, Map<String, a> map, Set<c> set, Set<e> set2) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(map, "columns");
        z65.h(set, "foreignKeys");
        this.a = str;
        this.b = map;
        this.c = set;
        this.d = set2;
    }

    public static final u5b a(y2b y2bVar, String str) {
        return e.a(y2bVar, str);
    }

    public boolean equals(Object obj) {
        Set<e> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5b)) {
            return false;
        }
        u5b u5bVar = (u5b) obj;
        if (!z65.c(this.a, u5bVar.a) || !z65.c(this.b, u5bVar.b) || !z65.c(this.c, u5bVar.c)) {
            return false;
        }
        Set<e> set2 = this.d;
        if (set2 == null || (set = u5bVar.d) == null) {
            return true;
        }
        return z65.c(set2, set);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + CoreConstants.CURLY_RIGHT;
    }

    /* compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\tB3\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0004\b\u0015\u0010\u0016B'\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0004\b\u0015\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0019"}, d2 = {"Lu5b$e;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", Action.NAME_ATTRIBUTE, "b", "Z", "unique", "", com.huawei.hms.opendevice.c.a, "Ljava/util/List;", "columns", DateTokenConverter.CONVERTER_KEY, "orders", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;ZLjava/util/List;)V", com.huawei.hms.push.e.a, "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: u5b$e */
    /* loaded from: classes.dex */
    public static final class e {
        public static final a e = new a(null);
        public final String a;
        public final boolean b;
        public final List<String> c;
        public List<String> d;

        /* compiled from: TableInfo.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lu5b$e$a;", "", "", "DEFAULT_PREFIX", "Ljava/lang/String;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: u5b$e$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public e(String str, boolean z, List<String> list, List<String> list2) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(list, "columns");
            z65.h(list2, "orders");
            this.a = str;
            this.b = z;
            this.c = list;
            this.d = list2;
            List<String> list3 = list2;
            if (list3.isEmpty()) {
                int size = list.size();
                list3 = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    list3.add(j05.ASC.name());
                }
            }
            this.d = (List) list3;
        }

        public boolean equals(Object obj) {
            boolean J;
            boolean J2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.b == eVar.b && z65.c(this.c, eVar.c) && z65.c(this.d, eVar.d)) {
                J = l0b.J(this.a, "index_", false, 2, null);
                if (J) {
                    J2 = l0b.J(eVar.a, "index_", false, 2, null);
                    return J2;
                }
                return z65.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            boolean J;
            int hashCode;
            J = l0b.J(this.a, "index_", false, 2, null);
            if (J) {
                hashCode = -1184239155;
            } else {
                hashCode = this.a.hashCode();
            }
            return (((((hashCode * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + ", orders=" + this.d + "'}";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e(java.lang.String r5, boolean r6, java.util.List<java.lang.String> r7) {
            /*
                r4 = this;
                java.lang.String r0 = "name"
                defpackage.z65.h(r5, r0)
                java.lang.String r0 = "columns"
                defpackage.z65.h(r7, r0)
                int r0 = r7.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 0
            L14:
                if (r2 >= r0) goto L22
                j05 r3 = defpackage.j05.ASC
                java.lang.String r3 = r3.name()
                r1.add(r3)
                int r2 = r2 + 1
                goto L14
            L22:
                r4.<init>(r5, r6, r7, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.u5b.e.<init>(java.lang.String, boolean, java.util.List):void");
        }
    }
}
