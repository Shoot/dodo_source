package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.ranges.i;
import kotlin.sequences.Sequence;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Strings.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012&\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00100\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR4\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lku2;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "", "iterator", "", "a", "Ljava/lang/CharSequence;", "input", "", "b", "I", "startIndex", c.a, "limit", "Lkotlin/Function2;", "Lkotlin/Pair;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function2;", "getNextMatch", "<init>", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: ku2  reason: default package */
/* loaded from: classes3.dex */
public final class ku2 implements Sequence<IntRange> {
    private final CharSequence a;
    private final int b;
    private final int c;
    private final Function2<CharSequence, Integer, Pair<Integer, Integer>> d;

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0002R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0015\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000e¨\u0006!"}, d2 = {"ku2$a", "", "Lkotlin/ranges/IntRange;", "", "b", c.a, "", "hasNext", "", "a", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "getCurrentStartIndex", "setCurrentStartIndex", "currentStartIndex", "getNextSearchIndex", "setNextSearchIndex", "nextSearchIndex", DateTokenConverter.CONVERTER_KEY, "Lkotlin/ranges/IntRange;", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextItem", e.a, "getCounter", "setCounter", "counter", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ku2$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<IntRange>, be5 {
        private int a = -1;
        private int b;
        private int c;
        private IntRange d;
        private int e;

        a() {
            int l;
            l = i.l(ku2.this.b, 0, ku2.this.a.length());
            this.b = l;
            this.c = l;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < r6.f.c) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void b() {
            /*
                r6 = this;
                int r0 = r6.c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.a = r1
                r0 = 0
                r6.d = r0
                goto L9e
            Lc:
                ku2 r0 = defpackage.ku2.this
                int r0 = defpackage.ku2.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.e
                int r0 = r0 + r3
                r6.e = r0
                ku2 r4 = defpackage.ku2.this
                int r4 = defpackage.ku2.d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.c
                ku2 r4 = defpackage.ku2.this
                java.lang.CharSequence r4 = defpackage.ku2.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
                int r1 = r6.b
                ku2 r4 = defpackage.ku2.this
                java.lang.CharSequence r4 = defpackage.ku2.c(r4)
                int r4 = defpackage.m0b.T(r4)
                r0.<init>(r1, r4)
                r6.d = r0
                r6.c = r2
                goto L9c
            L47:
                ku2 r0 = defpackage.ku2.this
                kotlin.jvm.functions.Function2 r0 = defpackage.ku2.b(r0)
                ku2 r4 = defpackage.ku2.this
                java.lang.CharSequence r4 = defpackage.ku2.c(r4)
                int r5 = r6.c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L77
                kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
                int r1 = r6.b
                ku2 r4 = defpackage.ku2.this
                java.lang.CharSequence r4 = defpackage.ku2.c(r4)
                int r4 = defpackage.m0b.T(r4)
                r0.<init>(r1, r4)
                r6.d = r0
                r6.c = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.b
                kotlin.ranges.IntRange r4 = kotlin.ranges.g.q(r4, r2)
                r6.d = r4
                int r2 = r2 + r0
                r6.b = r2
                if (r0 != 0) goto L99
                r1 = 1
            L99:
                int r2 = r2 + r1
                r6.c = r2
            L9c:
                r6.a = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ku2.a.b():void");
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public IntRange next() {
            if (this.a == -1) {
                b();
            }
            if (this.a != 0) {
                IntRange intRange = this.d;
                z65.f(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.d = null;
                this.a = -1;
                return intRange;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a == -1) {
                b();
            }
            if (this.a == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ku2(CharSequence charSequence, int i, int i2, Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> function2) {
        z65.h(charSequence, "input");
        z65.h(function2, "getNextMatch");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = function2;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<IntRange> iterator() {
        return new a();
    }
}
