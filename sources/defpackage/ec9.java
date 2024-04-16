package defpackage;

import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\u0002\t\rB\u0011\b\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0004J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\nJ\b\u0010\u0017\u001a\u00020\u0011H\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001f"}, d2 = {"Lec9;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "input", "", "f", "a", "", "startIndex", "Lkotlin/text/MatchResult;", "b", "Lkotlin/sequences/Sequence;", com.huawei.hms.opendevice.c.a, e.a, "", "replacement", "i", "limit", "", "j", "toString", "Ljava/util/regex/Pattern;", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "pattern", "(Ljava/lang/String;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: ec9  reason: default package */
/* loaded from: classes3.dex */
public final class ec9 implements Serializable {
    public static final a b = new a(null);
    private final Pattern a;

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lec9$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ec9$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\u0006B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0002R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lec9$b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "", "a", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "pattern", "", "b", "I", "getFlags", "()I", "flags", "<init>", "(Ljava/lang/String;I)V", com.huawei.hms.opendevice.c.a, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ec9$b */
    /* loaded from: classes3.dex */
    private static final class b implements Serializable {
        public static final a c = new a(null);
        private final String a;
        private final int b;

        /* compiled from: Regex.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lec9$b$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ec9$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public b(String str, int i) {
            z65.h(str, "pattern");
            this.a = str;
            this.b = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.a, this.b);
            z65.g(compile, "compile(...)");
            return new ec9(compile);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/text/MatchResult;", "a", "()Lkotlin/text/MatchResult;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ec9$c */
    /* loaded from: classes3.dex */
    public static final class c extends ej5 implements Function0<MatchResult> {
        final /* synthetic */ CharSequence b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence, int i) {
            super(0);
            this.b = charSequence;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final MatchResult invoke() {
            return ec9.this.b(this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Regex.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ec9$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class d extends m94 implements Function1<MatchResult, MatchResult> {
        public static final d a = new d();

        d() {
            super(1, MatchResult.class, StatisticManager.NEXT, "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final MatchResult invoke(MatchResult matchResult) {
            z65.h(matchResult, "p0");
            return matchResult.next();
        }
    }

    public ec9(Pattern pattern) {
        z65.h(pattern, "nativePattern");
        this.a = pattern;
    }

    public static /* synthetic */ Sequence d(ec9 ec9Var, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ec9Var.c(charSequence, i);
    }

    private final Object writeReplace() {
        String pattern = this.a.pattern();
        z65.g(pattern, "pattern(...)");
        return new b(pattern, this.a.flags());
    }

    public final boolean a(CharSequence charSequence) {
        z65.h(charSequence, "input");
        return this.a.matcher(charSequence).find();
    }

    public final MatchResult b(CharSequence charSequence, int i) {
        z65.h(charSequence, "input");
        Matcher matcher = this.a.matcher(charSequence);
        z65.g(matcher, "matcher(...)");
        return hc9.a(matcher, i, charSequence);
    }

    public final Sequence<MatchResult> c(CharSequence charSequence, int i) {
        z65.h(charSequence, "input");
        if (i >= 0 && i <= charSequence.length()) {
            return yba.f(new c(charSequence, i), d.a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
    }

    public final MatchResult e(CharSequence charSequence) {
        z65.h(charSequence, "input");
        Matcher matcher = this.a.matcher(charSequence);
        z65.g(matcher, "matcher(...)");
        return hc9.b(matcher, charSequence);
    }

    public final boolean f(CharSequence charSequence) {
        z65.h(charSequence, "input");
        return this.a.matcher(charSequence).matches();
    }

    public final String i(CharSequence charSequence, String str) {
        z65.h(charSequence, "input");
        z65.h(str, "replacement");
        String replaceAll = this.a.matcher(charSequence).replaceAll(str);
        z65.g(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final List<String> j(CharSequence charSequence, int i) {
        List<String> e;
        z65.h(charSequence, "input");
        m0b.t0(i);
        Matcher matcher = this.a.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            e = jc1.e(charSequence.toString());
            return e;
        }
        int i2 = 10;
        if (i > 0) {
            i2 = i.h(i, 10);
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i - 1;
        int i4 = 0;
        do {
            arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            if (i3 >= 0 && arrayList.size() == i3) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.a.toString();
        z65.g(pattern, "toString(...)");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ec9(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            defpackage.z65.h(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            defpackage.z65.g(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ec9.<init>(java.lang.String):void");
    }
}
