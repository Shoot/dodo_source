package defpackage;

import kotlin.Metadata;
/* compiled from: OrderResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lii7;", "", "a", "(Lii7;)Ljava/lang/String;", "paymentMethodName", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: ji7  reason: default package */
/* loaded from: classes4.dex */
public final class ji7 {
    public static final String a(ii7 ii7Var) {
        String str;
        du7 c;
        z65.h(ii7Var, "<this>");
        jw7 a = ii7Var.a().n().a();
        if (a != null && (c = a.c()) != null) {
            str = c.name();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
