package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
/* compiled from: TextViewOnReceiveContentListener.java */
/* renamed from: hdb  reason: default package */
/* loaded from: classes.dex */
public final class hdb implements v87 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextViewOnReceiveContentListener.java */
    /* renamed from: hdb$a */
    /* loaded from: classes.dex */
    public static final class a {
        static CharSequence a(@NonNull Context context, @NonNull ClipData.Item item, int i) {
            if ((i & 1) != 0) {
                CharSequence coerceToText = item.coerceToText(context);
                if (coerceToText instanceof Spanned) {
                    return coerceToText.toString();
                }
                return coerceToText;
            }
            return item.coerceToStyledText(context);
        }
    }

    private static CharSequence b(@NonNull Context context, @NonNull ClipData.Item item, int i) {
        return a.a(context, item, i);
    }

    private static void c(@NonNull Editable editable, @NonNull CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // defpackage.v87
    public nt1 a(@NonNull View view, @NonNull nt1 nt1Var) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + nt1Var);
        }
        if (nt1Var.d() == 2) {
            return nt1Var;
        }
        ClipData b = nt1Var.b();
        int c = nt1Var.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < b.getItemCount(); i++) {
            CharSequence b2 = b(context, b.getItemAt(i), c);
            if (b2 != null) {
                if (!z) {
                    c(editable, b2);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b2);
                }
            }
        }
        return null;
    }
}
