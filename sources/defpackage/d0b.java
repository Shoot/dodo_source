package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Appendable.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "element", "Lkotlin/Function1;", "", "transform", "", "a", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/text/StringsKt")
/* renamed from: d0b  reason: default package */
/* loaded from: classes3.dex */
public class d0b {
    public static <T> void a(Appendable appendable, T t, Function1<? super T, ? extends CharSequence> function1) {
        z65.h(appendable, "<this>");
        if (function1 != null) {
            appendable.append(function1.invoke(t));
        } else if (t == null || (t instanceof CharSequence)) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
