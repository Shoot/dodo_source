package androidx.compose.ui.focus;

import java.util.Comparator;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OneDimensionalFocusSearch.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/k;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/Comparator;", "Len5;", "layoutNode", "Lgr6;", "b", "focusTarget1", "focusTarget2", "", "a", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class k implements Comparator<FocusTargetNode> {
    public static final k a = new k();

    private k() {
    }

    private final gr6<en5> b(en5 en5Var) {
        gr6<en5> gr6Var = new gr6<>(new en5[16], 0);
        while (en5Var != null) {
            gr6Var.a(0, en5Var);
            en5Var = en5Var.h0();
        }
        return gr6Var;
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        en5 en5Var;
        if (focusTargetNode != null) {
            if (focusTargetNode2 != null) {
                int i = 0;
                if (j.g(focusTargetNode) && j.g(focusTargetNode2)) {
                    oz6 E0 = focusTargetNode.E0();
                    en5 en5Var2 = null;
                    if (E0 != null) {
                        en5Var = E0.L0();
                    } else {
                        en5Var = null;
                    }
                    if (en5Var != null) {
                        oz6 E02 = focusTargetNode2.E0();
                        if (E02 != null) {
                            en5Var2 = E02.L0();
                        }
                        if (en5Var2 != null) {
                            if (z65.c(en5Var, en5Var2)) {
                                return 0;
                            }
                            gr6<en5> b = b(en5Var);
                            gr6<en5> b2 = b(en5Var2);
                            int min = Math.min(b.s() - 1, b2.s() - 1);
                            if (min >= 0) {
                                while (z65.c(b.r()[i], b2.r()[i])) {
                                    if (i != min) {
                                        i++;
                                    }
                                }
                                return z65.j(b.r()[i].i0(), b2.r()[i].i0());
                            }
                            throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                } else if (j.g(focusTargetNode)) {
                    return -1;
                } else {
                    if (!j.g(focusTargetNode2)) {
                        return 0;
                    }
                    return 1;
                }
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
