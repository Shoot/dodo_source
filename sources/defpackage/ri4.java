package defpackage;

import defpackage.kl8;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GroupUtils.java */
/* renamed from: ri4  reason: default package */
/* loaded from: classes3.dex */
public class ri4 {
    public static List<yf7> a(List<yf7> list) {
        ArrayList arrayList = new ArrayList();
        for (kl8 kl8Var : kl8.a.a.c()) {
            for (yf7 yf7Var : list) {
                if (kl8Var == kl8.i && yf7Var.r()) {
                    arrayList.add(yf7Var);
                }
                if (yf7Var.l() == kl8Var && !yf7Var.r()) {
                    arrayList.add(yf7Var);
                }
            }
        }
        return arrayList;
    }

    public static List<yf7> b(List<yf7> list) {
        ArrayList arrayList = new ArrayList();
        for (kl8 kl8Var : kl8.a.a.c()) {
            for (yf7 yf7Var : list) {
                if (yf7Var.l() == kl8Var) {
                    arrayList.add(yf7Var);
                }
            }
        }
        return arrayList;
    }
}
