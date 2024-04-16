package com.dodopizza.controlling.feature.orderrating.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
/* compiled from: OrderRatingChatMessageComposer.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\r\u001a\u0004\u0018\u00010\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J.\u0010\u000f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/controlling/feature/orderrating/presentation/b;", "", "Lw69;", "rating", "", DateTokenConverter.CONVERTER_KEY, "productsDescription", com.huawei.hms.opendevice.c.a, "Lbc7;", "activeOrder", "b", "", "selectedTagsTitles", e.a, "a", "f", "Ldh7;", "Ldh7;", "linesBuilder", "<init>", "(Ldh7;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b {
    private final dh7 a;

    /* compiled from: OrderRatingChatMessageComposer.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/controlling/feature/orderrating/presentation/b$a;", "", "Ldh7;", "linesBuilder", "Lcom/dodopizza/controlling/feature/orderrating/presentation/b;", "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public interface a {
        b a(dh7 dh7Var);
    }

    public b(dh7 dh7Var) {
        z65.h(dh7Var, "linesBuilder");
        this.a = dh7Var;
    }

    private final String a(w69 w69Var) {
        String c = w69Var.c();
        if (c.length() == 0) {
            return null;
        }
        return this.a.a(c);
    }

    private final String b(bc7 bc7Var) {
        if (bc7Var == null) {
            return null;
        }
        return this.a.b(bc7Var.e());
    }

    private final String c(String str) {
        return this.a.c(str);
    }

    private final String d(w69 w69Var) {
        return this.a.d(kw1.b(w69Var.f()));
    }

    private final String e(List<String> list) {
        String i0;
        if (!list.isEmpty()) {
            i0 = sc1.i0(list, " | ", null, null, 0, null, null, 62, null);
            return this.a.e(i0);
        }
        return null;
    }

    public final String f(bc7 bc7Var, w69 w69Var, String str, List<String> list) {
        List q;
        String i0;
        z65.h(w69Var, "rating");
        z65.h(str, "productsDescription");
        z65.h(list, "selectedTagsTitles");
        q = kc1.q(d(w69Var), c(str), b(bc7Var), e(list), a(w69Var));
        i0 = sc1.i0(q, "\n", null, null, 0, null, null, 62, null);
        return i0;
    }
}
