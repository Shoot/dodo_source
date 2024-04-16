package defpackage;

import android.view.inputmethod.ExtractedText;
import kotlin.Metadata;
/* compiled from: InputState.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Lvab;", "Landroid/view/inputmethod/ExtractedText;", "a", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: w35  reason: default package */
/* loaded from: classes.dex */
public final class w35 {
    public static final ExtractedText a(vab vabVar) {
        boolean N;
        z65.h(vabVar, "<this>");
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = vabVar.c();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = vabVar.c().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = jcb.i(vabVar.b());
        extractedText.selectionEnd = jcb.h(vabVar.b());
        N = m0b.N(vabVar.c(), '\n', false, 2, null);
        extractedText.flags = !N ? 1 : 0;
        return extractedText;
    }
}
