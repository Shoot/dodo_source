package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: LocalityListInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Luqa;", "", "", "Lmv5;", "localities", "", "filter", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: uqa  reason: default package */
/* loaded from: classes4.dex */
public final class uqa {
    public static final uqa a = new uqa();

    private uqa() {
    }

    public final Collection<mv5> a(Collection<mv5> collection, String str) {
        z65.h(collection, "localities");
        z65.h(str, "filter");
        ArrayList arrayList = new ArrayList();
        for (mv5 mv5Var : collection) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mv5Var.e());
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, str.length(), 0);
            arrayList.add(mv5.b(mv5Var, null, null, spannableStringBuilder, null, false, false, false, 123, null));
        }
        return arrayList;
    }
}
