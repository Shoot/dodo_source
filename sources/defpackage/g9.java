package defpackage;

import kotlin.Metadata;
/* compiled from: AddressStringBuilderExt.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001a\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u001a\u0010\u0005\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "value", "a", "b", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: g9  reason: default package */
/* loaded from: classes4.dex */
public final class g9 {
    public static final StringBuilder a(StringBuilder sb, String str) {
        z65.h(sb, "<this>");
        z65.h(str, "value");
        if (str.length() > 0) {
            sb.append(", ");
            sb.append(str);
        }
        return sb;
    }

    public static final StringBuilder b(StringBuilder sb, String str) {
        z65.h(sb, "<this>");
        z65.h(str, "value");
        if (str.length() > 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(str);
        }
        return sb;
    }
}
