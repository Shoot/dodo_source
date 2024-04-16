package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u001f¨\u0006#"}, d2 = {"Lw96;", "Lkotlin/text/MatchResult;", StatisticManager.NEXT, "Ljava/util/regex/Matcher;", "a", "Ljava/util/regex/Matcher;", "matcher", "", "b", "Ljava/lang/CharSequence;", "input", "Lt96;", c.a, "Lt96;", "()Lt96;", "groups", "", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "groupValues_", "Ljava/util/regex/MatchResult;", e.a, "()Ljava/util/regex/MatchResult;", "matchResult", "Lkotlin/ranges/IntRange;", "()Lkotlin/ranges/IntRange;", "range", "getValue", "()Ljava/lang/String;", "value", "()Ljava/util/List;", "groupValues", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: w96  reason: default package */
/* loaded from: classes3.dex */
public final class w96 implements MatchResult {
    private final Matcher a;
    private final CharSequence b;
    private final t96 c;
    private List<String> d;

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"w96$a", "Ln1;", "", "", "index", "k", DateTokenConverter.CONVERTER_KEY, "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w96$a */
    /* loaded from: classes3.dex */
    public static final class a extends n1<String> {
        a() {
        }

        @Override // defpackage.c1, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return contains((String) obj);
            }
            return false;
        }

        @Override // defpackage.c1
        public int d() {
            return w96.this.e().groupCount() + 1;
        }

        @Override // defpackage.n1, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return u((String) obj);
        }

        @Override // defpackage.n1, java.util.List
        /* renamed from: k */
        public String get(int i) {
            String group = w96.this.e().group(i);
            if (group == null) {
                return "";
            }
            return group;
        }

        @Override // defpackage.n1, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return x((String) obj);
        }

        public /* bridge */ int u(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int x(String str) {
            return super.lastIndexOf(str);
        }

        public /* bridge */ boolean contains(String str) {
            return super.contains((a) str);
        }
    }

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006H\u0096\u0002J\u0013\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0096\u0002R\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"w96$b", "", "Lc1;", "Lkotlin/text/MatchGroup;", "", "isEmpty", "", "iterator", "", "index", "get", DateTokenConverter.CONVERTER_KEY, "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w96$b */
    /* loaded from: classes3.dex */
    public static final class b extends c1<MatchGroup> implements t96 {

        /* compiled from: Regex.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/text/MatchGroup;", "a", "(I)Lkotlin/text/MatchGroup;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w96$b$a */
        /* loaded from: classes3.dex */
        static final class a extends ej5 implements Function1<Integer, MatchGroup> {
            a() {
                super(1);
            }

            public final MatchGroup a(int i) {
                return b.this.get(i);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ MatchGroup invoke(Integer num) {
                return a(num.intValue());
            }
        }

        b() {
        }

        @Override // defpackage.c1, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj != null && !(obj instanceof MatchGroup)) {
                return false;
            }
            return k((MatchGroup) obj);
        }

        @Override // defpackage.c1
        public int d() {
            return w96.this.e().groupCount() + 1;
        }

        @Override // defpackage.t96
        public MatchGroup get(int i) {
            IntRange h;
            h = hc9.h(w96.this.e(), i);
            if (h.z().intValue() >= 0) {
                String group = w96.this.e().group(i);
                z65.g(group, "group(...)");
                return new MatchGroup(group, h);
            }
            return null;
        }

        @Override // defpackage.c1, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<MatchGroup> iterator() {
            IntRange m;
            Sequence P;
            Sequence q;
            m = kc1.m(this);
            P = sc1.P(m);
            q = dca.q(P, new a());
            return q.iterator();
        }

        public /* bridge */ boolean k(MatchGroup matchGroup) {
            return super.contains(matchGroup);
        }
    }

    public w96(Matcher matcher, CharSequence charSequence) {
        z65.h(matcher, "matcher");
        z65.h(charSequence, "input");
        this.a = matcher;
        this.b = charSequence;
        this.c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.regex.MatchResult e() {
        return this.a;
    }

    @Override // kotlin.text.MatchResult
    public List<String> a() {
        if (this.d == null) {
            this.d = new a();
        }
        List<String> list = this.d;
        z65.e(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    public IntRange b() {
        IntRange g;
        g = hc9.g(e());
        return g;
    }

    @Override // kotlin.text.MatchResult
    public t96 c() {
        return this.c;
    }

    @Override // kotlin.text.MatchResult
    public String getValue() {
        String group = e().group();
        z65.g(group, "group(...)");
        return group;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult next() {
        int i;
        MatchResult e;
        int end = e().end();
        if (e().end() == e().start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 <= this.b.length()) {
            Matcher matcher = this.a.pattern().matcher(this.b);
            z65.g(matcher, "matcher(...)");
            e = hc9.e(matcher, i2, this.b);
            return e;
        }
        return null;
    }
}
