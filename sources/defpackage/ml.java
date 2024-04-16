package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AnnotatedString.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B[\b\u0000\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0016\b\u0002\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0010\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010)\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u0010\u0018\u00010\u000f\u0012\u0018\b\u0002\u0010+\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0010\u0018\u00010\u000f¢\u0006\u0004\b1\u00102B=\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0014\b\u0002\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00100\u000f\u0012\u0014\b\u0002\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00100\u000f¢\u0006\u0004\b1\u00103J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u001b\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00100\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0007J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0010\u0018\u00010\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R(\u0010)\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u0010\u0018\u00010\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R*\u0010+\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0010\u0018\u00010\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b!\u0010$R\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00100\u000f8F¢\u0006\u0006\u001a\u0004\b,\u0010$R\u001d\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00100\u000f8F¢\u0006\u0006\u001a\u0004\b*\u0010$R\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00064"}, d2 = {"Lml;", "", "", "index", "", "a", "startIndex", "endIndex", "k", "Ljcb;", "range", "l", "(J)Lml;", "start", "end", "", "Lml$a;", "Ljnb;", "i", "Lstb;", "j", "", "other", "", "equals", "hashCode", "", "toString", "Ljava/lang/String;", Image.TYPE_HIGH, "()Ljava/lang/String;", "text", "Lvqa;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "spanStylesOrNull", "Ljq7;", c.a, e.a, "paragraphStylesOrNull", DateTokenConverter.CONVERTER_KEY, "annotations", "f", "spanStyles", "paragraphStyles", "()I", "length", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ml  reason: default package */
/* loaded from: classes.dex */
public final class ml implements CharSequence {
    private final String a;
    private final List<a<vqa>> b;
    private final List<a<jq7>> c;
    private final List<a<? extends Object>> d;

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ml$b */
    /* loaded from: classes.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((a) t).f()), Integer.valueOf(((a) t2).f()));
            return d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
        r3 = defpackage.sc1.y0(r5, new defpackage.ml.b());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ml(java.lang.String r3, java.util.List<defpackage.ml.a<defpackage.vqa>> r4, java.util.List<defpackage.ml.a<defpackage.jq7>> r5, java.util.List<? extends defpackage.ml.a<? extends java.lang.Object>> r6) {
        /*
            r2 = this;
            java.lang.String r0 = "text"
            defpackage.z65.h(r3, r0)
            r2.<init>()
            r2.a = r3
            r2.b = r4
            r2.c = r5
            r2.d = r6
            if (r5 == 0) goto L82
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            ml$b r3 = new ml$b
            r3.<init>()
            java.util.List r3 = defpackage.ic1.y0(r5, r3)
            if (r3 == 0) goto L82
            int r4 = r3.size()
            r5 = -1
            r6 = 0
        L25:
            if (r6 >= r4) goto L82
            java.lang.Object r0 = r3.get(r6)
            ml$a r0 = (defpackage.ml.a) r0
            int r1 = r0.f()
            if (r1 < r5) goto L76
            int r5 = r0.d()
            java.lang.String r1 = r2.a
            int r1 = r1.length()
            if (r5 > r1) goto L46
            int r5 = r0.d()
            int r6 = r6 + 1
            goto L25
        L46:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ParagraphStyle range ["
            r3.append(r4)
            int r4 = r0.f()
            r3.append(r4)
            java.lang.String r4 = ", "
            r3.append(r4)
            int r4 = r0.d()
            r3.append(r4)
            java.lang.String r4 = ") is out of boundary"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L76:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "ParagraphStyle should not overlap"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml.<init>(java.lang.String, java.util.List, java.util.List, java.util.List):void");
    }

    public char a(int i) {
        return this.a.charAt(i);
    }

    public final List<a<? extends Object>> b() {
        return this.d;
    }

    public int c() {
        return this.a.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return a(i);
    }

    public final List<a<jq7>> d() {
        List<a<jq7>> l;
        List<a<jq7>> list = this.c;
        if (list == null) {
            l = kc1.l();
            return l;
        }
        return list;
    }

    public final List<a<jq7>> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml)) {
            return false;
        }
        ml mlVar = (ml) obj;
        if (z65.c(this.a, mlVar.a) && z65.c(this.b, mlVar.b) && z65.c(this.c, mlVar.c) && z65.c(this.d, mlVar.d)) {
            return true;
        }
        return false;
    }

    public final List<a<vqa>> f() {
        List<a<vqa>> l;
        List<a<vqa>> list = this.b;
        if (list == null) {
            l = kc1.l();
            return l;
        }
        return list;
    }

    public final List<a<vqa>> g() {
        return this.b;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = this.a.hashCode() * 31;
        List<a<vqa>> list = this.b;
        int i3 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        List<a<jq7>> list2 = this.c;
        if (list2 != null) {
            i2 = list2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        List<a<? extends Object>> list3 = this.d;
        if (list3 != null) {
            i3 = list3.hashCode();
        }
        return i5 + i3;
    }

    public final List<a<jnb>> i(int i, int i2) {
        List l;
        List<a<? extends Object>> list = this.d;
        if (list == null) {
            l = kc1.l();
        } else {
            l = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                a<? extends Object> aVar = list.get(i3);
                a<? extends Object> aVar2 = aVar;
                if ((aVar2.e() instanceof jnb) && nl.f(i, i2, aVar2.f(), aVar2.d())) {
                    l.add(aVar);
                }
            }
        }
        z65.f(l, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return l;
    }

    public final List<a<stb>> j(int i, int i2) {
        List l;
        List<a<? extends Object>> list = this.d;
        if (list == null) {
            l = kc1.l();
        } else {
            l = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                a<? extends Object> aVar = list.get(i3);
                a<? extends Object> aVar2 = aVar;
                if ((aVar2.e() instanceof stb) && nl.f(i, i2, aVar2.f(), aVar2.d())) {
                    l.add(aVar);
                }
            }
        }
        z65.f(l, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return l;
    }

    @Override // java.lang.CharSequence
    /* renamed from: k */
    public ml subSequence(int i, int i2) {
        if (i <= i2) {
            if (i == 0 && i2 == this.a.length()) {
                return this;
            }
            String substring = this.a.substring(i, i2);
            z65.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new ml(substring, nl.a(this.b, i, i2), nl.a(this.c, i, i2), nl.a(this.d, i, i2));
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public final ml l(long j) {
        return subSequence(jcb.i(j), jcb.h(j));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.a;
    }

    /* compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cB!\b\u0016\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001dJ\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0010\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lml$a;", "T", "", "a", "()Ljava/lang/Object;", "", "b", c.a, "", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Object;", e.a, "item", "I", "f", "()I", "start", DateTokenConverter.CONVERTER_KEY, "end", "Ljava/lang/String;", "g", "()Ljava/lang/String;", RemoteMessageConst.Notification.TAG, "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ml$a */
    /* loaded from: classes.dex */
    public static final class a<T> {
        private final T a;
        private final int b;
        private final int c;
        private final String d;

        public a(T t, int i, int i2, String str) {
            z65.h(str, RemoteMessageConst.Notification.TAG);
            this.a = t;
            this.b = i;
            this.c = i2;
            this.d = str;
            if (i > i2) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public final T a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public final int d() {
            return this.c;
        }

        public final T e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && z65.c(this.d, aVar.d)) {
                return true;
            }
            return false;
        }

        public final int f() {
            return this.b;
        }

        public final String g() {
            return this.d;
        }

        public int hashCode() {
            int hashCode;
            T t = this.a;
            if (t == null) {
                hashCode = 0;
            } else {
                hashCode = t.hashCode();
            }
            return (((((hashCode * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public a(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    public /* synthetic */ ml(String str, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }

    public /* synthetic */ ml(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? kc1.l() : list, (i & 4) != 0 ? kc1.l() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ml(java.lang.String r3, java.util.List<defpackage.ml.a<defpackage.vqa>> r4, java.util.List<defpackage.ml.a<defpackage.jq7>> r5) {
        /*
            r2 = this;
            java.lang.String r0 = "text"
            defpackage.z65.h(r3, r0)
            java.lang.String r0 = "spanStyles"
            defpackage.z65.h(r4, r0)
            java.lang.String r0 = "paragraphStyles"
            defpackage.z65.h(r5, r0)
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L19
            r4 = r1
        L19:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L24
            r5 = r1
        L24:
            java.util.List r5 = (java.util.List) r5
            r2.<init>(r3, r4, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml.<init>(java.lang.String, java.util.List, java.util.List):void");
    }
}
