package defpackage;

import androidx.annotation.NonNull;
import androidx.work.b;
import java.util.List;
/* compiled from: InputMerger.java */
/* renamed from: p35  reason: default package */
/* loaded from: classes.dex */
public abstract class p35 {
    private static final String a = nx5.f("InputMerger");

    public static p35 a(String str) {
        try {
            return (p35) Class.forName(str).newInstance();
        } catch (Exception e) {
            nx5 c = nx5.c();
            String str2 = a;
            c.b(str2, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    @NonNull
    public abstract b b(@NonNull List<b> list);
}
