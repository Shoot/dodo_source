package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
/* compiled from: _Sequences.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0005\u001a\u00020\u0004\u001a0\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007\u001a0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007\u001a\"\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\f*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001a\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u001a<\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0010*\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007\u001a\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a6\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u001a}\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010\u001b*\u00060\u0019j\u0002`\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001c\u001a\u00028\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u001d2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010#\u001a`\u0010%\u001a\u00020$\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u001d2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0007\u001a\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006("}, d2 = {"T", "Lkotlin/sequences/Sequence;", Image.TYPE_MEDIUM, "(Lkotlin/sequences/Sequence;)Ljava/lang/Object;", "", "n", "i", "Lkotlin/Function1;", "", "predicate", "j", "k", "", "l", "", Image.TYPE_SMALL, "R", "transform", "q", "r", "Lkotlin/collections/IndexedValue;", "t", "K", "selector", Image.TYPE_HIGH, "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "(Lkotlin/sequences/Sequence;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "o", "", "g", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/sequences/SequencesKt")
/* renamed from: dca */
/* loaded from: classes3.dex */
public class dca extends cca {

    /* compiled from: Iterables.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, d2 = {"dca$a", "", "", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dca$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Iterable<T>, be5 {
        final /* synthetic */ Sequence a;

        public a(Sequence sequence) {
            this.a = sequence;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.a.iterator();
        }
    }

    /* compiled from: _Sequences.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dca$b */
    /* loaded from: classes3.dex */
    public static final class b<T> extends ej5 implements Function1<T, Boolean> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(T t) {
            boolean z;
            if (t == null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static <T> Iterable<T> g(Sequence<? extends T> sequence) {
        z65.h(sequence, "<this>");
        return new a(sequence);
    }

    public static <T, K> Sequence<T> h(Sequence<? extends T> sequence, Function1<? super T, ? extends K> function1) {
        z65.h(sequence, "<this>");
        z65.h(function1, "selector");
        return new z43(sequence, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Sequence<T> i(Sequence<? extends T> sequence, int i) {
        z65.h(sequence, "<this>");
        if (i >= 0) {
            if (i != 0) {
                if (sequence instanceof h93) {
                    return ((h93) sequence).a(i);
                }
                return new d93(sequence, i);
            }
            return sequence;
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static <T> Sequence<T> j(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        z65.h(sequence, "<this>");
        z65.h(function1, "predicate");
        return new cv3(sequence, true, function1);
    }

    public static final <T> Sequence<T> k(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        z65.h(sequence, "<this>");
        z65.h(function1, "predicate");
        return new cv3(sequence, false, function1);
    }

    public static final <T> Sequence<T> l(Sequence<? extends T> sequence) {
        z65.h(sequence, "<this>");
        Sequence<T> k = k(sequence, b.a);
        z65.f(k, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return k;
    }

    public static <T> T m(Sequence<? extends T> sequence) {
        z65.h(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final <T, A extends Appendable> A n(Sequence<? extends T> sequence, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        z65.h(sequence, "<this>");
        z65.h(a2, "buffer");
        z65.h(charSequence, "separator");
        z65.h(charSequence2, "prefix");
        z65.h(charSequence3, "postfix");
        z65.h(charSequence4, "truncated");
        a2.append(charSequence2);
        int i2 = 0;
        for (T t : sequence) {
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

    public static final <T> String o(Sequence<? extends T> sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        z65.h(sequence, "<this>");
        z65.h(charSequence, "separator");
        z65.h(charSequence2, "prefix");
        z65.h(charSequence3, "postfix");
        z65.h(charSequence4, "truncated");
        String sb = ((StringBuilder) n(sequence, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
        z65.g(sb, "toString(...)");
        return sb;
    }

    public static /* synthetic */ String p(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return o(sequence, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    public static <T, R> Sequence<R> q(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        z65.h(sequence, "<this>");
        z65.h(function1, "transform");
        return new alb(sequence, function1);
    }

    public static <T, R> Sequence<R> r(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        z65.h(sequence, "<this>");
        z65.h(function1, "transform");
        return l(new alb(sequence, function1));
    }

    public static <T> List<T> s(Sequence<? extends T> sequence) {
        List<T> e;
        List<T> l;
        z65.h(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            l = kc1.l();
            return l;
        }
        T next = it.next();
        if (!it.hasNext()) {
            e = jc1.e(next);
            return e;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <T> Sequence<IndexedValue<T>> t(Sequence<? extends T> sequence) {
        z65.h(sequence, "<this>");
        return new o05(sequence);
    }
}
