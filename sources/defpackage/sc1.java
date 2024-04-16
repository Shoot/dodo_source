package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.i;
import kotlin.sequences.Sequence;
/* compiled from: _Collections.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0013\u0010\u000f\u001a\u001f\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0014\u0010\u0012\u001a'\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u0017\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0019\u0010\u000f\u001a\u001d\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u001a\u0010\u0012\u001a\u001f\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u001b\u0010\u0012\u001a'\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b!\u0010\u000f\u001a\u001d\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\"\u0010\u0012\u001a\u001f\u0010#\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b#\u0010\u000f\u001a\u001f\u0010$\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b$\u0010\u0012\u001a$\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010%\u001a\u00020\u0006\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010%\u001a\u00020\u0006\u001a\"\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\b\b\u0000\u0010\u0000*\u00020'*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001a=\u0010,\u001a\u00028\u0000\"\u0010\b\u0000\u0010**\n\u0012\u0006\b\u0000\u0012\u00028\u00010)\"\b\b\u0001\u0010\u0000*\u00020'*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010+\u001a\u00028\u0000¢\u0006\u0004\b,\u0010-\u001a$\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010%\u001a\u00020\u0006\u001a$\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010%\u001a\u00020\u0006\u001a&\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a8\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u00104\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000002j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`3\u001a\u0010\u00107\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00060\u001c\u001a\u0010\u0010:\u001a\u000209*\b\u0012\u0004\u0012\u0002080\u001c\u001a7\u0010;\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010**\n\u0012\u0006\b\u0000\u0012\u00028\u00000)*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010+\u001a\u00028\u0001¢\u0006\u0004\b;\u0010-\u001a\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000=\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001c\u001a\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000@\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\"\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000B0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a-\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000@\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004\u001a-\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000@\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004\u001a\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000H\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a-\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000@\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004\u001a\u0016\u0010K\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a+\u0010L\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bL\u0010M\u001a+\u0010N\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bN\u0010M\u001a.\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bO\u0010P\u001a-\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001a.\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bS\u0010T\u001a-\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001c2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001a?\u0010W\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010V0\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010D*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0086\u0004\u001a}\u0010c\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010Z*\u00060Xj\u0002`Y*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010[\u001a\u00028\u00012\b\b\u0002\u0010]\u001a\u00020\\2\b\b\u0002\u0010^\u001a\u00020\\2\b\b\u0002\u0010_\u001a\u00020\\2\b\b\u0002\u0010`\u001a\u00020\u00062\b\b\u0002\u0010a\u001a\u00020\\2\u0016\b\u0002\u0010b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\\\u0018\u00010\n¢\u0006\u0004\bc\u0010d\u001a`\u0010f\u001a\u00020e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010]\u001a\u00020\\2\b\b\u0002\u0010^\u001a\u00020\\2\b\b\u0002\u0010_\u001a\u00020\\2\b\b\u0002\u0010`\u001a\u00020\u00062\b\b\u0002\u0010a\u001a\u00020\\2\u0016\b\u0002\u0010b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\\\u0018\u00010\n\u001a\u001c\u0010h\u001a\b\u0012\u0004\u0012\u00028\u00000g\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u0019\u0010j\u001a\u00020i*\b\u0012\u0004\u0012\u00020i0\u0001H\u0007¢\u0006\u0004\bj\u0010k¨\u0006l"}, d2 = {"T", "", "element", "", "Q", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "", "index", "U", "(Ljava/lang/Iterable;I)Ljava/lang/Object;", "Lkotlin/Function1;", "defaultValue", "V", "(Ljava/lang/Iterable;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Y", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "", "Z", "(Ljava/util/List;)Ljava/lang/Object;", "a0", "b0", "c0", "(Ljava/util/List;I)Ljava/lang/Object;", "d0", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "j0", "k0", "l0", "", "Lb49;", "random", "s0", "(Ljava/util/Collection;Lb49;)Ljava/lang/Object;", "t0", "u0", "v0", "w0", "n", "S", "", "W", "", "C", "destination", "X", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "B0", "C0", "", "x0", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "y0", "", "E0", "", "", "G0", "D0", "F0", "", "H0", "I0", "", "K0", "Lkotlin/collections/IndexedValue;", "M0", "R", "other", "e0", "z0", "", "J0", "L0", "O", "m0", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "n0", "p0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;", "elements", "o0", "r0", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "q0", "Lkotlin/Pair;", "N0", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "f0", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "h0", "Lkotlin/sequences/Sequence;", "P", "", "A0", "(Ljava/lang/Iterable;)D", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/collections/CollectionsKt")
/* renamed from: sc1 */
/* loaded from: classes3.dex */
public class sc1 extends rc1 {

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, d2 = {"sc1$a", "Lkotlin/sequences/Sequence;", "", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sc1$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Sequence<T> {
        final /* synthetic */ Iterable a;

        public a(Iterable iterable) {
            this.a = iterable;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return this.a.iterator();
        }
    }

    /* compiled from: _Collections.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "", "it", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: sc1$b */
    /* loaded from: classes3.dex */
    public static final class b<T> extends ej5 implements Function1<Integer, T> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i) {
            super(1);
            this.a = i;
        }

