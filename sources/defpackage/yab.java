package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: TextFieldValue.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0007"}, d2 = {"Lvab;", "", "maxChars", "Lml;", c.a, "b", "a", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: yab  reason: default package */
/* loaded from: classes.dex */
public final class yab {
    public static final ml a(vab vabVar) {
        z65.h(vabVar, "<this>");
        return vabVar.a().l(vabVar.b());
    }

    public static final ml b(vab vabVar, int i) {
        z65.h(vabVar, "<this>");
        return vabVar.a().subSequence(jcb.h(vabVar.b()), Math.min(jcb.h(vabVar.b()) + i, vabVar.c().length()));
    }

    public static final ml c(vab vabVar, int i) {
        z65.h(vabVar, "<this>");
        return vabVar.a().subSequence(Math.max(0, jcb.i(vabVar.b()) - i), jcb.i(vabVar.b()));
    }
}
