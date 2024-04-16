package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Headers.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000b\u0018\u0000 \"2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u0019\"B\u0017\b\u0000\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0004\b \u0010!J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0004\u001a\u00020\u0003J\u001b\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u000eH\u0096\u0002J\u0006\u0010\u0011\u001a\u00020\u0010J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lgn4;", "", "Lkotlin/Pair;", "", Action.NAME_ATTRIBUTE, DateTokenConverter.CONVERTER_KEY, "", "index", Image.TYPE_HIGH, "u", "", "k", "", "v", "", "iterator", "Lgn4$a;", "p", "", "other", "", "equals", "hashCode", "toString", "", "a", "[Ljava/lang/String;", "g", "()[Ljava/lang/String;", "namesAndValues", "size", "()I", "<init>", "([Ljava/lang/String;)V", "b", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: gn4  reason: default package */
/* loaded from: classes3.dex */
public final class gn4 implements Iterable<Pair<? extends String, ? extends String>>, be5 {
    public static final b b = new b(null);
    private final String[] a;

    /* compiled from: Headers.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002J\u0019\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u0012\u001a\u00020\nR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lgn4$a;", "", "", "line", c.a, "(Ljava/lang/String;)Lgn4$a;", Action.NAME_ATTRIBUTE, "value", "a", e.a, "Lgn4;", "headers", "b", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;)Lgn4$a;", "i", "j", "g", "f", "", "Ljava/util/List;", Image.TYPE_HIGH, "()Ljava/util/List;", "namesAndValues", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gn4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final List<String> a = new ArrayList(20);

        public final a a(String str, String str2) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(str2, "value");
            return qdc.b(this, str, str2);
        }

        public final a b(gn4 gn4Var) {
            z65.h(gn4Var, "headers");
            return qdc.c(this, gn4Var);
        }

        public final a c(String str) {
            int Y;
            z65.h(str, "line");
            Y = m0b.Y(str, CoreConstants.COLON_CHAR, 1, false, 4, null);
            if (Y != -1) {
                String substring = str.substring(0, Y);
                z65.g(substring, "substring(...)");
                String substring2 = str.substring(Y + 1);
                z65.g(substring2, "substring(...)");
                d(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                z65.g(substring3, "substring(...)");
                d("", substring3);
            } else {
                d("", str);
            }
            return this;
        }

        public final a d(String str, String str2) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(str2, "value");
            return qdc.d(this, str, str2);
        }

        public final a e(String str, String str2) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(str2, "value");
            qdc.s(str);
            d(str, str2);
            return this;
        }

        public final gn4 f() {
            return qdc.e(this);
        }

        public final String g(String str) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            return qdc.g(this, str);
        }

        public final List<String> h() {
            return this.a;
        }

        public final a i(String str) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            return qdc.n(this, str);
        }

        public final a j(String str, String str2) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(str2, "value");
            return qdc.o(this, str, str2);
        }
    }

    /* compiled from: Headers.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lgn4$b;", "", "", "", "namesAndValues", "Lgn4;", "a", "([Ljava/lang/String;)Lgn4;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gn4$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gn4 a(String... strArr) {
            z65.h(strArr, "namesAndValues");
            return qdc.j((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    public gn4(String[] strArr) {
        z65.h(strArr, "namesAndValues");
        this.a = strArr;
    }

    public static final gn4 t(String... strArr) {
        return b.a(strArr);
    }

    public final String d(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        return qdc.i(this.a, str);
    }

    public boolean equals(Object obj) {
        return qdc.f(this, obj);
    }

    public final String[] g() {
        return this.a;
    }

    public final String h(int i) {
        return qdc.l(this, i);
    }

    public int hashCode() {
        return qdc.h(this);
    }

    @Override // java.lang.Iterable
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        return qdc.k(this);
    }

    public final Set<String> k() {
        Comparator x;
        x = l0b.x(pza.a);
        TreeSet treeSet = new TreeSet(x);
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(h(i));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        z65.g(unmodifiableSet, "unmodifiableSet(...)");
        return unmodifiableSet;
    }

    public final a p() {
        return qdc.m(this);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public String toString() {
        return qdc.p(this);
    }

    public final String u(int i) {
        return qdc.q(this, i);
    }

    public final List<String> v(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        return qdc.r(this, str);
    }
}