        public final T a(int i) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.a + CoreConstants.DOT);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: _Collections.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "a", "()Ljava/util/Iterator;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: sc1$c */
    /* loaded from: classes3.dex */
    public static final class c<T> extends ej5 implements Function0<Iterator<? extends T>> {
        final /* synthetic */ Iterable<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Iterable<? extends T> iterable) {
            super(0);
            this.a = iterable;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Iterator<T> invoke() {
            return this.a.iterator();
        }
    }

    public static double A0(Iterable<Double> iterable) {
        z65.h(iterable, "<this>");
        double d = 0.0d;
        for (Double d2 : iterable) {
            d += d2.doubleValue();
        }
        return d;
    }

    public static <T> List<T> B0(Iterable<? extends T> iterable, int i) {
        Object Y;
        List<T> e;
        List<T> F0;
        List<T> l;
        z65.h(iterable, "<this>");
        if (i >= 0) {
            if (i == 0) {
                l = kc1.l();
                return l;
            }
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    F0 = F0(iterable);
                    return F0;
                } else if (i == 1) {
                    Y = Y(iterable);
                    e = jc1.e(Y);
                    return e;
                }
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (T t : iterable) {
                arrayList.add(t);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return kc1.s(arrayList);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static <T> List<T> C0(List<? extends T> list, int i) {
        Object k0;
        List<T> e;
        List<T> F0;
        List<T> l;
        z65.h(list, "<this>");
        if (i >= 0) {
            if (i == 0) {
                l = kc1.l();
                return l;
            }
            int size = list.size();
            if (i >= size) {
                F0 = F0(list);
                return F0;
            } else if (i == 1) {
                k0 = k0(list);
                e = jc1.e(k0);
                return e;
            } else {
                ArrayList arrayList = new ArrayList(i);
                if (list instanceof RandomAccess) {
                    for (int i2 = size - i; i2 < size; i2++) {
                        arrayList.add(list.get(i2));
                    }
                } else {
                    ListIterator<? extends T> listIterator = list.listIterator(size - i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static <T, C extends Collection<? super T>> C D0(Iterable<? extends T> iterable, C c2) {
        z65.h(iterable, "<this>");
        z65.h(c2, "destination");
        for (T t : iterable) {
            c2.add(t);
        }
        return c2;
    }

    public static int[] E0(Collection<Integer> collection) {
        z65.h(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            iArr[i] = num.intValue();
            i++;
        }
        return iArr;
    }

    public static <T> List<T> F0(Iterable<? extends T> iterable) {
        List<T> l;
        Object next;
        List<T> e;
        List<T> I0;
        z65.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                l = kc1.l();
                return l;
            } else if (size != 1) {
                I0 = I0(collection);
                return I0;
            } else {
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                e = jc1.e(next);
                return e;
            }
        }
        return kc1.s(H0(iterable));
    }

    public static long[] G0(Collection<Long> collection) {
        z65.h(collection, "<this>");
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Long l : collection) {
            jArr[i] = l.longValue();
            i++;
        }
        return jArr;
    }

    public static final <T> List<T> H0(Iterable<? extends T> iterable) {
        Collection D0;
        List<T> I0;
        z65.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            I0 = I0((Collection) iterable);
            return I0;
        }
        D0 = D0(iterable, new ArrayList());
        return (List) D0;
    }

    public static <T> List<T> I0(Collection<? extends T> collection) {
        z65.h(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> Set<T> J0(Iterable<? extends T> iterable) {
        Collection D0;
        z65.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            D0 = D0(iterable, new LinkedHashSet());
            return (Set) D0;
        }
        return new LinkedHashSet((Collection) iterable);
    }

    public static <T> Set<T> K0(Iterable<? extends T> iterable) {
        Collection D0;
        Set<T> e;
        Object next;
        Set<T> d;
        int e2;
        Collection D02;
        z65.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            D0 = D0(iterable, new LinkedHashSet());
            return sfa.f((Set) D0);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            e = sfa.e();
            return e;
        } else if (size != 1) {
            e2 = f86.e(collection.size());
            D02 = D0(iterable, new LinkedHashSet(e2));
            return (Set) D02;
        } else {
            if (iterable instanceof List) {
                next = ((List) iterable).get(0);
            } else {
                next = iterable.iterator().next();
            }
            d = rfa.d(next);
            return d;
        }
    }

    public static <T> Set<T> L0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        z65.h(iterable, "<this>");
        z65.h(iterable2, "other");
        Set<T> J0 = J0(iterable);
        pc1.C(J0, iterable2);
        return J0;
    }

    public static <T> Iterable<IndexedValue<T>> M0(Iterable<? extends T> iterable) {
        z65.h(iterable, "<this>");
        return new m05(new c(iterable));
    }

    public static <T, R> List<Pair<T, R>> N0(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        int w;
        int w2;
        z65.h(iterable, "<this>");
        z65.h(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        w = lc1.w(iterable, 10);
        w2 = lc1.w(iterable2, 10);
        ArrayList arrayList = new ArrayList(Math.min(w, w2));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(lnb.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> boolean O(Iterable<? extends T> iterable) {
        z65.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return !((Collection) iterable).isEmpty();
        }
        return iterable.iterator().hasNext();
    }

    public static <T> Sequence<T> P(Iterable<? extends T> iterable) {
        z65.h(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> boolean Q(Iterable<? extends T> iterable, T t) {
        int d0;
        z65.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            d0 = d0(iterable, t);
            if (d0 >= 0) {
                return true;
            }
            return false;
        }
        return ((Collection) iterable).contains(t);
    }

    public static <T> List<T> R(Iterable<? extends T> iterable) {
        List<T> F0;
        z65.h(iterable, "<this>");
        F0 = F0(J0(iterable));
        return F0;
    }

    public static <T> List<T> S(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        Object j0;
        List<T> e;
        List<T> l;
        List<T> F0;
        z65.h(iterable, "<this>");
        if (i >= 0) {
            if (i == 0) {
                F0 = F0(iterable);
                return F0;
            }
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    l = kc1.l();
                    return l;
                } else if (size == 1) {
                    j0 = j0(iterable);
                    e = jc1.e(j0);
                    return e;
                } else {
                    arrayList = new ArrayList(size);
                    if (iterable instanceof List) {
                        if (iterable instanceof RandomAccess) {
                            int size2 = collection.size();
                            while (i < size2) {
                                arrayList.add(((List) iterable).get(i));
                                i++;
                            }
                        } else {
                            ListIterator listIterator = ((List) iterable).listIterator(i);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        return arrayList;
                    }
                }
            } else {
                arrayList = new ArrayList();
            }
            int i2 = 0;
            for (T t : iterable) {
                if (i2 >= i) {
                    arrayList.add(t);
                } else {
                    i2++;
                }
            }
            return kc1.s(arrayList);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static <T> List<T> T(List<? extends T> list, int i) {
        int e;
        List<T> B0;
        z65.h(list, "<this>");
        if (i >= 0) {
            List<? extends T> list2 = list;
            e = i.e(list.size() - i, 0);
            B0 = B0(list2, e);
            return B0;
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static final <T> T U(Iterable<? extends T> iterable, int i) {
        z65.h(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) ((List) iterable).get(i);
        }
        return (T) V(iterable, i, new b(i));
    }

    public static final <T> T V(Iterable<? extends T> iterable, int i, Function1<? super Integer, ? extends T> function1) {
        int n;
        z65.h(iterable, "<this>");
        z65.h(function1, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (i >= 0) {
                n = kc1.n(list);
                if (i <= n) {
                    return (T) list.get(i);
                }
            }
            return function1.invoke(Integer.valueOf(i));
        } else if (i < 0) {
            return function1.invoke(Integer.valueOf(i));
        } else {
            int i2 = 0;
            for (T t : iterable) {
                int i3 = i2 + 1;
                if (i == i2) {
                    return t;
                }
                i2 = i3;
            }
            return function1.invoke(Integer.valueOf(i));
        }
    }

    public static <T> List<T> W(Iterable<? extends T> iterable) {
        z65.h(iterable, "<this>");
        return (List) X(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C X(Iterable<? extends T> iterable, C c2) {
        z65.h(iterable, "<this>");
        z65.h(c2, "destination");
        for (T t : iterable) {
            if (t != null) {
                c2.add(t);
            }
        }
        return c2;
    }

    public static <T> T Y(Iterable<? extends T> iterable) {
        Object Z;
        z65.h(iterable, "<this>");
        if (iterable instanceof List) {
            Z = Z((List) iterable);
            return (T) Z;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T Z(List<? extends T> list) {
        z65.h(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T a0(Iterable<? extends T> iterable) {
        z65.h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static <T> T b0(List<? extends T> list) {
        z65.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> T c0(List<? extends T> list, int i) {
        int n;
        z65.h(list, "<this>");
        if (i >= 0) {
            n = kc1.n(list);
            if (i <= n) {
                return list.get(i);
            }
        }
        return null;
    }

    public static <T> int d0(Iterable<? extends T> iterable, T t) {
        z65.h(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                kc1.v();
            }
            if (z65.c(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> Set<T> e0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        z65.h(iterable, "<this>");
        z65.h(iterable2, "other");
        Set<T> J0 = J0(iterable);
        pc1.L(J0, iterable2);
        return J0;
    }

    public static final <T, A extends Appendable> A f0(Iterable<? extends T> iterable, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        z65.h(iterable, "<this>");
        z65.h(a2, "buffer");
        z65.h(charSequence, "separator");
        z65.h(charSequence2, "prefix");
        z65.h(charSequence3, "postfix");
        z65.h(charSequence4, "truncated");
        a2.append(charSequence2);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            d0b.a(a2, t, function1);
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static /* synthetic */ Appendable g0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i3;
        CharSequence charSequence7;
        Function1 function12;
        if ((i2 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i2 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i2 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i2 & 16) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i2 & 64) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        return f0(iterable, appendable, charSequence5, charSequence6, charSequence8, i3, charSequence7, function12);
    }

    public static final <T> String h0(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        z65.h(iterable, "<this>");
        z65.h(charSequence, "separator");
        z65.h(charSequence2, "prefix");
        z65.h(charSequence3, "postfix");
        z65.h(charSequence4, "truncated");
        String sb = ((StringBuilder) f0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
        z65.g(sb, "toString(...)");
        return sb;
    }

    public static /* synthetic */ String i0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        int i3;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return h0(iterable, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    public static <T> T j0(Iterable<? extends T> iterable) {
        Object k0;
        z65.h(iterable, "<this>");
        if (iterable instanceof List) {
            k0 = k0((List) iterable);
            return (T) k0;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T k0(List<? extends T> list) {
        int n;
        z65.h(list, "<this>");
        if (!list.isEmpty()) {
            n = kc1.n(list);
            return list.get(n);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T l0(List<? extends T> list) {
        z65.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T extends Comparable<? super T>> T m0(Iterable<? extends T> iterable) {
        z65.h(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T extends Comparable<? super T>> T n0(Iterable<? extends T> iterable) {
        z65.h(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> List<T> o0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        List<T> F0;
        z65.h(iterable, "<this>");
        z65.h(iterable2, "elements");
        Collection E = pc1.E(iterable2);
        if (E.isEmpty()) {
            F0 = F0(iterable);
            return F0;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!E.contains(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <T> List<T> p0(Iterable<? extends T> iterable, T t) {
        int w;
        z65.h(iterable, "<this>");
        w = lc1.w(iterable, 10);
        ArrayList arrayList = new ArrayList(w);
        boolean z = false;
        for (T t2 : iterable) {
            boolean z2 = true;
            if (!z && z65.c(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public static <T> List<T> q0(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        z65.h(collection, "<this>");
        z65.h(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        pc1.C(arrayList2, iterable);
        return arrayList2;
    }

    public static <T> List<T> r0(Collection<? extends T> collection, T t) {
        z65.h(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static <T> T s0(Collection<? extends T> collection, b49 b49Var) {
        z65.h(collection, "<this>");
        z65.h(b49Var, "random");
        if (!collection.isEmpty()) {
            return (T) U(collection, b49Var.d(collection.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T t0(Iterable<? extends T> iterable) {
        Object u0;
        z65.h(iterable, "<this>");
        if (iterable instanceof List) {
            u0 = u0((List) iterable);
            return (T) u0;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T u0(List<? extends T> list) {
        z65.h(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T v0(Iterable<? extends T> iterable) {
        z65.h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() != 1) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static <T> T w0(List<? extends T> list) {
        z65.h(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T extends Comparable<? super T>> List<T> x0(Iterable<? extends T> iterable) {
        List<T> c2;
        List<T> F0;
        z65.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                F0 = F0(iterable);
                return F0;
            }
            Object[] array = collection.toArray(new Comparable[0]);
            xr.x((Comparable[]) array);
            c2 = xr.c(array);
            return c2;
        }
        List<T> H0 = H0(iterable);
        oc1.A(H0);
        return H0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> y0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        List<T> c2;
        List<T> F0;
        z65.h(iterable, "<this>");
        z65.h(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                F0 = F0(iterable);
                return F0;
            }
            Object[] array = collection.toArray(new Object[0]);
            xr.y(array, comparator);
            c2 = xr.c(array);
            return c2;
        }
        List<T> H0 = H0(iterable);
        oc1.B(H0, comparator);
        return H0;
    }

    public static <T> Set<T> z0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        z65.h(iterable, "<this>");
        z65.h(iterable2, "other");
        Set<T> J0 = J0(iterable);
        pc1.H(J0, iterable2);
        return J0;
    }
}
