package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a3\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "", "Lkotlin/Function1;", "", "predicate", "a", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "formbuilder_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: ovb  reason: default package */
/* loaded from: classes.dex */
public final class ovb {
    public static final <T> T a(List<? extends T> list, Function1<? super T, Boolean> function1) {
        Object c0;
        z65.h(list, "<this>");
        z65.h(function1, "predicate");
        Iterator<? extends T> it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (function1.invoke((T) it.next()).booleanValue()) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        c0 = sc1.c0(list, i + 1);
        return (T) c0;
    }
}
