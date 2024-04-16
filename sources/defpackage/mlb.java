package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: TransitionValues.java */
/* renamed from: mlb  reason: default package */
/* loaded from: classes.dex */
public class mlb {
    public View b;
    public final Map<String, Object> a = new HashMap();
    final ArrayList<clb> c = new ArrayList<>();

    @Deprecated
    public mlb() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof mlb) {
            mlb mlbVar = (mlb) obj;
            if (this.b == mlbVar.b && this.a.equals(mlbVar.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        for (String str2 : this.a.keySet()) {
            str = str + "    " + str2 + ": " + this.a.get(str2) + "\n";
        }
        return str;
    }

    public mlb(@NonNull View view) {
        this.b = view;
    }
}
