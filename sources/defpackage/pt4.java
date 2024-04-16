package defpackage;

import kotlin.Metadata;
/* compiled from: IdnaMappingTable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"", "", "index", "a", "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: pt4  reason: default package */
/* loaded from: classes3.dex */
public final class pt4 {
    public static final int a(String str, int i) {
        z65.h(str, "<this>");
        char charAt = str.charAt(i);
        return (charAt << 7) + str.charAt(i + 1);
    }
}
