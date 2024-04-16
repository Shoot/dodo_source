package defpackage;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SequenceBuilder.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001aG\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\f*\f\b\u0002\u0010\u000e\"\u00020\r2\u00020\r¨\u0006\u000f"}, d2 = {"T", "Lkotlin/Function2;", "Lxba;", "Lcv1;", "", "", "block", "Lkotlin/sequences/Sequence;", "b", "(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;", "", "a", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "", "State", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/sequences/SequencesKt")
/* renamed from: zba  reason: default package */
/* loaded from: classes3.dex */
public class zba {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, d2 = {"zba$a", "Lkotlin/sequences/Sequence;", "", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zba$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Sequence<T> {
        final /* synthetic */ Function2 a;

        public a(Function2 function2) {
            this.a = function2;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return zba.a(this.a);
        }
    }

    public static final <T> Iterator<T> a(Function2<? super xba<? super T>, ? super cv1<? super Unit>, ? extends Object> function2) {
        cv1<? super Unit> b;
        z65.h(function2, "block");
        wba wbaVar = new wba();
        b = b75.b(function2, wbaVar, wbaVar);
        wbaVar.i(b);
        return wbaVar;
    }

    public static <T> Sequence<T> b(Function2<? super xba<? super T>, ? super cv1<? super Unit>, ? extends Object> function2) {
        z65.h(function2, "block");
        return new a(function2);
    }
}
